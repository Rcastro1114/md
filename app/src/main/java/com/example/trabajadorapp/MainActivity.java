package com.example.trabajadorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;

import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {

    private Button btnAgregarT, btnMostrarList, btnAcercaDeR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregarT = findViewById(R.id.btnAgregarTrabajador);
        btnMostrarList = findViewById(R.id.btnMostrarListaTrab);
        btnAcercaDeR = findViewById(R.id.btnAcercaDe);

        btnAgregarT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TipoTr.class));
            }
        });

        btnMostrarList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MostrarLstTr.class));
            }
        });

        btnAcercaDeR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AcercaDe.class));
            }
        });

    }

}