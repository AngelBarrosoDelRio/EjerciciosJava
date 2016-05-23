/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int[] numero = new int[10];
        int i;
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        
        for(i=0;i<10;i++){
            
            System.out.print("introduzca el numero "+i+" :");
            numero[i]=Integer.parseInt(entrada.next());
            
            if(numero[i]<minimo){
                minimo=numero[i];
            }
            if(numero[i]>maximo){
                maximo=numero[i];
            }
        }
        System.out.println("Lista de numeros: ");
        for(i=0;i<10;i++){
            System.out.print(numero[i]);
            if(numero[i]==maximo){
                System.out.print("maximo");
            }
            if(numero[i]==minimo){
                System.out.print("minimo");
            }
            System.out.println("");
        }
    }
  
}
