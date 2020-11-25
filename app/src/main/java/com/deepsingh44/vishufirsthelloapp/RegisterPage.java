package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
    }

    public void goToLogin(View view){
        Intent in=new Intent(this,LoginPage.class);
        startActivity(in);
        finish();
    }
}