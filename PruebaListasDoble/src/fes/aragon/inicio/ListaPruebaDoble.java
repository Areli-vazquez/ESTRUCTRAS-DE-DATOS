/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.dinamicasDos.ListaDoble;

/**
 *
 * @author areli
 */
public class ListaPruebaDoble {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        ListaDoble listaDos = new ListaDoble();
        ListaDoble listaTres = new ListaDoble();
        int longitud = 15;
        for (int i = 0; i < longitud; i++) {
            lista.agregarEnCabeza(i);
        }
        System.out.println("OBTENER NODO");
        lista.imprimirElementos();
        System.out.println("Posición número cinco : " + lista.obtenerNodo(5));
        System.out.println("-------------");

        System.out.println("INSERTAMOS EN INDICE");
        System.out.println("   posición siete");
        lista.inserteEnIndice(100, 7);
        lista.imprimirElementos();
        System.out.println("--------------");
        System.out.println("ELIMINAMOS EN INDICE");
        System.out.println("posición tres");
        lista.eliminarEnIndice(3);
        lista.imprimirElementos();

        System.out.println("--------------");
        System.out.println("ELIMINAR EN CABEZA");
        for (int i = 0; i < 2; i++) {
            lista.eliminarEnCabeza();
        }
        lista.imprimirElementos();
        System.out.println("--------------");
        System.out.println("AGREGANDO ELEMENTOS");
        listaTres.agregarEnCabeza(new String("Areli"));
        listaTres.agregarEnCabeza(new String("Ricardo"));
        listaTres.agregarEnCabeza(new String("Fabian"));
        listaTres.agregarEnCabeza(new String("Quince"));
        listaTres.agregarEnCabeza(new String("Equipo"));
        listaTres.imprimirElementos();
        System.out.println("--------------");
        System.out.println("ELIMINANDO UN NODO DE LA LISTA");
        listaTres.eliminar(new String("Equipo"));
        listaTres.eliminarEnIndice(4);
        listaTres.imprimirElementos();
        System.out.println("---------------");
        System.out.println("AGREGAR EN COLA");
        for (int i = 0; i < 15; i++) {
            listaDos.agregarEnCola(i);
        }
        listaDos.imprimirElementos();
        System.out.println("---------------");
        System.out.println("ELIMINAR EL NÚMERO 5");
        listaDos.eliminar(5);
        listaDos.imprimirElementos();
        System.out.println("---------------");
        System.out.println("ELIMINAR EN COLA");
        for (int i = 0; i < 1; i++) {
            listaDos.eliminarEnCola();
        }
        listaDos.imprimirElementos();
        System.out.println("---------------");
        System.out.println("AGREGAR EN CABEZA");
        listaDos.agregarEnCabeza(14);
        listaDos.imprimirElementos();
        System.out.println("Número menor de la lista es: " + listaDos.menor());
        System.out.println("Número mayor de la lista es: " + listaDos.mayor());
        System.out.println("LA SUMA DE NÚMEROS PARES ES: " + lista.sumaPares(longitud));
    }
}
