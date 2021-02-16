/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.impl.PilaLista;
import java.util.ArrayList;

/**
 *
 * @author areli
 */
public class PruebaPilas {
    public static void main(String[] args) {
        //ArrayList<String> datos =  new ArrayList<>(); //implementacion de una lista 2blemente enlazada
        PilaLista<Integer> pila = new PilaLista<>(9);//valores de la pila son integer
        pila.setLonguitud(5);
        for (int i = 0; i < 10; i++) {
            pila.insertar(i);
        }
        while (!pila.estaVacia()) {    //mientras la pila no esta vacia
            System.out.println(pila.extraer());//extrae los elementos
        }
    }
}
