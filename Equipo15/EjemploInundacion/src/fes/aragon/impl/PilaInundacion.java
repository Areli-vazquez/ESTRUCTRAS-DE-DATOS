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
public class PilaInundacion<E> implements Pila<E>{
    private ListaSimple pila = new ListaSimple();

    @Override
    public void borrar() {
        pila = new ListaSimple();
    }

    @Override
    public boolean estaVacia() {
        return pila.esVacia();
    }

    @Override
    public void insertar(E dato) {
        pila.agregarEnCabeza(dato);
    }

    @Override
    public E extraer() {
        return (E)pila.eliminarEnCabeza();
    }

    @Override
    public E elementoSuperior() {
        Object tmp = pila.eliminarEnCabeza();
        pila.agregarEnCabeza(tmp);
        return (E)tmp;
    }
    
}
