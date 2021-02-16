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
public class Persona3 implements Comparable<Persona3> {

    private String nombre;
    private int edad;

    public Persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.edad;
        return hash;
    }

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
        final Persona3 other = (Persona3) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    //generador del to string
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona3 o) {
        if (this.edad == 60) {
            System.out.println(this.edad - o.getEdad());
            return -1;
        } else {
            // es al reves
            if (o.getEdad() == 60) {
                return this.edad;
            } else {
                System.out.println(this.edad - o.getEdad());
                return this.edad - o.getEdad();
            }
        }
    }
}
