package com.example.aulapedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aulapedrapapeltesoura.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void seleccionarPiedra(View view){

        verificarGanador("piedra");



    }
    public void seleccionarPapel(View view){

        verificarGanador("papel");



    }
    public void seleccionarTijera(View view){

        verificarGanador("tijera");




    }

    private String generarEscojaAleatoria() {
        int numeroAleatorio = new Random().nextInt(3);
        String[] opciones = {"piedra","papel","tijera"};
        String opcion = opciones[numeroAleatorio];

        ImageView imagenRobot = findViewById(R.id.imageView);
        switch (opcion) {
            case "piedra":
                imagenRobot.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagenRobot.setImageResource(R.drawable.papel);
                break;
            case "tijera":
                imagenRobot.setImageResource(R.drawable.tesoura);
                break;
        }

        return opcion;
    }
    private void verificarGanador(String escolhaUsuario){
        String escolhaApp = generarEscojaAleatoria();

        TextView resultado = findViewById(R.id.resultado);

        switch (escolhaApp) {
            case "piedra":
                if (escolhaUsuario == "piedra") {
                    resultado.setText("Empate");
                } else if (escolhaUsuario == "papel") {
                    resultado.setText("Ganaste");
                } else if (escolhaUsuario == "tijera") {
                    resultado.setText("Perdiste");
                }
                break;

            case "papel":
                if (escolhaUsuario == "piedra") {
                    resultado.setText("Perdiste");
                } else if (escolhaUsuario == "papel") {
                    resultado.setText("Empate");
                } else if (escolhaUsuario == "tijera") {
                    resultado.setText("Ganaste");
                }
                break;

            case "tijera":
                if (escolhaUsuario == "piedra") {
                    resultado.setText("Ganaste");
                } else if (escolhaUsuario == "papel") {
                    resultado.setText("Perdiste");
                } else if (escolhaUsuario == "tijera") {
                    resultado.setText("Empate");
                }
                break;
        }




    }


}