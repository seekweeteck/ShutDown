package my.edu.tarc.shutdown;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by TAR UC on 1/5/2018.
 */

public class ShutdownReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //Insert code here
        Log.d("Shutdown", "Phone is shutting down");
    }

}
