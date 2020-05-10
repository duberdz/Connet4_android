package com.example.connect4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void gotoAyuda(View v){
        //buttonSound.start();
        Intent a = new Intent(this, ayuda.class);
        startActivity(a);
    }

    public void gotoComenzar(View v){
        //buttonSound.start();
        Intent a = new Intent(this, Configuracion.class);
        //SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        startActivity(a);
        finish();
    }

    public void gotoSalir(View v){
        //buttonSound.start();
        finish();
    }
}
