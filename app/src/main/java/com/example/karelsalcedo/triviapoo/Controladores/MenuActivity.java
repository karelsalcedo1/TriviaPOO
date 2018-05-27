package com.example.karelsalcedo.triviapoo.Controladores;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.karelsalcedo.triviapoo.Modelos.Jugador;
import com.example.karelsalcedo.triviapoo.R;

public class MenuActivity extends AppCompatActivity {
    EditText Nombre;
    Spinner Nivel;
    public boolean Data = false;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Nombre = (EditText)findViewById(R.id.editText);
        Nivel = (Spinner)findViewById(R.id.spinner);
        
    }

    private void checkData(){
        if (Nombre.getText().toString().isEmpty()){
            Toast.makeText(this, "Ingrese un nombre...", Toast.LENGTH_SHORT).show();
            Data = false;
        }
        if (Nivel.getSelectedItem().toString().equals("Seleciona un nivel...")){
            Toast.makeText(this, "Ingrese un nivel...", Toast.LENGTH_SHORT).show();
            Data = false;
        }
        else {
            Data = true;
        }
    }
    
    public void Jugar(View view){
    checkData();
    if (Data){
        Jugador jugador = new Jugador();
        jugador.setName(Nombre.getText().toString());
        jugador.setNivel(Nivel.getSelectedItem().toString());
        Toast.makeText(this, "¡A JUGAR!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TriviaActivity.class);
        startActivity(intent);
    }
        
    }

    public void at(View view){
        Intent intent = new Intent(this, AcercaActivity.class);
        startActivity(intent);
    }

}
