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
public class Delfin extends Mamifero {

    private String tipoMamifero;

    public Delfin(String s) {
        super(s);
    }

    public Delfin(String s, String t) {
        super(s, t);

    }

    public void piruetas() {
        System.out.println("Toma voltereta que me acabo de marcar");
    }

}
