/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ventanas;

import fes.aragon.dinamicas.ListaSimple;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author areli
 */
public class Lamina extends JPanel {//creamos la extensión de jPanel

    private int anchura, altura;//creacion de variables
    private int x = 1;//otra posicion
    private ListaSimple datos = new ListaSimple();//creación del objeto que contiene listaSimple

    //Constructor
    public Lamina(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    //override method
    @Override
    protected void paintComponent(Graphics g) {//pintado de componentes
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;//utilizamos gráficos de 2D y creamos el objeto  g2 y este se transforma a graficos 2D
        this.pintarCuadros(g2);//crear el método de pintar cuadros
    }
//MÉTODO SET de datos
    public void setDatos(ListaSimple datos) {
        this.datos = datos;
    }
//Metodo set de valores de x 
    public void setX(int x) {
        this.x = x;
    }

    private void pintarCuadros(Graphics2D g2) {//creación del método pintarCuadros y recibirá el objeto Graphics2D
        if (datos.getLongitud() != 0) {//Si los datos es diferente a 0 cumple la siguiente condicion
            int xx = x;//variable de x
            for (int i = 1; i < datos.getLongitud(); i++) {//Se recorré la lista desde 1 hasta el largo de nuestra lista
                //pintar el rectangulo 2D y se crea el objeto rect donde se le indicará las coordenadas 
                Rectangle2D rect = new Rectangle2D.Float(xx, (230 - (Integer) datos.obtenerNodo(i)),5F ,5F);//i =posición 1, lo pintará en coordenada 230,5F hexadecimal ancho y altura
                g2.setColor(Color.black);//color de la línea que parece en pantalla
                g2.fill(rect);//rellenar los rectangulos
                g2.draw(rect);//pintar rectangulos
                xx++;//se sumara la posicion 
            }
        }
    }

}
