package com.example.trabajadorapp.models;

public abstract class Trabajador extends com.example.trabajadorapp.models.Persona {
    protected float sueldoMensual;
    protected float descuentoISR;

    protected float totalDescuentos;
    protected float totalPagar;

    public Trabajador(){
        //super(lstPersonas.size() + 1, edtnombre.getText().toString(), edtapellido.getText().toString(), Integer.parseInt(edtedad.getText().toString()), Integer.parseInt(edtvalorh.getText().toString()), Integer.parseInt(edthr.getText().toString()));
        this.sueldoMensual = 0;
        this.descuentoISR = 0;
        this.totalDescuentos = 0;
        this.totalPagar = 0;
    }

    public Trabajador(int idPersona, String nombrePersona, String apellidoPersona, int edadPersona) {
        super(idPersona, nombrePersona, apellidoPersona, edadPersona);
    }

    public float getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public float getDescuentoISR() {
        return descuentoISR;
    }

    public void setDescuentoISR(float descuentoISR) {
        this.descuentoISR = descuentoISR;
    }

    public float getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(float totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public abstract int geTipoTrabajador();
}
