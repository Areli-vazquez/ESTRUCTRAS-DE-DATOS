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
public class Supercito {
    public static void main(String[] args) {
        Emulacion em= new Emulacion();
        
        em.correr(150);
        System.out.println("Durante: "+em.getTiempoTotal()+" minutos, las cajas tuvieron trabajo.");
         for (int i = 0; i < em.getPersonasAtendidas().getLongitud(); i++) {
             System.out.println("El número " + (i+1)+em.getPersonasAtendidas().obtenerNodo(i));
         }
    }
    
    
}
