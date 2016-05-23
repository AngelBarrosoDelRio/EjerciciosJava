/*
 * Realiza un programa que pida primero un número y a continuación un dígito. El programa
nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
dígito en el número introducido.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_26 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor introduzca un numero entero y a "
                + "continuacion un digito de ese numero anteriormente "
                + "introducido y ledire en que posicion esta");
        
        int numIntro;
        int numDigito;
        int posicion;
        
        System.out.print("Introduzca el numero: ");
        numIntro=Integer.parseInt(entrada.next());
        
        System.out.println("");
        
        System.out.print("Introduzca el digito: ");
        numDigito=Integer.parseInt(entrada.next());
        
        int numeroInvertido=0;
        
        while(!(numIntro<=0)){// mientras el numero introducido sea mayor que cero
            
           int resto=numIntro%10;// guardamos en resto la ultima cifra del numero.
           
           numeroInvertido= numeroInvertido*10+resto; // guardamos en invertido el numero obtenido del %10.
           
           numIntro=numIntro/10;//eliminamos la ultima cifra del numero introducido.
                   
        }
        
        numIntro=numeroInvertido;
        int cuentaNum=1;
        int resto;
        
        
        do{
            
            resto=numIntro%10; // cojo la ultima cifra.
            
            if(resto==numDigito){ // para comprobar si son iguales la ultima cifra y el digito introducido
                
                posicion=cuentaNum;
                numIntro/=10; // le quito el ultimo digito.
                System.out.println("El "+numDigito+" esta en la posicion "+posicion);
            
            }else {
                
                numIntro/=10;
            
            }
            cuentaNum++;
            
        }while(numIntro>0);
        
        
    }
   
}
