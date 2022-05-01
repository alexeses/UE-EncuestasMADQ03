package com.github.alexeses.gui;

import com.github.alexeses.control.CPrograma;

import javax.swing.*;

public class VMenuMain extends JFrame {
    private JMenuItem jMenuEncuesta;
    private JMenuItem jMenuConsultar;
    private JScrollPane scrpFrame;
    private JPanel mainMenu;

    public VMenuMain() {
        setContentPane(mainMenu);
        initComponents();
    }

    private void initComponents() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);
        setVisible(true);
        setSize(600, 400);
        System.out.println("Gola");
    }

    public void cargarPanel(JPanel panel) {
        scrpFrame.setViewportView(panel);
    }

    public void setControlador(CPrograma controlador) {
        jMenuEncuesta.addActionListener(controlador);
        jMenuConsultar.addActionListener(controlador);
    }

    public JMenuItem getjMenuEncuesta() {
        return jMenuEncuesta;
    }

    public JMenuItem getjMenuConsultar() {
        return jMenuConsultar;
    }
}
