package com.example.componentes3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void iniciar(View v){
        this.v = v;
        Intent i= new Intent(this,ServicioMusical.class);
        startService(i);
    }

}