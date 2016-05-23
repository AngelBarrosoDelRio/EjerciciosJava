/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
por teclado.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por favor introduzaca la hora actual para que pueda "
                + " saludarlo correctamente.");
        System.out.print("Hora: ");
        
        int hora=entrada.nextInt();
        
        if((hora>=0)&&(hora<12)){
            
            System.out.println("Buenos dias!!");
        }
        if((hora>=12)&&(hora<20)){
            
            System.out.println("Buenos tardes!!");
        }
        if((hora>=20)&&(hora<=24)){
            
            System.out.println("Buenos noches!!");
        }
    }
  
}
