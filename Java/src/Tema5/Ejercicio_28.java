/*
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_28 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("A continuacion le pedire que introduzca un numero "
                + "entero POSITIVO y le dire su factorial");
        int numeroIntro;
        
        
        do{
        
            System.out.print("Por favor introduzca un numero: ");
            numeroIntro= entrada.nextInt();
            
            if(numeroIntro<0){
                System.out.println("el numero introducido debe ser positivo.");
            }
        
        }while(numeroIntro<0);
        
        int factorial=numeroIntro;
            
            if(numeroIntro==0){
                
                System.out.println("El factorial de "+numeroIntro+"!=1");
            
            }else if(numeroIntro>0){
                
                System.out.print("El factorial de "+numeroIntro+"!=");
                
                for(int i=1;i<numeroIntro;i++){
                    
                    factorial*=i;
                    System.out.print(" x ");
                    if(i<=numeroIntro){
                        
                        System.out.print(i);
                    
                    }
                
                }
                System.out.println(" = "+factorial);
                System.out.println("");
            
            }
        
    }
  
}
