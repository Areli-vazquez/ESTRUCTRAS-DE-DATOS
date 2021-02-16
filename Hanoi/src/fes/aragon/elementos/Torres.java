/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author areli
 */
public class Torres extends JPanel{
    
    //Constructor de la clase torre
     
    public Torres() {
        this.setLayout(null);
    }

    /**
     * Metodo que dibuja la torre en el panel
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLACK);
        
        //base
        g.fillRect(10, 270, 200,5);
        
        //asta
        g.fillRect(110, 30, 5, 240);
        
    }
}

