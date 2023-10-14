package com.example.guia3.models;

public class TrabajadorTiempoCompleto extends Trabajador {

    private float descuentoAFP;
    private float descuentoISSS;

    public TrabajadorTiempoCompleto(String codigo, String nombre, String apellido, float descuentoISR, float totalDescuentos, float totalPagar, float sueldoMensual, float descuentoAFP, float descuentoISSS) {
        super(codigo, nombre, apellido,  sueldoMensual, descuentoISR, totalDescuentos, totalPagar);
        this.descuentoAFP = descuentoAFP;
        this.descuentoISSS = descuentoISSS;
        setSueldoMensual(sueldoMensual);
    }

    public void setDescuentoAFP(float descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public float getDescuentoAFP() {
        return descuentoAFP;
    }

    public void setDescuentoISSS(float descuentoISSS) {
        this.descuentoISSS = descuentoISSS;
    }

    public float getDescuentoISSS() {
        return descuentoISSS;
    }

    @Override
    public int getTipoTrabajador() {
        return 2;
    }
}
