/*
 * Realiza un programa que diga si un número entero positivo introducido por teclado es
capicúa. Se permiten números de hasta 5 cifras.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int aux1;
        int aux3;
        int n;
        
        System.out.println("Por favor introduzca un numero no superior a 5"
                + " cifras y le dire si es capicua.");
        System.out.print("Introduzca el numero: ");
        
        int numeroIntro=entrada.nextInt();
        System.out.println("");
        
        //numeros de una cifra
        if((numeroIntro>=0)&&(numeroIntro<10)){
            
            System.out.println("El numero es capicua");
        }
        
        //numeros de 2 cifras
        if((numeroIntro>=10)&&(numeroIntro<100)){
            
            n=numeroIntro/10;
            
            
            if((numeroIntro%10)==(n)){
                System.out.println("El numero es capicua");
            }else {
                System.out.println("El numero no es capicua");
            }
        }
        // numero de 3 cifras
        if((numeroIntro>=100)&&(numeroIntro<1000)){
            
            n=numeroIntro/100;
            
            
            if((numeroIntro%10)==(n)){
                System.out.println("El numero es capicua");
            }else {
                System.out.println("El numero no es capicua");
            }
        }
        //numero de 4 cifras
        if((numeroIntro>=1000)&&(numeroIntro<10000)){
            
            n=numeroIntro/1000;
            aux1=numeroIntro/100;
            aux1=aux1%10;
            aux3=numeroIntro/10;
            aux3=aux3%10;
            
            
            if((numeroIntro%10)==(n)&&(aux1)==(aux3)){
                
                System.out.println("El numero es capicua");
            
            }else {
               
                System.out.println("El numero no es capicua");
            }
        }
        // numeros de 5 cifras
        if((numeroIntro>=10000)&&(numeroIntro<100000)){
            
            n=numeroIntro/10000;
            aux1=numeroIntro/1000;
            aux1=aux1%10;
            aux3=numeroIntro/10;
            aux3=aux3%10;
            
            if((numeroIntro%10)==(n)&&(aux1)==(aux3)){
                
                System.out.println("El numero es capicua");
            
            }else {
               
                System.out.println("El numero no es capicua");
            }
        }
    }
  
    }

