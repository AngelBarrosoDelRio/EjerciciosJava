/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        int[] numero= new int[10];
        int i;
        int numeroIntro=0;
        
        for(i=0;i<10;i++){
           System.out.print("digame el numero "+i+" :");
           numeroIntro=Integer.parseInt(entrada.next());
           numero[i]=numeroIntro;
        }
        System.out.println("Array:");
        for(i=9;i>=0;i--){
            
            System.out.print("| "+numero[i]+" |"); 
        }
        System.out.println("");
    }
   
}
