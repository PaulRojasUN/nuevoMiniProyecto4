/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Paul
 */

public class Producto
{
    String nombre;
    int codigo;
    float precioCompra;
    float precioVenta;
    int cant;
    int noVendidos;
    Producto(String _nombre, int _codigo, 
            float _precioCompra, float _precioVenta, int _cant, int _noVendidos)
    {
        this.nombre = _nombre;
        this.codigo = _codigo;
        this.precioCompra = _precioCompra;
        this.precioVenta = _precioVenta;
        this.cant = _cant;
        this.noVendidos = _noVendidos;
    }

    public int getNoVendidos() {
        return noVendidos;
    }

    public void setNoVendidos(int noVendidos) {
        this.noVendidos = noVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    public void sumarCant(int _cant)
    {
        this.cant += _cant;
    }
    
    public void restarCant(int _cant)
    {
        this.cant -= _cant;
    }
    
    
}
