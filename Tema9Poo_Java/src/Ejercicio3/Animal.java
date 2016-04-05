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
public abstract class Animal {

    private String sexo;

    public Animal(String s) {

        this.sexo = s;

    }

    public Animal() {

        this.sexo = "hembra";

    }

    public void duerme() {

        System.out.println("zzzzzzzz");

    }

    public void come() {
        System.out.println("ñam ñam ñam ñam");
    }

    public String getSexo() { // luis tiene en vez de Sting Sexo.
        return this.sexo;
    }

}
