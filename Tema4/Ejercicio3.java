/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
del día de la semana.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Introduzca el dia de la semana de la que desea saber EJ:(1,2...7)");
        
        System.out.print("Dia:");
        
        int dia=entrada.nextInt();
        
        switch(dia){
            
            case 1:
                System.out.println("LUNES");
            break;
            case 2:
                System.out.println("MARTES");
            break;
            case 3:
                System.out.println("MIERCOLES");
            break;
            case 4:
                System.out.println("JUEVES");
            break;
            case 5:
                System.out.println("VIERNES");
            break;
            case 6:
                System.out.println("SABADO");
            break;
            case 7:
                System.out.println("DOMINGO");
            break;
            
        }
    }
   
}
