/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
toca a primera hora ese día.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Introduzca el dia de la semana de la que desa saber"
                + " que asignatura le toca a primera hora");
        
        System.out.print("Dia:");
        
        String dia=entrada.next();
        
        switch(dia){
            
            case "lunes":
                System.out.println("DWES");
            break;
            case "martes":
                System.out.println("PROG");
            break;
            case "miercoles":
                System.out.println("BBDD");
            break;
            case "jeueves":
                System.out.println("DIW");
            break;
            case "viernes":
                System.out.println("EINEM");
            break;
            
        }
    }
  
}
