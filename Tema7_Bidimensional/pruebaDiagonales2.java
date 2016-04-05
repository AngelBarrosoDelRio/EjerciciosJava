/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7_Bidimensional;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class pruebaDiagonales2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i, a;
        int tamañoArray = 5;
        int[][] tablero = new int[tamañoArray][tamañoArray];

        for (a = 0; a < tamañoArray; a++) {
            for (i = 0; i < tamañoArray; i++) {
                tablero[a][i] = (int) (Math.random() * 10 + 1);
            }
        }
        for (a = 0; a < tamañoArray; a++) {
            for (i = 0; i < tamañoArray; i++) {
                System.out.printf("|%2d|", tablero[a][i]);
            }
            System.out.println("");
        }
        System.out.println("ELija un numero e indiqueme sus cordenadas y "
                + "le sacare la diagonal a raiz de ese numero. La cordenadas van"
                + "[0-3] ejemplo: extraer el numero de la coordenada[2-2]= " + tablero[2][2]);

        System.out.print("coordenada x: ");
        int xa = Integer.parseInt(entrada.next());
        System.out.println("");
        System.out.print("coordenada y: ");
        int yi = Integer.parseInt(entrada.next());
        for (a = 0; a < tamañoArray; a++) {
            for (i = 0; i < tamañoArray; i++) {

                //Esta condicion hace que rode un numero ejemplo:
                /*
                 | 12 | 10 | 4 | 5 |
                 | 3  | 0  | 0 | 0 |
                 | 22 | 0  | 7 | 0 |
                 | 13 | 0  | 0 | 0 |
                 */
                if (((((Math.abs(a - xa) <= 1)) && (Math.abs(i - yi) <= 1)))) {
                    if ((a == xa && i == yi)) {

                        System.out.printf("|%2d|", tablero[a][i]);
                    } else {

                        tablero[a][i] = 0;
                        System.out.printf("|%2d|", tablero[a][i]);
                    }

                } else {
                    System.out.printf("|%2d|", tablero[a][i]);
                }
            }
            System.out.println("");
        }
        /* ESTE TE INDICA SU DIAGONAL ENTERA DESDE UNAS COORDENADAS DADAS POR EL USUARIO
         POR LO TANTO SIEMPRE SERA UNA DIAGONAL DIFERENTE.
        
         | 12 | 0 | 4 | 0 |
         | 3  | 5 | 8 | 4 |
         | 22 | 0 | 7 | 0 |
         | 0  | 7 | 2 | 9 |
        
         for (a = 0; a < tamañoArray; a++) {
         for (i = 0; i < tamañoArray; i++) {
         if((Math.abs(a-xa)>=1)&&(Math.abs(i-yi)>=1)&&(Math.abs(a-xa)==(Math.abs(i-yi)))){
         tablero[a][i]=0;
         System.out.printf("|%2d|", tablero[a][i]);
         }else{
         System.out.printf("|%2d|", tablero[a][i]);
         }
         }
         System.out.println("");
         }
         */

        /*
         ESTE FOR OBTIENE LA DIAGONAL PERO SOLAMENTE A UNA CASILLA DE DISTANCIA.
        
         | 12 | 8 | 4 | 1 |
         | 3  | 0 | 8 | 0 |
         | 22 | 3 | 7 | 1 |
         | 0  | 0 | 2 | 0 |
        
         for (a = 0; a < tamañoArray; a++) {
         for (i = 0; i < tamañoArray; i++) {
         if((Math.abs(a-xa)==1)&&(Math.abs(i-yi)==1)){
         tablero[a][i]=0;
         System.out.printf("|%2d|", tablero[a][i]);
         }else{
         System.out.printf("|%2d|", tablero[a][i]);
         }
         }
         System.out.println("");
         }
         */
    }

}
