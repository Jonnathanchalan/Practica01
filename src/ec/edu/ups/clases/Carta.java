/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Carta
 * clase que permite tener los registros de todos los menus que ofrecen a clientes
 * @version 2.1
 * @since 2019
 *
 * @author jonnathan
 */
public class Carta {
    
    @Override
    public String toString() {
        return "Carta{" + "codigo=" + codigo + ", entremeses=" + entremeses + ", caldos=" + caldos + ", ensaladas=" + ensaladas + ", pastas=" + pastas + ", mariscos=" + mariscos + ", carnes=" + carnes + ", postres=" + postres + '}';
    }
     protected int codigo;
    private String entremeses;
    private String caldos;
    private String ensaladas ;
    private String pastas;
    private String mariscos;
    private String carnes;
    private String postres;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEntremeses() {
        return entremeses;
    }

    public void setEntremeses(String entremeses) {
        this.entremeses = entremeses;
    }

    public String getCaldos() {
        return caldos;
    }

    public void setCaldos(String caldos) {
        this.caldos = caldos;
    }

    public String getEnsaladas() {
        return ensaladas;
    }

    public void setEnsaladas(String ensaladas) {
        this.ensaladas = ensaladas;
    }

    public String getPastas() {
        return pastas;
    }

    public void setPastas(String pastas) {
        this.pastas = pastas;
    }

    public String getMariscos() {
        return mariscos;
    }

    public void setMariscos(String mariscos) {
        this.mariscos = mariscos;
    }

    public String getCarnes() {
        return carnes;
    }

    public void setCarnes(String carnes) {
        this.carnes = carnes;
    }

    public String getPostres() {
        return postres;
    }

    public void setPostres(String postres) {
        this.postres = postres;
    }
   
    
}
