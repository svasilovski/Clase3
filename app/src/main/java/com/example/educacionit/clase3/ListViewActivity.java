package com.example.educacionit.clase3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private List<Contacto> lstContactos;
    private ListView lstView;
    private ContactoAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lstView = (ListView)findViewById(R.id.listView);

        lstContactos = new ArrayList<>();
        lstContactos.add(new Contacto("Jorje", "Lioea", "45678912"));
        lstContactos.add(new Contacto("Raul", "Pers", "12345678"));
        lstContactos.add(new Contacto("Laura", "Gomes", "98765432"));
        lstContactos.add(new Contacto("Maria", "Gonzales", "5412334556"));
        lstContactos.add(new Contacto("Jorje", "Lioea", "45678912"));
        lstContactos.add(new Contacto("Raul", "Pers", "12345678"));
        lstContactos.add(new Contacto("Laura", "Gomes", "98765432"));
        lstContactos.add(new Contacto("Maria", "Gonzales", "5412334556"));
        lstContactos.add(new Contacto("Jorje", "Lioea", "45678912"));
        lstContactos.add(new Contacto("Raul", "Pers", "12345678"));
        lstContactos.add(new Contacto("Laura", "Gomes", "98765432"));
        lstContactos.add(new Contacto("Maria", "Gonzales", "5412334556"));
        lstContactos.add(new Contacto("Jorje", "Lioea", "45678912"));
        lstContactos.add(new Contacto("Raul", "Pers", "12345678"));
        lstContactos.add(new Contacto("Laura", "Gomes", "98765432"));
        lstContactos.add(new Contacto("Maria", "Gonzales", "5412334556"));
        lstContactos.add(new Contacto("Jorje", "Lioea", "45678912"));
        lstContactos.add(new Contacto("Raul", "Pers", "12345678"));
        lstContactos.add(new Contacto("Laura", "Gomes", "98765432"));
        lstContactos.add(new Contacto("Maria", "Gonzales", "5412334556"));
        lstContactos.add(new Contacto("Jorje", "Lioea", "45678912"));
        lstContactos.add(new Contacto("Raul", "Pers", "12345678"));
        lstContactos.add(new Contacto("Laura", "Gomes", "98765432"));
        lstContactos.add(new Contacto("Maria", "Gonzales", "5412334556"));

        myAdapter=new ContactoAdapter(lstContactos);

        lstView.setAdapter(myAdapter);
    }
}
