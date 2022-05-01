package com.github.alexeses;

import com.github.alexeses.control.CPrograma;
import com.github.alexeses.gui.VMenuConsultas;
import com.github.alexeses.gui.VMenuCorredor;
import com.github.alexeses.gui.VMenuMain;
import com.github.alexeses.model.GestorCarrera;

import java.awt.*;

public class main {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                VMenuMain vM = new VMenuMain();
                VMenuCorredor vE = new VMenuCorredor();
                VMenuConsultas vC = new VMenuConsultas();

                GestorCarrera gC = new GestorCarrera();

                CPrograma c = new CPrograma(gC, vC, vE, vM);

                vM.setVisible(true);
                vM.setControlador(c);
            }
        });

    }
}
