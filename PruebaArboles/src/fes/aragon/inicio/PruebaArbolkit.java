/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.arbolesbinarios.ArbolBinarioMayorMenor;

/**
 *
 * @author areli
 */
public class PruebaArbolkit {
    public static void main(String[] args) {
        ArbolBinarioMayorMenor arbol=new ArbolBinarioMayorMenor();
        arbol.insertar(40);
        arbol.insertar(30);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(16);
        arbol.insertar(10);
        arbol.insertar(60);
        arbol.insertar(28);
        arbol.insertar(42);
        arbol.insertar(41);
        arbol.insertar(13);
        arbol.insertar(53);
        arbol.insertar(5);
        //arbol.recorridoAmplitud();
        System.out.println("-----");
        System.out.println("PRE-ORDEN");
        arbol.preOrden(arbol.getRaiz());
        System.out.println("-----");
        System.out.println("ORDEN");
        arbol.orden(arbol.getRaiz());//la hoja que esta del lado izq es la primera que saca
        System.out.println("-----");
        System.out.println("POST-ORDEN");
        arbol.postOrden(arbol.getRaiz());
    }
}
