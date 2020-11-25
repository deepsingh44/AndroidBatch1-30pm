package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class FragmentDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_demo);
        //getSupportFragmentManager().beginTransaction().attach(new FirstFragment()).commit();

    }

    public void first(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.mycontainer, new FirstFragment()).commit();
    }

    public void second(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.mycontainer, new SecondFragment()).commit();
    }

}