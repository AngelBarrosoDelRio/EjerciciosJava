/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author angelo
 */
public class usoTiempo {
    public static void main(String[] args) {
        
        Tiempo primerTiempo =new Tiempo(15,20,32);
        Tiempo segundoTiempo =new Tiempo(10,30,40);
        System.out.println(primerTiempo);
        System.out.println(segundoTiempo);
        primerTiempo.sumaTiempo(segundoTiempo);
    }
    
    
    
}
