/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author areli
 */
public class Vocales {

    public static void main(String[] args) {
        String[] ar3 = {"Pedro", "Juan", "Pablo", "Teodoro"};

        for (int i = 0; i < ar3.length; i++) {
            int contadorA = 0;
            int contadorE = 0;
            int contadorI = 0;
            int contadorO = 0;
            int contadorU = 0;
            String element = ar3[i];

            for (int j = 0; j < ar3.length; j++) {
                char conteo = element.charAt(j);
                switch (conteo) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;

                }
            }
            System.out.println("A: " + contadorA);
            System.out.println("E: " + contadorE);
            System.out.println("I: " + contadorI);
            System.out.println("O: " + contadorO);
            System.out.println("U: " + contadorU);
            System.out.println("-------------------------");
            JOptionPane.showMessageDialog(null, "¿Cuántas vocales hay en...?\n                 "
                    + element + "\n" + "A: " + contadorA + "\n" + "E: "
                    + contadorE + "\n" + "I: " + contadorI + "\n" + "O: " + contadorO + "\n"
                    + "U: " + contadorU);
        }
    }
}
