/*
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por
teclado.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Por favor introduzca un numero por teclado y"
                + " le dire cual es su ultma cifra");
        System.out.print("Introduzca el numero: ");
        System.out.println("");
        
        int numerIntro=entrada.nextInt();
        
        int ultimaCifra=numerIntro%10;
        
        System.out.println("La ultima cifra es: "+ultimaCifra);
        
        
        
        
        
    }
  
}
