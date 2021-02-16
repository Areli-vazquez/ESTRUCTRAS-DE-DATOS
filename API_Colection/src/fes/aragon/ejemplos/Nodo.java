/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

/**
 *
 * @author areli
 */
public class Nodo implements Comparable<Nodo>{
    private int valor;
//constructor
    public Nodo(int valor) {
        this.valor = valor;
    }
//getters y setters 
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
//metodo implementado 
    @Override
    public int compareTo(Nodo o) {
        //return this.valor-o.getValor(); //DE MENOR A MAYPR
        return o.getValor()-this.valor;//DE MAYOR A MENOR
        //agarra el valor nuevo con el valor que esta al principio
    }
    
    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + '}';
    }
}