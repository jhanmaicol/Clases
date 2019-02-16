package com.example.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSI = (Button) findViewById(R.id.buttonSI);

        Button btnNO = (Button) findViewById(R.id.buttonNO);

        final TextView tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResultado.setText(" Usted Presiono SI y la Respuesta es:\n Correcta, Si es la Capital");
            }
        });
        btnNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResultado.setText(" Usted Presiono NO y la Respuesta es:\n Incorrecta, Si es la Capital");
            }
        });
    }
}
