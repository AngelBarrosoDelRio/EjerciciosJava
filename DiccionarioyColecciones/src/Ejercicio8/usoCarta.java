/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author angelo
 */
public class usoCarta {

    public static void main(String[] args) {

        ArrayList<Cartas> carta = new ArrayList<Cartas>();//creo el arrayList de la clase Cartas

        //genera aleatoriamente los valores a coger por primera vez
        // para poder hacer las comparaciones
        Cartas cartaAux = new Cartas();
        carta.add(cartaAux);

        //comparo k se cumpla las restrinciones
        for (int i = 0; i < 39; i++) {

            do {

                cartaAux = new Cartas();

            } while (carta.contains(cartaAux));//carta.contains(cartaAux) llama al equals de la clase Cartas para comprobar k no exite

            //cuando salga del while añado esa nueva carta
            carta.add(cartaAux);
            

        }
        //ordeno el resultado para comprobar k no se repitan
        Collections.sort(carta);
        //muestro el resultado
        for (Cartas muestraCarta : carta) {

            System.out.println(muestraCarta);

        }

    }

}
