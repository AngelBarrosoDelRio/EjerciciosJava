/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8;

import static Matematicas.Arrays.muestraArrayInt;
import static Matematicas.ArraysBidmensionales.coordenadasEnArrayBiInt;
import static Matematicas.ArraysBidmensionales.esPuntoDeSilla;
import static Matematicas.ArraysBidmensionales.muestraArrayIntBi;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class PruebaArrayFunciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tamañoArrayi = 3;
        int tamañoArrayx = 3;
        int maximo = 50;
        int minimo = 0;
        int i, x, a;
        boolean repetido;
        /* muestra el array bidimensional y dentro introduzco la funcion de crear un array.
         muestraArrayIntBi(Matematicas.ArraysBidmensionales.generaArrayBiInt(tamañoArrayi,tamañoArrayx,maximo,minimo));
         */

        /*  
         prueba, sin indices ni nada, obtiene valores dados en la funcion generaArrayBiInt.
         prueba= Matematicas.ArraysBidmensionales.generaArrayBiInt(tamañoArrayi,tamañoArrayx,maximo,minimo);
         */
        
        // PUNTO DE SILLA CALIENTE
        int[][] matriz = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (x = 0; x < 3; x++) {
                do {
                    matriz[i][x] = (int) (Math.random() * (maximo - minimo) + minimo - 1);
                    repetido = false;

                    for (a = 0; a < 3 * i + x; a++) {
                        if (matriz[i][x] == matriz[a / 3][a % 3]) {
                            repetido = true;
                        }
                    }
                } while (repetido);
            }
        }
        for (i = 0; i < 3; i++) {
            for (x = 0; x < 3; x++) {
                System.out.printf("|%3d|", matriz[i][x]);
            }
            System.out.println("");
        }
         System.out.println(esPuntoDeSilla(matriz));
        
        /*
         System.out.print("digame un numero: ");
         int numeroIntro= entrada.nextInt();
         muestraArrayInt(coordenadasEnArrayBiInt(matriz,numeroIntro));
         */
       

    }

}
