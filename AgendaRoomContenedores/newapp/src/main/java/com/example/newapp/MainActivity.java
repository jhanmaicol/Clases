package com.example.newapp;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContact = findViewById(R.id.tvConatact);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvContact.setText("");
        loadItems();
    }

    private void loadItems() {

        Uri uri = Uri.parse("content://pe.edu.cibertec.agendaroom.provider/contact/");
        Cursor cursor =getContentResolver().query(uri,
                null,null,null,null);

        if (cursor.moveToFirst()){
            do{
                String name = cursor.getString(1);
                tvContact.setText(name + "\n");
            }while(cursor.moveToNext());
        }
    }
}
