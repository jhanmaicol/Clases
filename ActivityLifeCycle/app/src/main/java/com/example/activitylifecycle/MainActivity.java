package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btSecondActivity;
    public  static  final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSecondActivity = findViewById(R.id.btSecondActivity);

        btSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent
            }
        });

        Log.d(TAG,"ingrese al metodo onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "ingrese al metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ingrese al metodo onResumen");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ingrese al metodo onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ingrese al metodo onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ingrese al metodo onDestroy");
    }
}
