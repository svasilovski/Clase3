package com.example.educacionit.clase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtDatoEnviado;
    private Button btnEnviarDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDatoEnviado = (EditText)findViewById(R.id.editTextDato);
        btnEnviarDato = (Button) findViewById(R.id.botonEnviarDato);

        btnEnviarDato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = txtDatoEnviado.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(SecondActivity.DATO, dato);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
