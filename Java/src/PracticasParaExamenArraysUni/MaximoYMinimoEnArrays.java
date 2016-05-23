/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasParaExamenArraysUni;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class MaximoYMinimoEnArrays {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        int[] numero= new int[10];
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        int i;
        
        System.out.println("Introduzca 10 numeros enteros");
        for(i=0;i<10;i++){
            System.out.print("Numero "+i+": ");
            numero[i]=Integer.parseInt(entrada.next());
            System.out.println("");
        }
        
        for(i=0;i<10;i++){
            if(numero[i]<minimo){
                minimo=numero[i];
            }
            if(numero[i]>maximo){
                maximo=numero[i];
            }
        }
       
        System.out.println("Lista de numeros: ");
        for(i=0;i<10;i++){
            System.out.print(numero[i]);
            if(numero[i]==maximo){
                System.out.print("maximo");
            }
            if(numero[i]==minimo){
                System.out.print("minimo");
            }
            System.out.println("");
        }
    }
   
}
