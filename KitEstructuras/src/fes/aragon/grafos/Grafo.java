/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.grafos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author areli
 */
public class Grafo {
    public static final double INFINITO = Double.MAX_VALUE;//indicar el valor maximo
    private Map<String, Vertice> verticeMapa = new HashMap<String, Vertice>();

    private Vertice getVertice(String verticeNombre) {
        Vertice v = verticeMapa.get(verticeNombre); 
        if(v==null){
            v=new Vertice(verticeNombre);
            verticeMapa.put(verticeNombre, v);
        }
        return v;
    }
    public void agregarArista(String fuenteNombre, String destinoNombre, double costo){
        Vertice v = getVertice(fuenteNombre);
        Vertice w = getVertice(destinoNombre);
        v.getAdyacente().add(new Arista(w, costo));
        
    }
    public void camino(Vertice destino){
        if(destino.getPrevio()!=null){
            camino(destino.getPrevio());
            System.out.println(" a ");
        }
        System.out.println(destino.getNombre());
    }
    public void camino(String destino){
        Vertice w = verticeMapa.get(destino);
        if(w==null){
            throw new GrafoError(destino + " no se encuentra");
        }else if (w.getDistancia()==INFINITO){
            throw new GrafoError(destino+ "es inalcanzable");
        }else{
            System.out.println("Costo es: "+ w.getDistancia());
            camino(w);
            System.out.println("");
        }
    }
    private void limpiar(){
        for (Vertice value : verticeMapa.values()) {
            value.reiniciar();
            
        }
    }
    public void caminoCortoNoPonderado(String inicioVertice){
        limpiar();
        Vertice inicio = verticeMapa.get(inicioVertice);
        if (inicio==null) {
            throw new GrafoError("El vertice no existe");
        }
        Queue<Vertice> q = new LinkedList<>();
        inicio.setDistancia(0);
        q.add(inicio);
        while(!q.isEmpty()){
            Vertice v=q.remove();
            for (Arista e : v.getAdyacente()) {
                Vertice w = e.getDestino();
                if (w.getDistancia()==INFINITO) {
                    w.setDistancia(v.getDistancia()+1);
                    w.setPrevio(v);
                    q.add(w);
                }
            }
        }
    }
}
