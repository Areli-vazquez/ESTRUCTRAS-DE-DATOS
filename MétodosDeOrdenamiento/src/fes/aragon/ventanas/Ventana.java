/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ventanas;

import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.ordenamiento.MetodosOrdenamiento;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author areli
 */
public class Ventana extends JFrame {//crear una extención de jframe de java swing
    private Lamina lamina = null;//se crea el objeto lamina de la clase Lamina, añadir la lamina al jFrame
    //creación del constructor
    public Ventana() {
        Toolkit hr = Toolkit.getDefaultToolkit();//herramientas del toolkit para las ventanas
        Dimension tamano = hr.getScreenSize();//Manejar coordenadas "x" y "y", con resolucion de la pantalla
        int altura = tamano.height;//creacion de variable entera con altura
        int anchura = tamano.width;//creacion de variable entera con anchura
        this.setSize(anchura / 3, altura / 3);//con setsize se divide entre el ancho 5 y la altura en 3
        this.setResizable(false);//Para que no se redimencione la ventana
        this.setLocationRelativeTo(this);//localizamos la pantalla en medio
        this.setTitle("Visor de ordenamiento");//Ponerle el titulo a la ventana
        this.lamina = new Lamina(anchura, altura);//se añade la lamina con anchura y altura
        this.add(lamina);//agrega la lamina
    }
    public static void main(String[] args) {//se crea el metodo main
        Ventana ventana = new Ventana();//crea el objeto ventana con el constructor
        Ventana ventanaDos = new Ventana();//crea el objeto ventanaDos con el constructor
        Ventana ventanaTres = new Ventana();//crea el objeto ventanaTres con el constructor
        Ventana ventanaCuatro = new Ventana();//crea el objeto ventanaCuatro con el constructor
        Random rd = new Random();//creamos los numeros aleatorios
        ListaSimple lista = new ListaSimple();//creamos un objeto tipo lista 
        ListaSimple listaDos = new ListaSimple();//creamos un objeto tipo lista 
        ListaSimple listaTres = new ListaSimple();//creamos un objeto tipo lista
        ListaSimple listaCuatro = new ListaSimple();//creamos un objeto tipo lista 
        for (int i = 0; i < 150; i++) {//hacemos un for con l50 numeros
            lista.agregarEnCola(rd.nextInt(200));//utilizamos nuestra lista con el metodo de agregar en cabeza, con el rango de 200
            listaDos.agregarEnCola(rd.nextInt(200));//utilizamos nuestra lista con el metodo de agregar en cabeza, con el rango de 200
            listaTres.agregarEnCola(rd.nextInt(200));//utilizamos nuestra lista con el metodo de agregar en cabeza, con el rango de 200
            listaCuatro.agregarEnCola(rd.nextInt(200));//utilizamos nuestra lista con el metodo de agregar en cabeza, con el rango de 200
        }
        ventana.lamina.setDatos(lista);//aparece los datos en lamina
        ventanaDos.lamina.setDatos(listaDos);//aparece los datos en lamina
        ventanaTres.lamina.setDatos(listaTres);//aparece los datos en lamina
        ventanaCuatro.lamina.setDatos(listaCuatro);//aparece los datos en lamina
        ventana.lamina.setX(1);//posicion de la ventana para el dato de set x
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//que ponga los botones de cerrar, minimizar, maximizar
        ventanaDos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//que ponga los botones de cerrar, minimizar, maximizar
        ventanaTres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//que ponga los botones de cerrar, minimizar, maximizar
        ventanaCuatro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//que ponga los botones de cerrar, minimizar, maximizar
        java.awt.EventQueue.invokeLater(new Runnable() {//se cre el hilo
            public void run() {//metodo para correr
                ventana.setVisible(true);//aparece venatana en pantalla
                ventanaDos.setVisible(true);//aparece venatana en pantalla
                ventanaTres.setVisible(true);//aparece venatana en pantalla
                ventanaCuatro.setVisible(true);//aparece venatana en pantalla
            }
        });
        MetodosOrdenamiento.seleccion(lista, ventana.lamina);//darle datos de la lista y la lamina
        MetodosOrdenamiento.burbuja(listaDos, ventanaDos.lamina);//darle datos de la lista y la lamina
        MetodosOrdenamiento.insercion(listaTres, ventanaTres.lamina);//darle datos de la lista y la lamina
        MetodosOrdenamiento.quicksort(listaCuatro, 0, listaCuatro.getLongitud()-1);//darle datos de la lista y la lamina
    }
}
