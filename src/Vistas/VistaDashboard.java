/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author RYZEN
 */
public class VistaDashboard extends javax.swing.JFrame {
    
    public final int RGBAZULOSCURO = -14903059;
    public final int RGBAZULCLARO = -16755042;
    
    // = new PanelTienda();
    PanelClientes panelClientes;
    PanelProductos panelProductos;
    PanelProveedores panelProveedores;
    PanelRegistros panelRegistros;
    PanelTienda panelTienda;
    PanelTiendaVender panelTiendaVender;
    PanelCrearCliente panelCrearCliente;
    PanelCrearProveedor panelCrearProveedor;
    PanelCrearProducto panelCrearProductos;
    PanelComprarProducto panelComprarProductos;
    
    
    public VistaDashboard() {
        initComponents();
        setSize(1020, 640);

    }
    
    public void crearPanelTienda(PanelTienda _panel)
    {
        panelTienda = _panel;
    }
    
    public void crearPanelCliente(PanelClientes _panel)
    {
        panelClientes = _panel;
    }
    
    public void crearPanelProductos(PanelProductos _panel)
    {
        panelProductos = _panel;
    }
    
    public void crearPanelProveedores(PanelProveedores _panel)
    {
        panelProveedores = _panel;
    }
    
    public void crearPanelRegistros(PanelRegistros _panel)
    {
        panelRegistros = _panel;
    }
    
    public void crearPanelClientes(PanelClientes _panel)
    {
        panelClientes = _panel;
    }
    
    public void crearPanelTiendaVender(PanelTiendaVender _panel)
    {
        panelTiendaVender = _panel;
    }
    
    public void crearPanelCrearCliente(PanelCrearCliente _panel)
    {
        panelCrearCliente = _panel;
    }
    
    public void crearPanelCrearProveedor(PanelCrearProveedor _panel)
    {
        panelCrearProveedor = _panel;
    }
    
    public void crearPanelCrearProducto(PanelCrearProducto _panel)
    {
        panelCrearProductos = _panel;
    }
    
    public void crearPanelComprarProducto(PanelComprarProducto _panel)
    {
        panelComprarProductos = _panel;
    }
    
    
    void resetColorClaro(JPanel panel){
        panel.setBackground(new Color(28, 152, 237));     
    }
    
    void setColorOscuro(JPanel panel){
        panel.setBackground(new Color(0, 86, 158));
    }
    
    public void realizarCambioPanelDashboard(JPanel contenidoPanel){
        ubicarPanelEnDashboard(contenidoPanel);
        agregarPanelSeleccionado(contenidoPanel);
    }
    
