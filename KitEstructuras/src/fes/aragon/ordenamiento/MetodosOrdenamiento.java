/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ordenamiento;

import fes.aragon.dinamicas.ListaSimple;
import javax.swing.JPanel;

/**
 *
 * @author areli
 */
public class MetodosOrdenamiento {
//ordena de forma descendente
//MÉTODO DE SELECCIÓN

    public static void seleccion(ListaSimple lista) {//se hace una lista simple
        int min = 0; //pivote, variable del número que se encuentra
        //recorrido de buscar el elemento
        for (int i = 0; i < lista.getLongitud(); i++) {//rango desde 0, de i hasta la longitud de la lista
            min = i;//trabajaremos con la posicion del dato
            //posicionar el elemento en el lugar que le corresponde
            for (int j = i + 1; j < lista.getLongitud(); j++) {//empezará a trabajar a partir de i+1 que es la posicion qe le sigue al de arriba
                //se le pone un j++ para que siga avanzando
                if ((Integer) lista.obtenerNodo(j) < (Integer) lista.obtenerNodo(min)) {//va acceder al elemento que se le indica con j
                    //modificamos el de lista y hacemos un cash con integer para el obtener nodo que es objto.
                    min = j;//minumo es igual a j  para que cumpla la condición
                }
            }
            if (i != min) {//si es diferente a minimo se hace el siguiente cambio
                Object tmp = lista.obtenerNodo(i);//se genera un temporal donde tenemos el areglo que es en lista en obtener nodo(indice)del i 
                lista.inserteEnIndice(lista.obtenerNodo(min), i);//hacemos el cambio en lista en obtener nodo, con el dato posicionado en "i"
                lista.inserteEnIndice(tmp, min);//regresamos el dato en la lista donde le tenemos con el valor de i con ayuda de temporal.
            }
        }
    }

