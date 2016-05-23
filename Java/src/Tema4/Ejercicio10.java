/*
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
segundos que faltan para llegar a la medianoche.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio10 {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("¿Cuanto fañta àra ña media noche?");
        System.out.print("Dime la hora actual: ");
        int hora=Integer.parseInt(entrada.nextLine());
        System.out.print("Dime los minutos actuales: ");
        int minutos=Integer.parseInt(entrada.nextLine());
        
        int horMinut=hora*60;
        int mintosTotales=(horMinut+minutos)*60;
        int seguTotales=86400-mintosTotales;
        
        System.out.println("Faltan "+seguTotales+" segundos para la media noche");
        
    }
   
}
