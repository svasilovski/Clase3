package com.example.educacionit.clase3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactoAdapter extends BaseAdapter {

    private List<Contacto> lstContactos;

    public ContactoAdapter(List<Contacto> lstContactos) {
        this.lstContactos = lstContactos;
    }

    @Override
    public int getCount() {
        return lstContactos.size();
    }

    @Override
    public Object getItem(int position) {
        return lstContactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_contacto,parent,false);

        Contacto contacto = (Contacto)getItem(position);
        TextView numero = (TextView)view.findViewById(R.id.txtViewNumero);
        TextView nombre = (TextView)view.findViewById(R.id.txtViewNombre);
        TextView apellido = (TextView)view.findViewById(R.id.txtViewApellido);

        numero.setText(contacto.getNumero());
        nombre.setText(contacto.getNombre());
        apellido.setText(contacto.getApellido());

        return view;
    }
}
