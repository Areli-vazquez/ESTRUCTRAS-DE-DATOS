/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.grafos;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author areli
 */
public class Vertice {
    private String nombre;
    private List<Arista> adyacente;
    private double distancia; //el coste
    private Vertice previo;
    private Vertice posterior;
    private int variable;
    
    public Vertice(String nombre){
        this.nombre=nombre;
        adyacente= new LinkedList<Arista>();
        reiniciar();
                
    }
    public void reiniciar(){
        distancia = Grafo.INFINITO;
        previo = null;
        posterior = null;
        variable = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arista> getAdyacente() {
        return adyacente;
    }

    public void setAdyacente(List<Arista> adyacente) {
        this.adyacente = adyacente;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vertice getPrevio() {
        return previo;
    }

    public void setPrevio(Vertice previo) {
        this.previo = previo;
    }

    public Vertice getPosterior() {
        return posterior;
    }

    public void setPosterior(Vertice posterior) {
        this.posterior = posterior;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
    
}
