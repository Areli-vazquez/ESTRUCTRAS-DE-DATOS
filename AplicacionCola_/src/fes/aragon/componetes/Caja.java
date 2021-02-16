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

    private boolean semafor = true;
    private int tiempoParaAntender;
    private int tiempoRestante;
    private Persona persona;

    public Caja(int tiempoParaAntender, int tiempoRestante, Persona persona) {
        this.tiempoParaAntender = tiempoParaAntender;
        this.tiempoRestante = tiempoRestante;
        this.persona = persona;
    }

    public boolean isSemafor() {
        return semafor;
    }

    public void setSemafor(boolean semafor) {
        this.semafor = semafor;
    }

    public int getTiempoParaAntender() {
        return tiempoParaAntender;
    }

    public void setTiempoParaAntender(int tiempoParaAntender) {
        this.tiempoParaAntender = tiempoParaAntender;
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
        return "Caja{" + "semafor=" + semafor + ", tiempoParaAntender=" + tiempoParaAntender + ", tiempoRestante=" + tiempoRestante + ", persona=" + persona + '}';
    }

}
