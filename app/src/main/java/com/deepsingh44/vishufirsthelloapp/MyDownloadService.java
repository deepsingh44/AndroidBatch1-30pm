package com.deepsingh44.vishufirsthelloapp;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyDownloadService extends IntentService {

    public MyDownloadService() {
        super("downloadservice");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //task here
        File rootlocation = Environment.getExternalStorageDirectory();
       // File rootlocation=Environment.getRootDirectory();
        //Log.e("error",rootlocation.getAbsolutePath());
        File folder = new File(rootlocation, "myimages");
        folder.mkdir();
        Log.e("error", "create" + rootlocation);
        //get image from url
        try {
            URL url = new URL("https://assets.entrepreneur.com/content/3x2/2000/20191219170611-GettyImages-1152794789.jpeg");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();

            FileOutputStream fo = new FileOutputStream(folder.getAbsoluteFile()+"/deep.jpg");
            int i = 0;
            while ((i = inputStream.read()) != -1) {
                fo.write(i);
                //Log.e("error",i+"");
            }
            fo.close();
            inputStream.close();
            Log.e("error", folder.getAbsolutePath());
        } catch (Exception e) {
            Log.e("error", e.toString());
        }
    }
}
