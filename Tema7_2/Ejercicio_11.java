/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        int i;
        int[] numero=new int[10];
        int[] primo=new int[10];
        int[] noPrimo=new int[10];
        int cuentaPrimo=0;
        int cuentaNoPrimos=0;
        
        for(i=0;i<10;i++){
            System.out.print("Introduzca un numero: ");
            numero[i]=Integer.parseInt(entrada.next());
            
            //Separo los primos de los no primos.
            boolean esPrimo=true;
            
            for (int j = 2; j < numero[i]; j++) {
                
                if (numero[i] % j == 0) {
                    
                    esPrimo = false;
                    
                }
            }
            //NO CONSIDERAMOS COMO PRIMOS EL 0 o 1.
            if((numero[i]==0)||(numero[i]==1)){
                
                esPrimo=false;
            }
            
        
        
            if(esPrimo){
               
                primo[cuentaPrimo++]=numero[i];
                
            }else {
                
                noPrimo[cuentaNoPrimos++]=numero[i];
            }
            
        }
        System.out.println("");
        // ARRAY original.
        System.out.println("ARRAY ORIGINAL:");
        for(i=0;i<10;i++){
            
            System.out.printf("|%2d ",i);
            
        }
        System.out.println("");
        for(i=0;i<10;i++){
            
            System.out.printf("|%2d ",numero[i]);
            
        }
        System.out.println("");
        
        System.out.println("ARRAY MODIFICADO:");
        for(i=0;i<10;i++){
            
            System.out.printf("|%2d ",i);
            
        }
        System.out.println("");
        for(i=0;i<cuentaPrimo;i++){
            
            System.out.printf("|%2d ",primo[i]);
            
        }
        for(i=0;i<cuentaNoPrimos;i++){
            
            System.out.printf("|%2d ",noPrimo[i]);
        }
        
        
    }
  
}
