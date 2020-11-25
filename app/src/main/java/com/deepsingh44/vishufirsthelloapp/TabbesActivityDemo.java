package com.deepsingh44.vishufirsthelloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabbesActivityDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbes_demo);
        TabLayout tbl = findViewById(R.id.mytabbed);
        ViewPager viewPager = findViewById(R.id.myviewpager);

        myPages(viewPager);

        tbl.setupWithViewPager(viewPager);

    }

    private void myPages(ViewPager viewPager){
        MyTabbed mt=new MyTabbed(getSupportFragmentManager());
        mt.addTab(new Call(),"Call");
        mt.addTab(new Chat(),"Chat");
        mt.addTab(new Contact(),"Contact");
        viewPager.setAdapter(mt);

    }

    class MyTabbed extends FragmentPagerAdapter {
        List<String> titles = new ArrayList<>();
        List<Fragment> tabbs = new ArrayList<>();

        public MyTabbed(@NonNull FragmentManager fm) {
            super(fm);
        }


        public void addTab(Fragment fragment, String title) {
            tabbs.add(fragment);
            titles.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return tabbs.get(position);
        }

        @Override
        public int getCount() {
            return tabbs.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }

    }


}