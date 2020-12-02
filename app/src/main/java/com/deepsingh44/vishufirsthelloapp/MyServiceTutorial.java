package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

public class MyServiceTutorial extends AppCompatActivity {
    TextView tdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_service_tutorial);
        tdate = findViewById(R.id.current);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, MySystemLevelService.class);
        bindService(intent, serviceConnection, BIND_AUTO_CREATE);
    }

    public void start(View view) {
        /*Intent intent=new Intent(this,MySystemLevelService.class);
        startService(intent);*/

    }

    @Override
    protected void onStop() {
        super.onStop();
        unbindService(serviceConnection);
    }

    public void stop(View view) {
        /*Intent intent=new Intent(this,MySystemLevelService.class);
        stopService(intent);*/
        //unbindService(serviceConnection);
    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MySystemLevelService.MyLocalService mls = (MySystemLevelService.MyLocalService) service;
            String date = mls.getMySystemLevelService().getCurrentDate();
            tdate.setText(date);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    //below lollipop
    //START_STICKY
    //It is used to restart your service again.
    //START_NOT_STICKY
    //It is used not to restart your service again.
    //above lollipop service kill by the help android system.
    //JobScheduler Api
    //Music App
}