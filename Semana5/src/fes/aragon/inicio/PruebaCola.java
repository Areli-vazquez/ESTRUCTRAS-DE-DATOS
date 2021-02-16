/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.impl.ColaLista;

/**
 *
 * @author areli
 */
public class PruebaCola {
    public static void main(String[] args) {
        ColaLista<Integer> cola=new ColaLista<>(10);
        for(int i=0; i<10; i++){
            cola.insertar(i);//insertar en la cola
        }
        while(!cola.estaVacia()){//mientras la cola no este vacia
            System.out.println(cola.extraer());
        }
    }
}
