/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por el
menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_18 {
    public static void main(String[] args) {
    
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por favor , introduzca dos numeros enteros distintintos"
                + " y le dire todos los numeros enteros comprendidos entre ambos numeros"
                + " incrementando de 7 en 7");
        int n1;
        int n2;
        
        do{
            
            System.out.print("numero 1: ");
            n1=Integer.parseInt(entrada.next());
            
            System.out.print("numero 2: ");
            n2=Integer.parseInt(entrada.next());
            
            if(n1==n2){
                
                System.out.println("Error deben ser distintos entre ellos .");
                
            }
        
        }while(n1==n2);
        
        if(n1>n2){
            
            int aux=n1;
            n1=n2;
            n2=aux;
        }
        System.out.print("Los numeros comprendidos entre ["+n1+"-"+n2+"] "
                + "aumentando de 7 en 7 son: ");
        int i;
        for(i=n1+7;i<=n2;i+=7){
           
            System.out.print(i+", ");
        
        }
        
        
    }
  
}
