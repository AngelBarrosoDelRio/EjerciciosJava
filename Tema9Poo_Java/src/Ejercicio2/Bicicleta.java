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
public class Bicicleta extends Vehiculo {

    private String modelo;
    private String marca;
    private int numeroPiñones;

    public Bicicleta(String mod, String mar, int numeroPiñones) {
        super();
        this.modelo = mod;
        this.marca = mar;
        this.numeroPiñones = numeroPiñones;
    }

    public void caballito() {
        System.out.println("tomaa caballitoo primooo!!");

    }

}
