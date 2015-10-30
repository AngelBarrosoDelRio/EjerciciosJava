/*
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. Las líneas
deben tener una longitud aleatoria entre 1 y 40 caracteres. Estos caracteres podrán ser uno
de los siguientes: *, -, =, ., |, @
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        
        int longitud;
        int i,j;
        
        int eleccion=(int)(Math.random()*6);
        for(i=0 ; i<10 ; i++){
           
            longitud=(int)(Math.random()*40+1);
            
            
            for(j=1;j<longitud;j++){
                switch(eleccion){
                    case 0:
                         System.out.print("*");
                    break;
                    case 1:
                         System.out.print("-");
                    break;
                    case 2:
                         System.out.print("=");
                    break;
                    case 3:
                         System.out.print("#");
                    break;
                    case 4:
                         System.out.print("|");
                    break;
                    case 5:
                         System.out.print("@");
                    break;
                }
                
            }
            System.out.println("");
            
        }
    }
  
}
