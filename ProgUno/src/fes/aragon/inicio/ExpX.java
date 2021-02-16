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
public class ExpX {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Solo números enteros");
        System.out.println("Dame el valor de x: ");
        int x = entrada.nextInt();
        int xx = x;
        double n = 1, m = 1;
        double fact = 1;
        double e = 1;
        while (m <= 20) {
                n=1;
                while(n<=m){
                    fact *=n;
                    n++;
                }
                e +=x/ fact;
                fact =1;
                x*=xx;
                m++;
        }
        System.out.println("El valor de e^x:" +e);
    }

}
