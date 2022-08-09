/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Compra;
import Vistas.PanelTienda;
import Vistas.PanelTiendaVender;
import Vistas.VistaDashboard;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.ModeloPrincipal;

/**
 *
 * @author RYZEN
 */
public class ControllerDashboard {
    private ModeloPrincipal modelo;
    private VistaDashboard vista;
    
    private ControllerTienda controladorTienda;
    private ControllerProductos controladorProductos;
    private ControllerClientes controladorClientes;
    private ControllerProveedores controladorProveedores;
    private ControllerRegistros controladorRegistros;
    private ControllerTiendaVender controladorTiendaVender;
    private ControllerCrearCliente controladorCrearCliente;
    private ControllerCrearProveedor controladorCrearProveedor;
    private ControllerCrearProducto controladorCrearProducto;
    private ControllerComprarProducto controladorComprarProducto;
    
    
    private Compra compra;
    
    public ControllerDashboard(ModeloPrincipal modelo, VistaDashboard vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        agregarListenersBtnDashBoard();
        
        
        crearControladoresPaneles();
        agregarListenerBtnExtras();
        
        compra = new Compra();
        
    }
    
    private void agregarListenersBtnDashBoard()
    {
        vista.addBtnTiendaMouseEvent(new BtnMouseTiendaListener());
        vista.addBtnProductosMouseEvent(new BtnMouseProductosListener());
        vista.addProveedoresMouseEvent(new BtnMouseProveedoresListener());
        vista.addRegistrosMouseEvent(new BtnMouseRegistrosListener());
        vista.addClientesMouseEvent(new BtnMouseClientesListener());
        vista.addProveedoresMouseEvent(new BtnMouseProveedoresListener());
    }
    
    private void agregarListenerBtnExtras()
    {
        controladorTienda.addBtnVenderListener(new BtnListenerToTiendaVender());
        controladorTiendaVender.addBtnRegresarListener(new BtnListenerToTienda());
        controladorTiendaVender.addBtnAceptarListener(new BtnListenerToTienda());
        controladorTiendaVender.addBtnCrearClienteListener(new BtnListenerToCrearCliente());
        controladorClientes.addBtnCrearClientesListener(new BtnListenerToCrearCliente());
        controladorCrearCliente.addBtnRegresarListener(new BtnListenerToTiendaVender());
        controladorProveedores.addBtnCrearListener(new BtnListenerToCrearProveedor());
        controladorCrearProveedor.addBtnVolverProveedorListener(new BtnListenerToProveedores());
        controladorCrearProducto.addBtnVolverListener(new BtnListenerToProductos());
        controladorCrearProducto.addBtnCrearProductoListener(new BtnListenerToProductos());
        controladorProductos.addBtnCrearListener(new BtnListenerToCrearProductos());
        controladorProductos.addBtnComprarProductosListener(new BtnListenerToComprarProductos());
        controladorComprarProducto.addBtnVolverListener(new BtnListenerToProductos());
    }
    
    private void crearControladoresPaneles()
    {
        controladorTienda = new ControllerTienda(modelo, vista.getPanelTienda());
        controladorProductos = new ControllerProductos(modelo, vista.getPanelProductos());
        controladorClientes = new ControllerClientes(modelo, vista.getPanelClientes());
        controladorRegistros = new ControllerRegistros(modelo, vista.getPanelRegistros());
        controladorProveedores = new ControllerProveedores(modelo, vista.getPanelProveedores());
        controladorTiendaVender = new ControllerTiendaVender(modelo, vista.getPanelTiendaVender());
        controladorCrearCliente = new ControllerCrearCliente(modelo, vista.getPanelCrearCliente());
        controladorCrearProveedor = new ControllerCrearProveedor(modelo, vista.getPanelCrearProveedor());
        controladorCrearProducto = new ControllerCrearProducto(modelo, vista.getPanelCrearProducto());
        controladorComprarProducto = new ControllerComprarProducto(modelo, vista.getPanelComprarProducto());
    }
    
