/*
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144... El número n se debe introducir por teclado.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Introduzaca la cantidad de numeros de la lsita "
                + "Fibonacci que desea que salga por pantalla");
        System.out.print("¿Cuantos numeros desea que saque por pantalla?");
        int numeroIntro=entrada.nextInt();
        System.out.println("");
        
        switch(numeroIntro){
            case 1:
                System.out.println("0");
            break;
            
            case 2:
                System.out.println("0, 1");
            break;
            default:
                int n1=0;
                int n2=1;
                int aux;
                
                System.out.print("0, 1, ");
                
                while(numeroIntro>2){
                    
                    aux=n1;
                    n1=n2;
                    n2=aux+n2;
                    System.out.print(n2+", ");
                    numeroIntro--;
                }
        
            
            
            
        }
    }
  
}