    //metodo para el JPanel
    //MÉTODO DE SELECCIÓN
    public static void seleccion(ListaSimple lista, JPanel lamina) {//recibe el valor de lista simple y de jpanel
        int min = 0; //pivote, variable del número que se encuentra
        //recorrido de buscar el elemento
        for (int i = 0; i < lista.getLongitud(); i++) {//rango desde 0, de i hasta la longitud de la lista
            min = i;//trabajaremos con la posicion del dato
            //posicionar el elemento en el lugar que le corresponde
            for (int j = i + 1; j < lista.getLongitud(); j++) {//empezara a trabajar a partir de i+1 que es la posicion qe le sigue al de arriba
                //se le pone un j++ para que siga avanzando
                if ((Integer) lista.obtenerNodo(j) < (Integer) lista.obtenerNodo(min)) {//va acceder al elemento que se le indica con j
                    //modificamos el de lista y hacemos un cash con integer para el obtener nodo que es objto.
                    min = j;//minumo es igual a j  para que cumpla la condición
                }
            }
            if (i != min) {//si es diferente a minimo se hace el siguiente cambio
                Object tmp = lista.obtenerNodo(i);//se genera un temporal donde tenemos el areglo que es en lista en obtener nodo(indice)del i 
                lista.inserteEnIndice(lista.obtenerNodo(min), i);//hacemos el cambio en lista en obtener nodo, con el dato posicionado en "i"
                lista.inserteEnIndice(tmp, min);//regresamos el dato en la lista donde le tenemos con el valor de i con ayuda de temporal.
            }
            //pintar
            lamina.repaint();
            try {//se añade un try catch con el sleep
                Thread.sleep(50);//para que se quede estatico durante 50 milisegundos
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    //MÉTODO BURBUJA
    //ordena de forma descendente
    public static void burbuja(ListaSimple lista) {//se crea el método burbuja y se recibe la lista  de la clase lista simple
        for (int i = 1; i < lista.getLongitud(); i++) { //rango desde 0, de i hasta la longitud de la lista
            for (int j = 0; j < lista.getLongitud() - i; j++) {//empezara a trabajar a partir de i+1 que es la posicion qe le sigue al de arriba 
                //y la longitud será de -i de la posiciond e arriba
                if ((Integer) lista.obtenerNodo(j) > (Integer) lista.obtenerNodo(j + 1)) {//orden de menor a mayor
                    //va acceder al elemento que se le indica con j
                    //modificamos el de lista y hacemos un cash con integer para el obtener nodo que es objto.
                    Object tmp = lista.obtenerNodo(j);//se genera un temporal donde tenemos el areglo que es en lista en obtener nodo(indice)del j
                    lista.inserteEnIndice(lista.obtenerNodo(j + 1), j);
                    lista.inserteEnIndice(tmp, j + 1);//pondremos el nodo en la posicion de j+1
                }
            }
        }
    }

    //metodo para el JPanel
    //MÉTODO DE BURBUJA
    public static void burbuja(ListaSimple lista, JPanel lamina) {
        for (int i = 1; i < lista.getLongitud(); i++) { //rango desde 0, de i hasta la longitud de la lista
            for (int j = 0; j < lista.getLongitud() - i; j++) {//empezara a trabajar a partir de i+1 que es la posicion qe le sigue al de arriba y 
                //la longitud será de -i de la posiciond e arriba
                if ((Integer) lista.obtenerNodo(j) > (Integer) lista.obtenerNodo(j + 1)) {//orden de menor a mayor
                    //va acceder al elemento que se le indica con j
                    //modificamos el de lista y hacemos un cash con integer para el obtener nodo que es objto.
                    Object tmp = lista.obtenerNodo(j);//se genera un temporal donde tenemos el areglo que es en lista en obtener nodo(indice)del j
                    lista.inserteEnIndice(lista.obtenerNodo(j + 1), j);//se inserta la variable en el indice con j+1
                    lista.inserteEnIndice(tmp, j + 1);//pondremos el nodo en la posicion de j+1
                    lamina.repaint();//pintar
                    try {//se añade un try catch con el sleep
                        Thread.sleep(5);//para que se quede estatico durante 4 milisegundos
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    //MÉTODO DE INSERCIÓN
    public static void insercion(ListaSimple lista) {//se crea el método inserción y se recibe la lista  de la clase lista simple.
        int tmp, i, j;//se crean las variables de tipo entero que se ocuparán más adelante.
        int inser = lista.getLongitud();//se crea un objeto tipo int con el largo de la lista.
        for (j = 1; j < inser; j++) {///empezara a trabajar a partir de j=1 y j seguira siendo menor que la variable .
            tmp = (Integer) lista.obtenerNodo(j);//se hace un catch en donde utilizaremos el método de obtener nodo para su posición j. 
            i = j - 1;//pondremos el nodo en la posicion de j-1
            while ((i >= 0) && (tmp < (Integer) lista.obtenerNodo(i))) {//se hace un catch en donde se convertirá la variable de obtener nodo y esta
                //que sea mayor que la variable que se da en temporal.
                lista.inserteEnIndice((Integer) lista.obtenerNodo(i), i + 1);//se inserta la variable en el indice con i+1
                i--;// i se decrementa para que cumpla la condición
            }
            lista.inserteEnIndice(tmp, i + 1);//pondremos el nodo en la posicion de i+1
        }
    }

    //metodo para el jpanel
    //MÉTODO DE INSERCIÓN
    public static void insercion(ListaSimple lista, JPanel lamina) {//se crea el método inserción y se recibe la lista  de la clase lista simple.
        int tmp, i, j;//se crean las variables de tipo entero que se ocuparán más adelante.
        int inser = lista.getLongitud();//se crea un objeto tipo int con el largo de la lista.
        for (j = 1; j < inser; j++) {///empezara a trabajar a partir de j=1 y j seguira siendo menor que la variable .
            tmp = (Integer) lista.obtenerNodo(j);//se hace un catch en donde utilizaremos el método de obtener nodo para su posición j. 
            i = j - 1;//pondremos el nodo en la posicion de j-1
            while ((i >= 0) && (tmp < (Integer) lista.obtenerNodo(i))) {//se hace un catch en donde se convertirá la variable de obtener nodo y esta
                //que sea mayor que la variable que se da en temporal.
                lista.inserteEnIndice((Integer) lista.obtenerNodo(i), i + 1);//se inserta la variable en el indice con i+1
                i--;// i se decrementa para que cumpla la condición
            }
            lista.inserteEnIndice(tmp, i + 1);//pondremos el nodo en la posicion de i+1
            lamina.repaint();//pintar
            try {//se añade un try catch con el sleep
                Thread.sleep(50);//para que se quede estatico durante 50 milisegundos
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    //MÉTODO DE QUICKSORT
    public static void quicksort(ListaSimple lista, int izq, int der) {//se crea el método quicksort y se recibe la lista  de la clase lista simple,
        // se crea las variables izquierda y derecha
        int list = lista.getLongitud();
        int mitad = (Integer) lista.obtenerNodo(izq);//se hace un catch en donde utilizaremos el método de obtener nodo para su posición a la mitad. 
        int izquierda = izq;//se crea la variable izquierda con el objeto izq
        int derecha = der;//se crea la variable derecha con el objeto der
        int tmp;//se crea la variable tmp de tipo entera (int)

        while (izquierda < derecha) {//se crea un ciclo en donde indica que izquierda deberá ser menor que derecha
            while (((Integer) lista.obtenerNodo(izquierda) <= mitad) && izquierda < derecha) {//se crea un ciclo con while y se hace un catch 
                //en donde utilizaremos el método de obtener nodo para su posición izquierda y debe ser menor o igual a la posicion de la mitad.  
                izquierda++;//incremento en el lado izquierdo.
            }
            while ((Integer) lista.obtenerNodo(derecha) > mitad) {//se crea un ciclo con while y se hace un catch 
                //en donde utilizaremos el método de obtener nodo para su posición derecha y debe ser mayor a la posicion de la mitad.  
                derecha--;//decremento en derecha
            }
            if (izquierda < derecha) {//condición si cumple que izquierda sea menor que derecha
                tmp = (Integer) lista.obtenerNodo(izquierda);//se utiliza nuestra variable temporal, utilizaremos un catch en 
                //donde utilizaremos el método de obtener nodo para su posición izquierda.
                lista.inserteEnIndice((Integer) lista.obtenerNodo(derecha), izquierda);//se inserta la variable en derecha e izquierda.
                lista.inserteEnIndice(tmp, derecha);//se inserta la variable en el indice marcado con tmp y en el lado derecho.
            }
        }
        lista.inserteEnIndice((Integer) lista.obtenerNodo(derecha), izq);//se inserta la variable en el indice derecho
        lista.inserteEnIndice(mitad, derecha);//se inserta la variable en el indice derecho y a la mitad.

        if (izq < derecha - 1) {//condicion de que cumpla que nuestro objeto izq sea menor que la posición derecha -1
            quicksort(lista, izq, derecha - 1);//pondremos el nodo en la posicion de la lista, izquierda e ira en posicion derecha-1 
        }
        if (derecha + 1 < der) {//condicion de que cumpla que nuestra posición derecha+1 sea menor que nuestro objeto der.
            quicksort(lista, derecha + 1, der);//pondremos el nodo en la posicion de la lista, derecha+1 y este ira en el lado derecho.
        }
    }

    //Método para JPanel
    //MÉTODO DE QUICKSORT
    public static void quicksort(ListaSimple lista, int izq, int der, JPanel lamina) {//se crea el método quicsort y se recibe la lista  de la clase lista simple,
        // se crea las variables izquierda y derecha
        int mitad = (Integer) lista.obtenerNodo(izq);//se hace un catch en donde utilizaremos el método de obtener nodo para su posición a la mitad. 
        int izquierda = izq;//se crea la variable izquierda con el objeto izq
        int derecha = der;//se crea la variable derecha con el objeto der
        int tmp;//se crea la variable tmp de tipo entera (int)

        while (izquierda < derecha) {//se crea un ciclo en donde indica que izquierda deberá ser menor que derecha
            while (((Integer) lista.obtenerNodo(izquierda) <= mitad) && izquierda < derecha) {//se crea un ciclo con while y se hace un catch 
                //en donde utilizaremos el método de obtener nodo para su posición izquierda y debe ser menor o igual a la posicion de la mitad.  
                izquierda++;//incremento en el lado izquierdo.
            }
            while ((Integer) lista.obtenerNodo(derecha) > mitad) {//se crea un ciclo con while y se hace un catch 
                //en donde utilizaremos el método de obtener nodo para su posición derecha y debe ser mayor a la posicion de la mitad.  
                derecha--;//decremento en derecha
            }
            if (izquierda < derecha) {//condición si cumple que izquierda sea menor que derecha
                tmp = (Integer) lista.obtenerNodo(izquierda);//se utiliza nuestra variable temporal, utilizaremos un catch en 
                //donde utilizaremos el método de obtener nodo para su posición izquierda.
                lista.inserteEnIndice((Integer) lista.obtenerNodo(derecha), izquierda);//se inserta la variable en derecha e izquierda.
                lista.inserteEnIndice(tmp, derecha);//se inserta la variable en el indice marcado con tmp y en el lado derecho.
            }
        }
        lista.inserteEnIndice((Integer) lista.obtenerNodo(derecha), izq);//se inserta la variable en el indice derecho
        lista.inserteEnIndice(mitad, derecha);//se inserta la variable en el indice derecho y a la mitad.

        if (izq < derecha - 1) {//condicion de que cumpla que nuestro objeto izq sea menor que la posición derecha -1
            quicksort(lista, izq, derecha - 1, lamina);//pondremos el nodo en la posicion de la lista, izquierda e ira en posicion derecha-1 
            lamina.repaint();//pintar
            try {//se añade un try catch con el sleep
                Thread.sleep(50);//para que se quede estatico durante 50 milisegundos
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        if (derecha + 1 < der) {//condicion de que cumpla que nuestra posición derecha+1 sea menor que nuestro objeto der.
            quicksort(lista, derecha + 1, der, lamina);//pondremos el nodo en la posicion de la lista, derecha+1 y este ira en el lado derecho.
            lamina.repaint();//pintar
            try {//se añade un try catch con el sleep
                Thread.sleep(50);//para que se quede estatico durante 50 milisegundos
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
