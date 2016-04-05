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
public class Pinguino extends Ave {

    public Pinguino(String s) {
        super(s);
    }

    public Pinguino() {

    }

    public void canta() {
        System.out.println("No se cantar soy un pinguino solo se hacer ruidos raros ");
    }

    public void vuelta() {
        System.out.println("No puedo volar mi pequeñas alas y mi gran barrigota no me permite volar :( !!");
    }

    public void come(String comida) {
        if (comida.equals("chanquetes")) {
            System.out.println("no me des chanquetes dame mejor sardinass!!!!");
        } else if (comida.equals("sardinas")) {
            System.out.println("Que ricooo sardinasssss!!");
        } else {
            System.out.println("No se lo que es eso... pero tiene mas mala pinta.....");
        }

    }
}
