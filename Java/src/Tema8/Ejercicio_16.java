/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 */
package Tema8;

/**
 *
 * @author angelo
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
     
        for(int i=1; i<=99999;i++){
            if(Matematicas.Variadas.esCapicua(i)){
                System.out.print(i+", ");
            }
        }   
        
    }
  
}
