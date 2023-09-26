package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocaTexto(View view) {
        TextView texto = findViewById(R.id.textViewTexto);

        if (texto.getText().equals("Texto original")) {
            texto.setText("Mudei o texto");
            return;
        }

        texto.setText("Texto original");

    }

    public void soma(View view) {
        TextView resultado = findViewById(R.id.textViewResultado);
        EditText numero1 = findViewById(R.id.editTextN1);
        EditText numero2 = findViewById(R.id.editTextN2);

        double n1, n2, res;
        n1 = Integer.parseInt(numero1.getText().toString());
        n2 = Integer.parseInt(numero2.getText().toString());

        res = n1 + n2;
        resultado.setText(""+res);

    }
}
