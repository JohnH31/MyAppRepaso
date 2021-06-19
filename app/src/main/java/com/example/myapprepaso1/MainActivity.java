package com.example.myapprepaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSumar:
                Intent intent = new Intent(this, MASuma.class);
                startActivity(intent);
                break;
            case R.id.btnRestar:
                Intent intenti = new Intent(this, MAResta.class);
                startActivity(intenti);
                break;
            case R.id.btnMultiplicar:
                Intent intente = new Intent(this, MAMultiplicacion.class);
                startActivity(intente);
                break;
            case R.id.btnDividir:
                Intent intenta = new Intent(this, MADivicion.class);
                startActivity(intenta);
                break;
        }
    }
}