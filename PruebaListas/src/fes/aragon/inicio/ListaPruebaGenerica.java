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
public class ListaPruebaGenerica {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();//creación de variables 
        lista.agregarEnCola(new String("Demo"));//agregando el objeto demo 
        lista.agregarEnCola(new String("Perro"));//agregando el objeto perro
        lista.agregarEnCola(new Integer(19));//creando un nuevo objeto y se guarda
        lista.agregarEnCola(new Alumno());//creando un nuevo objeto
        lista.imprimirElementos();//
        lista.eliminar(new Alumno());//ELIMINAR el objeto 
        lista.imprimirElementos();  
        System.out.println("------------");
        //System.out.println(lista.obtenerNodo(1));
        /*while(!lista.esVacia()){
            lista.eliminarEnCola();
        }
        System.out.println(lista.esVacia());*/
        int indice=0;
        while(indice<lista.getLongitud()){
            System.out.println(lista.obtenerNodo(indice));
            indice++;
        }
        lista.eliminarEnIndice(2);
        //lista.inserteEnIndice(new String("Gato"), 1);
        System.out.println("--------");
        for (int i = 0; i < lista.getLongitud(); i++) {
            System.out.println(lista.obtenerNodo(i));
        }
    }
}
