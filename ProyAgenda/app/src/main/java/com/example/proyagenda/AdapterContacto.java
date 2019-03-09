package com.example.proyagenda;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterContacto extends RecyclerView.Adapter<AdapterContacto.ContactoPrototype> {

    ArrayList<Contacto> items;

    public AdapterContacto(ArrayList<Contacto> items){this.items = items;}

    @NonNull
    @Override
    public ContactoPrototype onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        View view;

        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.prototype_contacto,
                viewGroup, false);
        ContactoPrototype contactoPrototype = new ContactoPrototype(view);
        return contactoPrototype;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoPrototype contactoPrototype, int position) {
        Contacto contacto = items.get(position);

        contactoPrototype.tvNombre.setText(contacto.getNombre());
        contactoPrototype.tvEmpresa.setText(contacto.getEmpresa());
        contactoPrototype.tvNumero.setText(String.valueOf(contacto.getNumero()));
    }

    @Override
    public int getItemCount() { return items.size();}

    public class ContactoPrototype extends RecyclerView.ViewHolder{

        TextView tvNombre, tvEmpresa, tvNumero;
        public ContactoPrototype(@NonNull View itemView){
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvEmpresa = itemView.findViewById(R.id.tvEmpresa);
            tvNumero = itemView.findViewById(R.id.tvNumero);
        }
    }
}
