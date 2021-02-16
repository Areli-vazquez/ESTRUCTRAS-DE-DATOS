/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ordenamiento;

import fes.aragon.dinamicas.ListaSimple;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author areli
 */
public class MetodosOrdenamiento {

    public static void Seleccion(ListaSimple lista) {
        int min = 0;
        for (int i = 0; i < lista.getLongitud(); i++) {
            min = i;
            for (int j = i + 1; j < lista.getLongitud(); j++) {
                if ((Integer) lista.obtenerNodo(j) < (Integer) lista.obtenerNodo(min)) {
                    min = j;
                }
            }
            if (i != min) {
                Object tmp = lista.obtenerNodo(i);
                lista.insertarEnIndice(lista.obtenerNodo(min), i);
                lista.insertarEnIndice(tmp, min);
            }
        }
    }

    public static void Seleccion(ListaSimple lista, JPanel lamina) {
        int min = 0;
        for (int i = 0; i < lista.getLongitud(); i++) {
            min = i;
            for (int j = i + 1; j < lista.getLongitud(); j++) {
                if ((Integer) lista.obtenerNodo(j) < (Integer) lista.obtenerNodo(min)) {
                    min = j;
                }
            }
            if (i != min) {
                Object tmp = lista.obtenerNodo(i);
                lista.insertarEnIndice(lista.obtenerNodo(min), i);
                lista.insertarEnIndice(tmp, min);

            }
            lamina.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void Burbuja(ListaSimple lista) {
        for (int i = 1; i < lista.getLongitud(); i++) {
            for (int j = 0; j < lista.getLongitud() - i; j++) {
                if ((Integer) lista.obtenerNodo(j)
                        > (Integer) lista.obtenerNodo(j + 1)) {
                    Object tmp = lista.obtenerNodo(j);
                    lista.insertarEnIndice(lista.obtenerNodo(j + 1), j);
                    lista.insertarEnIndice(tmp, j + 1);
                }
            }
        }
    }

    public static void Burbuja(ListaSimple lista, JPanel lamina) {
        for (int i = 1; i < lista.getLongitud(); i++) {
            for (int j = 0; j < lista.getLongitud() - i; j++) {
                if ((Integer) lista.obtenerNodo(j)
                        > (Integer) lista.obtenerNodo(j + 1)) {
                    Object tmp = lista.obtenerNodo(j);
                    lista.insertarEnIndice(lista.obtenerNodo(j + 1), j);
                    lista.insertarEnIndice(tmp, j + 1);
                }
            }
            lamina.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void Insercion(ListaSimple lista) {
        int p, j, aux;
        for (p = 1; p < lista.getLongitud(); p++) {
            aux = (int) lista.obtenerNodo(p);
            j = p - 1;
            while ((j >= 0) && (aux < (Integer) lista.obtenerNodo(j))) {
                lista.insertarEnIndice(lista.obtenerNodo(j), j + 1);
                j--;
            }
            lista.insertarEnIndice(aux, j + 1);
        }
    }

    public static void Insercion(ListaSimple lista, JPanel lamina) {
        int p, j, aux;
        for (p = 1; p < lista.getLongitud(); p++) {
            aux = (int) lista.obtenerNodo(p);
            j = p - 1;
            while ((j >= 0) && (aux < (Integer) lista.obtenerNodo(j))) {
                lista.insertarEnIndice(lista.obtenerNodo(j), j + 1);
                j--;
            }
            lista.insertarEnIndice(aux, j + 1);
            lamina.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void QuickShort(ListaSimple lista, int inicio, int fin) {
        int izq, der, pos, aux;
        boolean ban;
        izq = inicio;
        der = fin;
        pos = izq;
        ban = true;
        while (ban) {
            ban = false;
            while ((Integer) lista.obtenerNodo(pos) <= (int) lista.obtenerNodo(der) && pos != der) {
                der--;
            }
            if (pos != der) {
                aux = (Integer) lista.obtenerNodo(pos);
                lista.insertarEnIndice((Integer) lista.obtenerNodo(der), pos);
                lista.insertarEnIndice(aux, der);
                pos = der;
                while ((Integer) lista.obtenerNodo(pos) >= (Integer) lista.obtenerNodo(izq) && pos != izq) {
                    izq++;
                }
                if (pos != izq) {
                    ban = true;
                    aux = (Integer) lista.obtenerNodo(pos);
                    lista.insertarEnIndice((Integer) lista.obtenerNodo(izq), pos);
                    lista.insertarEnIndice(aux, izq);
                    pos = izq;
                }
            }
        }
        if ((pos - 1) > inicio) {
            QuickShort(lista, inicio, pos - 1);
        }
        if (fin > (pos + 1)) {
            QuickShort(lista, pos + 1, fin);
        }
    }

    public static void QuickShort(ListaSimple lista, int inicio, int fin, JPanel lamina) {
        int izq, der, pos, aux;
        boolean ban;
        izq = inicio;
        der = fin;
        pos = izq;
        ban = true;
        while (ban) {
            ban = false;
            while ((Integer) lista.obtenerNodo(pos) <= (int) lista.obtenerNodo(der) && pos != der) {
                der--;
            }
            if (pos != der) {
                aux = (Integer) lista.obtenerNodo(pos);
                lista.insertarEnIndice((Integer) lista.obtenerNodo(der), pos);
                lista.insertarEnIndice(aux, der);
                pos = der;
                while ((Integer) lista.obtenerNodo(pos) >= (int) lista.obtenerNodo(izq) && pos != izq) {
                    izq++;
                }
                if (pos != izq) {
                    ban = true;
                    aux = (Integer) lista.obtenerNodo(pos);
                    lista.insertarEnIndice((Integer) lista.obtenerNodo(izq), pos);
                    lista.insertarEnIndice(aux, izq);
                    pos = izq;
                }
            }
        }
        if ((pos - 1) > inicio) {
            QuickShort(lista, inicio, pos - 1, lamina);
            lamina.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        if (fin > (pos + 1)) {
            QuickShort(lista, pos + 1, fin, lamina);
            lamina.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
