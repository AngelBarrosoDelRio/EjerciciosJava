/*
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio13 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        int aux;
        System.out.println("Vamos a ordenar tres numeros introducidos por teclado");
        
        System.out.print("por favor introduzca el numero1: ");
        int nu1=Integer.parseInt(entrada.next());
        
        System.out.print("por favor introduzca el numero2: ");
        int nu2=Integer.parseInt(entrada.next());
        
        System.out.print("por favor introduzca el numero3: ");
        int nu3=Integer.parseInt(entrada.next());
        
        //coparamos los dos primeros numeros para ordenarlos
        if(nu1>nu2){
           aux=nu1;
           nu1=nu2;
           nu2=aux;
        }
        //compara el el segundo numero y el tercero
        if(nu2>nu3){
           aux=nu2;
           nu2=nu3;
           nu3=aux;
        }
        // vuelve a comprar los numeros ppor si hubiese avido cambio en los 
        //nuemeros a la hora de comprarlos.
        if(nu1>nu2){
           aux=nu1;
           nu1=nu2;
           nu2=aux;
        }
        
        System.out.println("LOs numeros ordenados de menos ha mayor es: "+ nu1+", "+nu2+", "+nu3);
        
    }
          
}
