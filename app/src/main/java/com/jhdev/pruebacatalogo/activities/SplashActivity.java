package com.jhdev.pruebacatalogo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jhdev.pruebacatalogo.R;
import com.jhdev.pruebacatalogo.activities.main.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //se construye el hilo
        Thread timerThread = new Thread(){
            @Override
            public void run(){
                try{
                    //Duracion en milisegundos en el que se muestra el splash
                    sleep(4000);
                }catch(InterruptedException e){
                    Log.e("pruebaAndroid", "SplashActivity", e);
                }finally{

                    //Se muestra la pantalla principal
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }
}
