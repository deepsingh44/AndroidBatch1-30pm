package com.deepsingh44.vishufirsthelloapp;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadCastDemo extends BroadcastReceiver {
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Hello Broadcast", Toast.LENGTH_SHORT).show();
        if (intent.getAction() != null) {
            Log.e("error", intent.getAction());
            switch (intent.getAction()) {
                case "android.intent.action.ACTION_POWER_DISCONNECTED":
                    //power disconnected
                    break;
                case "android.intent.action.ACTION_POWER_CONNECTED":
                    //power connected task
                    break;
            }
        }

    }
}
