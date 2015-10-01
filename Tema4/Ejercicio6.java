/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
      
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("Indique la altura dese la que lanza el objeto y le dire lo que tarda en caer.");
        System.out.print("Altura 'h': ");
        
        int altura=entrada.nextInt();
        double g=9.81;
        double resultado= Math.sqrt(((double)altura*2)/g);
        
        System.out.println("el objeto tardara en caer: "+resultado);
    }
  
}
