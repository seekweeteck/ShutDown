package my.edu.tarc.shutdown;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    ShutdownReceiver sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1: Modify the manifest file to include intent filter
        //2: Create a BroadcastReceiver class

        //3: Create an instance of Shutdown Receiver
        sr = new ShutdownReceiver();
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_SHUTDOWN);
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(sr, intentFilter);


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Pause", "Main Activity on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //4: Unregister BroadcastReceiver
        this.unregisterReceiver(sr);
    }
}
