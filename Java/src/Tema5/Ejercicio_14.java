/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por favor , introduzca una base y un "
                + "exponente(entero positivo) y calculare su potencia");
        
        System.out.print("Base: ");
        int base=Integer.parseInt(entrada.next());
        
        System.out.print("Exponente: ");
        int exponente=Integer.parseInt(entrada.next());
        
        System.out.println("El resultado es: "+Math.pow(base, exponente));
    }
  
}
