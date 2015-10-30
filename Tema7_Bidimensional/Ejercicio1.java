/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
dispuestos en forma de tabla como se muestra en la figura.
 */
package Tema7_Bidimensional;

/**
 *
 * @author angelo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        int i,j;
        int [][]num = new int[3][6];
        
        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        
        for(i=0; i<=6; i++){
            System.out.printf("|%2d |",i);
        }
        System.out.println("");
        for(i=0; i<3; i++){
            System.out.println("-----------------------------------");
            System.out.printf("|%2d |",i+1);
            for(j=0; j<6; j++){
                
               System.out.printf("|%3d|",num[i][j]); 
                
            }
            
            System.out.println("");
        }
        
    }
  
}
