package com.example.p57s11spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner splista;
List<String>MiLista = new ArrayList<>(Arrays.asList("Edo Mex","CDMX","Puebla","Morelos","Veracrus","Guerrero"));
ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splista = findViewById(R.id.spA1Estado);
        splista.setOnItemSelectedListener((new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Se Selecciono: "+ valor, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }));

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,MiLista);
        splista.setAdapter(adaptador);
    }

}
