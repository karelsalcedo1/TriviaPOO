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

public class Trivia10Activity extends AppCompatActivity {
    TextView pregunta;
    ImageView Bien, Mal;
    public int DURACION_SPLASH = 3000;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    Jugador jugador = new Jugador();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia10);
        pregunta = (TextView) findViewById(R.id.textView4);
        Bien = (ImageView)findViewById(R.id.imageView3);
        Mal = (ImageView)findViewById(R.id.imageView4);
        mediaPlayer = MediaPlayer.create(this, R.raw.bien);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.mal);

        pre1();
    }

    private void pre1() {
        pregunta.setText("10.-Es una comunicación dirigida a un objeto, que le ordena que ejecute uno de sus métodos con ciertos parámetros asociados al evento que lo genero." +
                "\nA)Constructor" +
                "\nB)Mensaje" +
                "\nC)Herencia");
    }


    public void A(View view){
        Mal.setVisibility(View.VISIBLE);
        mediaPlayer2.start();
        Timer();
    }

    public void B(View view){
        Bien.setVisibility(View.VISIBLE);
        mediaPlayer.start();
        int suma = jugador.getCalificacion() + 1;
        jugador.setCalificacion(suma);
        Timer();

    }

    public void C(View view){
        Mal.setVisibility(View.VISIBLE);
        mediaPlayer2.start();
        Timer();
    }

    private void Timer(){
        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(Trivia10Activity.this, FinalActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
