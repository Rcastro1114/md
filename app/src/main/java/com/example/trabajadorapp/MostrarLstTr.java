package com.example.trabajadorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.trabajadorapp.adapters.PersonaAdapter;
import com.example.trabajadorapp.models.Trabajador;

import java.util.ArrayList;

public class MostrarLstTr extends AppCompatActivity {

    private PersonaAdapter personaAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    public static ArrayList<Trabajador> lstTrabajador = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lst_tr);

        Toast.makeText(this, "DATOS: "+ lstTrabajador, Toast.LENGTH_SHORT).show();
        personaAdapter = new PersonaAdapter(lstTrabajador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rcvPersonas);
        recyclerView.setAdapter(personaAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }
}