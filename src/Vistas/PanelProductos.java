/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author RYZEN
 */
public class PanelProductos extends javax.swing.JPanel {
    DefaultListModel modeloProductos;

    /**
     * Creates new form PanelProductos
     */
    public PanelProductos() {
        initComponents();
        modeloProductos = new DefaultListModel();
        listaProducto
                .setModel(modeloProductos);
    }
    
    public void cambiarTextoActualizar(){    
        if("ACTUALIZAR".equals(btnActualizarProducto.getText())){
            btnActualizarProducto.setText("ACEPTAR");
        }else{
            btnActualizarProducto.setText("ACTUALIZAR");
        }
    }
    
    public void setBtnTextActualizar()
    {
        btnActualizarProducto.setText("ACTUALIZAR");
    }
    
    public void vaciarCampos()
    {
        txtCodigo.setText("");
        txtNombreProducto.setText("");
        txtInventarioProducto.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        txtVendidosProducto.setText("");
        
        comboProvProducto.addItem("");
        comboProvProducto.setSelectedItem("");
    }
    
    public void cambiarEstadoCampos(boolean estado){
        txtCodigo.setEnabled(estado);
        txtNombreProducto.setEnabled(estado);
        comboProvProducto.setEnabled(estado);
        txtVendidosProducto.setEnabled(estado);
        txtInventarioProducto.setEnabled(estado);
        txtPrecioCompra.setEnabled(estado);
        txtPrecioVenta.setEnabled(estado);
    }
    
    public void habilitarBotonActualizar(boolean estado){
        btnActualizarProducto.setEnabled(estado);
    }
    
    public void habilitarBotonBorrar(boolean estado){
        btnBorrarProducto.setEnabled(estado);
    }
    
    public void habilitarBotonCrear(boolean estado){
        btnCrearProducto.setEnabled(estado);
    }
    
    public void habilitarBotonComprarProducto(boolean estado){
        btnComprarProducto.setEnabled(estado);
    }
    
    public void setSelectedComboProveedores(String _txt)
    {
        comboProvProducto.setSelectedItem(_txt);
    }
    
    public void setCodigo(String _value)
    {
        txtCodigo.setText(_value);
    }
    
    public String getCodigo()
    {
        return txtCodigo.getText();
    }
    
    public void setVendidos(String _value)
    {
        txtVendidosProducto.setText(_value);
    }
    
    public String getNombre(){
        return txtNombreProducto.getText();
    }
    
    public void setNombre(String nombre){
        txtNombreProducto.setText(nombre);
    }
    
    public int getNumeroVendidos(){
        return Integer.parseInt(txtVendidosProducto.getText());
    }
    
    public void setNumeroVendidos(int numeroVendidos){
        txtVendidosProducto.setText(String.valueOf(numeroVendidos));
    }
    
    public int getInventario(){
        return Integer.parseInt(txtInventarioProducto.getText());
    }
    
    public void setInventario(int numeroInventario){
        txtInventarioProducto.setText(String.valueOf(numeroInventario));
    }
    
    public float getPrecioCompra()
    {
        return Float.parseFloat(txtPrecioCompra.getText());
    }
    
    public void setPrecioCompra(float _precio){
        txtPrecioCompra.setText(String.valueOf(_precio));
    }
    
    public void setPrecioVenta(float _precio)
    {
        txtPrecioVenta.setText(String.valueOf(_precio));
    }
    
    public String getPrecioVenta()
    {
        return txtPrecioVenta.getText();
    }
    
    
    public String getProductoSeleccionado(){
        return listaProducto
                .getSelectedValue();
    }
    
    public void llenarListaProductos(ArrayList<String> productos){
        modeloProductos.removeAllElements();
        for (String producto : productos)
            {
                modeloProductos.addElement(producto);
            }
    }
    
    
    public void llenarComboProveedores(ArrayList<String> proveedores){
        comboProvProducto.removeAllItems();
        for (String genero : proveedores)
            {
                comboProvProducto.addItem(genero);
            }
    }
    
    public String getProveedorSeleccionado(){
        return comboProvProducto.getSelectedItem().toString();
    }
    
    public void addBtnActualizarListener(ActionListener listenControles){
        btnActualizarProducto.addActionListener(listenControles);
    }
    
