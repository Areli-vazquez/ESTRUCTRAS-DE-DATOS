/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 *
 * @author areli
 */
public class ColaPrioridad {

    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar> colaPrioridad = new PriorityQueue<>();
        colaPrioridad.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        colaPrioridad.add(new GregorianCalendar(1915, Calendar.DECEMBER, 10));
        colaPrioridad.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3));
        colaPrioridad.add(new GregorianCalendar(1910, Calendar.JUNE, 22));
        for (GregorianCalendar fecha : colaPrioridad) {
            System.out.println(fecha.get(Calendar.YEAR) + " " + fecha.get(Calendar.DATE));

        }
        System.out.println("------");
        PriorityQueue<Persona3> cola = new PriorityQueue<>();
        cola.add(new Persona3("Amanda", 56));
        cola.add(new Persona3("Rosa", 16));
        cola.add(new Persona3("Alma", 60));
        cola.add(new Persona3("Pedro", 17));
        cola.remove();
        cola.add(new Persona3("Juan", 11));
        cola.add(new Persona3("Juan2.0", 60));
        for (Persona3 persona : cola) {
            System.out.println(persona);
            
        }

    }
}
