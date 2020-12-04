package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BroadcastTutorial extends AppCompatActivity {
    BroadCastDemo br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_tutorial);
        //sendBroadcast(new Intent(this,BroadCastDemo.class));
        br = new BroadCastDemo();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        registerReceiver(br,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(br);
    }
}