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
public class DoWhile {
    public static void main(String[] args) {
        int  i= 0;
        boolean bandera=false;
        do{
            System.out.print(i+" ");
            i++;
            if(i>=6){//si aparece porque se ejecuta depués
                //si se le pone i==6 ejecuta igual
                bandera =true;
            }
        }while(bandera != true);
    }
    
}
