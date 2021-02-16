/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.alg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author areli
 */
public class LeerArchivos {

    public static void main(String[] args) {
        FileReader fr = null;
        int[] arg = new int[1500];
        try {
            File f = new File(System.getProperty("user.dir") + "/numeros.txt");
            fr = new FileReader(f);
            BufferedReader buff = new BufferedReader(fr);
            String cad = "";
            int contador = 0;
            while ((cad = buff.readLine()) != null) {
                String[] token = cad.split(";");
                for (String token1 : token) {//se agrega el for para las variables que se ocuparán
                    arg[contador] = Integer.parseInt(token1);//convertimos a entero el token
                }
                for (int i = 0; i < token.length; i++) { //se añade el recorrido con el for
                    arg[contador] = Integer.parseInt(token[i]);
                    contador++;

                }
            }
            int i = 0;//posición y variable de control aumentada
            int j = 0;//se añade la variable que indica el indice
            int x = 30;//en esta posición esta e número que metimos(valor de x)
            int contados = 0;
            while ((j < arg.length)) {   //Mientras j sea menor que el arreglo             
                if (x == arg[j]) {
                    contados++;
                    System.out.println("El valor " + x + " se encuentra en el indice " + (j));
                }
                j++;
            }
            while ((i < arg.length) && (x != arg[i])) {//mientras i sea menor a la longitud del arreglo 
                if (x == arg[i]) {// va a sumar uno a "contar" si el numero que metimos es igual a lo que hay Fen el arreglo en la posicion i (que actualmente vale 0)
                    contados++;// lleva el número de veces que lleva "x"
                }
                i++;

            }

            if (contados > 0) {
                System.out.println("El valor " + x + " aparece " + contados + " veces ");

            } else {
                System.out.println("El valor " + x + " se encuentra en el indice " + (i));
            }

        } catch (IOException ex) {
            Logger.getLogger(LeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
