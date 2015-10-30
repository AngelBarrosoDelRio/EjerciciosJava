/*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
valor.
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
     
        
        int dado1;
        int dado2;
        
        do{
            
            dado1=(int)(Math.random()*6+1);
            dado2=(int)(Math.random()*6+1);

        }while(dado1!=dado2); 
        
        System.out.println("ha sacado en 1º dado: "+dado1+" y en el 2º "+dado2+".");
    }
}
