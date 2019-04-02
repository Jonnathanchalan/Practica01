/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Catalogo
 * clase que permite tener los registros de la parte de promocionb del restaurante
 * @version 2.1
 * @since 2019
 *
 * @author jonnathan
 */
public class Catalogo {

    @Override
    public String toString() {
        return "Catalogo{" + "codigo=" + codigo + ", nombre=" + nombre + ", tarjetasPresentacion=" + tarjetasPresentacion + ", direccion=" + direccion + ", horarioAtencion=" + horarioAtencion + '}';
    }
    protected int codigo;
    private String nombre;
    private String tarjetasPresentacion;
    private String direccion ;
    private int horarioAtencion;

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

    public String getTarjetasPresentacion() {
        return tarjetasPresentacion;
    }

    public void setTarjetasPresentacion(String tarjetasPresentacion) {
        this.tarjetasPresentacion = tarjetasPresentacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(int horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    
    
    
}