    void agregarPanelSeleccionado(JPanel contenidoPanel){
        content.removeAll();
        content.add(contenidoPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    void ubicarPanelEnDashboard(JPanel panel){
        panel.setSize(750, 430);
        panel.setLocation(0,0);
    }
    
    void mostrarBotonTiendaActivado(){
        setColorOscuro(btnTienda);
        resetColorClaro(btnClientes);
        resetColorClaro(btnProveedores);
        resetColorClaro(btnProductos);
        resetColorClaro(btnRegistros);
    }
    
    void mostrarBotonClientesActivado(){
        resetColorClaro(btnTienda);
        setColorOscuro(btnClientes);
        resetColorClaro(btnProveedores);
        resetColorClaro(btnProductos);
        resetColorClaro(btnRegistros);
    }
    
    void mostrarBotonProveedoresActivado(){
        resetColorClaro(btnTienda);
        resetColorClaro(btnClientes);
        setColorOscuro(btnProveedores);
        resetColorClaro(btnProductos);
        resetColorClaro(btnRegistros);
    }
    
    void mostrarBotonProductosActivado(){
        resetColorClaro(btnTienda);
        resetColorClaro(btnClientes);
        resetColorClaro(btnProveedores);
        setColorOscuro(btnProductos);
        resetColorClaro(btnRegistros);
    }
    
    void mostrarBotonRegistrosActivado(){
        resetColorClaro(btnTienda);
        resetColorClaro(btnClientes);
        resetColorClaro(btnProveedores);
        resetColorClaro(btnProductos);
        setColorOscuro(btnRegistros);
    }
    
    void cambiarImagenPrincipal(String titulo){
        backgoundImagen.setIcon(new ImageIcon("src/Imagenes/backgound" + titulo + ".png"));
    }
    
    public void addBtnTiendaMouseEvent(MouseListener mouseListenControles){
        btnTienda.addMouseListener(mouseListenControles);
    }
    
    public void addClientesMouseEvent(MouseListener mouseListenControles)
    {
        btnClientes.addMouseListener(mouseListenControles);
    }
    
    public void addBtnProductosMouseEvent(MouseListener mouseListenControles)
    {
        btnProductos.addMouseListener(mouseListenControles);
    }
    
    public void addProveedoresMouseEvent(MouseListener mouseListenControles)
    {
        btnProveedores.addMouseListener(mouseListenControles);
    }
    
    public void addRegistrosMouseEvent(MouseListener mouseListenControles)
    {
        btnRegistros.addMouseListener(mouseListenControles);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnTienda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnRegistros = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        imagenDashboard = new javax.swing.JPanel();
        backgoundImagen = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        panelBar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(176, 230, 253));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UniMarketLogo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        btnTienda.setBackground(new java.awt.Color(0, 86, 158));
        btnTienda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiendaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiendaMousePressed(evt);
            }
        });
        btnTienda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTienda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tienda");
        btnTienda.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        menu.add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 50));
        btnTienda.getAccessibleContext().setAccessibleName("btnTienda");

        btnClientes.setBackground(new java.awt.Color(28, 152, 237));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });
        btnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Clientes");
        btnClientes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        menu.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        btnProveedores.setBackground(new java.awt.Color(28, 152, 237));
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProveedores.setPreferredSize(new java.awt.Dimension(270, 51));
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProveedoresMousePressed(evt);
            }
        });
        btnProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProveedores.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Proveedores");
        btnProveedores.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        menu.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        btnProductos.setBackground(new java.awt.Color(28, 152, 237));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setPreferredSize(new java.awt.Dimension(270, 51));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductosMousePressed(evt);
            }
        });
        btnProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Productos");
        btnProductos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        menu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        btnRegistros.setBackground(new java.awt.Color(28, 152, 237));
        btnRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistros.setPreferredSize(new java.awt.Dimension(270, 51));
        btnRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrosMousePressed(evt);
            }
        });
        btnRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistros.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Registros");
        btnRegistros.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        menu.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        content.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backgoundDashboard.png"))); // NOI18N

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        imagenDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgoundImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backgoundUnimarket.png"))); // NOI18N
        backgoundImagen.setText("jLabel3");
        imagenDashboard.add(backgoundImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 750, 170));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(176, 230, 253));
        lblExit.setText("  X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        imagenDashboard.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        panelBar.setBackground(new java.awt.Color(28, 152, 237));
        panelBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBarMouseEntered(evt);
            }
        });
        panelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        imagenDashboard.add(panelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        background.add(imagenDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTiendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMouseEntered
        if(btnTienda.getBackground().getRGB() == RGBAZULOSCURO)
        setColorOscuro(btnTienda);
    }//GEN-LAST:event_btnTiendaMouseEntered

    private void btnTiendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMouseExited
       
 
       if(btnClientes.getBackground().getRGB() != RGBAZULOSCURO || btnProveedores.getBackground().getRGB() != RGBAZULOSCURO
            || btnProductos.getBackground().getRGB() != RGBAZULOSCURO || btnRegistros.getBackground().getRGB() != RGBAZULOSCURO){
            resetColorClaro(btnTienda);
        }   
        
    }//GEN-LAST:event_btnTiendaMouseExited

    private void btnTiendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMousePressed

        mostrarBotonTiendaActivado();
        realizarCambioPanelDashboard(panelTienda);
        cambiarImagenPrincipal("Tienda");
        
    }//GEN-LAST:event_btnTiendaMousePressed

    
    
    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        if(btnClientes.getBackground().getRGB() == RGBAZULOSCURO){
            setColorOscuro(btnClientes);
        }
        
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
       
        if(btnTienda.getBackground().getRGB() != RGBAZULOSCURO || btnProveedores.getBackground().getRGB() != RGBAZULOSCURO
            || btnProductos.getBackground().getRGB() != RGBAZULOSCURO || btnRegistros.getBackground().getRGB() != RGBAZULOSCURO){
            resetColorClaro(btnClientes);
        }

        
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed

        mostrarBotonClientesActivado();
        realizarCambioPanelDashboard(panelClientes);
        cambiarImagenPrincipal("Clientes");
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        if(btnProveedores.getBackground().getRGB() == RGBAZULOSCURO){
            setColorOscuro(btnProveedores);
        }
    }//GEN-LAST:event_btnProveedoresMouseEntered

    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        if(btnTienda.getBackground().getRGB() != RGBAZULOSCURO || btnClientes.getBackground().getRGB() != RGBAZULOSCURO
            || btnProductos.getBackground().getRGB() != RGBAZULOSCURO || btnRegistros.getBackground().getRGB() != RGBAZULOSCURO){
            resetColorClaro(btnProveedores);
        }
    }//GEN-LAST:event_btnProveedoresMouseExited

    private void btnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMousePressed

        mostrarBotonProveedoresActivado();
        realizarCambioPanelDashboard(panelProveedores);
        cambiarImagenPrincipal("Proveedores");
    }//GEN-LAST:event_btnProveedoresMousePressed

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        if(btnProductos.getBackground().getRGB() == RGBAZULOSCURO){
            setColorOscuro(btnProductos);
        }
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        if(btnTienda.getBackground().getRGB() != RGBAZULOSCURO || btnClientes.getBackground().getRGB() != RGBAZULOSCURO
            || btnProveedores.getBackground().getRGB() != RGBAZULOSCURO || btnRegistros.getBackground().getRGB() != RGBAZULOSCURO){
            resetColorClaro(btnProductos);
        }
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMousePressed

        mostrarBotonProductosActivado();
        realizarCambioPanelDashboard(panelProductos);
        cambiarImagenPrincipal("Productos");
    }//GEN-LAST:event_btnProductosMousePressed

    private void btnRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMouseEntered
        if(btnRegistros.getBackground().getRGB() == RGBAZULOSCURO){
            setColorOscuro(btnRegistros);
        }
    }//GEN-LAST:event_btnRegistrosMouseEntered

    private void btnRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMouseExited
        if(btnTienda.getBackground().getRGB() != RGBAZULOSCURO || btnClientes.getBackground().getRGB() != RGBAZULOSCURO
            || btnProveedores.getBackground().getRGB() != RGBAZULOSCURO || btnProductos.getBackground().getRGB() != RGBAZULOSCURO){
            resetColorClaro(btnRegistros);
        }
    }//GEN-LAST:event_btnRegistrosMouseExited

    private void btnRegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMousePressed

        mostrarBotonRegistrosActivado();
        realizarCambioPanelDashboard(panelRegistros);
        cambiarImagenPrincipal("Registos");
    }//GEN-LAST:event_btnRegistrosMousePressed

    private void panelBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarMouseEntered
       
    }//GEN-LAST:event_panelBarMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
 
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited

    }//GEN-LAST:event_btnExitMouseExited

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        lblExit.setBackground(new Color(246, 108, 94)); 
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBackground(new Color(255,255,255)); 
    }//GEN-LAST:event_lblExitMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDashboard().setVisible(true);
            }
        });
    }

    public PanelTienda getPanelTienda() {
        return panelTienda;
    }
    
    public PanelProductos getPanelProductos()
    {
        return panelProductos;
    }
    
    public PanelProveedores getPanelProveedores()
    {
        return panelProveedores;
    }
    
    public PanelClientes getPanelClientes()
    {
        return panelClientes;
    }
    
    public PanelRegistros getPanelRegistros()
    {
        return panelRegistros;
    }
    
    public PanelTiendaVender getPanelTiendaVender()
    {
        return panelTiendaVender;
    }
    
    public PanelCrearCliente getPanelCrearCliente()
    {
        return panelCrearCliente;
    }
    
    public PanelCrearProveedor getPanelCrearProveedor()
    {
        return panelCrearProveedor;
    }
    
    public PanelCrearProducto getPanelCrearProducto()
    {
        return panelCrearProductos;
    }
    
    public PanelComprarProducto getPanelComprarProducto()
    {
        return panelComprarProductos;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgoundImagen;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnProveedores;
    private javax.swing.JPanel btnRegistros;
    private javax.swing.JPanel btnTienda;
    public static javax.swing.JPanel content;
    private javax.swing.JPanel imagenDashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblExit;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelBar;
    // End of variables declaration//GEN-END:variables

}
