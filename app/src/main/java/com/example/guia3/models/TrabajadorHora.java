package com.example.guia3.models;

public class TrabajadorHora extends Trabajador {
    private int numeroHoras;
    private float valorHora;

    public TrabajadorHora(String codigo, String nombre, String apellido, int numeroHoras, float valorHora, float sueldoMensual, float descuentoISR, float totalDescuentos, float totalPagar) {
        super(codigo, nombre, apellido, sueldoMensual, descuentoISR, totalDescuentos, totalPagar);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getValorHora() {
        return valorHora;
    }

    @Override
    public int getTipoTrabajador() {
        return 1;
    }
}
