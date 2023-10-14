package com.example.trabajadorapp.models;

import androidx.annotation.NonNull;
public class TrabajadorHora extends com.example.trabajadorapp.models.Trabajador {
    private int numeroHoras;
    private float valorHora;

    public TrabajadorHora(){
        this.numeroHoras = 0;
        this.valorHora = 0;
    }

    @Override
    public int geTipoTrabajador() {

        return 1;
    }

    public TrabajadorHora(int idPersona, String nombrePersona, String apellidoPersona, int edadPersona, int numeroHoras, float valorHora) {
        super(idPersona, nombrePersona, apellidoPersona, edadPersona);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
        this.sueldoMensual = numeroHoras*valorHora;
        //TAREAS A REALIZAR
        this.descuentoISR = (float) (this.sueldoMensual * 0.1);
        this.totalDescuentos = this.descuentoISR;
        this.totalPagar = this.sueldoMensual - this.totalDescuentos;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

}
