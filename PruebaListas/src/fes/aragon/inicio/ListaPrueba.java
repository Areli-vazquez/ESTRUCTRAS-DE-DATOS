/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.dinamicas.ListaSimple;
import java.util.Random;

/**
 *
 * @author areli
 */
public class ListaPrueba {
    public static void main(String[] args) {
        ListaSimple listaEliminar = new ListaSimple();//creando otra lista
        ListaSimple lista = new ListaSimple();//importamos la clase y creamos la variable
        //CREACIÓN DE NODOS
        //lista.agregarEnCola(20);
        //lista.agregarEnCola(39);
        //lista.agregarEnCola(100);
        Random rd = new Random();
             for (int i = 0; i < rd.nextInt(1500); i++) {//creación de lista con valores de 1500 y los valores son aleatorios(no se sabe los elementos)
                 lista.agregarEnCola(rd.nextInt(200));
        }
        lista.imprimirElementos();//imprimir los números de la lista
        System.out.println("ELIMINADOS");
        for (int i = 0; i < 10; i++) {//eliminar 10 elementos y se agregaran en otra lista para ver cuales se eliminaron
            //listaEliminar.agregarEnCola(lista.eliminarEnCabeza());
            listaEliminar.agregarEnCola(lista.eliminarEnCola());
           
        }
        listaEliminar.imprimirElementos();
        System.out.println("-------");
        lista.imprimirElementos();
        lista.eliminar(2);
        System.out.println("ELIMINAR");
        
    }
    
}
