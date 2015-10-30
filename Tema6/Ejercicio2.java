/*
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
podemos usar String.valueOf(n) .
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Este programa mostrara una carta elegida al azar.");
        int numCarta=(int)(Math.random()*12+1);
        int palo=(int)(Math.random()*4+1);
        
        System.out.print("La carta elegida es: ");
        switch(numCarta){
            case 1:
                System.out.print("AS de ");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print(+numCarta+" de ");
               
            break; 
            case 10:
                System.out.print("J de ");
            break;
            case 11:
                System.out.print("Q de ");
            break;
            case 12:
                System.out.print("K de ");
            break;
        }
        switch(palo){
            case 1:
                System.out.print("TREBOLES");
            break;
            case 2:
                System.out.print("CORAZONES");
            break;
            case 3:
                System.out.print("PICAS");
            break;
            case 4:
                System.out.print("DIAMANTES");
            break;
        }
    }
  
}
