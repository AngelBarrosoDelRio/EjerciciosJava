/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
estar almacenada en una variable.
 */
package Tema2;

/**
 *
 * @author angelo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        double pesetas=166.67;
        double euros=60;
        
        System.out.print(euros+" € en pesetas son: ");
        System.out.printf("%.2f", euros*pesetas);
    }
  
}
