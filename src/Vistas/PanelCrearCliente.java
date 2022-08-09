/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author RYZEN
 */
public class PanelCrearCliente extends javax.swing.JPanel {

    /**
     * Creates new form PanelCrearCliente
     */
    public PanelCrearCliente() {
        initComponents();
    }
    
    
    public void activarBotonCrear(boolean estado){
        btnCrearCliente.setEnabled(estado);
    }
    
    public String getNombres(){
        return txtNombresCliente.getText();
    }
    
    public void setNombres(String nombres){
        txtNombresCliente.setText(nombres);
    }
    
    public String getApellidos(){
        return txtApellidosCliente.getText();
    }
    
    public void setApellidos(String apellidos){
        txtApellidosCliente.setText(apellidos);
    }
    
    public String getCorreo(){
        return txtCorreoCliente.getText();
    }
    
    public void setCorreo(String correo){
        txtCorreoCliente.setText(correo);
    }
    
    public String getTelefono(){
        return txtTelefonoCliente.getText();
    }
    
    public void setTelefono(String telefono){
        txtTelefonoCliente.setText(telefono);
    }
    
    public void vaciarCampos()
    {
        txtIDCliente.setText("");
        txtNombresCliente.setText("");
        txtApellidosCliente.setText("");
        txtCorreoCliente.setText("");
        txtEdadCliente.setText("");
        txtTelefonoCliente.setText("");
        txtNumeroComprasCliente.setText("");
        comboGeneroCliente.setSelectedItem("No establecido");
    }
    
    public int getEdad(){
        return Integer.parseInt(txtEdadCliente.getText());
    }
    
    public void setEdad(int edad){
        txtEdadCliente.setText(String.valueOf(edad));
    }
    
    public int getNumeroCompras(){
        return Integer.parseInt(txtNumeroComprasCliente.getText());
    }
    
    public void setNumeroCompras(int numeroCompras){
        txtNumeroComprasCliente.setText(String.valueOf(numeroCompras));
    }
    
    public int getId()
    {
        return Integer.parseInt(txtIDCliente.getText());
    }
    
    public void llenarComboGenero(ArrayList<String> generos){
        for (String genero : generos)
            {
                comboGeneroCliente.addItem(genero);
            }
    }
    
    public String getGeneroSeleccionado(){
        return comboGeneroCliente.getSelectedItem().toString();
    }
    
    public void setGeneroSeleccionado(String _genero){
         comboGeneroCliente.setSelectedItem(_genero);
    }
    
    
    
    public void addBtnVolverListener(ActionListener listenControles){
        btnVolver.addActionListener(listenControles);
    }
    
    public void addBtnCancelarListener(ActionListener listenControles){
        btnCancelar.addActionListener(listenControles);
    }
    
    public void addBtnCrearListener(ActionListener listenControles){
        btnCrearCliente.addActionListener(listenControles);
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
        txtApellidosCliente = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        comboGeneroCliente = new javax.swing.JComboBox<>();
        lblGenero1 = new javax.swing.JLabel();
        txtEdadCliente = new javax.swing.JTextField();
        lblEdad1 = new javax.swing.JLabel();
        txtNumeroComprasCliente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCrearCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtNombresCliente = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(730, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblListaClientes.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblListaClientes.setText("CREAR CLIENTE");
        add(lblListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(176, 230, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCorreo.setText("  Correo:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        jPanel1.add(txtApellidosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 190, -1));

        lblNombres.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombres.setText("Nombres:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel1.add(txtIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 190, -1));
        jPanel1.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));

        lblEdad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblEdad.setText(" No. Compras:");
        jPanel1.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, -1));

        lblTelefono1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTelefono1.setText("Teléfono:");
        jPanel1.add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        comboGeneroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No establecido", "M", "F" }));
        jPanel1.add(comboGeneroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, -1));

        lblGenero1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblGenero1.setText("Género:");
        jPanel1.add(lblGenero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));
        jPanel1.add(txtEdadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, -1));

        lblEdad1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblEdad1.setText("Edad:");
        jPanel1.add(lblEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
        jPanel1.add(txtNumeroComprasCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 190, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 86, 158));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 120, 40));

        btnCrearCliente.setBackground(new java.awt.Color(0, 86, 158));
        btnCrearCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCliente.setText("CREAR");
        btnCrearCliente.setBorder(null);
        jPanel1.add(btnCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        lblID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblID.setText("ID");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));
        jPanel1.add(txtNombresCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 440, 350));

        btnVolver.setBackground(new java.awt.Color(0, 86, 158));
        btnVolver.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(null);
        add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboGeneroCliente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdad1;
    private javax.swing.JLabel lblGenero1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblListaClientes;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtEdadCliente;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtNumeroComprasCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}