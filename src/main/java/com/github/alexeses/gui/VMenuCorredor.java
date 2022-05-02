package com.github.alexeses.gui;

import com.github.alexeses.Instancia;
import com.github.alexeses.control.CPrograma;
import com.github.alexeses.model.Corredor;

import javax.swing.*;

public class VMenuCorredor extends JPanel {
    private JPanel principal;
    private JTextField txtNombre;
    private JTextField txtDorsal;
    private JLabel lblNombre;
    private JLabel lblDorsal;
    private JLabel lblSexo;
    private JLabel lblEdad;
    private JSpinner spnEdad;
    private JComboBox comboBox1;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JRadioButton rdMujer;
    private JRadioButton rdHombre;
    private JLabel lblModalidad;

    public VMenuCorredor() {
        add(principal);
    }

    public void setControlador(CPrograma controlador) {
        btnGuardar.addActionListener(controlador);
        btnLimpiar.addActionListener(controlador);
    }

    public void borrarEncuesta() {
        txtNombre.setText("");
        txtDorsal.setText("");
        spnEdad.setValue(0);
        rdHombre.setSelected(false);
        rdMujer.setSelected(false);
        comboBox1.setSelectedIndex(0);
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public Corredor obtenerCorredor() {
        Corredor corredor = null;

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
        } else if (txtDorsal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El dorsal no puede estar vacio");
        } else if (!txtDorsal.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El dorsal debe ser un numero");
        } else if (txtDorsal.getText().length() > 5) {
            JOptionPane.showMessageDialog(null, "El dorsal no puede tener mas de 5 caracteres");
        } else if (((int) spnEdad.getValue() == 0 || (int) spnEdad.getValue() > 100)) {
            JOptionPane.showMessageDialog(null, "La edad no puede ser 0 ni mayor de 100");
        } else if (!rdHombre.isSelected() && !rdMujer.isSelected()) {
            JOptionPane.showMessageDialog(null, "El sexo no puede estar vacio");
        } else if (comboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "La modalidad no puede estar vacia");
        } else {
            String nombre = txtNombre.getText();
            int dorsal = Integer.parseInt(txtDorsal.getText());
            int edad = (int) spnEdad.getValue();
            String sexo = rdHombre.isSelected() ? "Hombre" : "Mujer";
            String modalidad = comboBox1.getSelectedItem().toString();

            JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nDorsal: " + dorsal +
                    "\nEdad: " + edad + "\nSexo: " + sexo + "\nModalidad: " + modalidad);

            for(Corredor c : Instancia.INSTANCIA.getgC().getCarrera()){
                if(c.getNombre().equals(nombre) && c.getDorsal() == dorsal){
                    JOptionPane.showMessageDialog(null, "Ya existe un corredor con ese nombre y dorsal");
                } else {
                    corredor = new Corredor(nombre, dorsal, sexo, edad, modalidad);
                }

            }

        }
        return corredor;
    }
}
