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
public class Caja {

    private boolean semaforo = true;
    private int tiempoAntender;
    private int tiempoRestante;
    private Persona persona;

    public Caja(int tiempoParaAntender, int tiempoRestante, Persona persona) {
        this.tiempoAntender = tiempoParaAntender;
        this.tiempoRestante = tiempoRestante;
        this.persona = persona;
    }

    public boolean isSemaforo() {
        return semaforo;
    }

    public void setSemaforo(boolean semafor) {
        this.semaforo = semafor;
    }

    public int getTiempoAntender() {
        return tiempoAntender;
    }

    public void setTiempoAntender(int tiempoAntender) {
        this.tiempoAntender = tiempoAntender;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Caja{" + "semaforo=" + semaforo + ", tiempoParaAntender=" + tiempoAntender + ", tiempoRestante=" + tiempoRestante + ", persona=" + persona + '}';
    }

}
