/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por
teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa
debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando
hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio15 {
    public static void main(String[] args) {
     
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("Bienvenido, por favor eliga una opcion referente "
                + " a la eleccion de el vertice de la piramide que desa y"
                + " del caracter con el que desa pintarla.");
        
        System.out.println("       MENÚ");
        System.out.println("------------------");
        System.out.println("1º vertice hacia arriba");
        System.out.println("2º vertice hacia abajo");
        System.out.println("3º vertice hacia la derecha");
        System.out.println("4º vertice hacia la izquierda");
        System.out.println("------------------");
        System.out.println("opcion: ");
        int opcion=Integer.parseInt(entrada.next());
        
        System.out.println("Eñige un carater eje('@','*'...): ");
        String caracter =entrada.next();
        
        switch(opcion){
            
            case 1:
                System.out.println(" "+" "+" "+" "+caracter);
                System.out.println(" "+" "+" "+" "+caracter+caracter);
                System.out.println(" "+" "+caracter+caracter+caracter+caracter);
                System.out.println(""+caracter+caracter+caracter+caracter+caracter+caracter);
        }
    }
  
}
