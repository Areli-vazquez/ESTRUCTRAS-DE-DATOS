/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.arbol.Nodo;
import fes.aragon.dinamicas.ListaSimple;
import java.util.Random;

/**
 *
 * @author areli
 */
public class PruebaArbol2 {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            lista.agregarEnCola(rd.nextInt(200));
        }
        lista.imprimirElementos();
        System.out.println("--------");

        //CONSTRUCCIÓN DE ÁRBOL BINARIO
        ListaSimple arbolBinario = new ListaSimple();
        int incremento = 1;
        //insertar información
        for (int i = 0; i < lista.getLongitud(); i++) {
            arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(i)));
            if (i != lista.getLongitud() - 1) {
                ((Nodo) arbolBinario.obtenerNodo(i)).setHijoIzq(incremento);
                ((Nodo) arbolBinario.obtenerNodo(i)).setHijoDer(++incremento);
            }
            incremento++;
        }
        for (int i = 0; i < arbolBinario.getLongitud(); i++) {
            Nodo tmp = (Nodo) arbolBinario.obtenerNodo(i);
            System.out.println(tmp.toString());
            //añadir una excepcion para los null
            if (tmp.getHijoIzq() != null) {
                System.out.println("*izquierdo: " + lista.obtenerNodo(tmp.getHijoIzq()));
            }
            if (tmp.getHijoDer() != null) {
                System.out.println("*derecho:  " + lista.obtenerNodo(tmp.getHijoDer()));
            }
        }

    }
}
