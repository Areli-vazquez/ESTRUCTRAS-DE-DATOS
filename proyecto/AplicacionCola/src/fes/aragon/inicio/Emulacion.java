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

/**
 *
 * @author areli
 */
public class Emulacion {

   private ColaLista<Persona> fila = new ColaLista<>(100);
    private ListaSimple lista = new ListaSimple();
    private ListaSimple personasAtendidas = new ListaSimple();
    private int tiempoTotal = 0;

    public Emulacion() {
    }

    public void correr(int tiempoDeEmulacion) {
        int incrementoTiempo = 0;
        lista.agregarEnCola(new Caja(0, 0, null));
        for (int i = 0; i <= tiempoDeEmulacion; i++) {
            if (Aleatorio.personaEnFila()) {
                fila.insertar(new Persona(0, 0));
            }            
       }
        while (incrementoTiempo <= tiempoDeEmulacion) {            
            //Cuando pasa a caja una persona 
            if (!fila.estaVacia()) {
                Caja tmp = null;
                for (int i = 0; (i < lista.getLongitud()) && (!fila.estaVacia()); i++) {
                    tmp = ((Caja) lista.obtenerNodo(i));
                    if (tmp.isSemaforo()) {
                        tmp.setSemaforo(false);
                        tmp.setPersona(fila.extraer());
                        tmp.getPersona().setTiempoFila(tmp.getTiempoAntender());
                        tmp.setTiempoAntender(Aleatorio.tiempoEnAtender());
                        tmp.setTiempoRestante(tmp.getTiempoAntender());
                        tmp.getPersona().setTiempoTotal(tmp.getPersona().getTiempoFila() + tmp.getTiempoAntender());                        
                        if ((tmp.getPersona().getTiempoTotal() > 15) && (!getFila().estaVacia())&&(getFila().elementoSuperior()!=null)) {
                            lista.agregarEnCola(new Caja(0, 0, null));
                        }
                        //Contar el tiempo total que las cajas atendieron                        
                        tiempoTotal = tmp.getTiempoAntender()+ tiempoTotal;                        
                    }
                    //Restar tiempo a las cajas                    
                    while (tmp.getTiempoRestante() > 0) {                        
                        tmp.setTiempoRestante(tmp.getTiempoRestante() - 1);
                        if (tmp.getTiempoRestante() == 0) {
                            personasAtendidas.agregarEnCola(new Persona(tmp.getPersona()));
                            tmp.setSemaforo(true);
                            tmp.setPersona(null);
                        }
                    }
                }
            }
            incrementoTiempo++;
        }
    }
    public ColaLista<Persona> getFila() {
        return fila;
    }

    public ListaSimple getLista() {
        return lista;
    }

    public ListaSimple getPersonasAtendidas() {
        return personasAtendidas;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

}

