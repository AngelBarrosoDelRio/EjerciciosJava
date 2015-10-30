/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
colocar el número de la posición inicial en la posición final, rotando el resto de números
para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner (System.in);
        int i,inicial,posicionFinal;
        int[] numero=new int[10];
        int[] arrayModificado= new int[10];
        
        // relleno el array numero.
        for(i=0;i<10;i++){
            System.out.print("Introduzca un numero: ");
            numero[i]=Integer.parseInt(entrada.next());
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
         
         //comprueba que la posicion inicial sea menor que la final y este comprendida entre [0-9].
        do{
            
            System.out.print("Ahora por favor introduzca la posicion inicial: ");
            inicial=Integer.parseInt(entrada.next());
             System.out.println("");
            System.out.print("Ahora por favor introduzca la posicion final: ");
            posicionFinal = Integer.parseInt(entrada.next());
             System.out.println("");
            
            if(inicial>posicionFinal){
                System.out.println("posicion inicial debe ser menor que que la final.");
            }
            if((inicial<0)||(inicial>9)||(posicionFinal<0)||(posicionFinal>9)){
                System.out.println("Las posiciones deben estar entre [0-9]");
            }
        
        }while((inicial>posicionFinal)||(inicial<0)||(inicial>9)||(posicionFinal<0)||(posicionFinal>9));
        
        // meto el array numero en arrayModificado para poder hacer las rotaciones.
        for(i=9;i>=0;i--){
           
            arrayModificado[i]=numero[i];
        
        }
        
        // roto el Array.
        arrayModificado[posicionFinal]=numero[inicial]; //meto la posicion inicial en la posicion final.
        // desde la final +1 hasta 10 arrayModificado[posicionFInal+1....]= numero[i-1....(lo que vale posicionFinal)].
        for(i=posicionFinal+1;i<10;i++){
            
            arrayModificado[i]=numero[i-1];
            
        }
        // meto el array[9] en la primera posicion.
        arrayModificado[0]=numero[9];
        // desde 0 hasta posicionInicial  arrayModificado[1...]=numero[0...].
        for(i=0;i<inicial;i++){
            
            arrayModificado[i+1]=numero[i];
        }
        
        //muestra el array modificado.
        System.out.println("Array Modificado");
        for(i=0;i<10;i++){
            
            System.out.printf("|%2d ",i);
            
        }
        System.out.println("");
        for(i=0;i<10;i++){
            
            System.out.printf("|%2d ",arrayModificado[i]);
            
        }
        
    }
   
}
