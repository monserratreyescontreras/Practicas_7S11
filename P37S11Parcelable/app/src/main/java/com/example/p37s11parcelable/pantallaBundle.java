package com.example.p37s11parcelable;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pantallaBundle extends AppCompatActivity {
TextView nombre,correo,telefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_bundle);

        Datos datos = getIntent().getParcelableExtra("datosParce");

        nombre = findViewById(R.id.lblA2Nombre);
        correo = findViewById(R.id.lblA2Correo);
        telefono = findViewById(R.id.lblA2Telefono);

        nombre.setText(datos.getNombre());
        correo.setText(datos.getCorreo());
        telefono.setText(datos.getTelefono());
    }
}