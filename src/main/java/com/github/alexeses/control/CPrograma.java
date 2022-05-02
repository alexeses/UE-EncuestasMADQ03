package com.github.alexeses.control;

import com.github.alexeses.Instancia;
import com.github.alexeses.gui.Filtro;
import com.github.alexeses.gui.VMenuConsultas;
import com.github.alexeses.gui.VMenuCorredor;
import com.github.alexeses.gui.VMenuMain;
import com.github.alexeses.model.Corredor;
import com.github.alexeses.model.GestorCarrera;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPrograma implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        VMenuMain vM = Instancia.INSTANCIA.getvM();
        VMenuCorredor vE = Instancia.INSTANCIA.getvE();
        VMenuConsultas vC = Instancia.INSTANCIA.getvC();
        GestorCarrera gC = Instancia.INSTANCIA.getgC();

        if (e.getSource() instanceof JMenuItem) {
            if (e.getSource().equals(vM.getjMenuEncuesta())) {
                vM.cargarPanel(vE);
            } else if (e.getSource().equals(vM.getjMenuConsultar())) {
                vM.cargarPanel(vC);
            }
        }
        vE.getBtnLimpiar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vE.borrarEncuesta();
            }
        });

        vE.getBtnGuardar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Corredor corredor = vE.obtenerCorredor();
                if(corredor == null) return;
                gC.addEncuesta(corredor);
                vE.borrarEncuesta();
            }
        });

        vC.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vC.getCmbSeleccion().getSelectedItem().equals("Todo")) {
                    System.out.println("Todo");
                    Instancia.INSTANCIA.getvC().setFiltro(Filtro.TODOS);
                } else if (vC.getCmbSeleccion().getSelectedItem().equals("Hombres")) {
                    System.out.println("Hombres");
                    Instancia.INSTANCIA.getvC().setFiltro(Filtro.HOMBRES);
                } else if (vC.getCmbSeleccion().getSelectedItem().equals("Mujeres")) {
                    System.out.println("Mujeres");
                    Instancia.INSTANCIA.getvC().setFiltro(Filtro.MUJERES);
                }
                Instancia.INSTANCIA.getvC().updateTable();
            }
        });
    }
}
