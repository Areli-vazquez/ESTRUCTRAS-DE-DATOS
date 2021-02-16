/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.Objects;

/**
 *
 * @author areli
 */
public class Articulo implements Comparable<Articulo>{
private String descripcion;
private int numeroDePieza;

    public Articulo(String descripcion, int numeroDePieza) {
        this.descripcion = descripcion;
        this.numeroDePieza = numeroDePieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
//hashcode
    public int getNumeroDePieza() {
        return numeroDePieza;
    }

    public void setNumeroDePieza(int numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    @Override
    public String toString() {
        return "Articulo{" + "descripcion=" + descripcion + ", numeroDePieza=" + numeroDePieza + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.descripcion);
        hash = 83 * hash + this.numeroDePieza;
        return hash;
    }
//metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
   //metodos implementados
    @Override
    public int compareTo(Articulo o) {
        return this.numeroDePieza-o.getNumeroDePieza();
    }
    
    
}
