package com.example.p37s11parcelable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText nombre, correo, telefono;
Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtA1Nombre);
        correo = findViewById(R.id.txtA1Correo);
        telefono = findViewById(R.id.txtA1Telefono);
        enviar =findViewById(R.id.btnA1Enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                envioBundle(v);
            }
        });
    }

    public void envioBundle(View v){
        Datos datos = new Datos(nombre.getText().toString(),correo.getText().toString(),telefono.getText().toString());
        Intent intent = new Intent(this, pantallaBundle.class);
        intent.putExtra("datosParce",datos);
        startActivity(intent);
    }
}