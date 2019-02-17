package com.example.inventory;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


// Importante heredar de la Clase Padre RecyclerView.Adapter<VH>
public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ProductPrototipe> {

    ArrayList<Product> items;

    public AdapterProduct(ArrayList<Product> items) {
        this.items = items;
    }

    //Crea la vista en base al prototipo definido por cada celda
    @NonNull
    @Override
    public ProductPrototipe onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    //carga la informacion por cada celda de acuerdo a la posicion
    @Override
    public void onBindViewHolder(@NonNull ProductPrototipe productoPrototipe, int i) {

    }

    //indica la cantidad de registros en el RecycleView
    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ProductPrototipe extends RecyclerView.ViewHolder {

        TextView tvName, tvDescription, tvQuantity;

        public ProductPrototipe(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById((R.id.tvDescription));
            tvQuantity = itemView.findViewById(R.id.tvQuantity);
        }
    }
}
