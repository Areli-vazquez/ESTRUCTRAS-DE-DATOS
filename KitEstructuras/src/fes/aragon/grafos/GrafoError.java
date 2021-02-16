/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.grafos;

/**
 *
 * @author areli
 */
public class GrafoError extends RuntimeException{
    
    public GrafoError(String nombre){
        super(nombre);
    }
    
}
