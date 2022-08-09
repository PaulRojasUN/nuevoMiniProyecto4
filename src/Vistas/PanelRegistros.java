/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RYZEN
 */
public class PanelRegistros extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegistros
     */
    DefaultTableModel modeloTabla;
    
    /**
     * Creates new form PanelRegistros
     */
    public PanelRegistros() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel)tableRegistros.getModel();
    }
    
    public void llenarTabla(ArrayList<ArrayList<String>> _registros)
    {
        int cant = modeloTabla.getRowCount(); 
        for (int i = cant -1; i >=0; i--)
        {
            modeloTabla.removeRow(i);
        }
        String auxString = "";
        for (ArrayList<String> registro: _registros)
        {
            modeloTabla.addRow(new Object[]{registro.get(0), registro.get(1), registro.get(2),
            registro.get(3), registro.get(4),});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegistros = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Movimiento", "Producto", "Cantidad", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRegistros);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 680, 370));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRegistros;
    // End of variables declaration//GEN-END:variables
}
