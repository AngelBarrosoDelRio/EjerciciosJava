/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex30abr1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        HashMap<String, String> diccionarioColores = new HashMap<String, String>();
        HashMap<String, String> codigoColores = new HashMap<String, String>();
        diccionarioColores.put("azul", "blue");
        diccionarioColores.put("negro", "black");
        diccionarioColores.put("rojo", "red");
        diccionarioColores.put("blanco", "white");
        diccionarioColores.put("verde", "green");
        diccionarioColores.put("morado", "purple");
        diccionarioColores.put("amarillo", "yellow");
        diccionarioColores.put("naranja", "orange");
        diccionarioColores.put("rosa", "violet");
        
        codigoColores.put("azul", "#0000FF");
        codigoColores.put("negro", "#000000");
        codigoColores.put("rojo", "#FF0000");
        codigoColores.put("blanco", "#FFFFFF");
        codigoColores.put("verde", "#008000");
        codigoColores.put("morado", "#800080");
        codigoColores.put("amarillo", "#FF0000");
        codigoColores.put("naranja", "#FFA500");
        codigoColores.put("rosa", "#EE82EE");
        
        System.out.print("Por favor, introduzca un color: ");
        String colorIntro=entrada.nextLine();
        System.out.println("");
        
        for (Map.Entry pareja: diccionarioColores.entrySet()) {
          if(colorIntro.equals(pareja.getKey())){
              for (Map.Entry pareja2: codigoColores.entrySet()) {
                  if(colorIntro.equals(pareja2.getKey())){
                    System.out.println("El color "+pareja.getKey()+", en inglés es "+pareja.getValue()+" y su código RGB es "+pareja2.getValue());
                  }
              }
              
          }
        }
    }
  
}
