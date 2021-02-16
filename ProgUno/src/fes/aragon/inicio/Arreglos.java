/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

/**
 *
 * @author areli
 */
public class Arreglos {
    public static void main(String[] args) {
        String[] arr={"Norte","Sur","Este","Oeste"};
        int[][] arr2 = {{1,2,3},{3,4}};
        int[] arr3=new int[10];
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0; j<arr2[i].length;j++){
                System.out.println(arr2[i][i]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr3.length;i++){
            arr3[i]=i;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]+" ");
            
        }
    }
    
}
