/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
esquina inferior derecha.
 */
package Tema7_Bidimensional;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
     
        
        Scanner entrada = new Scanner ( System.in);
        
        int[][] num = new int[4][5];
        int i,j;
        int[] sumaFila = new int[4];
        int[] sumaColumna= new int[5];
        int total=0;
        
        // meto valores en el array num[][].
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
                System.out.print("Introduzca numero: ");
                num[i][j]=Integer.parseInt(entrada.next());
            }
        }
        // calculo lo que va a dar la suma de cada una de las filas.
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
              
                sumaFila[i]+=num[i][j];
            }
        }
        // calculo lo que va a dar la suma de las cada una de las columnas.
        for(j=0; j<5; j++){
            for(i=0; i<4; i++){
               sumaColumna[j]+= num[i][j];
            }
        }
        
        //muestro el Array 
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
              
                System.out.printf("|%6d     |",num[i][j]);
            }
            System.out.printf("|sumaFila: %2d|",sumaFila[i]);
            System.out.println("");
        }
        for(j=0; j<5; j++){
            
            if(j==4){
                System.out.printf("|sumaCol: %2d|",sumaColumna[j]);
                total+=sumaColumna[j];
                System.out.printf("|Total:%2d|",total);
            }else{
                System.out.printf("|sumaCol: %2d|",sumaColumna[j]);
                total+=sumaColumna[j];
            }
        }
    }
  
}
