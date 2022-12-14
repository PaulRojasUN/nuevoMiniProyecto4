/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import java.awt.event.ActionListener;

/**
 *
 * @author RYZEN
 */
public class PanelCrearProveedor extends javax.swing.JPanel {

    /**
     * Creates new form PanelCrearProveedor
     */
    public PanelCrearProveedor() {
        initComponents();
    }
    
    public String getNit()
    {
        return txtNit.getText();
    }
    
    public void activarBotonCrear(boolean estado){
        btnCrearProv.setEnabled(estado);
    }
    
    public String getNombres(){
        return txtNombreProv.getText();
    }
    
    public void setNombres(String nombres){
        txtNombreProv.setText(nombres);
    }
    
    public String getCorreo(){
        return txtCorreoProv.getText();
    }
    
    public void setCorreo(String correo){
        txtCorreoProv.setText(correo);
    }
    
    public String getTelefono(){
        return txtTelefonoProv.getText();
    }
    
    public void setTelefono(String telefono){
        txtTelefonoProv.setText(telefono);
    }
    
    public int getNumeroVentas(){
        return Integer.parseInt(txtNumeroVentas.getText());
    }
    
    public void setNumeroVentas(int numeroCompras){
        txtNumeroVentas.setText(String.valueOf(numeroCompras));
    }
    
    public void addBtnCrearListener(ActionListener listenControles){
        btnCrearProv.addActionListener(listenControles);
    }
    
    public void addBtnVolverListener(ActionListener listenControles){
        btnVolver.addActionListener(listenControles);
    }
    
    public void addBtnCancelarListener(ActionListener listenControles){
        btnCancelar.addActionListener(listenControles);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListaClientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombreProv = new javax.swing.JTextField();
        txtCorreoProv = new javax.swing.JTextField();
        txtTelefonoProv = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        txtNumeroVentas = new javax.swing.JTextField();
        lblNumeroVentas = new javax.swing.JLabel();
        btnCrearProv = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblListaClientes.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblListaClientes.setText("CREAR PROVEEDOR");
        add(lblListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(176, 230, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCorreo.setText("  Correo:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblNombres.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombres.setText("  Nombre:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));
        jPanel1.add(txtNombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 190, -1));
        jPanel1.add(txtCorreoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));
        jPanel1.add(txtTelefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, -1));

        lblTelefono1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTelefono1.setText("Tel??fono:");
        jPanel1.add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));
        jPanel1.add(txtNumeroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 190, -1));

        lblNumeroVentas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNumeroVentas.setText(" No. Compras:");
        jPanel1.add(lblNumeroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        btnCrearProv.setBackground(new java.awt.Color(0, 86, 158));
        btnCrearProv.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCrearProv.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProv.setText("CREAR");
        btnCrearProv.setBorder(null);
        jPanel1.add(btnCrearProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 86, 158));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 120, 40));

        lblNit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNit.setText("Nit:");
        jPanel1.add(lblNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 190, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 440, 350));

        btnVolver.setBackground(new java.awt.Color(0, 86, 158));
        btnVolver.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(null);
        add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearProv;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblListaClientes;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNumeroVentas;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JTextField txtCorreoProv;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtNumeroVentas;
    private javax.swing.JTextField txtTelefonoProv;
    // End of variables declaration//GEN-END:variables
}
