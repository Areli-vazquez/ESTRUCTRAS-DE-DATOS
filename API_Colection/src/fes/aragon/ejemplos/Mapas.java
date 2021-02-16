/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author areli
 */
public class Mapas {

    public static void main(String[] args) {
        Map<String, Persona> mapas = new HashMap<String, Persona>();//las claves son cualquier tipo de objeto
        Persona per = new Persona("MASH", 44);
        mapas.put("12345", per);
        mapas.put("2805-99", new Persona("Areli", 21));
        System.out.println(mapas);
        for (Map.Entry<String, Persona> entry : mapas.entrySet()) {
            String key = entry.getKey();
            Persona value = entry.getValue();
            System.out.println("Clave: " + key + " valor: " + value);
        }
        System.out.println("-----");
        Map<Integer, Persona2> mapaDos = new TreeMap<Integer, Persona2>();
        mapaDos.put(24, new Persona2("Amanda", 56));
        mapaDos.put(4, new Persona2("Rosa", 16));
        for (Map.Entry<Integer, Persona2> entry : mapaDos.entrySet()) {
            Integer key = entry.getKey();
            Persona2 value = entry.getValue();
            System.out.println("Clave: " + key + " valor: " + value);
        }
        Map<Integer, Persona2> mapaTres = new TreeMap<Integer, Persona2>();
        mapaTres.putAll(mapaDos);
        for (Map.Entry<Integer, Persona2> entry : mapaTres.entrySet()) {
            Integer key = entry.getKey();
            Persona2 value = entry.getValue();
            System.out.println("Clave: " + key + " valor: " + value);
        }
        System.out.println("-----");
        List<Persona2> lista= Mapas.valoresOrdenados(mapaTres);
        for (Persona2 persona2 : lista) {
            System.out.println(persona2);
        }
    }
    private static <K,V extends Comparable<V>> List<V> valoresOrdenados(Map<K,V> map){
        List<V> retornar = new LinkedList<>(map.values());
        Collections.sort(retornar, new Comparator<V>(){
            @Override
            public int compare(V o1, V o2) {
                return o1.compareTo(o2);
            }
        });
        return retornar;
    }
}
