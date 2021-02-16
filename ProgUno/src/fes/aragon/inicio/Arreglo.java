/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

/**
 *
 * @author areli
 */
public class Arreglo {

    public static void main(String[] args) {
        final int l = 4;
        int[] ar = new int[l];//crear un arreglo tipo entero con 10 elementos
        int[] ar2 = new int[l];
        String[] ar3 = {"Pedro", "Juan", "Pablo", "Teodoro"};
        System.out.println(ar[0]);//adentro del corchete elemento de arreglo
        //RECORRER
        for (int i = 0; i < ar.length; i++) {//recorrio todos los elementos 
            System.out.print(ar[i] + "  ");
        }
        System.out.println(" ");
        //ASIGNAR VALORES
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i + 1;
        }
        //RECORRER EN EL NUEVO FOR
        for (int i = 0; i < ar.length; i++) {//recorrio todos los elementos 
            System.out.print(ar[i] + " ");
        }
        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar[i];//pasar valores de un arreglo a otro 

        }
        System.out.println(" ");
        int contador = 0;
        for (int i = 0; i < ar3.length; i++) {
            String elemento = ar3[i];
            for (int j = 0; j < ar3[i].length(); j++) {
                //aqui va el codigo de las vocales 
                if (elemento.charAt(j) == 'a') {
                    contador++;
                }
            }
             System.out.println("-----------");
        }//cuantas E existen
        int contador2 = 0;
        for (int i = 0; i < ar3.length; i++) {
            String elemento = ar3[i];
            for (int j = 0; j < elemento.length(); j++) {
                if (elemento.charAt(j) == 'e') {
                    contador2++;
                }
            }

        }//cuantas I existen
        int contador3 = 0;
        for (int i = 0; i < ar3.length; i++) {
            String elemento = ar3[i];
            for (int j = 0; j < elemento.length(); j++) {
                if (elemento.charAt(j) == 'i') {
                    contador3++;
                }
            }

        }//cuantas O existen
        int contador4 = 0;
        for (int i = 0; i < ar3.length; i++) {
            String elemento = ar3[i];
            for (int j = 0; j < elemento.length(); j++) {
                if (elemento.charAt(j) == 'o') {
                    contador4++;
                }
            }
            }//cuantas U existen
          int contador5 = 0;
        for (int i = 0; i < ar3.length; i++) {
            String elemento = ar3[i];
            for (int j = 0; j < elemento.length(); j++) {
                if (elemento.charAt(j) == 'u') {
                    contador5++;
                }
                }  
        }
        System.out.println("En los nombres PEDRO, JUAN, PABLO, TEODORO: ");
        System.out.println("Hay " + contador + " letras A ");
        System.out.println("Hay " + contador2 + " letras E ");
        System.out.println("Hay " + contador3 + " letras I ");
        System.out.println("Hay " + contador4 + " letras O ");
        System.out.println("Hay " + contador5 + " letras U ");
//tarea parte 1
    }
}
