/*
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
espacios.
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("Este programa mostraraa 20 numeros aleatorios entre 0 y 100.");
        
        for(int i=0;i<20;i++){
            int numero=(int)(Math.random()*100);
            System.out.print(numero+", ");
        }
    }
  
}