    class BtnMouseProductosListener implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
             controladorProductos.actualizarPanel();
          }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    
    class BtnMouseTiendaListener implements MouseListener
    {
       
        @Override
        public void mouseClicked(MouseEvent e) {
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Tienda");
            try {  
                controladorTienda.actualizarPanel();
            } catch (IOException ex) {
                System.out.println("Ocurrió un error");
              }
           }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    
    
    class BtnMouseClientesListener implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
            controladorClientes.actualizarPanel();
          }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    
    class BtnMouseProveedoresListener implements MouseListener
    {
       
        @Override
        public void mouseClicked(MouseEvent e) {
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
            controladorProveedores.actualizarPanel();  
           }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    
    class BtnMouseRegistrosListener implements MouseListener
    {
       
        @Override
        public void mouseClicked(MouseEvent e) {
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
           controladorRegistros.actualizarPanel();
           }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    
    //Aquí se colocan los listener de los botones en los paneles que abren el panelTiendaVender
    class BtnListenerToTiendaVender implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("VENDER".equals(e.getActionCommand()))
            {
                compra.setListaProductos(vista.getPanelTienda().getListaDeCompras());
                compra.setTotalCompra(parseFloat(vista.getPanelTienda().getTxtPrecioTotal()));
                
                 vista.realizarCambioPanelDashboard(vista.getPanelTiendaVender());
                 controladorTiendaVender.setCompra(compra);
                 controladorTiendaVender.actualizarPanel();
                 
            }
            else if ("VOLVER".equals(e.getActionCommand()) || "CANCELAR".equals(e.getActionCommand()))
            {
                if (controladorCrearCliente.getRuta()==1)
                {
                    controladorTiendaVender.actualizarPanel();
                    vista.realizarCambioPanelDashboard(vista.getPanelTiendaVender());
                }
                else if (controladorCrearCliente.getRuta()==2)
                {
                    controladorClientes.actualizarPanel();
                    vista.realizarCambioPanelDashboard(vista.getPanelClientes());
                }
            }
            else if ("CREAR".equals(e.getActionCommand()))
            {
                    if (controladorCrearCliente.getRuta()==1)
                {
                    controladorCrearCliente.crearCliente();
                    controladorTiendaVender.actualizarPanel();
                    vista.realizarCambioPanelDashboard(vista.getPanelTiendaVender());
                }
                else if (controladorCrearCliente.getRuta()==2)
                {
                    controladorCrearCliente.crearCliente();
                    controladorClientes.actualizarPanel();
                    vista.realizarCambioPanelDashboard(vista.getPanelClientes());
                }
            }
        }
    }
    
    public void agregarVentas() throws IOException
    {
        for(String venta: compra.getListaCompras())
        {
            String nombre = venta.substring(0, venta.indexOf("x")-1);
            int cant = parseInt(venta.substring(venta.indexOf("x")+2,venta.indexOf("=")-1));
            float precio = parseFloat(venta.substring(venta.indexOf("=")+2));
            modelo.agregarRegistro("VENTA", nombre, cant, precio);
        }
    }
    
    //Aquí se colocan los listener de los botones en los paneles que abren el panelTienda
    class BtnListenerToTienda implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("REGRESAR".equals(e.getActionCommand()))//Botón Regresar en panelTiendaVender
            {
                vista.realizarCambioPanelDashboard(vista.getPanelTienda());
            }
            else if ("ACEPTAR".equals(e.getActionCommand()))//Botón Aceptar en panelTiendaVender
            {
                try {
                    agregarVentas();
                } catch (IOException ex) {
                    Logger.getLogger(ControllerDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
                controladorTienda.vaciarListaCompra();
                vista.realizarCambioPanelDashboard(vista.getPanelTienda());
            }
        }
    }
    
    class BtnListenerToCrearCliente implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            controladorCrearCliente.vaciarCampos();
            if ("Crear Cliente".equals(e.getActionCommand()))//BotóN en panelTiendaVender
            {
                controladorCrearCliente.asignarRuta(1);    
            }
            else if ("CREAR".equals(e.getActionCommand()))//Botón en panelCliente
            {
                controladorCrearCliente.asignarRuta(2);  
            }
            vista.realizarCambioPanelDashboard(vista.getPanelCrearCliente());
        }
    }
    
    class BtnListenerToCrearProveedor implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("CREAR".equals(e.getActionCommand()))//Botón Regresar en panelTiendaVender
            {
                vista.realizarCambioPanelDashboard(vista.getPanelCrearProveedor());
            }
        }
    }
    
    class BtnListenerToProveedores implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("VOLVER".equals(e.getActionCommand()) || "CANCELAR".equals(e.getActionCommand()))//Botón Regresar en panelTiendaVender
            {
                vista.realizarCambioPanelDashboard(vista.getPanelProveedores());
            }
        }
    }
    
    class BtnListenerToCrearProductos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("CREAR".equals(e.getActionCommand()))//Botón Regresar en panelTiendaVender
            {
                controladorCrearProducto.actualizarPanel();
                vista.realizarCambioPanelDashboard(vista.getPanelCrearProducto());
            }
        }
    }
    
    class BtnListenerToProductos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("VOLVER".equals(e.getActionCommand()) || "CANCELAR".equals(e.getActionCommand()))//Botón Regresar en panelTiendaVender
            {
                vista.realizarCambioPanelDashboard(vista.getPanelProductos());
            }
            else if ("CREAR".equals(e.getActionCommand()))
            {
                vista.realizarCambioPanelDashboard(vista.getPanelProductos());
            }
        }
    }
    
    class BtnListenerToComprarProductos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ("COMPRAR PRODUCTO".equals(e.getActionCommand()))//Botón Regresar en panelTiendaVender
            {
                controladorComprarProducto.actualizarPanel();
                vista.realizarCambioPanelDashboard(vista.getPanelComprarProducto());
            }
        }
    }
}