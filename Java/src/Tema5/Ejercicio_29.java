/*
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores
a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_29 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("A continuacion introducira dos numeros, el primero "
                + "de ellos sera para marcar el inicio de donde usted desea que "
                + "empiece a contar hasta llegar a cero y el segundo sera para comprobar que no sean "
                + "divisible por ese numero( el segundo), y le mostrare el resultado");
        
        System.out.print("Introduzca el primer numero: ");
        int primerNum=Integer.parseInt(entrada.next());
        System.out.println("");
        System.out.print("Introduzca el segundo numero: ");
        int segundNum=Integer.parseInt(entrada.next());
        
        System.out.print("Los numeros desde ["+primerNum+"-0] y no divisibles entre "+segundNum +" son: ");
        for(int i=primerNum;i>=0;i--){
            
            if(i%segundNum!=0){
                
                System.out.print(i+", ");
            }
        }
    }
  
}
