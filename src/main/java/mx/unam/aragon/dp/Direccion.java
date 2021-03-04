/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;


public class Direccion {
    
private String callle;
private String numero;
private String colonia;
private String delegacion;
private String estado;
private String cp;

    public Direccion() {
    }

    public Direccion(String callle, String numero, String colonia, String delegacion, String estado, String cp) {
        this.callle = callle;
        this.numero = numero;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.estado = estado;
        this.cp = cp;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCallle() {
        return callle;
    }

    public void setCallle(String callle) {
        this.callle = callle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
