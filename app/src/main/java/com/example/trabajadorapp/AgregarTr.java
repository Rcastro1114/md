package com.example.trabajadorapp;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.trabajadorapp.MostrarLstTr.lstTrabajador;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.trabajadorapp.models.TrabajadorHora;
import com.example.trabajadorapp.models.TrabajadorTiempoCompleto;
import com.google.android.material.textfield.TextInputEditText;
public class AgregarTr extends AppCompatActivity {

    private TextInputEditText edtNombre, edtApellido, edtEdad, edtValorPorH, edtHora, edtsueldo;
    private int idEleccionTrab = 0;
    private Button btnSaveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_tr);

        edtNombre = findViewById(R.id.edtName);
        edtApellido = findViewById(R.id.edtLastName);
        edtEdad = findViewById(R.id.edtAge);
        edtValorPorH = findViewById(R.id.edtValorporhora);
        edtHora = findViewById(R.id.edtHora);
        edtsueldo = findViewById(R.id.edtSueldo);
        btnSaveData = findViewById(R.id.btnSaveData);

        Bundle bundle = getIntent().getExtras();
        idEleccionTrab = bundle.getInt("tipoEleccionTr");

        if(idEleccionTrab == 1){
            edtsueldo.setVisibility(View.GONE);
        }else if(idEleccionTrab == 2){
            edtHora.setVisibility(View.GONE);
            edtValorPorH.setVisibility(View.GONE);
        }


        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idEleccionTrab == 1){
                    lstTrabajador.add(new TrabajadorHora(lstTrabajador.size() + 1, edtNombre.getText().toString(), edtApellido.getText().toString(),
                            Integer.valueOf(edtEdad.getText().toString()),Integer.valueOf(edtHora.getText().toString()), Integer.valueOf(edtValorPorH.getText().toString())));
                    AlertaDialogo();
                } else if (idEleccionTrab == 2) {
                    lstTrabajador.add(new TrabajadorTiempoCompleto(lstTrabajador.size() + 1, edtNombre.getText().toString(),
                            edtApellido.getText().toString(), Integer.valueOf(edtEdad.getText().toString()), Float.valueOf(edtsueldo.getText().toString())));
                    AlertaDialogo();
                }
            }
        });
    }

    private void AlertaDialogo(){
        new AlertDialog.Builder(this)
                .setTitle("¡REGISTRO!")
                .setMessage("Los datos han sido registrados")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(AgregarTr.this, MainActivity.class));
                    }
                })
                .show();
    }
}