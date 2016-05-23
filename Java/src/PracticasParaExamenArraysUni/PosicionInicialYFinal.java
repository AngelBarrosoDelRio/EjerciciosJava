/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
    continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
    programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
    que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
    colocar el número de la posición inicial en la posición final, rotando el resto de números
    para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 */
package PracticasParaExamenArraysUni;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class PosicionInicialYFinal {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);
        int i,inicial,posicionfinal;
        int[] numero= new int[10];
        int[] numeroCopia= new int[10];
        int aux;
        System.out.println("Introduzca 10 numeros enteros por favor.");
        
        for(i=0;i<10;i++){
            
            System.out.print("numero "+i+": ");
            numero[i]=Integer.parseInt(entrada.next());
            System.out.println("");
            
        }
        
        System.out.print("Indice |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",numero[i]);
        }
        System.out.println("|");
        
        System.out.println("A continuacion indique una posicion Inicial y final:");
         for(i=0;i<10;i++){
            numeroCopia[i]=numero[i]; 
         }
        do{
            System.out.print("Inicial: ");
            inicial=Integer.parseInt(entrada.next());
            System.out.print("Final: ");
            posicionfinal= Integer.parseInt(entrada.next());
            if((inicial>=posicionfinal)||(inicial<0)||(posicionfinal>9)){
                System.out.println("Recuerda que debe inicial debe ser menor que final y deben estar compredindos "
                        + "entre [0-9]");
            }
        }while ((inicial>=posicionfinal)||(inicial<0)||(posicionfinal>9));
        
        numero[posicionfinal]=numeroCopia[inicial];
        
        for(i=posicionfinal+1;i<10;i++){
           
            numero[i]=numeroCopia[i-1];
            
        }
        
        numero[0]=numeroCopia[9];
        for(i=1;i<posicionfinal;i++){
            numero[i]=numeroCopia[i-1];
        }
        
        System.out.print("Indice |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",numero[i]);
        }
        System.out.println("|");
    }
  
}
