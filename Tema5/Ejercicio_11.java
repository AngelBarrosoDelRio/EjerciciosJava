/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("introduzca un numero entero y le dire"
                + " su cuadrado y cubo.");
        System.out.print("numero:");
        int numero=Integer.parseInt(entrada.next());
        System.out.println("");
        System.out.println("numero  cuadrado  cubo");
        
        for(int i=numero;i<=numero+4;i++){
            
            System.out.println("  "+i+"   |   "+(i*i)+"    |  "+(i*i*i));
        }
    }
  
}
