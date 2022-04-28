package com.github.alexeses;

import com.github.alexeses.control.CPrograma;
import com.github.alexeses.gui.VMenuConsultas;
import com.github.alexeses.gui.VMenuEncuestas;
import com.github.alexeses.gui.VMenuMain;
import com.github.alexeses.model.GestionEncuestas;

import java.awt.*;

public class main {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                VMenuMain vM = new VMenuMain();
                VMenuEncuestas vE = new VMenuEncuestas();
                VMenuConsultas vC = new VMenuConsultas();

                GestionEncuestas gE = new GestionEncuestas();

                CPrograma c = new CPrograma(gE, vC, vE, vM);

                vM.setVisible(true);
                vM.setControlador(c);
            }
        });

    }
}
