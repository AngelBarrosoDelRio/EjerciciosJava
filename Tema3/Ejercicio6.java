/*
 * Escribe un programa que calcule el área de un triángulo.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Este programa calcula el area de un triangulo. Para ello necesito su altura y base.");
        
        System.out.print("Dime su altura: ");
        int altura=Integer.parseInt(entrada.nextLine());
        System.out.print("Dime su base: ");
        int base=Integer.parseInt(entrada.nextLine());
        System.out.println("");
        
        System.out.println("el area del rectangulo es : "+(base*altura)/2);
        
    }
  
}
