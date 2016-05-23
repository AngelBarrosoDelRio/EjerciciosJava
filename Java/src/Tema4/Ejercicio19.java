/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio19 {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Por favor introduzca un numero no superior a 5"
                + " cifras y le dire cuantos digitos tiene, el numero puede"
                + " ser positivo o negativo.");
        System.out.println("Introduzca el numero: ");
        
        int numeroIntro=entrada.nextInt();
        System.out.println("");
        
        if(numeroIntro<0){
            
            numeroIntro=-(numeroIntro);
        }
        
        if((numeroIntro>=0)&&(numeroIntro<10)){
            
            System.out.println("Su numero tiene 1 cifra ");
        }
        if((numeroIntro>=10)&&(numeroIntro<100)){
            
            
            
            System.out.println("Su numero tiene 2 cifra ");
        }
        if((numeroIntro>=100)&&(numeroIntro<1000)){
            
            
            
            System.out.println("Su numero tiene 3 cifra  ");
        }
        if((numeroIntro>=1000)&&(numeroIntro<10000)){
            
           
            
            System.out.println("Su numero tiene 4 cifra ");
        }
        if((numeroIntro>=10000)&&(numeroIntro<100000)){
            
            
            
            System.out.println("Su numero tiene 5 cifra ");
        }
    }
  
}
