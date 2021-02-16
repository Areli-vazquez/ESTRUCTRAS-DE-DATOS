/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.swing;

import com.sun.image.codec.jpeg.ImageFormatException;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageDecoder;
import fes.aragon.impl.PilaInundacion;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JPanel;

/**
 *
 * @author areli
 */
public class PanelPila extends JPanel {

    private BufferedImage img;

    
    public PanelPila() {
        InputStream entrada = getClass().getResourceAsStream("/fes/aragon/recursos/bmo.jpg");
        JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(entrada);

        try {
            img = decoder.decodeAsBufferedImage();
            EventoRaton evt = new EventoRaton();
            this.addMouseListener(evt);
            this.setFocusable(true);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ImageFormatException ex) {
            ex.printStackTrace();
        }
    }

    private class EventoRaton extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e); 
            System.out.println(img.getRGB(e.getX(), e.getY()));
            inundacion(e.getX(), e.getY());
        }
    }

    private void inundacion(int x, int y) {
        PilaInundacion<Point> pila = new PilaInundacion<>();
        pila.insertar(new Point(x, y));
        while (!pila.estaVacia()) {
            Point p = (Point) pila.extraer();
            int colorImg = img.getRGB(p.x, p.y);
            if (colorImg != -1322255 && (colorImg >= -16514044 && colorImg <= 16777216)) {
                img.setRGB(p.x, p.y,-1322255);
                pila.insertar(new Point(p.x + 1, p.y));//llamada a la derecha
                pila.insertar(new Point(p.x - 1, p.y));//llamada a la izquierda
                pila.insertar(new Point(p.x, p.y + 1));//llamada abajo
                pila.insertar(new Point(p.x, p.y - 1));//llamada arriba
            }
            repaint();
        }
    }

    public BufferedImage getImg() {
        return img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D gg = (Graphics2D) g;
        gg.drawImage(img, 0, 0, this);
    }
}
