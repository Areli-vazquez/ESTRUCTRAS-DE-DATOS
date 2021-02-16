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
 * @author ricky
 */
public class Emulacion {

    private ColaLista<Persona> fila = new ColaLista<>();
    private ListaSimple cajas = new ListaSimple();
    private ListaSimple personaAtendida = new ListaSimple();
    private int tiempoTotal = 0;

    public Emulacion() {

    }

    public void correr(int tiempoDeEmulacion) {
        int incrementoTiempo = 0;
        cajas.agregarEnCola(new Caja(0, 0, null));
        ListaSimple s = new ListaSimple();
        s.agregarEnCola(0);
        while (incrementoTiempo < tiempoDeEmulacion) {
            //ver si llega personas
            if (Aleatorio.personaEnFila()) {
                fila.insertarFinal(new Persona(0, 0));
                System.out.println("Llega persona");
                //System.out.println("Hay "+fila.getLongitud()+" personas en fila");
            }
            //pasa en caja
            /* Este if bien se puede quitar y solo dejar el del for*/ if (!fila.estaVacia()) {
                for (int i = 0; i < cajas.getLongitud() && !fila.estaVacia(); i++) {
                    Caja tmp = ((Caja) cajas.obtenerNodo(i));
                    if (tmp.isSemafor()) {
                        tmp.setSemafor(false);
                        tmp.setPersona(fila.extraer());
                        System.out.println("  Entra persona a caja: " + (i+1));
                        tmp.setTiempoParaAntender(Aleatorio.tiempoEnAtender());
                        tmp.setTiempoRestante(tmp.getTiempoParaAntender());
                        try {
                            s.inserteEnIndice((int) tmp.getPersona().getTiempoFila() + (int) tmp.getTiempoParaAntender(), i);
                            tmp.getPersona().setTiempoTotal((Integer) s.obtenerNodo(i));
                        } catch (java.lang.NullPointerException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
            //Restar Tiempo a las cajas
            if (!this.cajas.esVacia()) {
                for (int i = 0; i < cajas.getLongitud(); i++) {
                    Caja tmp = ((Caja) cajas.obtenerNodo(i));
                    if (!tmp.isSemafor()) {
                        tmp.setTiempoRestante(tmp.getTiempoRestante() - 1);
                        if (tmp.getTiempoRestante() == 0) {
                            System.out.println("La persona se atendio en: " + tmp.getPersona().getTiempoTotal() + " minutos en la caja " + (i+1));
                            //Abrir una caja si se tardo mas de 15 minutos
                            if ((int) s.obtenerNodo(i) > 15 && !(cajas.getLongitud() >= 15)) {
                                cajas.agregarEnCola(new Caja(0, 0, null));
                                System.out.println("La persona ya se tardo: Se abrio la caja "+ cajas.getLongitud());
                                s.agregarEnCola(0);
                                
                            } else {
                                //cerrar caja, cuando se cierra se recorren las cajas
                                if (cajas.getLongitud() != 1 && (Integer) s.obtenerNodo(i) <= 15) {
                                    System.out.println("Ya no se tardo: Se cerro la caja " + (i+1));
                                    cajas.eliminarEnIndice(i);
                                    s.eliminarEnIndice(i);
                                    //i--;
                                }
                            }
                            //Fin de abrir cajas
                            this.personaAtendida.agregarEnCabeza(new Persona(tmp.getPersona()));
                            tmp.setSemafor(true);
                            tmp.setPersona(null);
                        }
                    }
                }
            }
            //incrementador de tiempo para las personas en la fila
            if (!fila.estaVacia()) {
                for (int i = 0; i < fila.getLongitud(); i++) {
                    Persona tmp = fila.extraer();
                    //System.out.println("Se agreo 1 minuto de espera a la persona: "+i);
                    tmp.setTiempoFila(tmp.getTiempoFila() + 1);
                    fila.insertarFinal(tmp);
                }
            }
            incrementoTiempo++;
            System.out.println("Tiempo trancurrido: " + incrementoTiempo);
            System.out.println("Hay " + fila.getLongitud() + " personas en fila" );
            System.out.println("Hay " + cajas.getLongitud() + " cajas abiertas");
        }
    }

}
