/*
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados).
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        System.out.println("A continuacion se mostrara la tirada de tres dados"
                + " y la suma de los puntos que suman entre ellos.");
        
        int dado1=(int)(Math.random()*6);
        int dado2=(int)(Math.random()*6);
        int dado3=(int)(Math.random()*6);
        
        System.out.println("La tirada de los dados es : ");
        System.out.println("1º dado: "+dado1);
        System.out.println("2º dado: "+dado2);
        System.out.println("3º dado: "+dado3); 
        
        int suma=dado1+dado2+dado3;
        System.out.println("La suma de la tirada es igual a "+suma);
    }
  
}
