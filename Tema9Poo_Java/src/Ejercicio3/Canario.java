/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author angelo
 */
public class Canario extends Ave{
   
    public Canario(String s){
        super(s);
    }
    
    public Canario(){
        
    }
    
    public void canta(){
        System.out.println("pio pio, pio pio, pi pi pi pi ");
    }
    
    public void come(String comida) {
        if (comida.equals("alpiste")) {
            System.out.println("Que pesao con el alpiste...dame lechugaaa lechesss!!!!");
        } else if (comida.equals("lechuga")) {
            System.out.println("Que ricooo lechuguita frecaaa!!");
        } else {
            System.out.println("No se lo que es eso pero tiene mas mala pinta.....");
        }

    }
}
