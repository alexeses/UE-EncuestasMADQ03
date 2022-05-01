package com.github.alexeses.model;

import java.util.ArrayList;

public class GestorCarrera {

    private ArrayList<Corredor> carrera;

    public void setEncuestas() {
        carrera = new ArrayList<>();
    }

    public void addEncuesta(Corredor encuesta) {
        carrera.add(encuesta);
    }

    public Corredor getEncuesta(int i) {
        return carrera.get(i);
    }
}
