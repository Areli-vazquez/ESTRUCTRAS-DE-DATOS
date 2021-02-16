/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.pruebas;

import fes.aragon.impl.PilaLista;

/**
 *
 * @author areli
 */
public class EvaluarPostFija {

    public static void main(String[] args) {
        String cadena = "5 4 + 3 1 - *"; //cadena con espacios en blanco
        PilaLista pila = new PilaLista();//creo mi pila con cadena de 100
        String[] token = cadena.split("  ");//trae elemento por elemento token
         int indice=0;
        while(indice<token.length){
            String simbolo=token[indice];
            
            if(simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/")){
                Float op2=(Float)pila.extraer();
                Float op1=(Float)pila.extraer(); 
                Float operacion= null;
                if(simbolo.equals("+")){
                    operacion=op1+op2;
                }else if(simbolo.equals("-")){
                    operacion=op1-op2;
                }else if(simbolo.equals("*")){
                    operacion=op1*op2;
                }else if(simbolo.equals("/")){
                    operacion=op1/op2;
                }
                pila.insertar(operacion);
            }else {
                try{
                    pila.insertar(Float.parseFloat(simbolo));
                }catch (NumberFormatException ex){
                    System.out.println("Numero no valido");
                }
            }
            indice++;
        }
        System.out.println(pila.extraer());
    }
}
