/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.util.Objects;

/**
 *
 * @author areli
 */
public class Alumno {
    private String nombre;
    private String ap;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {  
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
//comparando la dirección que te da el objeto
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ap, other.ap)) {
            return false;
        }
        return true;
    }
   

    

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", ap=" + ap + '}';
    }
        
    
}
