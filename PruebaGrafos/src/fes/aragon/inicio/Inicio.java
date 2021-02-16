/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.grafos.Lectura;

/**
 *
 * @author areli
 */
public class Inicio {
    public static void main(String[] args) {
        Lectura app = new Lectura();
        app.LeerArchivo();
        app.getG().caminoCortoNoPonderado("A");
        app.getG().camino("C");
        System.out.println("");
    }
}
