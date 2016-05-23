/*
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_17 {
    public static void main(String[] args) {
    
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por favor , introduzca un numero y le sumare los "
                + "100 números siguientes");
        int n;
        
        do{
            
            System.out.print("numero: ");
            n=Integer.parseInt(entrada.next());
            
            System.out.println("");
            
            if(n<0){
                System.out.println("Error, debe introducir un numero positivo.");
            }
        
        }while(n<0);
        
        int suma=0;
        
        for(int i=0;i<100;i++){
            
            suma+=n;
            n++;
            
            
        }
        System.out.println("El resultado es:  "+suma);
    }
   
}
