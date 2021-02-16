/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author areli
 */
public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("1");
        datos.add("2");
        datos.add("3");
        Iterator<String> iterA = datos.iterator();
        Iterator<String> iterB = datos.iterator();
        
        while (iterA.hasNext()) {            
            String valor = iterA.next();
            System.out.println(valor);
            iterA.remove();
            
        }
        //System.out.println(iterB.hasNext());//verificar la lsita b
        ArrayList<Integer> punto = new ArrayList<>();
        Random rd=new Random();
        for (int i = 0; i < 20; i++) {
            punto.add(rd.nextInt(200));
            
        }
        System.out.println(punto);
        /*
        for (int i = 1; i < punto.size(); i++) {
            if(punto.get(i-1)>=5 && punto.get(i)<=10){
                punto.remove(i-1);
            }
        }*/
            Iterator<Integer> iterPunto = punto.iterator();
            while(iterPunto.hasNext()){
                Integer valor =iterPunto.next();
                if (valor>=5 && valor<=150) {
                    iterPunto.remove();
                }
            }
            System.out.println(punto);
    }
}
