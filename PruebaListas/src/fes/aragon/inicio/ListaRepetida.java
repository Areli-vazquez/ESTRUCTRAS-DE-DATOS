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
public class ListaRepetida {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Random rd = new Random();
           for (int i = 0; i < rd.nextInt(1500); i++) {//creación de lista con valores de 1500 y los valores son aleatorios(no se sabe los elementos)
                 lista.agregarEnCola(rd.nextInt(50));
    }
           lista.imprimirElementos();
          // lista.eliminarRepetidos(0);
           System.out.println("El número repetido es: ");
               
           }
           
    }

