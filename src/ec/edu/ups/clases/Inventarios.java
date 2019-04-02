/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Inventarios
 * clase que permite tener los registros de lo que posee el restaurante y su materia prima
 * @version 2.1
 * @since 2019
 *
 * @author jonnathan
 */
public class Inventarios {

    @Override
    public String toString() {
        return "Inventarios{" + "codigo=" + codigo + ", mueblesEnseres=" + mueblesEnseres + ", materiaPrima=" + materiaPrima + ", maquinaria=" + maquinaria + ", productosTerminados=" + productosTerminados + '}';
    }
     protected int codigo;
    private String mueblesEnseres;
    private String materiaPrima;
    private String maquinaria;
    private int productosTerminados;
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMueblesEnseres() {
        return mueblesEnseres;
    }

    public void setMueblesEnseres(String mueblesEnseres) {
        this.mueblesEnseres = mueblesEnseres;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public String getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(String maquinaria) {
        this.maquinaria = maquinaria;
    }

    public int getProductosTerminados() {
        return productosTerminados;
    }

    public void setProductosTerminados(int productosTerminados) {
        this.productosTerminados = productosTerminados;
    }
   
}
