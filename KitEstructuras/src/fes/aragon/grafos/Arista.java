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
public class Arista {
    private Vertice destino; 
    private double costo;

    public Arista(Vertice destino, double costo) {
        this.destino = destino;
        this.costo = costo;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
