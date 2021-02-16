/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.componetes;

/**
 *
 * @author areli
 */
public class Persona {
    private int tiempoFila = 0;
    private int tiempoAtendido=0;
    private int tiempoTotal = 0;

    public Persona(int tiempoFila, int tiempoTotal) {
        this.tiempoFila = tiempoFila;
        this.tiempoTotal = tiempoTotal;
    }    
    
    public Persona(Persona persona) {
        this.tiempoFila = persona.getTiempoFila();
        this.tiempoTotal = persona.getTiempoTotal();
        this.tiempoAtendido= persona.getTiempoAtendido();
    }   

    public int getTiempoFila() {
        return tiempoFila;
    }

    public void setTiempoFila(int tiempoFila) {
        this.tiempoFila = tiempoFila;
    }

    public int getTiempoAtendido() {
        return tiempoAtendido;
    }

    public void setTiempoAtendido(int tiempoAtendido) {
        this.tiempoAtendido = tiempoAtendido;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    @Override
    public String toString() {
        return "Persona{" + "tiempoFila=" + tiempoFila + ", tiempoAtendido=" + tiempoAtendido + ", tiempoTotal=" + tiempoTotal + '}';
    }
    
}
