package com.example.ejercicioaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i( "MainActivity", "Aqui se crea la aplicacion");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i( "MainActivity", "Aqui comienza la aplicacion");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivity", "La aplicacion se ha reiniciado");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity", "La aplicacion se ha resumido");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity", "La aplicacion se ha pausado");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity", "La aplicaciones se ha parado");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity", "La aplicacion se ha destruido");
    }
}
