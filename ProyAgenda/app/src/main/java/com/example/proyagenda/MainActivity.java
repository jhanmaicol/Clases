package com.example.proyagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView rvContacto;

     ArrayList<Contacto> items;

     AdapterContacto adapterContacto;

     final static int REQUEST_CODE_MAIN = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContacto = findViewById(R.id.rvAgenda);

        items = new ArrayList<>();

        loadItems();

        adapterContacto = new AdapterContacto(items);

        rvContacto.setAdapter(adapterContacto);

        rvContacto.setLayoutManager(new LinearLayoutManager(this));

    }

    private void loadItems() {
        // Instancia un objeto de la clase Product
        Contacto contacto1 = new Contacto("Jhanmaicol Jesus",
                "Practia", 969064343);

        // Agrega el objeto creado a la lista
        items.add(contacto1);

        Contacto contacto2 = new Contacto("Alex Justo",
                "Bancomercio", 939309851);
        items.add(contacto2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ContactoActivity.class);
        startActivityForResult(intent, REQUEST_CODE_MAIN);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE_MAIN && resultCode == RESULT_OK) {
            String nombre = data.getStringExtra("contacto_Nombre");
            String descripcion = data.getStringExtra("contacto_descripcion");
            int cantidad = data.getIntExtra("contacto_cantidad",0);

            Contacto contacto = new Contacto(nombre,descripcion,cantidad);

            items.add(contacto);

            adapterContacto.notifyDataSetChanged();

        }
    }
}
