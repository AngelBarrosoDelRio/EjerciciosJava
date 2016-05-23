/*
 * Escribe un programa que pase de decimal a binario.
 */
package Tema8;

import java.util.Scanner;
import Matematicas.Variadas.*;

/**
 *
 * @author angelo
 */
public class Ejercicio_18 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Escriba un numero y le dire su binario");
        System.out.print("Numero decimal: ");
        long decimal=Long.parseLong(entrada.next());
        int bits=1;
        int bitsDefinitivo=0;
        int i;
        int binario=0;
        int aux;
        
        //obtenemos los valores de los bits (1,2,4,8,16,32.....hasta que sea el maximo menor del numero decimal)
        for(i=bits; i<decimal;i*=2){
            bitsDefinitivo=i;
            
        }
        
        while(decimal>0){
            //mientras sea mayor para poder hacer la resta (ya que si no seria negativo y eso no se puede dar en este caso)
            if(decimal>=bitsDefinitivo){
                
                decimal-=bitsDefinitivo;                
                bitsDefinitivo=bitsDefinitivo/2; 
                // aux=1 xk siempre que se pueda hacer la resta el numero binario sera un 1.
                aux=1;
                binario=Matematicas.Variadas.juntaNumeros(binario, aux);
            
            }else{
                
                bitsDefinitivo=bitsDefinitivo/2;
                // aux=0 xk siempre que NO se pueda hacer la resta el numero binario sera un 0.
                aux=0;
                binario=Matematicas.Variadas.juntaNumeros(binario, aux);
            }
            
        }//cierre while
        
        System.out.println("binario= "+binario);
        
    }
  
}
