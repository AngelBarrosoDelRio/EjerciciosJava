/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        int contraseña=1234;
        int intentos=4;
        int numIntro;
        
        System.out.println("Por favor introduzca el numero secreto de la caja fuerte");
        
        do{
            System.out.println("Tiene "+intentos+" intentos");
            
            System.out.print("Contraseña: ");
            numIntro=entrada.nextInt();
            
            if(contraseña==numIntro){
                
                System.out.println("Caja fuerte abierta");
                
            }else {
                
                System.out.println("Contraseña erronea, vuelva a escribir la contraseña.");
                intentos--;
            }
            
        }while((intentos>4)||(numIntro!=contraseña));
        
    }
  
}
