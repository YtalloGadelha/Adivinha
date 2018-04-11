package com.example.android.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        textoResultado = (TextView) findViewById(R.id.resultadoId);

        botaoJogar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.botaoJogarId){

            Random randomico = new Random();

            int numeroAleatorio = randomico.nextInt(11);

            textoResultado.setText("Número escolhido: " + numeroAleatorio);

        }

    }
}
