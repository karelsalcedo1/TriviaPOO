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

public class TriviaActivity extends AppCompatActivity {
    TextView pregunta;
    ImageView Bien, Mal;
    public int DURACION_SPLASH = 3000;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    Jugador jugador = new Jugador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
        pregunta = (TextView) findViewById(R.id.textView4);
        Bien = (ImageView)findViewById(R.id.imageView3);
        Mal = (ImageView)findViewById(R.id.imageView4);
        mediaPlayer = MediaPlayer.create(this, R.raw.bien);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.mal);

        pre1();
    }

    private void pre1() {
        pregunta.setText("1.-Son comportamientos diferentes, asociados a objectos distintos, pero pueden compartir el mismo nombre." +
                "\nA)Polimorfismo" +
                "\nB)Objecto" +
                "\nC)Herencia");
    }


    public void A(View view){
        Bien.setVisibility(View.VISIBLE);
        mediaPlayer.start();
        int suma = jugador.getCalificacion() + 1;
        jugador.setCalificacion(suma);
        Timer();
    }

    public void B(View view){
        Mal.setVisibility(View.VISIBLE);
        mediaPlayer2.start();
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
                Intent intent = new Intent(TriviaActivity.this, Trivia2Activity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
    
}
