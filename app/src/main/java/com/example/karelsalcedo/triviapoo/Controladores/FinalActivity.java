package com.example.karelsalcedo.triviapoo.Controladores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karelsalcedo.triviapoo.Modelos.Jugador;
import com.example.karelsalcedo.triviapoo.R;

public class FinalActivity extends AppCompatActivity {
    ImageView Oro, Plata, Bronce;
    TextView Nombre, ca;
    Jugador jugador = new Jugador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Oro = (ImageView)findViewById(R.id.Oro);
        Plata = (ImageView)findViewById(R.id.Plata);
        Bronce = (ImageView)findViewById(R.id.Bronce);
        Nombre = (TextView)findViewById(R.id.Nombre);
        ca = (TextView)findViewById(R.id.caf);
        String name = jugador.getName();
        int cali = jugador.getCalificacion();
        int Total = cali * 10;
        String calificacion = Integer.toString(Total);
        ca.setText("Tu calificacion es: " +calificacion);
        Nombre.setText(name);
        if (Total == 100){
            Oro.setVisibility(View.VISIBLE);
        }
        if (Total == 90){
            Oro.setVisibility(View.VISIBLE);
        }
        if (Total == 80){
            Oro.setVisibility(View.VISIBLE);
        }
        if (Total == 70){
            Plata.setVisibility(View.VISIBLE);
        }
        if (Total == 60){
            Plata.setVisibility(View.VISIBLE);
        }
        if (Total == 50){
            Plata.setVisibility(View.VISIBLE);
        }
        if (Total == 40){
            Bronce.setVisibility(View.VISIBLE);
        }
        if (Total == 30){
            Bronce.setVisibility(View.VISIBLE);
        }
        if (Total == 20){
            Bronce.setVisibility(View.VISIBLE);
        }
        if (Total == 10){
            Bronce.setVisibility(View.VISIBLE);
        }
        if (Total == 0){
            Bronce.setVisibility(View.VISIBLE);
        }
    }


    public void back(View view){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
