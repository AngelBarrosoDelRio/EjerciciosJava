/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y
que luego calcule la suma, la media, el máximo y el mínimo de esos números. El tamaño
de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
       
        ArrayList<Integer> numero = new ArrayList<Integer>();
        //interactua es el tamaño que va a tener el arraylist
        int interactua= (int)(Math.random()*10+10);
        //numero añadido son los diferentes valores que voy a introducir en el arrayList
        int numeroAnadido;
        int suma=0;
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        double media;
        
        
        for(int i=0; i< interactua;i++){
            numeroAnadido=(int)(Math.random()*100);
            numero.add(numeroAnadido);
            suma+=numeroAnadido;
            
            if(numeroAnadido>maximo){
                maximo=numeroAnadido;
            }
            if(numeroAnadido<minimo){
                minimo=numeroAnadido;
            }
            
        }
        media=suma/interactua;
        for(Integer numeros:numero){
            System.out.println("numero: "+numeros);
            
        }
        System.out.println("La media ha sido: "+media);
        System.out.println("La suma es: "+suma);
        System.out.println("El minimo: "+minimo);
        System.out.println("El maximo: "+maximo);
    }
 
}
