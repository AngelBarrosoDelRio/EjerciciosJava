/*
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra
esos nombres por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin
usar ningún índice.
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        
        a.add("Rafa");
        a.add("Angel");
        a.add("Jose");
        a.add("Carlos");
        a.add("Manuel");
        a.add("Alba");
        
        for(String alumno:a){
            System.out.println("Nombre: "+alumno);
        }

    }
 
}
