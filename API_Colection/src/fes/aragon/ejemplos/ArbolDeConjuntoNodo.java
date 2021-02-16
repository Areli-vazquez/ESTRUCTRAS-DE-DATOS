/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author areli
 */
public class ArbolDeConjuntoNodo {
    public static void main(String[] args) {
        SortedSet<Nodo> nodos = new TreeSet<Nodo>();
        nodos.add(new Nodo(20));
        nodos.add(new Nodo(29));
        nodos.add(new Nodo(19));
        nodos.add(new Nodo(10));
        nodos.add(new Nodo(25));
        nodos.add(new Nodo(5));
        System.out.println(nodos);
        for (Nodo nodo : nodos) {
            System.out.println(nodo);
        }
    }
}
