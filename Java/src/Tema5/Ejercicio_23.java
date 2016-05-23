/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números
mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
total acumulado, el contador de los números introducidos y la media.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_23 {
    public static void main(String[] args) {
    
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Vaya introduciendo numeros, cuando la suma de "
                + "ellos sea mayor que mil le mostrare por pantalla la cantidad"
                + " de numeros introducidos, la media y la suma acumulada");
        
        int suma=0;
        int acumulado=0;
        int numintro;
        do{
           
            System.out.print("Introduzca numero: ");
            numintro=Integer.parseInt(entrada.next());
            
            suma+=numintro;
            acumulado++;
            
        }while(suma<1000);
        
        System.out.println("Ha introducido "+acumulado+" numeros.");
        System.out.println("La suma total de los numeros introducidos es: "+suma);
        System.out.println("La media de los numeros introducidos es: "+(suma/acumulado));
    }
  
}
