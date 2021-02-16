/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.pruebas;

import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.ordenamiento.MetodosOrdenamiento;
import java.util.Random;

/**
 *
 * @author areli
 */
public class PruebasDeOrdenamiento {

    public static void main(String[] args) {//hacer el main
        Random rd = new Random();//creamos los numeros aleatorios
        ListaSimple lista = new ListaSimple();//creamos un objeto tipo lista 
        for (int i = 0; i < 10; i++) {//hacemos un for con l0 numeros
            lista.agregarEnCola(rd.nextInt(200));//utilizamos nuestra lista con el metodo de agregar en cabeza, con el rango de 200
        }
        lista.imprimirElementos();//imprimimos la lista con el método imprimir elementos
        System.out.println("-------");
        System.out.println("SELECCIÓN");//imprimir en consola SELECCIÓN
        MetodosOrdenamiento.seleccion(lista);
        lista.imprimirElementos();
        //llamamos el jar 
        System.out.println("-------");
        System.out.println("BURBUJA");//imprimir en consola BURBUJA
        MetodosOrdenamiento.burbuja(lista);//ordenarse sin problema
        lista.imprimirElementos();//imprimimos la lista con el método imprimir elementos

        System.out.println("-------");
        System.out.println("INSERCIÓN");//imprimir en consola INSERCIÓN
        MetodosOrdenamiento.insercion(lista);//ordenarse sin problema
        lista.imprimirElementos();//imprimimos la lista con el método imprimir elementos

        System.out.println("-------");
        System.out.println("QUICKSORT");//imprimir en consola QUICKSORT
        MetodosOrdenamiento.quicksort(lista, 0, lista.getLongitud()- 1);
        lista.imprimirElementos();
    }
}
