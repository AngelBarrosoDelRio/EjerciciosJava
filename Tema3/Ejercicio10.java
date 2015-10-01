/*
 * Realiza un conversor de Mb a Kb.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio10 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner (System.in);
     int kb=1024;
     int mb;
     
        System.out.println("Esto es un conversor de 'mb' a 'kb'");
        System.out.println("Por favor introduzca los MB que quiere cambiar a KB: ");
        mb=entrada.nextInt();
        
        System.out.println(mb+" MB son "+kb/mb+" KB");
    }
  
}
