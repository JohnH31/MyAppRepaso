package com.example.myapprepaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MADivicion extends AppCompatActivity {
    private EditText campo1,campo2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madivicion);
        campo1 = findViewById(R.id.txtN1);
        campo2 = findViewById(R.id.txtN2);
        resultado = findViewById(R.id.txtResultadoD);
    }
    private void dividir(){
        String num1 = campo1.getText().toString();
        String num2 = campo2.getText().toString();

        if (!num1.isEmpty() && !num2.isEmpty()){
            float divi = Float.parseFloat(num1) / Float.parseFloat(num2);
            resultado.setText("La divicion es: "+divi);
        }else{
            Toast.makeText(this,"Campos vacios", Toast.LENGTH_SHORT).show();
        }

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btndivicion:
                this.dividir();
                break;
        }
    }
}