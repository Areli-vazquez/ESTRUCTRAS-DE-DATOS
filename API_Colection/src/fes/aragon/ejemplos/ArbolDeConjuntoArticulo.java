/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author areli
 */
public class ArbolDeConjuntoArticulo {

    public static void main(String[] args) {
        SortedSet<Articulo> datos = new TreeSet<>();
        datos.add(new Articulo("Tostadora", 1234));
        datos.add(new Articulo("Licuadora", 4354));
        datos.add(new Articulo("Modem", 3344));
        System.out.println(datos);

        SortedSet<Articulo> datosDos = new TreeSet<>(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo o1, Articulo o2) {
                String desA = o1.getDescripcion();
                String desB = o2.getDescripcion();
                //return desA.compareTo(desB);
                return o1.getDescripcion().length()-o2.getDescripcion().length();
                //
            }
        });
        System.out.println(datosDos);
        datosDos.addAll(datos);
        System.out.println(datosDos);
    }
}
