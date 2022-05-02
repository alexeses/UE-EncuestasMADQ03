package com.github.alexeses.model;

public class Corredor {

    private final String nombre;
    private final int dorsal;
    private final String sexo;
    private final int edad;
    private final String modalidad;

    public Corredor(String nombre, int dorsal, String sexo, int edad, String modalidad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.sexo = sexo;
        this.edad = edad;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getModalidad() {
        return modalidad;
    }
}