    public void addBtnBorrarListener(ActionListener listenControles){
        btnBorrarProducto.addActionListener(listenControles);
    }
    
    public void addBtnCrearListener(ActionListener listenControles){
        btnCrearProducto.addActionListener(listenControles);
    }
    
    public void addBtnComprarListener(ActionListener listenControles){
        btnComprarProducto.addActionListener(listenControles);
    }
    
    public void addListaProductoListener(ListSelectionListener listenSelectionController){
        listaProducto
                .addListSelectionListener(listenSelectionController);
    }
  
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listaProducto = new javax.swing.JList<>();
        lblListaClientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtVendidosProducto = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        txtInventarioProducto = new javax.swing.JTextField();
        btnCrearProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        btnBorrarProducto = new javax.swing.JButton();
        lblNumeroVentas = new javax.swing.JLabel();
        lblNumeroVentas1 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        comboProvProducto = new javax.swing.JComboBox<>();
        btnComprarProducto = new javax.swing.JButton();
        lblNombres1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPrecioVenta = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        lblListaProveedores = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaProducto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaProducto);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, 350));

        lblListaClientes.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblListaClientes.setText("INFORMACIÓN");
        add(lblListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(176, 230, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCorreo.setText("  Proveedor:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        lblNombres.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombres.setText("  Nombre:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        txtNombreProducto.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtNombreProducto.setEnabled(false);
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, -1));

        txtVendidosProducto.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtVendidosProducto.setEnabled(false);
        jPanel1.add(txtVendidosProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, 20));

        lblTelefono1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTelefono1.setText("  Vendidos:");
        jPanel1.add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        txtInventarioProducto.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtInventarioProducto.setEnabled(false);
        jPanel1.add(txtInventarioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 190, -1));

        btnCrearProducto.setBackground(new java.awt.Color(0, 86, 158));
        btnCrearProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProducto.setText("CREAR");
        btnCrearProducto.setBorder(null);
        jPanel1.add(btnCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 120, 40));

        btnActualizarProducto.setBackground(new java.awt.Color(0, 86, 158));
        btnActualizarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProducto.setText("ACTUALIZAR");
        btnActualizarProducto.setBorder(null);
        btnActualizarProducto.setEnabled(false);
        jPanel1.add(btnActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 40));

        btnBorrarProducto.setBackground(new java.awt.Color(0, 86, 158));
        btnBorrarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBorrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarProducto.setText("BORRAR");
        btnBorrarProducto.setBorder(null);
        btnBorrarProducto.setEnabled(false);
        jPanel1.add(btnBorrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, 40));

        lblNumeroVentas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNumeroVentas.setText("  Inventario:");
        jPanel1.add(lblNumeroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        lblNumeroVentas1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNumeroVentas1.setText("   Precio Compra:");
        jPanel1.add(lblNumeroVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtPrecioCompra.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtPrecioCompra.setEnabled(false);
        jPanel1.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, -1));

        comboProvProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProvProducto.setEnabled(false);
        jPanel1.add(comboProvProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 190, -1));

        btnComprarProducto.setBackground(new java.awt.Color(0, 86, 158));
        btnComprarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnComprarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnComprarProducto.setText("COMPRAR PRODUCTO");
        btnComprarProducto.setBorder(null);
        jPanel1.add(btnComprarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 390, 40));

        lblNombres1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombres1.setText("Código:");
        jPanel1.add(lblNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        txtCodigo.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCodigo.setEnabled(false);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 190, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblPrecioVenta.setText("   Precio Venta:");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtPrecioVenta.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtPrecioVenta.setEnabled(false);
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 440, 350));

        lblListaProveedores.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblListaProveedores.setText("LISTA DE PRODUCTOS");
        add(lblListaProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnBorrarProducto;
    private javax.swing.JButton btnComprarProducto;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JComboBox<String> comboProvProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblListaClientes;
    private javax.swing.JLabel lblListaProveedores;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblNumeroVentas;
    private javax.swing.JLabel lblNumeroVentas1;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JList<String> listaProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtInventarioProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtVendidosProducto;
    // End of variables declaration//GEN-END:variables
}
