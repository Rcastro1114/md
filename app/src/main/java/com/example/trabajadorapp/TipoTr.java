package com.example.trabajadorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class TipoTr extends AppCompatActivity {

    private RadioButton rdbPorHora,rdbTiempoCompleto;
    private Bundle bundle;
    private RadioGroup rdgTrabajador;
    private Button btnNextAg;

    private int idEleccionTrab = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_tr);

        rdgTrabajador = findViewById(R.id.rdGroupButton);
        rdbPorHora = rdgTrabajador.findViewById(R.id.rButtPorHora);
        rdbTiempoCompleto = rdgTrabajador.findViewById(R.id.rdbuttTiempoComp);
        btnNextAg = findViewById(R.id.btnSiguienteAgr);

        rdbPorHora.setOnClickListener(v -> idEleccionTrab = 1);
        rdbTiempoCompleto.setOnClickListener(v -> idEleccionTrab = 2);

        btnNextAg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle = new Bundle();
                bundle.putInt("tipoEleccionTr", idEleccionTrab);
                Intent intent = new Intent(TipoTr.this, AgregarTr.class);
                intent.putExtras(bundle);
                startActivity(intent);
                //startActivity(new Intent(AgregarTrab.this, TrabajadorPorHora.class));
            }
        });
    }
}