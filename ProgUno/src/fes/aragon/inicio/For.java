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
public class For {
    public static void main(String[] args) {
        //j=j+2 es igual a j+=2
        for (int i = 0, j=0; (i < 10&& j<=8); i++, j+=2) {
//variable de control es i
//estructura de control es o
            System.out.println(i + " "+j);
        }
    }
}
