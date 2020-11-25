package com.deepsingh44.vishufirsthelloapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashPage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*requestWindowFeature( Window.FEATURE_NO_TITLE );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );*/
        //using this way we can attach layout to an activity.
        setContentView(R.layout.splash);
        //using this way we can get View Object
        ImageView image = findViewById(R.id.myimage);
        //using this way we can load animation from anim folder
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        image.setAnimation(anim);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //using intent we can call another activity or components
                Intent in=new Intent(SplashPage.this,WebViewDemo.class);
                //if target page is activity then you need to call startActivity()
                startActivity(in);
                //to destroy current activity we can call finish()
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}