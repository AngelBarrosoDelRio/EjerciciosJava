/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1Arrays;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoAnimal {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        //creo el objeto nuevo
        Gato[] gatitos = new Gato[5];
        String nombre,raza;
        int i;
        
        System.out.println("Introduzca los datos de los gato");
        for(i=0;i<5;i++){
            //para crear un objeto en concreto
            gatitos[i] = new Gato();
            //le doy valores
            System.out.println("Gato"+i+": ");
            System.out.print("nombre:");
            nombre=entrada.nextLine();
            System.out.println("");
            System.out.print("raza:");
            raza=entrada.nextLine();
            System.out.println("");
            //envio los valores recogidos a la clase Gato
            gatitos[i].setNombre(nombre);
            gatitos[i].setRaza(raza);
           
        }
        for(i=0;i<5;i++){
            //saco la informacion mediante un toString
            System.out.println(gatitos[i]);
        }
        
    }
 
}
