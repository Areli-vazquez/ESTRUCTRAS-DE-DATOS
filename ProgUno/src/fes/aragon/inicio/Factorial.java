/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author areli
 */
public class Factorial {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Dame un número");//caja emergente
        try { //para tomar la excepción de que el usuario escribe una letra
            int dato = Integer.parseInt(numero);//se transforma a tipo entero (dato), ya que haremos operaciones 
            int n=1;
            int factorial = 1; 
            while (n<=dato) {                
                factorial+=n;
                n++;
            }
            JOptionPane.showMessageDialog(null,"El factorial de "+ dato+ " es "+factorial);//hace las operaciones(dato) que se ingresa 
        } catch (NumberFormatException ex) {//ex, es la pila de excepciones 
            JOptionPane.showConfirmDialog(null, "Solo número");//sale una segunda pestaña con la advertencia

        }
    }
}
