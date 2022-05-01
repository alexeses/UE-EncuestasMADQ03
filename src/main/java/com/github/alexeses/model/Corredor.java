package com.github.alexeses.model;

public class Corredor {
    private String nombre;
    private int dorsal;
    private String sexo;
    private int edad;
    private String modalidad;

    public Corredor(String nombre, int dorsal, String sexo, int edad, String modalidad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.sexo = sexo;
        this.edad = edad;
        this.modalidad = modalidad;
    }
}
