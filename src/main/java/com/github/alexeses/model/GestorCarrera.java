package com.github.alexeses.model;

import com.github.alexeses.Instancia;

import java.util.ArrayList;

public class GestorCarrera {

    public ArrayList<Corredor> carrera;

    public GestorCarrera(){
        carrera = new ArrayList<>();
    }

    public ArrayList<Corredor> getCarrera() {
        return carrera;
    }

    public void addEncuesta(Corredor corredor) {
        carrera.add(corredor);
        Instancia.INSTANCIA.getvC().updateTable();
    }

    public void verCarrera(){
        for(Corredor corredor : carrera){
            System.out.println(corredor.toString());
        }
    }

}