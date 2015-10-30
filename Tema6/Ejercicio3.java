/*
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 48 cartas:
2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio3 {
  public static void main(String[] args) {
        
        System.out.println("Este programa mostrara una carta elegida al azar.");
        int numCarta=(int)(Math.random()*12+1);
        int palo=(int)(Math.random()*4+1);
        
        System.out.print("La carta elegida es: ");
        switch(numCarta){
            case 1:
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
                System.out.print("sota de ");
            break;
            case 11:
                System.out.print("caballo de ");
            break;
            case 12:
                System.out.print("rey de ");
            break;
        }
        switch(palo){
            case 1:
                System.out.print("Bastos");
            break;
            case 2:
                System.out.print("Oros");
            break;
            case 3:
                System.out.print("Copas");
            break;
            case 4:
                System.out.print("Espadas");
            break;
        }
  }
}
