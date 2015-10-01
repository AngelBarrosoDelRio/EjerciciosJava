/*
 * Escribe un programa que calcule la media de un conjunto de números positivos introduci-
dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in); 
      int numeroIntro;
      int sumaN=1;
      int numeroNumeros=-1;
      
        System.out.println("Vaya introduciendo numeros y le dire la"
                + " media de los cuales. Para dejar de introducir numeros "
                + "indique un numero negativo");
        do{
            System.out.print("numero: ");
            numeroIntro=Integer.parseInt(entrada.next());
            sumaN+=numeroIntro;
            numeroNumeros++;
            
        }while(numeroIntro>=0);
        
        
        System.out.println("la media de los numeros introducidos es: "
                + (sumaN/(numeroNumeros))+", gracias vuelva pronto.");
        
      
    }
  
}
