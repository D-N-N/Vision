package com.dnn.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class RestartService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            context.startForegroundService(new Intent(context, BackgroundService.class));
//        } else {
            context.startService(new Intent(context, BackgroundService.class));
        //}

    }
}
