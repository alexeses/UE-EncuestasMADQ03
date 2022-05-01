package com.github.alexeses.control;

import com.github.alexeses.gui.VMenuConsultas;
import com.github.alexeses.gui.VMenuCorredor;
import com.github.alexeses.gui.VMenuMain;
import com.github.alexeses.model.GestorCarrera;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPrograma implements ActionListener {
    GestorCarrera gC;
    VMenuConsultas vC;
    VMenuCorredor vE;
    VMenuMain vM;

    public CPrograma(GestorCarrera gC, VMenuConsultas vC, VMenuCorredor vE, VMenuMain vM) {
        this.gC = gC;
        this.vC = vC;
        this.vE = vE;
        this.vM = vM;
    }

    // ===*+ ACTION LISTENERS +*===

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JMenuItem) {
            if (e.getSource().equals(vM.getjMenuEncuesta())) {
                vM.cargarPanel(vE);
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
                vE.guardarEncuesta();
            }
        });


    }
}
