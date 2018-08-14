package com.example.educacionit.clase3;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String DATO = "dato";
    private TextView txtDatoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtDatoRecibido = (TextView)findViewById(R.id.textViewDatosRecibidos);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String valor = bundle.getString("dato");

        txtDatoRecibido.setText("Bienvenido: " + valor);

    }
}
