package com.example.p17s11comnactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btnSiguiente, btnA1pasaParametro;
EditText txtA1Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = findViewById(R.id.btnA1SigAct);
        btnA1pasaParametro = findViewById(R.id.btnA1pasoNombre);
        txtA1Nombre = findViewById(R.id.txtA1Nombre);

        btnA1pasaParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasoParametro(v);
            }
        });

    }
    public void sigPantalla(View v){
        //DEFINIMOS EL INTENT
        Intent intent = new Intent(this, pantalla2.class);
        startActivity(intent);
    }

    public void pasoParametro(View v){
        Intent intent = new Intent(this, pantalla3.class);
        intent.putExtra("nombre",txtA1Nombre.getText().toString());
        startActivity(intent);
    }

}