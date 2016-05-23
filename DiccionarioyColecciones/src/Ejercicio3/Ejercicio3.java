/*
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacena-
dos en un objeto de la clase ArrayList .
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        ArrayList<Integer> numero = new ArrayList<Integer>();
        int numeroIntro;
        
        System.out.println("por favor introduzca 10 numeros enteros y los ordenare: ");
        
        for(int i =0; i<10; i++){
            System.out.print("numero "+i+": ");
            numeroIntro= Integer.parseInt(entrada.nextLine());
            numero.add(numeroIntro);
            System.out.println("");
        }
        System.out.println("Lista original: " + numero);
        /*for(int n : numero) {
            System.out.println("muestra: "+n);
        }
        */
        Collections.sort(numero);

        System.out.println("Lista ordenada de menor a mayor: " + numero);

    // Descomentar el siguiente bloque para ordenar la lista de mayor a menor
    
      ArrayList<Integer> b = new ArrayList<Integer>();

      for(int n : numero) {
        b.add(0, n);// 0 por ke desplaza hacia la derecha y comienza por el orden cogido anteriormente
          //System.out.println("anadido a b: "+n);
      }
       
      System.out.print("Lista ordenada de mayor a menor: " + b);
    
    }
  
}
