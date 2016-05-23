/*
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
la suma, la resta, la división y la multiplicación.
 */
package Tema2;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        int x=144;
        int y=999;
        
        System.out.println("Este programa mostrara la suma, multiplicacion, resta y division. ");
        System.out.println(x+" + "+ y+" = "+ (x+y));
        System.out.println(x+" - "+ y+" = "+ (x-y));
        System.out.println(x+" x "+ y+" = "+ x*y);
        System.out.println(x+" / "+ y+" = "+ x/y);
    }
  
}
