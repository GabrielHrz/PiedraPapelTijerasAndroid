package com.example.aulapedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.aulapedrapapeltesoura.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
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
    private void verificarGanador(String escolhaUsuario){
        Toast.makeText(this, "Item cliclado "+escolhaUsuario, Toast.LENGTH_SHORT).show();

    }
}