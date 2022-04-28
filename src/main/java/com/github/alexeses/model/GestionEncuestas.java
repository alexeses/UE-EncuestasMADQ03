package com.github.alexeses.model;

import java.util.ArrayList;

public class GestionEncuestas {

    private ArrayList<Encuesta> encuestas;

    public void setEncuestas() {
        encuestas = new ArrayList<>();
    }

    public void addEncuesta(Encuesta encuesta) {
        encuestas.add(encuesta);
    }

    public Encuesta getEncuesta(int i) {
        return encuestas.get(i);
    }
}
