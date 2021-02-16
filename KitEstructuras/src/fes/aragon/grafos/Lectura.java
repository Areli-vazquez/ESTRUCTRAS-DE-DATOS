/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.grafos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author areli
 */
public class Lectura {
    private Grafo g=new Grafo();
    public void LeerArchivo(){        
        JFileChooser abrir = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "txt", "texto");
        abrir.setFileFilter(filtro);
        int seleccion = abrir.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                InputStreamReader fr=new InputStreamReader(
                        new FileInputStream(abrir.getSelectedFile().getPath()), StandardCharsets.UTF_8);
                BufferedReader br=new BufferedReader(fr);
                String cad="";
                while((cad=br.readLine())!=null){
                    StringTokenizer tokens=new StringTokenizer(cad);
                    String fuente=tokens.nextToken();
                    String destino=tokens.nextToken();
                    double costo=Double.parseDouble(tokens.nextToken());
                    g.agregarArista(fuente, destino, costo);                    
                };
                fr.close();
                br.close();                
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }            
            
        }
    }

    public Grafo getG() {
        return g;
    }

    public void setG(Grafo g) {
        this.g = g;
    }
    
}
