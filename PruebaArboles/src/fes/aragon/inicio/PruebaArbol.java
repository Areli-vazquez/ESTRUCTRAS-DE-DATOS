/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.arbol.Nodo;
import fes.aragon.dinamicas.ListaSimple;

/**
 *
 * @author areli
 */
public class PruebaArbol {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregarEnCola(new Integer(13));
        lista.agregarEnCola(new Integer(11));
        lista.agregarEnCola(new Integer(5));
        lista.agregarEnCola(new Integer(27));
        lista.agregarEnCola(new Integer(18));
        lista.agregarEnCola(new Integer(2));
        lista.agregarEnCola(new Integer(31));
        lista.agregarEnCola(new Integer(9));
        lista.imprimirElementos();
        System.out.println("--------");

        //CONSTRUCCIÓN DE ÁRBOL BINARIO
        ListaSimple arbolBinario = new ListaSimple();
        arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(0)));
        ((Nodo) arbolBinario.obtenerNodo(0)).setHijoIzq(1);
        ((Nodo) arbolBinario.obtenerNodo(0)).setHijoDer(2);
        arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(1)));//posición del padre
        ((Nodo) arbolBinario.obtenerNodo(1)).setHijoIzq(3);//posicion hijos
        ((Nodo) arbolBinario.obtenerNodo(1)).setHijoDer(4);//posicion hijos
        arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(2)));
        ((Nodo) arbolBinario.obtenerNodo(2)).setHijoIzq(5);
        ((Nodo) arbolBinario.obtenerNodo(2)).setHijoDer(6);
        arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(3)));
        ((Nodo) arbolBinario.obtenerNodo(3)).setHijoIzq(null);
        ((Nodo) arbolBinario.obtenerNodo(3)).setHijoDer(null);
        arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(4)));
        ((Nodo) arbolBinario.obtenerNodo(4)).setHijoIzq(null);
        ((Nodo) arbolBinario.obtenerNodo(4)).setHijoDer(null);
          arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(5)));
        ((Nodo) arbolBinario.obtenerNodo(5)).setHijoIzq(null);
        ((Nodo) arbolBinario.obtenerNodo(5)).setHijoDer(null);
          arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(6)));
        ((Nodo) arbolBinario.obtenerNodo(6)).setHijoIzq(7);
        ((Nodo) arbolBinario.obtenerNodo(6)).setHijoDer(null);
          arbolBinario.agregarEnCola(new Nodo((Integer) lista.obtenerNodo(7)));
        ((Nodo) arbolBinario.obtenerNodo(7)).setHijoIzq(null);
        ((Nodo) arbolBinario.obtenerNodo(7)).setHijoDer(null);

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
