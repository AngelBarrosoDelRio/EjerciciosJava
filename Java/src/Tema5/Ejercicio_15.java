/*
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
    
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por favor , introduzca una base y un "
                + "exponente(entero positivo) y saquere por pantalla todas "
                + "las potencias con la base  y el numero de exponentes dado.");
        
        System.out.print("Base: ");
        int base=Integer.parseInt(entrada.next());
        
        System.out.print("Exponente: ");
        int exponente=Integer.parseInt(entrada.next());
        
        for(int i=1;i<=exponente;i++){
            
            System.out.print(base+"^"+i+", ");
        }
    }
   
}
