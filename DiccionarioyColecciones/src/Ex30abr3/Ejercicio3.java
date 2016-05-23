/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex30abr3;

import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        ArrayList<Cartas> mazo1 = new ArrayList<>();
        ArrayList<Cartas> mazo2 = new ArrayList<>();
        ArrayList<Cartas> mezcla = new ArrayList<>();
        
        int numInterazionMazo1= (int) (Math.random() * 4+1);
        int numInterazionMazo2= (int) (Math.random() * 4+1);
        int i;
        Cartas cartaAux = new Cartas();
        mazo1.add(cartaAux);

        //comparo k se cumpla las restrinciones
        for (i = 0; i < numInterazionMazo1; i++) {

            do {

                cartaAux = new Cartas();

            } while (mazo1.contains(cartaAux));//carta.contains(cartaAux) llama al equals de la clase Cartas para comprobar k no exite

            //cuando salga del while añado esa nueva carta
            mazo1.add(cartaAux);
            

        }
        for (i = 0; i < numInterazionMazo2; i++) {

            do {

                cartaAux = new Cartas();

            } while (mazo2.contains(cartaAux) || mazo1.contains(cartaAux));//carta.contains(cartaAux) llama al equals de la clase Cartas para comprobar k no exite

            //cuando salga del while añado esa nueva carta
            mazo2.add(cartaAux);
            

        }
        System.out.println("Mazo1: ");
        for (Cartas muestraCartamazo1 : mazo1) {

            System.out.println(muestraCartamazo1);

        }
        System.out.println("");
        System.out.println("Mazo2: ");
        for (Cartas muestraCartamazo2 : mazo2) {

            System.out.println(muestraCartamazo2);

        }
        
        i=0;
        do{
            if(mazo1.size()>0 && mazo2.size()>0){
            mezcla.add(mazo1.get(i));
            mezcla.add(mazo2.get(i));
            mazo1.remove(i);
            mazo2.remove(i);
            }else if(mazo1.size()==0 && mazo2.size()>0){
               mezcla.add(mazo2.get(i));
               mazo2.remove(i);
            }else if(mazo2.size()==0 && mazo1.size()>0) {
               mezcla.add(mazo1.get(i));
               mazo1.remove(i); 
            }
            
            
        }while(mazo1.size()>0 || mazo2.size()>0 );
        
        System.out.println("");
        System.out.println("barajada: ");
        for (Cartas muestraCartamezclada : mezcla) {

            System.out.println(muestraCartamezclada);

        }
        
    }
}
