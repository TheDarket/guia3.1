package com.example.guia3.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Trabajador extends Persona {

    protected float sueldoMensual;
    protected float descuentoISR;
    protected float totalDescuentos;
    protected float totalPagar;
    private static List<Trabajador> lstTrabajadores = new ArrayList<>();


    public Trabajador(String codigo, String nombre, String apellido, float sueldoMensual, float descuentoISR, float totalDescuentos, float totalPagar) {
        super(codigo, nombre, apellido);
        this.sueldoMensual = sueldoMensual;
        this.descuentoISR = descuentoISR;
        this.totalDescuentos = totalDescuentos;
        this.totalPagar = totalPagar;
    }
    public String getNombrePersona() {
        return super.getNombrePersona();
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public float getSueldoMensual() {
        return sueldoMensual;
    }


    public void setDescuentoISR(float descuentoISR) {
        this.descuentoISR = descuentoISR;
    }

    public float getDescuentoISR() {
        return descuentoISR;
    }


    public void setTotalDescuentos(float totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public float getTotalDescuentos() {
        return totalDescuentos;
    }


    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public static List<Trabajador> getListaTrabajadores() {
        return lstTrabajadores;
    }
    public abstract int getTipoTrabajador();
}
