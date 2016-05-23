/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
    A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
    para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
    desplazando el resto de números (los que no son primos) de tal forma que no se pierda
    ninguno. Al final se debe mostrar el array resultante.
 */
package PracticasParaExamenArraysUni;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class DesplazarPrimoPrimerasPosiciones {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);
        int i;
        int[] numero= new int[10];
        int[] primo= new int[10];
        int[] noPrimo= new int[10];
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
        
        int cuentaPrimos=0;
        int cuentaNoPrimo=0;
        
        for(i=0;i<10;i++){
            
            boolean esPrimo=true;
        
            for (int j = 2; j < numero[i]; j++){
                    if((numero[i]==0)||(numero[i]==1)){

                        esPrimo=false;

                    }    
                    if ((numero[i] % j) == 0){ 

                        esPrimo=false;

                    }
            }

            System.out.println("");
            if(esPrimo==true){
                
                primo[cuentaPrimos]=numero[i];
                cuentaPrimos++;

            }else{

                noPrimo[cuentaNoPrimo]=numero[i];
                cuentaNoPrimo++;
            }
        }
        
        System.out.print("Indice |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        for(i=0;i<cuentaPrimos;i++){
           
            System.out.printf("%2d |",primo[i]);
            
        }
        for(i=0;i<cuentaNoPrimo;i++){
           
            System.out.printf("%2d |",noPrimo[i]);
            
        }
        
        
    }
    
}
