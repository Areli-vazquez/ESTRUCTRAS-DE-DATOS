/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplo;

import fes.aragon.dinamicasDos.ListaDoble;

/**
 *
 * @author areli
 */
public class Granja {

    public static void main(String[] args) {
        ListaDoble animales = new ListaDoble();

        System.out.println("AGREGAR EN CABEZA \n");
        System.out.println("El equipo 15 tiene una granja con los siguientes animales,los cuales los tiene"
                + "\n formados en una fila y a cada uno le corresponde el número de su posición empezando por cero. \n ");
        animales.agregarEnCabeza("Pollitos");
        animales.agregarEnCabeza("Gallinas");
        animales.agregarEnCabeza("Gallos");
        animales.agregarEnCabeza("Caballos");
        animales.agregarEnCabeza("Cerdos");
        animales.agregarEnCabeza("Vacas");
        animales.agregarEnCabeza("Toros");
        animales.agregarEnCabeza("Borregos");
        animales.agregarEnCabeza("Guajolotes");
        animales.agregarEnCabeza("Cabras");
        animales.agregarEnCabeza("Ponis");
        animales.agregarEnCabeza("Patos");
        animales.agregarEnCabeza("Perros");
        animales.agregarEnCabeza("Gatos");
        animales.agregarEnCabeza("Conejos");
        animales.agregarEnCabeza("Burros");
        animales.imprimirElementos();
        System.out.println("--------------");
        System.out.println("OBTENER NODO \n");
        System.out.println("A los granjeros del equipo 15 les gustaría saber en que lugar de la fila estan los ponis.\n ");
        animales.imprimirElementos();
        System.out.println("\nPosición número cinco : " + animales.obtenerNodo(5));
        System.out.println("-------------");
        System.out.println("A los granjeros del equipo 15 les gustaría saber si tienen gallinas en su lista de granja\n");
        System.out.println(animales.estaEnLista("Gallinas"));
        System.out.println("--------------");
        System.out.println("ELIMINAMOS EN INDICE");
        System.out.println("posición cuatro: patos\n ");
        animales.eliminarEnIndice(4);
        animales.imprimirElementos();
        System.out.println("--------------");
        System.out.println("ELIMINAR EN COLA\n");
        System.out.println("A los granjeros del equipo 15 les gustaría que los que están al final de la cola sean sacrificados\n"
                + "para la cena de navidad.");
        System.out.println("Primer animal sacrificado/eliminado: " + animales.eliminarEnCola());
        System.out.println("Segundo animal sacrificado/eliminado: " + animales.eliminarEnCola() + "\n");
        animales.imprimirElementos();
        System.out.println("--------------");
        System.out.println("AGREGAR EN COLA\n");
        System.out.println("En enero del 2021 los granjeros del equipo 15, decidieron comprar más animales para \n "
                + "agregarlos al final de la lista.\n");
        animales.agregarEnCola("Ganzos <--");
        animales.agregarEnCola("Corderos <--");
        animales.agregarEnCola("Ternero <--");
        animales.imprimirElementos();
    }
}
