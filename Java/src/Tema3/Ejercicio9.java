/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 π r2 h
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        double pi=3.14;
        double altura;
        double radio;
        
        System.out.println("Este programa le indicara el volumen de un cono mediante la formula: V = 1/3 πr 2 h");
        
        System.out.print("Digame su radio 'r': ");
        radio=Integer.parseInt(entrada.nextLine());
        System.out.print("Digame su altura 'h': ");
        altura=Integer.parseInt(entrada.nextLine());
        System.out.println("");
        System.out.print("EL volumen del cono es: ");
        System.out.printf("%.3f",(0.333*pi)*(radio*2)*altura);
        System.out.println("");
        
    }
  
}
