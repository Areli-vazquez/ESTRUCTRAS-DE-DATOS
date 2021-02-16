/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.dinamicas;

/**
 *
 * @author areli
 */
public class ListaSimple {

    protected Nodo cabeza, cola;
    protected int longitud = 0;

    public ListaSimple() {
        cabeza = cola = null;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void agregarEnCabeza(Object dato) {
        cabeza = new Nodo(dato, cabeza);
        if (cola == null) {
            cola = cabeza;
        }
        longitud++;
    }

    public void agregarEnCola(Object dato) {
        if (cabeza == null) {
            cabeza = cola = new Nodo(dato);
        } else {
            cola.setSigiente(new Nodo(dato));
            cola = cola.getSigiente();
        }
        longitud++;
    }

    public Object eliminarEnCabeza() {
        Object dato = null;
        if (cabeza != null) {
            dato = cabeza.getDato();
            if (cabeza == cola) {
                cabeza = cola = null;
            } else {
                cabeza = cabeza.getSigiente();
            }
            longitud--;
        }
        return dato;
    }

    public Object eliminarEnCola() {
        Object dato = null;
        if (cola != null) {
            dato = cola.getDato();
            if (cabeza == cola) {
                cabeza = cola = null;
            } else {
                Nodo tmp;
                for (tmp = cabeza; tmp.getSigiente() != cola; tmp = tmp.getSigiente());
                cola = tmp;
                cola.setSigiente(null);
            }
            longitud--;
        }
        return dato;
    }

    public boolean estaEnLista(Object dato) {
        Nodo tmp;
        for (tmp = cabeza; tmp != null && !tmp.getDato().equals(dato); tmp = tmp.getSigiente());
        return tmp != null;
    }

    public boolean eliminar(Object dato) {
        boolean borrado = false;
        if (cabeza != null) {
            if (cabeza == cola && dato.equals(cabeza.getDato())) {
                cabeza = cola = null;
                borrado = true;
                longitud--;
            } else if (dato == cabeza.getDato()) {
                cabeza = cabeza.getSigiente();
                borrado = true;
                longitud--;
            } else {
                Nodo prd, tmp;
                for (prd = cabeza, tmp = cabeza.getSigiente();
                        tmp != null && !tmp.getDato().equals(dato);
                        prd = prd.getSigiente(), tmp = tmp.getSigiente());
                if (tmp != null) {
                    borrado = true;
                    longitud--;
                    prd.setSigiente(tmp.getSigiente());
                    if (tmp == cola) {
                        cola = prd;
                    }
                }
            }
        }
        return borrado;
    }

    public void imprimirElementos() {
        for (Nodo tmp = cabeza; tmp != null; tmp = tmp.getSigiente()) {
            System.out.println(tmp.getDato());
        }
    }

    public Object obtenerNodo(int indice) {
        Nodo tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSigiente());
        }
        if (tmp != null) {
            return tmp.getDato();
        } else {
            return null;
        }
    }

    public boolean insertarEnIndice(Object dato, int indice) {
        Nodo tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSigiente());
        }
        if (tmp != null) {
            tmp.setDato(dato);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarEnIndice(int indice) {
        boolean borrado = false;
        if (indice <= longitud) {
            if (cabeza != null) {
                if (cabeza == cola && indice == 0) {
                    cabeza = cola = null;
                    borrado = true;
                    longitud--;
                } else if (indice == 0) {
                    cabeza = cabeza.getSigiente();
                    borrado = true;
                    longitud--;
                } else {
                    Nodo prd, tmp;
                    int contador=1;
                    for (prd = cabeza, tmp = cabeza.getSigiente();
                            contador<indice;
                            prd = prd.getSigiente(), tmp = tmp.getSigiente(),
                            contador++);
                    if (tmp != null) {
                        borrado = true;
                        longitud--;
                        prd.setSigiente(tmp.getSigiente());
                        if (tmp == cola) {
                            cola = prd;
                        }
                    }
                }
            }
        }
        return borrado;
    }
}
