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

public class Trivia4Activity extends AppCompatActivity {
    TextView pregunta;
    ImageView Bien, Mal;
    public int DURACION_SPLASH = 3000;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    Jugador jugador = new Jugador();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia4);
        pregunta = (TextView) findViewById(R.id.textView4);
        Bien = (ImageView)findViewById(R.id.imageView3);
        Mal = (ImageView)findViewById(R.id.imageView4);
        mediaPlayer = MediaPlayer.create(this, R.raw.bien);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.mal);

        pre1();
    }

    private void pre1() {
        pregunta.setText("4.-Definiciones de las propiedades y comportamientos de un tipo de objeto concreto, Las instancias es la lectura de estas definiciones y la creación de un objeto a partir de ella." +
                "\nA)Mensaje" +
                "\nB)Constructor" +
                "\nC)Objecto");
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
                Intent intent = new Intent(Trivia4Activity.this, Trivia5Activity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
