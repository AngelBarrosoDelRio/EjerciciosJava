/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author angelo
 */
public class Coche extends Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int numeroPuertas;

    public Coche(String matri, String mar, String mod, int numeroPuertas) {
        super();
        this.matricula = matri;
        this.marca = mar;
        this.modelo = mod;
        this.numeroPuertas = numeroPuertas;
    }

    public void quemaRuedas() {
        System.out.println("brrrroooommmm brrrroommmm... chiiiiiii chiiiii");
    }

}
