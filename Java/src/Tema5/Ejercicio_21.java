/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
datos pero no se incluye en el cómputo.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_21 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        int numeroIntro;
        int acumulado=0;
        int impares=0;
        int sumaImpares=0;
        int maximo=0;
        
        
        System.out.println("Por favor, vaya introduciendo numeros y dantole "
                + "a intro. Cuando no dese introducir mas numero solo debe "
                + "introducir un numero negativo.Cuando finalice le indicare : "
                + "cantidad de numeros introducidos, la media de los impares y "
                + "el mayor de los pares");
        
        do{
            
            System.out.print("Introduzca numero: ");
            numeroIntro=Integer.parseInt(entrada.next());
            
            if(numeroIntro>=0){
                if(numeroIntro%2==0){
                   if(numeroIntro>maximo){
                       maximo=numeroIntro;
                   }
                    

                }else {
                    impares++;
                    sumaImpares+=numeroIntro;
                }

                acumulado++;
            }
            
        }while(numeroIntro>0);
        
        System.out.println("La media de los impares es: "+(sumaImpares/impares));
        System.out.println("Ha introducido "+acumulado+" numeros.");
        System.out.println("El numero par mas grande introducido es: "+maximo);
    }
  
}
