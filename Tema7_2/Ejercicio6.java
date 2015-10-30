/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        int[] numero = new int [15];
        int i;
        
        for(i=0;i<15;i++){
            
            System.out.print("numero "+i+" :");
            numero[i]=Integer.parseInt(entrada.next());
        }
        
        System.out.println("Array Original:");
        for(i=0;i<15;i++){
            System.out.print("| "+numero[i]+" |");
        }
        

        // roto el arrays original.
        int aux=numero[0];
        int aux1=numero[14];
        
        for(i=13;i<0;i--){  // es importante hacerlo disminuyendo para evitar perder el '2'.
            numero[i]=numero[i+1];
        }
        
        numero[14]=aux;
        numero[0]=aux1;
        
        // muestra el array rotado.
        System.out.println("");
        System.out.println("Arrays rotado");
        for(i=0;i<15;i++){
            
            System.out.print("| "+numero[i]+" |");
        }
        
    }
 
}
