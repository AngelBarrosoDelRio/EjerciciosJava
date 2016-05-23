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
public class Ave extends Animal {

    public Ave(String s) {

        super(s);

    }

    public Ave() {
        super();
    }

    public void vuelta() {
        System.out.println("Menudas vista tengo desde aqui arriba!!");
    }

    public void encuba() {
        if ("macho".equals(this.getSexo())) {
            System.out.println("Eso es cosa de hembras, yo me voy a cazar.");
        } else {
            System.out.println("Voy a plantar el culo aqui no vaya a ser cojan frio los huevos");
        }
    }

    public void montarNido() {
        System.out.println("MIra que de ramas para nuestro nido, voy a cojerlas.");
    }

}
