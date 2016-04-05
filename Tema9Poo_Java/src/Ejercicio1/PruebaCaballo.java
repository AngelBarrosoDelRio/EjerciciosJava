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
public class PruebaCaballo {
    public static void main(String[] args) {
        
        Caballo rocinante = new Caballo("Arabe","macho","negro azabache","negro",2.10,true,true);
        
        rocinante.galopa();
        rocinante.come("azucarillos");
    }
}
