/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosFuncionesByExamen;

import static Matematicas.Arrays.muestraArrayInt;
import Matematicas.Variadas;

/**
 *
 * @author angelo
 */
public class pruebas {
    public static void main(String[] args) {
        int []prueba= new int[5];
        prueba[0]=1;
        prueba[1]=1;
        prueba[2]=8;
        prueba[3]=8;
        prueba[4]=5;
        muestraArrayInt(Matematicas.funcionesExamen.moda(prueba));
    }
 
}
