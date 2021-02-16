/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.componetes.Aleatorio;
import fes.aragon.componetes.Caja;
import fes.aragon.componetes.Persona;
import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.impl.ColaLista;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author areli
 */
public class Emulacion {

    private ColaLista<Persona> fila = new ColaLista<>(100);
    private ListaSimple cajas = new ListaSimple();
    private ListaSimple personasAtendidas = new ListaSimple();
    private int tiempoTotal = 0;

  public Emulacion() {

    }

    public void correr(int tiempoDeEmulacion) {
        int incrementoTiempo = 0;
        cajas.agregarEnCola(new Caja(0, 0, null));
        while (incrementoTiempo <= tiempoDeEmulacion) {
            if (Aleatorio.personaEnFila()) {
                fila.insertar(new Persona(0, 0));
            }
            if (!this.cajas.esVacia()) {
                for (int i = 0; i < cajas.getLongitud(); i++) {
                    Caja tmp = ((Caja) cajas.obtenerNodo(i));
                    if (!tmp.isSemaforo()) {
                        tmp.setTiempoRestante(tmp.getTiempoRestante() - 1);
                        if (tmp.getTiempoRestante() == 0) {
                            this.personasAtendidas.agregarEnCola(new Persona(tmp.getPersona()));
                            tmp.setSemaforo(true);
                            tmp.setPersona(null);
                        }
                    }
                }
            }
            if (!fila.estaVacia()) {
                for (int i = 0; i < cajas.getLongitud(); i++) {
                    Caja tmp = ((Caja) cajas.obtenerNodo(i));
                    if (tmp.isSemaforo()) {
                        tmp.setPersona(fila.extraer());
                        if (tmp.getPersona() == null) {
                            tmp.setSemaforo(true);
                        } else {
                            tmp.setSemaforo(false);
                            tmp.setTiempoAntender(Aleatorio.tiempoEnAtender());
                            tmp.setTiempoRestante(tmp.getTiempoAntender());
                            tmp.getPersona().setTiempoAtendido(tmp.getTiempoAntender());
                            tmp.getPersona().setTiempoTotal(
                                    tmp.getPersona().getTiempoFila() + tmp.getTiempoRestante());

                        }
                    }
                }
            }
            if (!personasAtendidas.esVacia()) {
                for (int i = 0; i < personasAtendidas.getLongitud(); i++) {
                    Persona tmp = (Persona) personasAtendidas.eliminarEnCabeza();
                    System.out.println(tmp.toString());
                    if (tmp.getTiempoTotal() >= 15) {
                        this.cajas.agregarEnCola(new Caja(0, 0, null));
                        System.out.println("-->SE ABRE UNA CAJA NUEVA<--" + this.cajas.getLongitud());
                    }
                }
            }
            if (!this.fila.estaVacia()) {
                this.fila.elementoSuperior().setTiempoFila(this.fila.elementoSuperior().getTiempoFila() + 1);
            }
            incrementoTiempo++;
            
        }

    }
}
