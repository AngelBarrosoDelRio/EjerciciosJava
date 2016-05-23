/*
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas
como en la siguiente figura:
   1
  121
 12321
1234321
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_24 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Introduzca la altura de la piramide: ");
        int alturaIntro=entrada.nextInt();
        
        int a;
        int i;
        int j;
        int espaciosDelante=alturaIntro;
        int numCaracter=1;
        
        
        
         System.out.println("");
                for( a=0;a<=alturaIntro;a++){
            
                    for(i=0;i<espaciosDelante;i++){
                        System.out.print(" ");
                    }
            
                  espaciosDelante--;
                    for(j=1;j<(numCaracter)/2;j++){ // la mitad de los numeros (vertical)
                
                        System.out.print(j);
                    }
                    for(j=(numCaracter)/2;j>=1;j--){// la otra mitad de la piramide (vertical)
                        System.out.print(j);
                    }
                  numCaracter+=2;
                  System.out.println("");
                }
    }
   
}
