package com.example.trabajadorapp.models;

public class TrabajadorTiempoCompleto extends com.example.trabajadorapp.models.Trabajador {
    private float descuentoAFP;
    private float descuentoISSS;

    public TrabajadorTiempoCompleto(){
        this.descuentoAFP = 0;
        this.descuentoISSS = 0;
    }

    @Override
    public int geTipoTrabajador() {
        return 2;
    }

    public TrabajadorTiempoCompleto(int idPersona, String nombrePersona, String apellidoPersona, int edadPersona, float sueldoMensual) {
        super(idPersona, nombrePersona, apellidoPersona, edadPersona);
        this.sueldoMensual = sueldoMensual;

        //TAREAS A REALIZAR
        if (this.sueldoMensual <= 1000){
            this.descuentoISSS = (float) (this.sueldoMensual*0.03);
        }else {
            this.descuentoISSS = 30;
        }if(this.sueldoMensual <= 7028.29){
            this.descuentoAFP = (float) (this.sueldoMensual*0.0725);
        }if(this.sueldoMensual >= 0.01 && this.sueldoMensual <= 472){
            this.descuentoISR = 0;
        }if(this.sueldoMensual >= 472.01 && this.sueldoMensual <= 895.24){
            this.descuentoISR = (float) ((this.sueldoMensual - this.descuentoISSS - this.descuentoAFP - 472)*0.1+17.67);
        }if(this.sueldoMensual >= 895.25 && this.sueldoMensual <= 2038.10){
            this.descuentoISR = (float) ((this.sueldoMensual - this.descuentoISSS - this.descuentoAFP - 895.24)*0.2+60);
        }if(this.sueldoMensual >= 2038.11){
            this.descuentoISR = (float) ((this.sueldoMensual - this.descuentoISSS - this.descuentoAFP - 2038.1)*0.3+288.57);
        }
        this.totalDescuentos = this.descuentoISSS + this.descuentoAFP + this.descuentoISR;
        this.totalPagar = this.sueldoMensual - this.totalDescuentos;
        this.sueldoMensual = this.totalPagar;
    }

    public float getDescuentoAFP() {
        return descuentoAFP;
    }

    public void setDescuentoAFP(float descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public float getDescuentoISSS() {
        return descuentoISSS;
    }

    public void setDescuentoISSS(float descuentoISSS) {
        this.descuentoISSS = descuentoISSS;
    }

}
