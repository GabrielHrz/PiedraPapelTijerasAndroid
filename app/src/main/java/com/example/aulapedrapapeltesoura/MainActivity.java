package com.example.aulapedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

        verificarGanador("Piedra");


    }
    public void seleccionarPapel(View view){

        verificarGanador("Papel");


    }
    public void seleccionarTijera(View view){

        verificarGanador("Tijera");


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



    }


}