/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author areli
 */
public class ArbolDeConjunto {
    public static void main(String[] args) {
        SortedSet<String> clasificador = new TreeSet<>();//los ordena alfabeticamente
        clasificador.add("Pedro");
        clasificador.add("Alma");
        clasificador.add("Benito");
        for (String string : clasificador) {
            System.out.println(string);
        }
    }
}
