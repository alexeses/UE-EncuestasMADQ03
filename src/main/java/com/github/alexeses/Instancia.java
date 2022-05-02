package com.github.alexeses;

import com.github.alexeses.control.CPrograma;
import com.github.alexeses.gui.VMenuConsultas;
import com.github.alexeses.gui.VMenuCorredor;
import com.github.alexeses.gui.VMenuMain;
import com.github.alexeses.model.GestorCarrera;

import java.awt.*;

public class Instancia {

    private VMenuMain vM;
    private VMenuCorredor vE;
    private VMenuConsultas vC;
    private CPrograma c;
    private GestorCarrera gC;
    public static Instancia INSTANCIA;

    public Instancia() {
        INSTANCIA = this;

        EventQueue.invokeLater(() -> {

            vM = new VMenuMain();
            vE = new VMenuCorredor();
            gC = new GestorCarrera();
            vC = new VMenuConsultas();

            c = new CPrograma();

            vM.setVisible(true);
            vM.setControlador(c);
        });
    }

    public VMenuMain getvM() {
        return vM;
    }

    public VMenuCorredor getvE() {
        return vE;
    }

    public VMenuConsultas getvC() {
        return vC;
    }

    public CPrograma getC() {
        return c;
    }

    public GestorCarrera getgC() {
        return gC;
    }
}
