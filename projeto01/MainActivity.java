package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.nota1);
        n2 = findViewById(R.id.nota2);
        result = findViewById(R.id.resultado);
    }
    public void calcularMedia(View v){
        String nota1 = n1.getText().toString();
        String nota2 = n2.getText().toString();
        double notaD1 = Double.parseDouble(nota1);
        double notaD2 = Double.parseDouble(nota2);
        double media = (notaD1 + notaD2) / 2;
        result.setText("A média é: " + media);

    }
}