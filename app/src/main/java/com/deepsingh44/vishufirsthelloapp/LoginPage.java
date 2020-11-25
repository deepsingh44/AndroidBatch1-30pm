package com.deepsingh44.vishufirsthelloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    public void register(View view){
        //Toast.makeText(this, "Register Here", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,RegisterPage.class);
        startActivity(in);
        finish();
    }
    public void forget(View view){
        Toast.makeText(this, "Forget Password", Toast.LENGTH_SHORT).show();
    }

    /*public void goToHome(View view){
        Intent in=new Intent(this,HomePage.class);
        startActivity(in);
        finish();
    }*/

}