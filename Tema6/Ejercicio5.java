/*
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
espacios. Muestra también el máximo, el mínimo y la media de esos números.
 */
package Tema6;

import com.sun.corba.se.spi.ior.iiop.MaxStreamFormatVersionComponent;

/**
 *
 * @author angelo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
     
        System.out.println("Este programa mostrara 50 numeros aleatorios "
                + "entre 100 y 199 y le mostrara su maximo y su minimo y la media.");
        int maximo= 100;
        int minimo=199;
        int suma=0;
        int i;
        
        for(i=0;i<50;i++){
            int numero=(int)(Math.random()*100 +100);
            
            if(numero<minimo){
                minimo=numero;
            }else if(numero>maximo){
                maximo=numero;
            }
            
            suma+=numero;
            System.out.print(numero +", ");
        }
        
        
        System.out.println("");
        System.out.println("El maximo es: "+maximo);
        System.out.println("El minimo es: "+minimo);
        System.out.println("La media es: "+ suma/50);
    }
   
}
