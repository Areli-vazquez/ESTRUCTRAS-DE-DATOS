/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.dinamicas;

/**
 *
 * @author areli
 */
public class Nodo {
    private Object dato;
    private Nodo Sigiente;

    public Nodo(Object dato) {
        this(dato,null);
    }

    public Nodo(Object dato, Nodo Sigiente) {
        this.dato=dato;
        this.Sigiente=Sigiente;
    }    

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSigiente() {
        return Sigiente;
    }

    public void setSigiente(Nodo Sigiente) {
        this.Sigiente = Sigiente;
    }
    
    
}
