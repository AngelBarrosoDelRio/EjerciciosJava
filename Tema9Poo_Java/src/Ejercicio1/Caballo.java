/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author angelo
 */
public class Caballo {

    String raza;
    String sexo;
    String color;
    String colorCrines;
    double altura;
    boolean herrado;
    boolean semental;

    // constructor
    Caballo(String r, String sx, String c, String cc, double alt, boolean h, boolean s) {

        this.raza = r;
        this.sexo = sx;
        this.color = c;
        this.colorCrines = cc;
        this.altura = alt;
        this.herrado = h;
        this.semental = s;

    }

    // metodos
    void galopa() {
        System.out.println("trocoto trocoto trocoto que rapido voy al galope");
    }

    void relincha() {
        System.out.println("iiiiiiiiii iiii ii i iiiii");
    }

    void come(String comida) {
        if (comida.equals("azucarillos")) {
            System.out.println("ummmm que rico me encanta los azucarillos");
        } else if ((comida.equals("avena"))||(comida.equals("trigo"))) {
            System.out.println("Bueno me lo tendre que comer si no tienes azucarillos");
        } else {
            System.out.println("esto no me gusta... pueajj dame azucarillos por favor ");
        }
    }
}
