/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author areli
 */
public class ListaEnlazada {

    public static void main(String[] args) {
        List<String> datos = new LinkedList<>();//clase que implementa la clase list
        //meter objetos en la lista de cualquier tipo
        datos.add("Uno");
        datos.add("Dos");
        datos.add("Tres");
        //iteración con ellos
        ListIterator<String> iter = datos.listIterator();
        while (iter.hasNext()) { //obtener datos del has next si tiene siguiente elemento
            String valor = iter.next();
            System.out.println(valor);//imprimira los elementos que ingresamos
            iter.remove();//sacar valores y quitarlo de la lista.
        }
        //permite remover mejor los elementos
        System.out.println("------");
        for (String valor : datos) {//for edge, ira recorriendo 1 por 1 y encada recorrido regresa el valor
            System.out.println(valor);
        }
        List<String> a=new LinkedList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        List<String> b = new LinkedList<>();
        b.add("Uno");
        b.add("Dos");
        b.add("Tres");
        b.add("Cuatro");
        
        ListIterator<String> iterA = a.listIterator();//iterador 1 
        ListIterator<String> iterB = b.listIterator();//iterador 2 
        //agregar 1 y uno, letra y número
        
        while (iterB.hasNext()) {//revisa si tienes un metodo adelante
            if (iterA.hasNext()) {//agregando 1 x 1 adelante dle otro
                iterA.next();
            }
            iterA.add(iterB.next());//agregando de la lista 1
        }
        System.out.println("-----");
        System.out.println(a);//sacar la lista 'a'
        System.out.println(iterB.hasNext());
        iterB=b.listIterator();
        iterB.next();
        iterB.next();
        iterB.remove();//elimar el 2
        System.out.println(b);//se hizo copia de la lista b
        System.out.println(a);
        // N=n-1;
        List c=a.subList(0, 3);//agarrar los elementos de las listas  creadas
        System.out.println(c);
    }

}
