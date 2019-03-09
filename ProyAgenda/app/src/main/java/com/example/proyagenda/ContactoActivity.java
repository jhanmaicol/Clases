package com.example.proyagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ContactoActivity extends AppCompatActivity {

    TextInputEditText etNombre, etEmpresa, etNumero;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        etNombre = findViewById(R.id.etNombre);
        etEmpresa = findViewById(R.id.etEmpresa);
        etNumero = findViewById(R.id.etNumero);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_boton,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String nombre = etNombre.getText().toString();
        String empresa = etEmpresa.getText().toString();
        int numero = Integer.parseInt(etNumero.getText().toString());
        Intent intent = getIntent();
        intent.putExtra("contacto_Nombre",nombre);
        intent.putExtra("contacto_descripcion", empresa);
        intent.putExtra("contacto_cantidad", numero);
        setResult(RESULT_OK,intent);

        finish();
        return true;
    }
}
