/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.arbolesbinarios;

import fes.aragon.impl.ColaLista;

/**
 *
 * @author areli
 */
public class ArbolBinarioMayorMenor {

    private Nodo raiz;

    public ArbolBinarioMayorMenor() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        Nodo n = raiz, previo = null;
        while (n != null) {
            previo = n;
            if (n.getDato() < dato) {
                n = n.getDer();
            } else {
                n = n.getIzq();
            }
        }
        if (raiz == null) {
            raiz = new Nodo(dato);
        } else if (previo.getDato() < dato) {
            previo.setDer(new Nodo(dato));
        } else {
            previo.setIzq(new Nodo(dato));
        }
    }

    public void recorridoAmplitud() {
        Nodo n = raiz;
        ColaLista<Nodo> cola = new ColaLista(100);
        if (n != null) {
            cola.insertar(n);
            while (!cola.estaVacia()) {
                n = (Nodo) cola.extraer();
                System.out.println(n.getDato());
            }
            if (n.getIzq() != null) {
                cola.insertar(n.getIzq());
            }
            if (n.getDer() != null) {
                cola.insertar(n.getDer());
            }
        }
    }

    public void preOrden(Nodo n) {
        if (n != null) {
            System.out.println(n.getDato());
            preOrden(n.getIzq());
            preOrden(n.getDer());
        }
    }

}
