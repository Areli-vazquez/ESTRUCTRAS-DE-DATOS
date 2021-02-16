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

    //CONSTRUCTORES
    public ArbolBinarioMayorMenor() {
        this.raiz = null;//no tiene dato por eso es nula.
    }

    public void insertar(int dato) {
        Nodo n = raiz, previo = null;//la informacion de n es igual a la raíz
        while (n != null) {//n sea diferente  a null
            previo = n;//n se posiciona donde esta el vacio
            if (n.getDato() < dato) {//si la raiz es menor
                n = n.getDer();//se posiciona en otra dirección derecha
            } else {
                n = n.getIzq();
            }
        }
        //posicion de previo
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
        ColaLista<Nodo> cola = new ColaLista();
        if (n != null) {
            cola.insertar(n);
            while (!cola.estaVacia()) {
                n = (Nodo) cola.extraer();
                System.out.println(n.getDato());
                if (n.getIzq() != null) {
                    cola.insertar(n.getIzq());//dar el hijo izquierdo
                }
                if (n.getDer() != null) {
                    cola.insertar(n.getDer());//dar l hijo derecho
                }
            }
        }
    }
    public void preOrden(Nodo n){
        if (n!=null) {
            System.out.println(n.getDato());
            preOrden(n.getIzq());
            preOrden(n.getDer());
        }
    }
    public void orden(Nodo n){
        if (n!=null) {
            orden(n.getIzq());//sacar los datos del lado izq
            System.out.println(n.getDato());//dar el dato que corresponde
            orden(n.getDer());//sacar los datos del lado der
        }
    }
    public void postOrden(Nodo n){
        if (n!=null) {
            postOrden(n.getIzq());
            postOrden(n.getDer());
            System.out.println(n.getDato());//nodo padre
        }
    }
    //método get de nodo padre
    public Nodo getRaiz() {
        return raiz;
    }
}
