/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
número leído por teclado.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_27 {
    public static void main(String[] args) {
      
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Este programa le mostrara, sumara y  contara los multiplos de 3 que "
                + "hay entre 1 y el numero que usted introduzca por teclado.");
        
        System.out.print("Introduzca un numero: ");
        int numeroIntro=entrada.nextInt();
        int cuentaMultiplos=0;
        int sumaMultiplos=0;
        
        System.out.print("LOs multiplos de 3 entre [1-"+numeroIntro+"] son: ");
        for(int i=1;i<=numeroIntro;i++){
            
            if(i%3==0){
                
                cuentaMultiplos++;
                sumaMultiplos+= i;
                System.out.print(i+", ");
            }
        }
        System.out.println("");
        System.out.println("Entre [1-"+numeroIntro+"] hay: "+cuentaMultiplos+" numeros");
        System.out.println("La suma de esos multiplos es: "+sumaMultiplos);
        
    }
  
}
