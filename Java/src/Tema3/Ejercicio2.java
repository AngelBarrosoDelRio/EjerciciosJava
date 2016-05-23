/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
ser introducida por teclado.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        double pesetas=166.67;
        double euros;
        
        System.out.println("Bienvenido al conversor de divisa.");
        System.out.print("Por favor indique la cantidad de euros que desea cambiar a pesetas: ");
        euros=entrada.nextDouble();
        System.out.println("Usted a elegido: "+euros+" €");
        System.out.print("Al cambio en pesetas es: ");
        System.out.printf("%.2f",euros*pesetas);
    }
 
}
