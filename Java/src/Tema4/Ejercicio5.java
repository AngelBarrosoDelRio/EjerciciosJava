/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Vamos a resolver una ecuacion de 1º grado, para "
                + " ellos dame el valor que va a tener 'a' y 'b'");
        
        System.out.print("'a'= ");
        int a= Integer.parseInt(entrada.nextLine());
        
        System.out.print("'b'= ");
        int b= Integer.parseInt(entrada.nextLine());
        
        System.out.println("En este caso 'x' va a valer: "+ (-(a)-(b)));
    }
    
  
}
