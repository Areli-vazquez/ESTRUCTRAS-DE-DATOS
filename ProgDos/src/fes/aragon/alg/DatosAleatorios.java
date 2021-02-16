/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.alg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author areli
 */
public class DatosAleatorios {

    public static void main(String[] args) {
        FileWriter fw = null;
        final int cantidad = 1500;
        try {
            //declaracion de datos
            int[] datos = new int[500];//creando arreglo y poniendole valores 
            //file para crear rutas
            Random rd = new Random();
            File f = new File(System.getProperty("user.dir") + "/numeros.txt");
            fw = new FileWriter(f, false); //inicializar el archivo
            PrintWriter pr = new PrintWriter(fw);//imprimirlo
            int contador = 99;//incremento de   datos 
            for (int i = 0; i < datos.length; i++) {
                pr.write(String.valueOf(rd.nextInt(200) + ";"));//String para tranformar datos a string
                //";" es para poner la división de números
                if (i == contador) {
                    pr.write("\n");
                    contador += 100;//cuando contador llega a 99 hace un salto de linea
                    //seguirá aunmentando a i y asi susecivamente 
                }
            }
            /*for (int i = 0; i < datos.length; i++) {
                datos[i] =rd.nextInt(200);//números aleatorios entre 0 a 200 y se le asigna a "datos"
                //se puede repetir un número de esos
            }   for (int i = 0; i < datos.length; i++) {
                System.out.println(datos[i]);
            }
             */
        } catch (IOException ex) {
            Logger.getLogger(DatosAleatorios.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(DatosAleatorios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
