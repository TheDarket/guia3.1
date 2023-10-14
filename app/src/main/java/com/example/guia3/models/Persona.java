package com.example.guia3.models;

public class Persona {
    protected String codigoPersona;
    protected String nombrePersona;
    protected String apellidoPersona;

    public Persona(String codigo, String nombre, String apellido) {
        this.codigoPersona = codigo;
        this.nombrePersona = nombre;
        this.apellidoPersona = apellido;
    }

    public void setCodigoPersona(String codigo){this.codigoPersona = codigo;}
    public String getCodigoPersona() {return codigoPersona;}
    public void setNombrePersona(String nombre) {
        this.nombrePersona = nombre;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setApellidoPersona(String apellido) {
        this.apellidoPersona = apellido;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }
}
