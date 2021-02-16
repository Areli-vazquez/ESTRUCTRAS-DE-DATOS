/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

/**
 *
 * @author areli
 */
public class Nodo {
    private Object dato;
    Nodo siguiente; //porque apunta al otro nodo nuevo.

    public Nodo(Object dato) {//cuando se crea un nodo se crea un dato
        this(dato, null);//llama al constructor de abajo
        this.siguiente=null;
    }

    public Nodo(Object dato, Nodo siguiente) {//aqui da los dos datos
        this.dato=dato;
        this.siguiente=siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

}
}
