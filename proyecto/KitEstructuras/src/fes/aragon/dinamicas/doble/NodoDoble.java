/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.dinamicas.doble;

/**
 *
 * @author areli
 */
public class NodoDoble {
    private Object dato;
    private NodoDoble sigiente, anterior;

    public NodoDoble() {
        
    }

    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.sigiente = siguiente;
        this.anterior = anterior;
    }
    
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return sigiente;
    }

    public void setSiguiente(NodoDoble sigiente) {
        this.sigiente = sigiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
        
}