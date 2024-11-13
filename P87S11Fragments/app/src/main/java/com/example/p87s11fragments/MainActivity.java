package com.example.p87s11fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
Button btnF1, btnF2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnF1 = findViewById(R.id.btnA1Frg1);
        btnF2 = findViewById(R.id.btnA1Frg2);

        Fragment funo = new PrimerFragment();
        Fragment fdos = new SegundoFragment();

        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                f1.replace(R.id.contenedorFragment, funo).commit();
            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                f2.replace(R.id.contenedorFragment, fdos).commit();
            }
        });

    }
}