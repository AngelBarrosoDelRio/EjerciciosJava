/*
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible
entre 5.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Bienvenido, introduzca un numero y le dire si es"
                + " par y/o divisible entre 5");
        System.out.print("Numero: ");
        int numeroIntr= entrada.nextInt();
        
        if((numeroIntr%2==0)&&(numeroIntr%5==0)){
        
            System.out.println("El numero introducido es par y divisible por 5");
        
        }else if(numeroIntr%2==0){
            
            System.out.println("Este numero es par y NO divisible entre 5");
        
        }else if(numeroIntr%5==0){
           
            System.out.println("Este numero NO es par, pero SI divisible entre 5");
            
        }else if(!(numeroIntr%2==0)&& !(numeroIntr%5==0)){
            
            System.out.println("NO es par ni divisible entre 5");
        }
        
        
    }
   
}
