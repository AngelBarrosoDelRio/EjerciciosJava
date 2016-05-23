/*
 * Realiza un programa que pida dos números y que luego muestre el resultado de su
multiplicación.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
     
        Scanner entrada=new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("A continuacion se le pedira dos numeros y le dire cuanto vale su multiplicacion.");
        System.out.print("1º numero: ");
        numero1=entrada.nextInt();
        System.out.print("2º numero: ");
        numero2=entrada.nextInt();
        
        System.out.println("El resultado de la multiplicación es: "+numero1*numero2);
        
        
    }
  
}
