/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

/**
 *
 * @author angelo
 */
public class ArraysBidmensionales {

    /**
     * **********************************************************
     */
    /*                                                           */
    /* generaArrayBiInt:int n, int m, int minimo ,int maximo    */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*  generaArrayBiInt: Genera un array de tamaño n x m con
     números aleatorios cuyo
     intervalo (mínimo y máximo) se indica como parámetro.    */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static int[][] generaArrayBiInt(int n, int m, int minimo, int maximo) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < m; x++) {
                array[i][x] = (int) (Math.random() * (maximo - minimo) + minimo - 1);
            }
        }
        return array;
    }

    /**
     * **********************************************************
     */
    /*                                                           */
    /* columnasArrayIntBi:int x[][]                              */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*    numero de columnas que tiene el array                  */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static int columnasArrayIntBi(int x[][]) {
        return x[0].length;
    }

    /**
     * **********************************************************
     */
    /*                                                           */
    /* filasArrayIntBi:int x[][]                                 */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*    numero de filas que tiene el array                     */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static int filasArrayIntBi(int x[][]) {
        return x.length;
    }

    /**
     * **********************************************************
     */
    /*                                                           */
    /* muestraArrayIntBi:int v[][]                               */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*    muestra un array bidimensional                         */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static void muestraArrayIntBi(int v[][]) {
        for (int i = 0; i < filasArrayIntBi(v); i++) {
            for (int x = 0; x < columnasArrayIntBi(v); x++) {
                System.out.printf("|%2d|", v[i][x]);
            }
            System.out.println("");
        }
    }

    /**
     * **********************************************************
     */
    /*                                                           */
    /* coordenadasEnArrayBiInt::int v[][]                        */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*    Devuelve la fila y la columna (en un array con dos     */
    /*    elementos) de la primera ocurrencia del elemento que   */
    /*    se pasa como parámetro. Si no se encuentra, se         */
    /*    devuelve {-1,-1}.                                      */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static int[] coordenadasEnArrayBiInt(int v[][], int n) {

        for (int i = 0; i < v.length; i++) {
            for (int x = 0; x < v[0].length; x++) {
                if (v[i][x] == n) {
                    int[] coordenadas = {i, x};
                    return coordenadas;
                }
            }
        }

        int[] coordenadas = {-1, -1};
        return coordenadas;
    }

    /**
     * **********************************************************
     */
    /*                                                           */
    /* esPuntoDeSilla:int v[][]                                  */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*    Dice si un número es o no punto de silla, es decir,    */
    /*     mínimo en su fila y máximo en su columna.             */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static int esPuntoDeSilla(int v[][]) {

        int[] minFila = new int[3];
        int[] maxColum = new int[3];
        int i, x;
        int sillaCaliente = 0;
        
        //comprueba el minimo de la fila
        for (i = 0; i < v.length; i++) {
            int minimoFila = Integer.MAX_VALUE;
            for (x = 0; x < v[0].length; x++) {
                if (v[i][x] < minimoFila) {
                    minimoFila = v[i][x];
                    minFila[i] = minimoFila;
                }

            }
        }
        //comprueba el maximo de la columna
        for (x = 0; x < v[0].length; x++) {
            int maximoColum = Integer.MIN_VALUE;
            for (i = 0; i < v.length; i++) {
                if (v[i][x] > maximoColum) {
                    maximoColum = v[i][x];
                    maxColum[x] = maximoColum;
                }
            }
        }
        //comprueba que el numero sea el maximo de la columna y el minimo de la fila
        for (i = 0; i < v.length; i++) {
            for (x = 0; x < v[0].length; x++) {
                if (minFila[i] == maxColum[x]) {

                    sillaCaliente = v[i][x];
                }
            }
        }

        if (sillaCaliente != 0) {
            return sillaCaliente;
        } else {
            sillaCaliente = -1;
            return sillaCaliente;
        }

    }

}//CIERRE DEL PUBLIC CLASS
