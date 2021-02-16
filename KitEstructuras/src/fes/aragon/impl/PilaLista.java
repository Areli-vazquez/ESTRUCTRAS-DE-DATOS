/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.impl;

import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.inter.Pila;

/**
 *
 * @author areli
 */
public class PilaLista<E> implements Pila<E> {

    private ListaSimple pila = new ListaSimple();
   /* private int longuitud = 10;//limite de pila

    public PilaLista(int longuitud) {
        this.longuitud = longuitud;
    }

    public int getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(int longuitud) {
        this.longuitud = longuitud;
    }
*/
    @Override
    public void borrar() {
        pila = new ListaSimple();//importa elementos que pertenecen a borrar
    }

    @Override
    public boolean estaVacia() {
        return pila.esVacia();//regresa el dato de pila
    }

    @Override
    public void insertar(E dato) {
            pila.agregarEnCabeza(dato);//insertar en pila
        
    }

    @Override
    public E extraer() {
        return (E) pila.eliminarEnCabeza();
    }

    @Override
    public E elementoSuperior() {
        Object tmp = pila.eliminarEnCabeza();//quitar el elemento
        pila.agregarEnCabeza(tmp);//volverlo a agregar en pila agregarndolo en tmp
        return (E) tmp;//regresar valores de pila "E"
    }

}
