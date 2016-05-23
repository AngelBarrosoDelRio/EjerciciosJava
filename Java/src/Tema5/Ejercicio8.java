/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Introduzca un numero entre  el 1 y 10 y le dire "
                + " su tabla de multiplicar");
        
        System.out.println("numero: ");
        int numero=entrada.nextInt();
        
        System.out.println("Tabla del "+numero);
        for (int i=1;i<=10;i++){
            
            System.out.println(numero+" x "+i+" = "+(numero*i));
            
        }
    }
   
}
