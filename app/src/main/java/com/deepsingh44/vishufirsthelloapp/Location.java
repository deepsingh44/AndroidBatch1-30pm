package com.deepsingh44.vishufirsthelloapp;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.IBinder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Location extends Service implements LocationListener {
    private LocationManager locationmanager;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @SuppressLint("MissingPermission")
    @Override
    public void onCreate() {
        super.onCreate();
        locationmanager = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);

        locationmanager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 10000, 0, this);
    }

    @Override
    public void onLocationChanged(@NonNull android.location.Location location) {
        //send current location to activity
        Intent in = new Intent();
        in.setAction("deepsingh44");
        in.putExtra("lat",location.getLatitude());
        in.putExtra("lon",location.getLongitude());
        sendBroadcast(in);
    }
}
