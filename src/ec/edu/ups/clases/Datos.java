/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Datos
 * clase que permite tener los registros de las facturas
 * @version 2.1
 * @since 2019
 *
 * @author jonnathan
 */
public class Datos {

    @Override
    public String toString() {
        return "Datos{" + "codigo=" + codigo + ", nombre=" + nombre + ", ruc=" + ruc + ", direccion=" + direccion + ", cantidad=" + cantidad + ", detalle=" + detalle + ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + '}';
    }
     protected int codigo;
    private String nombre;
    private int ruc;
    private String direccion ;
    private int cantidad;
    private int detalle;
    private int valorUnitario;
    private int valorTotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDetalle() {
        return detalle;
    }

    public void setDetalle(int detalle) {
        this.detalle = detalle;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
      
    
}
