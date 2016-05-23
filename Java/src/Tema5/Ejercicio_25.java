/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_25 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Vamos a voltear un numero que usted introducira por pantalla.");
        System.out.println("Introduzca numero: ");
        
        int numIntro=entrada.nextInt();
        int numeroInvertido=0;
        
        while(!(numIntro<=0)){// mientras el numero introducido sea mayor que cero
            
           int resto=numIntro%10;// guardamos en resto la ultima cifra del numero.
           
           numeroInvertido= numeroInvertido*10+resto; // guardamos en invertido el numero obtenido del %10.
           
           numIntro=numIntro/10;//eliminamos la ultima cifra del numero introducido.
                   
        }
        
        System.out.println("El numero introducido invertido es: "+numeroInvertido);
    }
  
}
