/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.dinamicasDos;

/**
 *
 * @author areli
 */
public class ListaDoble {

    protected NodoDoble cabeza, cola;
    protected int longitud = 0;

    //CONSTRUCTOR
    public ListaDoble() {
        cabeza = cola = null;
    }

    //MÉTODO PARA LONGITUD DE LISTA
    public int getLongitud() {
        return longitud;
    }

    //MÉTODO LISTA VACIA 
    public boolean esVacia() {
        return cabeza == null;
    }

    //MÉTODO AGREGAR NODOS
    public void agregarEnCabeza(Object dato) {
        NodoDoble nodo = new NodoDoble(dato);
        if (cola == null) {
            cabeza = cola = nodo;
        } else {
            nodo.setSiguiente(cabeza);
            cabeza.setAnterior(nodo);
            cabeza = nodo;
        }
        longitud++;
    }

    public void agregarEnCola(Object dato) {
        NodoDoble nodo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = cola = nodo;
        } else {//si está vacía la lista
            cola.setSiguiente(nodo);
            cabeza.setAnterior(cola);
            cola = nodo;
        }
        longitud++;//incremento en cola
    }

    //MÉTODO IMPRIMIR ELEMENTOS 
    public void imprimirElementos() {
        for (NodoDoble tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
            System.out.println(tmp.getDato());
        }
    }

    //MÉTODOS ELIMINAR
    //Eliminar en cabeza 
    public Object eliminarEnCabeza() {
        Object dato = null;
        if (cabeza != null) {
            dato = cabeza.getDato();
            if (cabeza == cola) {
                cabeza = cola = null;
            } else {
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
            }
            longitud--;
        }
        return dato;
    }

    //Eliminar en cola
    public Object eliminarEnCola() {
        Object dato = null;
        if (cola != null) {//verificar si la lista tiene solo un nodo
            dato = cola.getDato();
            if (cabeza == cola) {
                cabeza = cola = null;
            } else {
                NodoDoble tmp;
                for (tmp = cabeza; tmp.getSiguiente() != cola; tmp = tmp.getSiguiente());
                cola = tmp;
                cola.setSiguiente(null);
            }
            longitud--;
        }
        return dato;
    }

    //Eliminar nodo 
    public void eliminar(Object dato) {
        if (dato.equals(cabeza.getDato())) {
            if (cabeza != null) {
                if (cabeza != cola) {
                    cabeza = cabeza.getSiguiente();
                } else {
                    cabeza = cola = null;
                }
                longitud--;
            }
        } else if (dato.equals(cola.getDato())) {
            if (cola != null) {
                if (cabeza == cola) {
                    cabeza = cola = null;
                } else {
                    NodoDoble tmp;
                    for (tmp = cabeza; tmp.getSiguiente() != cola; tmp = tmp.getSiguiente());
                    cola = tmp;
                    cola.setSiguiente(null);
                }
                longitud--;
            }
        } else {
            NodoDoble tmp1, tmp;
            for (tmp1 = cabeza, tmp = cabeza.getSiguiente(); tmp != null && !tmp.getDato().equals(dato); tmp1 = tmp1.getSiguiente(), tmp = tmp.getSiguiente());
            if (tmp != null) {
                longitud--;
                tmp1.setSiguiente(tmp.getSiguiente());
            } else {
                System.out.println("El valor no se encuentra en la lista");
            }
        }
    }

    //eliminar en indice con posicion que indique
    public boolean eliminarEnIndice(int indice) {
        boolean eliminar = false;
        if (indice < 0 || indice >= longitud) {
            eliminar = true;
        }
        if (!eliminar) {
            if (indice == longitud - 1) {
                eliminarEnCola();
            } else if (indice == 0) {
                eliminarEnCabeza();
            } else {
                int i = 0;
                NodoDoble tmp;
                for (tmp = cabeza.getSiguiente(); tmp != null && i != indice - 1; tmp = tmp.getSiguiente(), i++);
                tmp.getAnterior().setSiguiente(tmp.getSiguiente());
                tmp.getSiguiente().setAnterior(tmp.getAnterior());
                tmp.setSiguiente(null);
                longitud--;
            }
        }
        return eliminar;
    }

    //MÉTODO EN LISTA
    public boolean estaEnLista(Object dato) {
        NodoDoble tmp;
        for (tmp = cabeza; tmp != null && tmp.getDato().equals(dato); tmp = tmp.getSiguiente());
        return tmp != null;
    }

    //MÉTODO INSERTAR 
    public boolean inserteEnIndice(Object dato, int indice) {
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

    //MÉTODO OBTENER NODO
    public Object obtenerNodo(int indice) {
        NodoDoble tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente()) ;
        }
        if (tmp != null) {
            return tmp.getDato();
        } else {
            return null;
        }

    }
    //SUMAR PARES
    public static int sumaPares(int numero){
        if (numero == 0) {
            return 0 ; 
        }
        if (numero %2==0) {
            return numero+sumaPares(numero-1); 
        }else{
            return sumaPares(numero-1);
        }
    }
    //SUMAR IMPARES
        public static int sumaImpares(int numero){
        if (numero == 1) {
            return 1 ; 
        }else{
            return numero+sumaImpares(numero-2); 
        }
    }
    //NÚMERO MENOR
    public int menor() {
        NodoDoble a = cabeza;
        Integer men;
        try {
            if (cabeza == null) {
                System.out.println("Lista esta vacia");
                return 0;
            } else {
                men = (Integer) cabeza.getDato();
                while (a != null) {
                    if (men > (Integer) a.getDato()) {
                        men = (Integer) a.getDato();
                    }
                    a = a.getSiguiente();
                }
            }
            return men;
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        return 0;
    }
//NÚMERO MAYOR
   public int mayor() {
        NodoDoble a = cabeza;
        Integer may;
        try {
            if (cabeza == null) {
                System.out.println("La lista esta vacía");
                return 0;
            } else {
                may = (Integer) cabeza.getDato();
                while (a != null) {
                    if ((Integer) a.getDato() > may) {
                        may = (Integer) a.getDato();
                    }
                    a = a.getSiguiente();
                }
            }
            return may;
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        return 0;
    }
}
