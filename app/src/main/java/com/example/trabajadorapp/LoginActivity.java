package com.example.trabajadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.example.trabajadorapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        configSharedPreference();

        binding.btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoading();
            }
        });
    }

    private void configSharedPreference(){
        SharedPreferences sharedPreferences = getSharedPreferences("MISDATOS", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email","admin@admin");
        editor.putString("pass","Admin");
        editor.apply();
    }

    //VALIDAD CREDENCIALES
    private boolean verificarCredenciales(String email, String pass){
        boolean esValido = false;

        SharedPreferences sharedPreferences = getSharedPreferences("MISDATOS", Context.MODE_PRIVATE);
        //extraemos los valores del shared
        String _email = sharedPreferences.getString("email","default");
        String _pass = sharedPreferences.getString("pass","default");

        if(email.equals(_email) && pass.equals(_pass)){
            esValido = true;
        }
        return esValido;
    }

    //PROCEDIMIENTO DE ANIMACION
    private void showLoading(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
        builder.setCancelable(false);

        //UTILIZACION DEL PROGRESSBAR CREADO POR NOSOTROS
        View progressBar = getLayoutInflater().inflate(R.layout.progressbar,null);

        //AGREGAMOS EL PROGRESSBAR AL ALERTDIALOG
        builder.setView(progressBar);
        //CREACIÓN DEL ALERTDIALOG
        final AlertDialog dialog = builder.create();
        //MOSTRAR ALERTA
        dialog.show();

            new Handler().postDelayed(() -> {
               try{
                   if(dialog.isShowing()){
                        //PROGRAMAMOS EL PROCEDIMIENTO DESPUES DE HABER TRANSCURRIDO 3 SEGUNDOS
                       if(verificarCredenciales(binding.edtEmail.getText().toString(),binding.edtPassword.getText().toString())){
                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            dialog.dismiss();
                            finish();
                       } else {
                           Toast.makeText(LoginActivity.this, "CREDENCIALES INCORRECTAS", Toast.LENGTH_SHORT).show();
                           dialog.dismiss();
                       }
                   }
               } catch(Exception e){
                    e.printStackTrace();
               }
            }, 3000); //3000 milisegundos
    }
}