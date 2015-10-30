/*
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final
cuántos números se han generado.
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
    
        int cuentaNumeros=0;
        int numero;
        
        do{
            
            
            numero=(int)(Math.random()*100);
            
            if(numero%2==0){
               
                System.out.print(numero+", ");
                cuentaNumeros++;
            }
           
            
        }while(numero!=24);
        System.out.println("");
        System.out.println("se ha obtenido una lista de "+cuentaNumeros+" numeros.");
    }
   
}
