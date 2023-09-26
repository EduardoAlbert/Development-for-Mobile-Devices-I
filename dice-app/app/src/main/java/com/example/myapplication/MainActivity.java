package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Integer pcPoints = 0;
    Integer userPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        EditText userNumberEditText = findViewById(R.id.userNumberEditText);
        TextView pcNumberTextView = findViewById(R.id.pcNumberTextView);
        TextView drawnNumberTextView = findViewById(R.id.drawnNumberTextView);
        TextView userPointsTextView = findViewById(R.id.userPointsTextView);
        TextView pcPointsTextView = findViewById(R.id.pcPointsTextView);

        if (userNumberEditText.getText().toString().equals("")) {
            drawnNumberTextView.setText("Digite um número!");
            pcNumberTextView.setText("");
            return;
        }

        Integer pcNumber = Math.abs(new Random().nextInt(6) + 1);
        Integer drawnNumber = Math.abs(new Random().nextInt(6) + 1);

        pcNumberTextView.setText("A máquina escolheu " + pcNumber);

        if (drawnNumber.equals(Integer.parseInt(userNumberEditText.getText().toString()))) {
            userPoints += 1;
            userPointsTextView.setText("Você: " + String.valueOf(userPoints));
            drawnNumberTextView.setText("Você acertou!");
        } else {
            drawnNumberTextView.setText("Número sorteado: " + drawnNumber);
        }

        if (drawnNumber.equals(pcNumber)) {
            pcPoints += 1;
            pcPointsTextView.setText("Máquina: " + String.valueOf(pcPoints));
            drawnNumberTextView.setText("A máquina acertou!");
        }
    }
}
