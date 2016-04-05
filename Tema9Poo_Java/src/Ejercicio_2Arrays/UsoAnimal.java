/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2Arrays;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class UsoAnimal {
    public static void main(String[] args) {
        
    
   Scanner entrada= new Scanner(System.in);
        //creo el objeto nuevo
        Gato[] gatitos = new Gato[5];
        String nombre,raza;
        int i;
        
        
            //para crear un objeto en concreto
        gatitos[0] = new Gato("garfield","persa");
        gatitos[1] = new Gato("garfield1","peludo");
        gatitos[2] = new Gato("garfield2","egipcio");
        gatitos[3] = new Gato("garfield3","montes");
        gatitos[4] = new Gato("garfield4","albino");
            //le doy valores
            
           
        
        for(i=0;i<5;i++){
            //saco la informacion mediante un toString
            System.out.println(gatitos[i]);
        }
        
    }
 
} 
