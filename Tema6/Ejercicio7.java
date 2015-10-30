/*
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).
 */
package Tema6;



/**
 *
 * @author angelo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
    int apuesta;
    int columnas = 3;
    
    for (int i = 1; i <= 15; i++) {
      System.out.printf("%6d. |", i);
      
      if (i == 15) {
        columnas = 1;
      }
      
      for (int j = 1; j <= columnas; j++) {
        apuesta = (int)(Math.random() * 3) + 1;
        switch(apuesta) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}
