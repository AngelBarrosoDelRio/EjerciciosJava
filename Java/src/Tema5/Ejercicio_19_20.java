/*
 * Ejercicio 19:Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * Ejercicio 20: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_19_20 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        
        System.out.println("A continuación le pedire que introduzca la altur en la que desea la piramide.");
        System.out.print("Altura: ");
        int alturaIntro=Integer.parseInt(entrada.next());
        
        System.out.println("¿Como desea la piramide?  1) rellena  2) hueca");
        System.out.print("Respuesta: ");
        int respuesta=Integer.parseInt(entrada.next());
        
        int a;
        int i;
        int j;
        int espaciosDelante=alturaIntro-1;
        int numCaracter=1;
        int espacioInternos=1;
        
        switch(respuesta){
            
            //piramide rellena
            case 1:
                System.out.println("");
                for( a=0;a<alturaIntro;a++){
            
                    for(i=0;i<espaciosDelante;i++){
                        System.out.print(" ");
                    }
            
                  espaciosDelante--;
                    for(j=0;j<numCaracter;j++){
                
                        System.out.print("*");
                    }
                  numCaracter+=2;
                  System.out.println("");
                }
            break;
            //piramide hueca
            case 2:
                
                System.out.println("");
                for( a=0;a<alturaIntro-1;a++){ // altura menos uno para poner al final la fila de caracteres que cierra la piramide.
                    
                    if(a==0){  // si es la primera fila evaluara solamente los espacios en blanco delanteros
                        for(i=0;i<espaciosDelante;i++){
                            System.out.print(" ");
                        }
                    espaciosDelante--;
                    System.out.print("*"); // pinta el caracter de la primera fila.
                    }
                    
                    if((a>0)&&(a<alturaIntro)){ // pinta el cuerpo de la piramide.
                        
                        for(i=0;i<espaciosDelante;i++){  // espacios por delante
                            System.out.print(" ");
                        }
                        espaciosDelante--;
                        System.out.print("*"); // pinto el caracter
                        
                        for(j=0;j<espacioInternos;j++){  // espacios internos 
                            System.out.print(" ");
                        }
                        espacioInternos+=2; // incrementa de dos en dos xk empieza en uno y el siguiente debe ser 3... para formar la forma de la piramide
                        System.out.print("*");  // cierra la fila
                    }
                    System.out.println("");  // salto de linea
                    
                }// cierra del primer for 'a'.
                
                for (a=0;a<(alturaIntro*2)-1;a++){ // pinta la ultima linea de la piramide 'el cierre'
                    System.out.print("*");
                }
                
            break;
        }//cierre del switch
        
        System.out.println("");
        
        
    }
   
}
