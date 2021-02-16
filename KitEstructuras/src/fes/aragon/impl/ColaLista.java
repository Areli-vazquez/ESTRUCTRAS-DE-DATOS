/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.impl;

import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.inter.Cola;

/**
 *
 * @author areli
 */
public class ColaLista<E> implements Cola<E> {
    private ListaSimple cola= new ListaSimple();
    private int longitud;
//CONSTRUCTOR

    public ColaLista() {
    }

    //implementación de métodos get&&set de longitud
    public int getLongitud() {
        return longitud;
    }

    //métodos abstractos
    @Override
    public void borrar() {
        cola = new ListaSimple();
    }

    @Override
    public boolean estaVacia() {
        return cola.esVacia();//regresa a la cola el vacio
    }

    @Override
    public void insertar(E dato) {
        if (cola.getLongitud()<longitud) {//insertar en cola
            cola.agregarEnCabeza(dato);
        } else {
            System.out.println("Cola llena");
        }
    }

    @Override
    public E extraer() {
        longitud--;
        return (E) cola.eliminarEnCabeza();//eliminarción
    }

    @Override
    public E elementoSuperior() {
        Object tmp =cola.eliminarEnCabeza();//sacar en cabeza
        cola.agregarEnCabeza(tmp);//agrega en cabeza
        return (E)tmp;//regresa valor de E
    }
    //mas funcionalidad a la cola 
    public void insertarFinal(E dato){
        cola.agregarEnCola(dato);
        longitud++;
    }
    public void imprimirCola(){
        cola.imprimirElementos();
    }
    public Object elementoCola(int indice){
        return cola.obtenerNodo(indice);//obtiene el elemento que se necesita
    }

}
