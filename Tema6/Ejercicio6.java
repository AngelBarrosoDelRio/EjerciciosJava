/*
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 */
package Tema6;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("¿crees que adivinaras el numero que estoy pensando?."
                + ".. vamos a comprobarlo, tiene 5 intentos");
        
        int numeroPensado=(int)(Math.random()*100 );
        int oportunidades=5;
        boolean acertado=false;
        
        System.out.println("el numero que piensa la maquina es: "+numeroPensado);
        System.out.print("Dime un numero: ");
        
        do{
          int numeroIntro=entrada.nextInt();
          
          if(numeroIntro==numeroPensado){
              acertado=true;
              System.out.println("Enhorabuenaaa!! has acertado el numero.");
          }else{
              if(numeroIntro<numeroPensado){
                  
                  System.out.println("El numero que ha introducido es menor, por favor introduzca uno mas grande.");
              
              }else if(numeroIntro>numeroPensado){
                 
                  System.out.println("El numero que ha introducido es mayor, por favor introduzca uno mas pequeño.");
              }
              oportunidades--;
              
              if(oportunidades>0){
                 System.out.println("Lo siento te has confundio,le quedan "+oportunidades+" oportunidades. ");
                System.out.println("vuelva a introducir un numero: ");
              }else {
                  System.out.println("Lo siento ha fallado el resultado era: "+numeroPensado);
              }
              
          }
          
            
        }while((oportunidades>0)||(acertado=false));
    }
  
}
