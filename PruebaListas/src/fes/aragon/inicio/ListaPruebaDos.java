/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.dinamicas.ListaSimple;

/**
 *
 * @author areli
 */
public class ListaPruebaDos {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregarEnCola(100);
        lista.agregarEnCola(80);
        lista.agregarEnCola(67);
        lista.agregarEnCola(90);
        lista.agregarEnCola(1);
        lista.imprimirElementos();
        System.out.println(lista.estaEnLista(10));
        System.out.println(lista.eliminar(1));
        System.out.println("-----------");
        lista.imprimirElementos();
    }
}
