/*
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
con la palabra “par” o “impar” según proceda.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca 8 numeros enteros y le dire si es par o impar.");
        int [] numero = new int[8];
        int i;
        
        for(i=0;i<8;i++){
            System.out.print("introduzca numero"+i+" : ");
            numero[i]=Integer.parseInt(entrada.next());
            
            
            
        }
        for(i=0;i<8;i++){
            if(numero[i]%2==0){
                    System.out.println(numero[i]+" es par");
            }else{
                    System.out.println(numero[i]+" es impar");  
            }
        }
    }
  
}
