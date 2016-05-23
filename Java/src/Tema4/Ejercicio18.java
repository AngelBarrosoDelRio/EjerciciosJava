/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido
por teclado. Se permiten números de hasta 5 cifras..
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio18 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        int primerN;
        
        System.out.println("Por favor introduzca un numero no superior a 5"
                + " cifras y le dire el primer termino");
        System.out.println("Introduzca el numero: ");
        int numeroIntro=entrada.nextInt();
        System.out.println("");
        
        if((numeroIntro>=0)&&(numeroIntro<10)){
            
            System.out.println("el primer termino es "+ numeroIntro);
        }
        if((numeroIntro>=10)&&(numeroIntro<100)){
            
            numeroIntro=numeroIntro/10;
            primerN=numeroIntro%10;
            
            System.out.println("el primer termino es "+ primerN);
        }
        if((numeroIntro>=100)&&(numeroIntro<1000)){
            
            numeroIntro=numeroIntro/100;
            primerN=numeroIntro%10;
            
            System.out.println("el primer termino es "+ primerN);
        }
        if((numeroIntro>=1000)&&(numeroIntro<10000)){
            
            numeroIntro=numeroIntro/1000;
            primerN=numeroIntro%10;
            
            System.out.println("el primer termino es "+ primerN);
        }
        if((numeroIntro>=10000)&&(numeroIntro<100000)){
            
            numeroIntro=numeroIntro/10000;
            primerN=numeroIntro%10;
            
            System.out.println("el primer termino es  "+ primerN);
        }
    }
  
}
