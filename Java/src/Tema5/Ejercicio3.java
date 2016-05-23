/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
 */
package Tema5;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
     
        int i=0;
        
        do{
            System.out.print(i+", ");
            i+=5;
            
        }while(i<100);
    }
  
}
