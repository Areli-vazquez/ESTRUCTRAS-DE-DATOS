/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author areli
 */
public class Anillo extends JPanel{
    /**
     * Constructor de la clase Anillo 
     */
    public Anillo() {
        Random rand = new Random();

        //tres colores bases
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        
        Color colorAnillo = new Color(r, g, b);
         //Línea 1
        Border bordejpanel = new TitledBorder(new BevelBorder(2));

        //Línea 2
        this.setBorder(bordejpanel); 
        this.setBackground(colorAnillo);
    }


}
