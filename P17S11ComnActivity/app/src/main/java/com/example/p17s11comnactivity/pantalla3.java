package com.example.p17s11comnactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pantalla3 extends AppCompatActivity {
TextView lblA3Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        lblA3Nombre = findViewById(R.id.lblA3Dato);
        Bundle parametro = getIntent().getExtras();
        lblA3Nombre.setText("Bienvenido: "+parametro.getString("nombre"));
    }
}