/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.arbol;

/**
 *
 * @author areli
 */
public class Nodo {
    private Integer información;
    private Integer hijoIzq;
    private Integer hijoDer;

    //CONSTRUCTOR

    public Nodo(Integer información) {
        this.información = información;
    }


    public Nodo(Integer información, Integer hijoIzq, Integer hijoDer) {
        this.información = información;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }
    //GETTERS AND SETTERS
    public Integer getInformación() {
        return información;
    }

    public void setInformación(Integer información) {
        this.información = información;
    }

    public Integer getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Integer hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Integer getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Integer hijoDer) {
        this.hijoDer = hijoDer;
    }

    @Override
    public String toString() {
        return "Nodo{" + "informaci\u00f3n=" + información + ", hijoIzq=" + hijoIzq + ", hijoDer=" + hijoDer + '}';
    }
    
}
