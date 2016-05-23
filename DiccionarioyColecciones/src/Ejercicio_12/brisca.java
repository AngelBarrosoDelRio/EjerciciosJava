/*
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que
sume los puntos según el juego de la brisca. El valor de las cartas se debe guardar en una
estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). La
secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de
la clase Carta .
 */
package Ejercicio_12;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author angelo
 */
public class brisca {
    public static void main(String[] args) {
      
        HashMap<String, Integer> puntuacion = new HashMap<String, Integer>();
        puntuacion.put("AS",11);
        puntuacion.put("SOTA",2);
        puntuacion.put("CABALLO",3);
        puntuacion.put("REY",4);
        puntuacion.put("3",10);
        
        ArrayList<Cartas> carta = new ArrayList<Cartas>();
        
        Cartas cartaAux = new Cartas();
        
        for (int i = 0; i < 5; i++) {

            do {

                cartaAux = new Cartas();

            } while (carta.contains(cartaAux));//carta.contains(cartaAux) llama al equals de la clase Cartas para comprobar k no exite

            //cuando salga del while añado esa nueva carta
            carta.add(cartaAux);
            

        }
        int sumaPuntos=0;
        System.out.println("Bienvenido al juego de la brisca, a contuniacion "
                + "mostrare \nlos puntos obtenidos en una tirada aleatoria simulada.");
        System.out.println("--------------------------------------------------------");
        for (Cartas muestraCarta : carta) {
            
            if(puntuacion.containsKey(muestraCarta.numCartaObtenida)){
               sumaPuntos+=(int)puntuacion.get(muestraCarta.numCartaObtenida); 
            }
            System.out.println(muestraCarta);

        }
        System.out.println("");
        System.out.println("puntos obtenidos : "+sumaPuntos);
        
        
    }
 
}
