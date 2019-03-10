package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SenconActivity extends AppCompatActivity {

    public  static  final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencon);

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
