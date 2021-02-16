/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.util.Scanner;

/**
 *
 * @author areli
 */
public class Switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame una vocal:");
        char valor = entrada.next().charAt(0);
        switch (valor) {
            case 'a':
                System.out.println("La vocal fue a");
                break;
            case 'e':
                System.out.println("La vocal fue e");
                break;
            case 'i':
                System.out.println("La vocal fue i");
                break;
            case 'o':
                System.out.println("La vocal fue o ");
                break;
            case 'u':
                System.out.println("La vocal fue u");
                break;
            default:
                System.out.println("no fue vocal");
                break;
        }
    }

}
