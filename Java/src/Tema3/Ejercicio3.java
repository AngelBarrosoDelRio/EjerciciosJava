/*
 * Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
teclado.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        double numero1;
        double numero2;
        
        System.out.println("Introduzca dos numeros enteros que quieras y le hare su suma, resta, multiplicacion y division");
        System.out.print("Primer numero: ");
        numero1=Integer.parseInt(entrada.nextLine());
        System.out.print("Segundo numero: ");
        numero2=Integer.parseInt(entrada.nextLine());
        
        System.out.println("");
        System.out.println("Suma= "+(numero1+numero2));
        System.out.println("Resta= "+(numero1-numero2));
        System.out.println("Multi= "+(numero1*numero2));
        System.out.println("divis= "+(numero1/numero2));
    }
   
}
