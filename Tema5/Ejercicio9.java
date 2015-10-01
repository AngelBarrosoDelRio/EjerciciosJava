/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);      
        
        System.out.println("Introduzca un numero entero y le dire "
                + " cuantos digitos lo compone");
        
        System.out.println("numero: ");
        int numero=entrada.nextInt();
        int cuentaDigitos=1;
        
        while(numero>9){
            
            numero=numero/10;
            cuentaDigitos++;
            
        }
        System.out.println("el numero introducido tiene "+cuentaDigitos+" digitos");
    }
   
}
