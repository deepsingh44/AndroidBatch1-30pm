package com.deepsingh44.vishufirsthelloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.sa90.materialarcmenu.ArcMenu;
import com.sa90.materialarcmenu.StateChangeListener;

public class MenuExample extends AppCompatActivity {
    ArcMenu arcMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_example);

        BoomButton bmb=findViewById(R.id.bmb);


        /*arcMenu = (ArcMenu) findViewById(R.id.arcmenu_android_example_layout);
        arcMenu.setStateChangeListener(new StateChangeListener() {
            @Override
            public void onMenuOpened() {
                //TODO something when menu is opened
            }

            @Override
            public void onMenuClosed() {
                //TODO something when menu is closed
            }
        });*/

        /*final TextView tv = findViewById(R.id.mytext);*/
        //registerForContextMenu(tv);
        /*final View view=findViewById(R.id.myinvisibleview);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu pm=new PopupMenu(MenuExample.this,view);
                pm.getMenuInflater().inflate(R.menu.deep_menu,pm.getMenu());

                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.first:
                                Toast.makeText(MenuExample.this, "First is Clicked", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.second:
                                Toast.makeText(MenuExample.this, "Second is Clicked", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });

                pm.show();
            }
        });*/
    }

    /*//for contextMenu we need to register with a view
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.deep_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.first:
                Toast.makeText(this, "First is Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second:
                Toast.makeText(this, "Second is Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }*/

    /*//for primary menu we need to override a method that is declare below:
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.deep_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //to perform some action in optionMenu we need to override below method:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        *//*if (item.getItemId() == R.id.first) {
            Toast.makeText(this, "First is Clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.second) {
            Toast.makeText(this, "Second is Clicked", Toast.LENGTH_SHORT).show();
        }*//*
        switch (item.getItemId()) {
            case R.id.first:
                Toast.makeText(this, "First is Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second:
                Toast.makeText(this, "Second is Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}