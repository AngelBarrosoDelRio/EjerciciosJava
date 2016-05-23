/*
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
    
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por favor , introduzca un numero y le dire si "
                + "este es primo o no primo");
        
        System.out.print("numero: ");
        int n=Integer.parseInt(entrada.next());
        
        boolean esPrimo=true;
            
        for (int i = 2; i < n; i++) {
            
            if((n==0)||(n==1)){
            
                esPrimo=false;
            }    
            
            if (n % i == 0) {
                    
                esPrimo = false;
                    
            }
            
        }
        if(esPrimo==true){
            
            System.out.println("El numero introducido es primo");
            
        
        }else{
           
            System.out.println("El numero introducido NO es primo");
        }
            
    }
  
}
