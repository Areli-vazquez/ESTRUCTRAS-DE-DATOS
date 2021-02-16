/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.recursivo;

import java.util.Scanner;

/**
 *
 * @author areli
 */
public class Recursividad {
 static int nMovimientos =0;
 
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;//vuelve a llamar el método
        }
    }

//FIBONACCI
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    //TORRES DE HANOI
    public static void TorresDeHanoi(int disco, String origen, String medio, String destino) {//Creación del método de torres de hanoi
        
        if (disco == 1) {//creacion de la condición para que el número minimo de discos sea 1 para jugar o más
            nMovimientos = nMovimientos +1;//se calcula el número de movimientos y se le da un incremento
            System.out.println(nMovimientos + "⇢ Mover disco número:  " + disco +" de "+ origen + " a " + destino);
        } else {
            TorresDeHanoi(disco - 1, origen, destino, medio);//Movimientos que dará el disco de origen a al medio
            nMovimientos = nMovimientos +1;//se hace un incremento de movimientos
            System.out.println(nMovimientos+ "⇢ Mover disco número:  " + disco + " de " + origen + " a " + destino);
            TorresDeHanoi(disco - 1, medio, origen, destino);// Movimiento que dara el disco de en medio al destino.

        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial");
        System.out.println(Recursividad.factorial(3));
        System.out.println("Fibonacci");
        System.out.println(Recursividad.fibonacci(5));
        System.out.println("---------------");
        System.out.println("TORRES DE HANOI");
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de discos:");// usuario ingresa con cuantos discos desea jugar
        int nDiscos = sc.nextInt(); // se declará  y se guarda el número de discos que se ingresa
        System.out.println("");
        TorresDeHanoi(nDiscos, "origen", "medio", "destino");//llamo a mi método para llamar a las 3 torres y a los discos
        System.out.println("\nSe resolvio en: " + nMovimientos+ " movimientos");
    }

}
