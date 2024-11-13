package com.example.p97s11cronometroservice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button lanzar, detener;
TextView lblcronometro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblcronometro = findViewById(R.id.cronometro);
        lanzar = findViewById(R.id.btnA1Iniciar);
        detener = findViewById(R.id.btnA1Detener);
        Cronometro cronometro = new Cronometro(getApplicationContext());
        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cronometro.setView(lblcronometro); //para ver en pantalla
                //cronometro.nuevo(); //para ver en logs
            }
        });

        detener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cronometro.onDestroy();
            }
        });

    }
}