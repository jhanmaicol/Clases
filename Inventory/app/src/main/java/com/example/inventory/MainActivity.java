package com.example.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProduct;

    ArrayList<Product> items;

    AdapterProduct adapterProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // enlaza variable
        rvProduct = findViewById(R.id.rvProduct);
        // asigna espacio en memoaria para el arreglo
        items = new ArrayList<>();
        // cara la informacion a mostrar
        loadItems();
        // inicialiso el adaptador
        adapterProduct = new  AdapterProduct(items);
    }

    private void loadItems() {
        //instanci un objeta de la clase product
        Product productLaptop = new Product("Laptop","Marca Toshiba", 2);
        //Agrega el objeto creado a la lista
        items.add(productLaptop);

        Product productoMouse = new Product("Mouse", "Modelo Genious", 122);
        items.add(productoMouse);
    }
}
