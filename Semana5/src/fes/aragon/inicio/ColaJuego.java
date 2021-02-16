/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.impl.ColaLista;
import java.util.Random;
import javax.swing.JTextArea;

/**
 *
 * @author areli
 */
public class ColaJuego {

    public void JuegoUno(JTextArea textArea) {//método
        ColaLista<Integer> juego = new ColaLista<>(5);
        Random rd = new Random();//para sacar números random
        for (int i = 0; i < 5; i++) {
            juego.insertar(rd.nextInt(200));//límite de 200 num
        }
        Integer primeroCola;
        while (juego.estaVacia()) {//mientras la cola no este vacía sigue trabajando
            primeroCola = juego.extraer();//extrae el primer individuo de la cola
            if (primeroCola >= 0 && primeroCola <= 50) {//rango de 0 a 50 ya no se vuelve a meter en la cola
                if (primeroCola == 25) {// se tiene que agregar o crear un nuevo jugador
                    juego.insertar(rd.nextInt(200));
                }
            } else {
                juego.insertar(rd.nextInt(200));
            }
            for (int i = 0; i < juego.getLongitud(); i++) {
                textArea.append(String.valueOf((Integer) juego.elementoCola(i)));
                textArea.append("\n");
            }
            textArea.append("--------\n");
       }
    }
}
