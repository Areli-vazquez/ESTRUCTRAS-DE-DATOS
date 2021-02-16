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
public class CalcularE {
    public static void main(String[] args) {
        double n=1,m=1;
        double fact=1;
        double e = 1;
        while (m<10) {            
            n=1;
            while (n<=m) {                
                fact*=n;
                n++;
            }
            e+=1/fact;
            fact =1;
            m++;
        }
        JOptionPane.showMessageDialog(null, "Valor de e: "+e);
    }
    
}
