/*
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar
palabras en lugar de números.
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);
        ArrayList<String> palabra = new ArrayList<String>();
        String palabraIntro;
        System.out.println("por favor introduzca 10 numeros enteros y los ordenare: ");
        
        for(int i =0; i<10; i++){
            System.out.print("Palabra "+i+": ");
            palabraIntro= entrada.nextLine();
            palabra.add(palabraIntro);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Lista original: " + palabra);
        Collections.sort(palabra);
        System.out.println("Lista ordenada: " + palabra);
        
        ArrayList<String> p = new ArrayList<String>();
        
        for(String modifica:palabra){
            p.add(0,modifica);
        }
        System.out.print("Lista ordenada de mayor a menor: " + p);
        
    }
 
}
