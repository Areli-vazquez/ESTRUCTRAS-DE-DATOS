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

    //crear variables
    protected Nodo cabeza, cola;
    protected int longitud = 0;

    public ListaSimple() {//constructor vacío 
        cabeza = cola = null;//datos de inicio son nulos
    }

    //creción el método get de longitud 
    public int getLongitud() {//nos dice el número de elementos que tiene longitud
        return longitud;
    }

    public boolean esVacia() {
        return cabeza == null;//lista vacía con null
    }

    //se crea el método para lista vacía
    public boolean Vacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
    public void agregarEnCabeza(Object dato) {//creamos el nodo y le damos cabeza
        cabeza = new Nodo(dato, cabeza);//creamos el nodo y dandole dirección a la cabeza
        if (cola == null) {
            cola = cabeza;//apuntan a la misma dirección
        }
        longitud++;//incremento a longitud
    }

    public void agregarEnCola(Object dato) {
        if (cabeza == null) {//si la lista no está vacía
            cabeza = cola = new Nodo(dato);//crea un nuevo nodo y el dato
        } else {
            cola.setSiguiente(new Nodo(dato));//agarrá el set siguiente y apunta al nuevo nodo
            cola = cola.getSiguiente();//apuntando al siguiente Nodo nuevo 
        }
        longitud++;//incremento en cola
    }

    public Object eliminarEnCabeza() {
        Object dato = 0;//dato que eliminamos vale 0
        if (cabeza == null) {//no tiene elemento 
            dato = cabeza.getDato();//para que cabeza me de dato o los datos que tiene
            if (cabeza == cola) {//los dos apuntan al mismo nodo
                cabeza = cola = null;
            } else {
                cabeza = cabeza.getSiguiente();//apunta al siguiente nodo para que se elimine el primer nodo
            }
            longitud--;//decremento de longitud
        }
        return dato;
    }

    public boolean eliminar(Object dato) {
        boolean eliminar = false;
        if (cabeza != null) {
            if (cabeza == cola && dato.equals(cabeza.getDato())) {//solo hay un nodo y que si esta en el nodo
                cabeza = cola = null;
                eliminar = true;
                longitud--;//se elimina un dato
            } else if (dato == cabeza.getDato()) {//si hay otro dato en cabeza
                cabeza = cabeza.getSiguiente();
                eliminar = true;
                longitud--;//encontro el dato a eliminar
            } else {
                Nodo prd, tmp;
                for (prd = cabeza, tmp = cabeza.getSiguiente();
                        tmp != null && tmp.getDato().equals(dato);
                        prd = prd.getSiguiente(), tmp = tmp.getSiguiente());
                if (tmp != null) {
                    eliminar = true;
                    longitud--;//si encontro el dato a eliminar
                    prd.setSiguiente(tmp.getSiguiente());//vamos a poner anteriormente en el otro nodo

                    if (tmp == cola) {
                        cola = prd;//indicarle el dato anterior
                    }
                }
            }
        }
        return eliminar;
    }

    public boolean estaEnLista(Object dato) {
        Nodo tmp;
        for (tmp = cabeza; tmp != null && tmp.getDato().equals(dato); tmp = tmp.getSiguiente());
        return tmp != null;
    }

    public int eliminarEnCola() {
        Object dato = 0;
        if (cola != null) {//cola diferente a null
            dato = cola.getDato();
            if (cabeza == cola) {//solo hay un dato
                cabeza = cola = null;
            } else {
                Nodo temp;//nodo temporal
                for (temp = cabeza; temp.getSiguiente() != cola; temp = temp.getSiguiente());//recorrer cda uno de los nodos
                // hasta llegar al nodo diferente al anterios
                cola = temp;//cuando encuentra ya la variable temporal
                cola.setSiguiente(null);//indica que vaya avanzando constantemente y termine cuando sea diferente a null.
            }
            longitud--;//decremento elemento
        }
        return 0;

    }

    public void imprimirElementos() {
        for (Nodo tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {//Nodo es una variable temporal que indica en la cabeza y se manda al suguiente dato si es null
            System.out.println(tmp.getDato());
        }
    }

    public Object obtenerNodo(int indice) {//regresa valores de objeto indice
        Nodo tmp = null;//el nodo empieza en cabeza
        if (indice <= longitud) {//indice es igual a el indice y longitud
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente());//empieza con suindice 0,llega hasta el valor del nodo y hasta que llegue a null no a llegado a el ultimo
        }
        if (tmp != null) {//si encontro el nodo a traves del indice
            return tmp.getDato();//regresa el dato
        }
        if (tmp != null) {
            return tmp.getDato();
        } else {
            return null;//sino retorne un valor null
        }
    }
    

    public boolean inserteEnIndice(Object dato, int indice) {
        Nodo tmp = null;//el nodo empieza en cabeza
        if (indice <= longitud) {//indice es igual a el indice y longitud
            tmp = cabeza;
            for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente());//empieza con suindice 0,llega hasta el valor del nodo y hasta que llegue a null no a llegado a el ultimo
        }
        if (tmp != null) {
            tmp.setDato(dato);
            return true;
        } else {
            return false;//sino retorne un valor null
        }
    }

    public boolean eliminarEnIndice(int indice) {
        boolean eliminar = false;
        if (indice <= longitud) {
                if (cabeza == cola && indice == 0) {//solo hay un nodo y que si esta en el nodo
                    cabeza = cola = null;
                    eliminar = true;
                    longitud--;//se elimina un dato
                } else if (indice == 0) {//indice = a 0
                    cabeza = cabeza.getSiguiente();
                    eliminar = true;
                    longitud--;//encontro el dato a eliminar
                } else {
                    Nodo prd, tmp;
                    int contador = 1;
                    for (prd = cabeza, tmp = cabeza.getSiguiente();
                            contador < indice;
                            prd = prd.getSiguiente(), tmp = tmp.getSiguiente(), contador++);
                    if (tmp != null) {
                        eliminar = true;
                        longitud--;//si encontro el dato a eliminar
                        prd.setSiguiente(tmp.getSiguiente());//vamos a poner anteriormente en el otro nodo

                        if (tmp == cola) {
                            cola = prd;//indicarle el dato anterior
                        }
                    }
                }
            }
        
        return eliminar;
    }
}

/*
    public void eliminarRepetidos(int dato) {
        boolean eliminar = false;
        Nodo tmp, rep;
        for (rep = cola, tmp = cola.getSiguiente();
                tmp != null && tmp.getDato().equals(dato);
                rep = rep.getSiguiente(), tmp = tmp.getSiguiente());
        if (tmp != null) {
            eliminar = true;
            rep.setSiguiente(tmp.getSiguiente());//vamos a poner anteriormente en el otro nodo

            if (tmp == cola) {
                cola = rep;//indicarle el dato anterior
            }
        }
    }*/
