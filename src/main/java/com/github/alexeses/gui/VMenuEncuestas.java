package com.github.alexeses.gui;

import com.github.alexeses.control.CPrograma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VMenuEncuestas extends JPanel {
    private JPanel principal;
    private JComboBox cmbSexo;
    private JLabel lblSexo;
    private JLabel lblEdad;
    private JSpinner spnEdad;
    private JLabel lplPartido;
    private JRadioButton rd00;
    private JRadioButton rd01;
    private JRadioButton rd05;
    private JRadioButton rd03;
    private JRadioButton rd04;
    private JRadioButton rd02;
    private JRadioButton rd06;
    private JButton btnGuardar;
    private JButton btnBorrar;

    public VMenuEncuestas() {
        add(principal);
        // Ajustamos la selección de los botones
        onBoton(0);
    }

    public void onBoton(int opcion) {
        rd01.setSelected(opcion == 1);
        rd02.setSelected(opcion == 2);
        rd03.setSelected(opcion == 3);
        rd04.setSelected(opcion == 4);
        rd05.setSelected(opcion == 5);
        rd06.setSelected(opcion == 6);
        rd00.setSelected(opcion == 0);
    }

    public void offBoton(int opcion) {
        rd00.setSelected(opcion != 0);
        rd01.setSelected(opcion != 1);
        rd05.setSelected(opcion != 5);
        rd03.setSelected(opcion != 3);
        rd04.setSelected(opcion != 4);
        rd02.setSelected(opcion != 2);
        rd06.setSelected(opcion != 6);
    }

    public void setControlador(CPrograma controlador) {
        btnGuardar.addActionListener(controlador);
        btnBorrar.addActionListener(controlador);
        rd00.addActionListener(controlador);
        rd01.addActionListener(controlador);
        rd05.addActionListener(controlador);
        rd03.addActionListener(controlador);
        rd04.addActionListener(controlador);
        rd02.addActionListener(controlador);
        rd06.addActionListener(controlador);
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public JRadioButton getRd00() {
        return rd00;
    }

    public void setRd00(JRadioButton rd00) {
        this.rd00 = rd00;
    }

    public JRadioButton getRd01() {
        return rd01;
    }

    public void setRd01(JRadioButton rd01) {
        this.rd01 = rd01;
    }

    public JRadioButton getRd05() {
        return rd05;
    }

    public void setRd05(JRadioButton rd05) {
        this.rd05 = rd05;
    }

    public JRadioButton getRd03() {
        return rd03;
    }

    public void setRd03(JRadioButton rd03) {
        this.rd03 = rd03;
    }

    public JRadioButton getRd04() {
        return rd04;
    }

    public void setRd04(JRadioButton rd04) {
        this.rd04 = rd04;
    }

    public JRadioButton getRd02() {
        return rd02;
    }

    public void setRd02(JRadioButton rd02) {
        this.rd02 = rd02;
    }

    public JRadioButton getRd06() {
        return rd06;
    }

    public void setRd06(JRadioButton rd06) {
        this.rd06 = rd06;
    }
}
