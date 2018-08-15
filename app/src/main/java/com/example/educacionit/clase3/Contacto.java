package com.example.educacionit.clase3;

public class Contacto {
    private String nombre;
    private String apellido;
    private String numero;

    public Contacto(String nombre, String apellido, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
