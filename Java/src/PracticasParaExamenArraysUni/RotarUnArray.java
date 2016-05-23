/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 */
package PracticasParaExamenArraysUni;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class RotarUnArray {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int[] numero= new int[15];
        int i;
        System.out.println("Introduzca 15 numeros enteros");
        for(i=0;i<15;i++){
            System.out.print("Numero "+i+": ");
            numero[i]=Integer.parseInt(entrada.next());
            System.out.println("");
        }
        //// ARRAY ORIGINAL
        System.out.println("ARRAY ORIGINAL:");
        System.out.print("Indice |");
        for(i=0;i<15;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        for(i=0;i<15;i++){
            System.out.printf("%2d |",numero[i]);
        }
        System.out.println("|");
        
        /// ROTO EL ARRAY
        int aux=numero[14];
        for(i=14;i>0;i--){
            numero[i]=numero[i-1];
            
        }
        numero[0]=aux;
        
        ////MUESTRA EL ARRAY MODIFICADO
        System.out.println("ARRAY MODIFICADO:");
        System.out.print("Indice |");
        for(i=0;i<15;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        for(i=0;i<15;i++){
            System.out.printf("%2d |",numero[i]);
        }
        System.out.println("|");
    }
  
}
