package com.example.agendafragments;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orientation = getResources().getConfiguration().orientation;

        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            Fragment frDetail = new DetailFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.frDitalContac,frDetail)
                    .commit();
        }


    }
}
