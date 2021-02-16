/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.dinamicasDos;

/**
 *
 * @author areli
 */
public class NodoDoble {

    private Object dato;
    NodoDoble siguiente;//puntero
    NodoDoble anterior;//puntero

    //constructor
    public NodoDoble(Object dato) {
        this(dato, null, null);//el puntero siguiente apuntará a null
    }

    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
