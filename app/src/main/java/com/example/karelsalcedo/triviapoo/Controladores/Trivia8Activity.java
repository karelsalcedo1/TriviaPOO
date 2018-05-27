package com.example.karelsalcedo.triviapoo.Controladores;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karelsalcedo.triviapoo.Modelos.Jugador;
import com.example.karelsalcedo.triviapoo.R;

public class Trivia8Activity extends AppCompatActivity {
    TextView pregunta;
    ImageView Bien, Mal;
    public int DURACION_SPLASH = 3000;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    Jugador jugador = new Jugador();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia8);
        pregunta = (TextView) findViewById(R.id.textView4);
        Bien = (ImageView)findViewById(R.id.imageView3);
        Mal = (ImageView)findViewById(R.id.imageView4);
        mediaPlayer = MediaPlayer.create(this, R.raw.bien);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.mal);

        pre1();
    }

    private void pre1() {
        pregunta.setText("8.-Es una función cuyo comportamiento, al ser declarado, es determinado por la definición de una función con la misma cabecera en alguna de sus subclases." +
                "\nA)Destructor" +
                "\nB)New" +
                "\nC)Constructor");
    }


    public void A(View view){
        Mal.setVisibility(View.VISIBLE);
        mediaPlayer2.start();
        Timer();
    }

    public void B(View view){
        Mal.setVisibility(View.VISIBLE);
        mediaPlayer2.start();
        Timer();
    }

    public void C(View view){
        Bien.setVisibility(View.VISIBLE);
        mediaPlayer.start();
        int suma = jugador.getCalificacion() + 1;
        jugador.setCalificacion(suma);
        Timer();
    }

    private void Timer(){
        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(Trivia8Activity.this, Trivia9Activity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
