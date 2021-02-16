/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.dinamicas.doble;

/**
 *
 * @author areli
 */
public class ListaDoble {
    protected NodoDoble cabeza, cola;
    protected int longitud = 0;

    public ListaDoble() {
        cabeza = cola = null;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void agregarEnCabeza(Object dato) {
        if (cabeza == null) {
            cabeza = new NodoDoble(dato, cabeza, null);
        } else {
            cabeza = new NodoDoble(dato, cabeza, null);
            cabeza.getSiguiente().setAnterior(cabeza);
        }
        if (cola == null) {
            cola = cabeza;
        }

        longitud++;
    }

    public void agregarEnCola(Object dato) {
        if (cabeza == null) {
            cabeza = cola = new NodoDoble(dato, null, cola);
        } else {
            cola = new NodoDoble(dato, null, cola);
            cola.getAnterior().setSiguiente(cola);
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
                cabeza = cabeza.getSiguiente();
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
                cola.getAnterior().setSiguiente(null);
            }
            longitud--;
        }
        return dato;
    }

    public boolean estaEnLista(Object dato) {
        NodoDoble tmp;
        for (tmp = cabeza; tmp != null && !tmp.getDato().equals(dato); tmp = tmp.getSiguiente());
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
                cabeza = cabeza.getSiguiente();
                borrado = true;
                longitud--;
            } else {
                NodoDoble tmp;
                for (tmp = cabeza; tmp != null && !tmp.getDato().equals(dato); tmp = tmp.getSiguiente());
                borrado = true;
                longitud--;
                if (tmp == cola) {
                    cola.getAnterior().setSiguiente(null);
                } else {
                    tmp.getAnterior().setSiguiente(tmp.getSiguiente());
                    tmp.getSiguiente().setAnterior(tmp.getAnterior());
                }
            }
        }
        return borrado;
    }

    public void imprimirElementos() {
        for (NodoDoble tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
            System.out.println(tmp.getDato());
        }
    }

    public Object obtenerNodoDoble(int indice) {
        NodoDoble tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente());
        }
        if (tmp != null) {
            return tmp.getDato();
        } else {
            return null;
        }
    }

    public boolean insertarEnIndice(Object dato, int indice) {
        NodoDoble tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente());
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
                    cabeza = cabeza.getSiguiente();
                    borrado = true;
                    longitud--;
                } else {
                    NodoDoble tmp;
                    int contador = 1;
                    for (tmp = cabeza.getSiguiente();
                            contador < indice;
                            tmp = tmp.getSiguiente(), contador++);
                    borrado = true;
                    longitud--;
                    if (tmp == cola) {
                        cola.getAnterior().setSiguiente(null);
                    } else {
                        tmp.getAnterior().setSiguiente(tmp.getSiguiente());
                        tmp.getSiguiente().setAnterior(tmp.getAnterior());
                    }
                }
            }
        }
        return borrado ;
    }
}
