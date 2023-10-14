package com.example.trabajadorapp.models;

import androidx.annotation.NonNull;

public class Persona{
    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;

    public Persona(){
        this.idPersona = 0;
        this.nombrePersona = "";
        this.apellidoPersona = "";
        this.edadPersona = 0;
    }

    public Persona(int idPersona, String nombrePersona, String apellidoPersona, int edadPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @NonNull
    @Override
    public String toString(){
        return idPersona + nombrePersona + edadPersona;
    }
}
