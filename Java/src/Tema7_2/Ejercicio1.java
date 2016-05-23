/*
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
sucede con los valores de los elementos que no han sido inicializados?
 */
package Tema7_2;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[] numero= new int[12];
        
        numero[0]=39;
        numero[1]=-2;
        numero[4]=0;
        numero[6]=14;
        numero[8]=5;
        numero[9]=120;
        
        System.out.println("Array :");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<12;i++){
            
            System.out.print("| "+numero[i]+" |");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
        
    }
  
}
