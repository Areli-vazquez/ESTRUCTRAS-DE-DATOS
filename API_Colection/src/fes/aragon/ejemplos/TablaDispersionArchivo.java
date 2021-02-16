/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author areli
 */
public class TablaDispersionArchivo {
    public static void main(String[] args) {
        File f =new File(System.getProperty("user.dir")+"/quijote.txt");
        Set<String> palabras =new HashSet<String>();
        try {
            InputStreamReader in = new InputStreamReader(new FileInputStream(f),"UTF-8");//es para los caracteres
            BufferedReader buf = new BufferedReader(in);
            String cadena =" ";
            while ((cadena = buf.readLine())!=null) {                
                String[] palabra = cadena.split("");
                for (int i = 0; i < palabra.length; i++) {
                    palabras.add(palabra[i]);
                }
            }
            System.out.println("Total de palabras: "+palabras.size());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TablaDispersionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TablaDispersionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TablaDispersionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
