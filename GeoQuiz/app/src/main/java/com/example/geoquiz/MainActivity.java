package com.example.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button btnSI, btnNO, btnNext, btnPrevious ;
    TextView tvQuestion, pantalla;

    int actualPosition;

    ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         btnSI = (Button) findViewById(R.id.buttonSI);
         btnNO = (Button) findViewById(R.id.buttonNO);
         btnNext = (Button) findViewById(R.id.buttonSiguiente);
         btnPrevious =(Button) findViewById(R.id.buttonAtraz);

         tvQuestion = findViewById(R.id.tvResultado);
         pantalla = findViewById(R.id.pantallaPregunta);

         actualPosition = 0;

         questions = new ArrayList<>();
         loadQuestion();

         showActualQuestion();



        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvQuestion.setText(getString(R.string.respuestaCorrecta));
            }
        });
        btnNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvQuestion.setText(getString(R.string.respuestaIncorrexta));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actualPosition+= 1;
                pantalla.setText(questions.get(actualPosition).getNomre());

            }
        });

    }

    private void showActualQuestion() {
        pantalla.setText(questions.get(actualPosition).getNomre());
    }

    private void loadQuestion(){
        Question questionPeru = new Question(getString(R.string.peru_questions), true);
        questions.add(questionPeru);

        Question questionChile = new Question(getString(R.string.chile_questions), false);
        questions.add(questionChile);

        Question questionColombia = new Question(getString(R.string.colombia_questions), false);
        questions.add(questionColombia);
    }


}

