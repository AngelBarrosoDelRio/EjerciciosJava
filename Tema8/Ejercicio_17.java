/*
 * Escribe un programa que pase de binario a decimal.
 */
package Tema8;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_17 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        long decimal = 0;
    
        System.out.print("Introduzca un número binario: ");
        int binario = Integer.parseInt(entrada.next());

        int bits = Matematicas.Variadas.cuentaDigitos(binario);

        for(int i = 0; i < bits; i++) {
          decimal += Matematicas.Variadas.digitoN(binario, bits - i - 1) * Matematicas.Variadas.potencia(2, i);
        }

        System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
 
}
