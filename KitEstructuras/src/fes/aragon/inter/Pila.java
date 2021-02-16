/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inter;

/**
 *
 * @author areli
 */
public interface Pila<E>{//la E toma el tipo de variable que se mete a la pila
    void borrar();
    boolean estaVacia();
    void insertar(E dato);//tipo de dato
    E extraer();//estraer el valor que esta en cabeza
    E elementoSuperior();//agarrar nuevamente el elemento de hasta arriba  y lo inserta de nuevo
    
    
    
}
