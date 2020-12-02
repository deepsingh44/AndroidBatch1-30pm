package com.deepsingh44.vishufirsthelloapp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Date;

public class MySystemLevelService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        //initialize here
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroy", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyLocalService();
    }

    class MyLocalService extends Binder {

        public MySystemLevelService getMySystemLevelService() {
            return MySystemLevelService.this;
        }

    }

    public String getCurrentDate() {
        return new Date(System.currentTimeMillis()).toString();
    }
}
