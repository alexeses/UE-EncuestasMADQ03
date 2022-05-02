package com.github.alexeses.gui;

import com.github.alexeses.Instancia;
import com.github.alexeses.model.Corredor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VMenuConsultas extends JPanel {
    private JPanel principal;
    private JTable tblSeleccion;
    private JScrollPane jsPanel;
    private JButton btnBuscar;
    private JComboBox cmbSeleccion;

    private Filtro filtro = Filtro.TODOS;

    public VMenuConsultas() {
        add(principal);
        crearTabla();
    }

    public void crearTabla() {

        DefaultTableModel model = (DefaultTableModel)tblSeleccion.getModel();

        model.addColumn("Nombre");
        model.addColumn("Dorsal");
        model.addColumn("Sexo");
        model.addColumn("Edad");
        model.addColumn("Modalidad");

        tblSeleccion.setModel(model);

    }

    public void updateTable() {
        vaciarTabla();
        DefaultTableModel model = (DefaultTableModel)tblSeleccion.getModel();
        for(Corredor c : Instancia.INSTANCIA.getgC().getCarrera()){
            switch (filtro) {
                case TODOS:
                    model.addRow(
                            new Object[]{c.getNombre(), c.getDorsal(), c.getSexo(), c.getEdad(), c.getModalidad()}
                    );
                    break;
                case HOMBRES:
                    if(c.getSexo().equals("Hombre")){
                        model.addRow(
                            new Object[]{c.getNombre(), c.getDorsal(), c.getSexo(), c.getEdad(), c.getModalidad()}
                        );
                    }
                    break;
                case MUJERES:
                    if(c.getSexo().equals("Mujer")){
                        model.addRow(
                            new Object[]{c.getNombre(), c.getDorsal(), c.getSexo(), c.getEdad(), c.getModalidad()}
                        );
                    }
                    break;
            }
        }
        tblSeleccion.setModel(model);
    }

    public void vaciarTabla(){
        DefaultTableModel model = (DefaultTableModel)tblSeleccion.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            model.removeRow(i);
        }
        tblSeleccion.setModel(model);
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JComboBox getCmbSeleccion() {
        return cmbSeleccion;
    }

    public Filtro getFiltro() {
        return filtro;
    }

    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }
}
