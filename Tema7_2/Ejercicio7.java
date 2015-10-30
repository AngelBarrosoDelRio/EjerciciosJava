/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 */
package Tema7_2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int i;
        int [] numero= new int[100];
        for(i=0;i<100;i++){
            
           numero[i]=(int)(Math.random()*20); 
        }
        System.out.println("Lista de numeros introducidos: ");
        for(i=0;i<100;i++){
            
            System.out.print(numero[i]+" ,");
        }
        
        System.out.println("Ahora necesito que me indique dos valores.");
        System.out.print("Valor1: ");
        int numero1=Integer.parseInt(entrada.next());
        System.out.println("Valor2: ");
        int numero2=Integer.parseInt(entrada.next());
        
        System.out.println("LIsta cambiada:");
        for(i=0;i<100;i++){
            
            if(numero[i]==numero1){
                numero[i]=numero2;
                System.out.print("'"+numero[i]+"', ");
            }else if(numero[i]==numero2){
                numero[i]=numero1;
                System.out.print("'"+numero[i]+"', ");
                
            }else {
                System.out.print(numero[i]+", ");
            }
        }
    }
 
}
