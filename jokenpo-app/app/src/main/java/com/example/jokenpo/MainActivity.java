package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String escolhaSmart, escolhaUsuario;
    private int pontuacaoUsuario = 0, pontuacaoSmart = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computarPlacar() {
        TextView textViewPontuacaoUsuario = findViewById(R.id.textViewPontuacaoUsuario);
        TextView textViewPontuacaoSmartphone = findViewById(R.id.textViewPontuacaoSmartphone);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        if (!this.escolhaUsuario.equals(this.escolhaSmart)) {

            if (this.escolhaUsuario == "pedra" && this.escolhaSmart == "tesoura" ||
                this.escolhaUsuario == "papel" && this.escolhaSmart == "pedra" ||
                this.escolhaUsuario == "tesoura" && this.escolhaSmart == "papel") {
                this.pontuacaoUsuario += 1;
                textViewPontuacaoUsuario.setText("Você: "+this.pontuacaoUsuario);
                textViewResultado.setText("Você ganhou!");
            } else {
                this.pontuacaoSmart += 1;
                textViewPontuacaoSmartphone.setText("Smartphone: "+this.pontuacaoSmart);
                textViewResultado.setText("Smartphone ganhou!");
            }
        } else {
            textViewResultado.setText("Empate!");
        }

    }

    public void escolhePedra(View view) {

        this.escolhaUsuario = "pedra";

        ImageView imgUsuario = findViewById(R.id.imageViewUsuario);

        imgUsuario.setImageResource(R.drawable.pedra);

        this.escolhaSmart(view);

        this.computarPlacar();

    }

    public void escolhePapel(View view) {

        this.escolhaUsuario = "papel";

        ImageView imgUsuario = findViewById(R.id.imageViewUsuario);

        imgUsuario.setImageResource(R.drawable.papel);

        this.escolhaSmart(view);

        this.computarPlacar();
    }

    public void escolheTesoura(View view) {

        this.escolhaUsuario = "tesoura";

        ImageView imgUsuario = findViewById(R.id.imageViewUsuario);

        imgUsuario.setImageResource(R.drawable.tesoura);

        this.escolhaSmart(view);
    }

    public void escolhaSmart(View view) {
        ImageView imgSmart = findViewById(R.id.imageViewSmart);

        int i = new Random().nextInt(3);

        if (i == 0) {
            imgSmart.setImageResource(R.drawable.pedra);
            this.escolhaSmart = "pedra";
        }
        else if (i == 1) {
            imgSmart.setImageResource(R.drawable.papel);
            this.escolhaSmart = "papel";
        }
        else if (i == 2) {
            imgSmart.setImageResource(R.drawable.tesoura);
            this.escolhaSmart = "tesoura";
        }
    }
}
