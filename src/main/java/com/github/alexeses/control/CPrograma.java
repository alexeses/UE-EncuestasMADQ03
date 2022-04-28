package com.github.alexeses.control;

import com.github.alexeses.gui.VMenuConsultas;
import com.github.alexeses.gui.VMenuEncuestas;
import com.github.alexeses.gui.VMenuMain;
import com.github.alexeses.model.GestionEncuestas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPrograma implements ActionListener {
    GestionEncuestas gE;
    VMenuConsultas vC;
    VMenuEncuestas vE;
    VMenuMain vM;

    public CPrograma(GestionEncuestas gE, VMenuConsultas vC, VMenuEncuestas vE, VMenuMain vM) {
        this.gE = gE;
        this.vC = vC;
        this.vE = vE;
        this.vM = vM;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JMenuItem) {
            if (e.getSource().equals(vM.getjMenuEncuesta())) {
                vM.cargarPanel(vE);
                System.out.println("Encuesta");
            }
        }

        vE.getRd00().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TADO: Me he quedado en el controlador de los botones,
                // si seleccionas uno, se deben quitar los demás.
                if (vE.getRd00().isSelected()) {
                    vE.offBoton(0);
                    System.out.println("00");
                } else if (vE.getRd01().isSelected()) {
                    vE.offBoton(1);
                    System.out.println("Boton 1");
                } else if (vE.getRd02().isSelected()) {
                    vE.offBoton(2);
                    System.out.println("Boton 2");
                }
            }
        });
    }
}
