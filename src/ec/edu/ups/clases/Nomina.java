/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Nomina
 * clase que permite tener los registros de todos los empleados del restaurante
 * @version 2.1
 * @since 2019
 *
 * @author jonnathan
 */
public class Nomina {

    @Override
    public String toString() {
        return "Nomina{" + "codigo=" + codigo + ", areaAdministrativa=" + areaAdministrativa + ", servicio=" + servicio + ", operativo=" + operativo + ", ventas=" + ventas + '}';
    }
    protected int codigo;
    private String areaAdministrativa;
    private String servicio;
    private String operativo;
    private int ventas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAreaAdministrativa() {
        return areaAdministrativa;
    }

    public void setAreaAdministrativa(String areaAdministrativa) {
        this.areaAdministrativa = areaAdministrativa;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getOperativo() {
        return operativo;
    }

    public void setOperativo(String operativo) {
        this.operativo = operativo;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
}
