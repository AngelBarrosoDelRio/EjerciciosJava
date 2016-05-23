/*
 * Muestra los números primos que hay entre 1 y 1000.
 */
package Tema8;

/**
 *
 * @author angelo
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        
        for(int i=1; i<1000;i++){
            if(Matematicas.Variadas.esPrimo(i)){
                System.out.print(i+", ");
            }
        }   
    }
  
}
