/*
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
y cuántos son negativos.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int nIntro;
        int positivos=0;
        
        System.out.println("Por favor, introduzca 10 numeros que uste "
                + "desee y le dire cuantos son positivos y cuantos negativos");
        
        for(int i=0;i<10;i++){
            
            System.out.print("Introduzca numero "+i+" : ");
            nIntro= Integer.parseInt(entrada.next());
            
            if(nIntro>0){
                positivos++;
            }
            
        }
        System.out.println("");
        
        System.out.println("Ha introducido usted "+positivos+" números "
                + "positivos y "+(10-positivos)+" números negativos");
    }
  
}
