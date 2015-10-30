/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
deberá dar la posición tanto del máximo como del mínimo.
 */
package Tema7_Bidimensional;

/**
 *
 * @author angelo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
     
        int[][] num = new int[6][10];
        int i,j;
        int maximo=0;
        int minimo=1000;
        int iMinimo=0,iMaximo=0,jMinimo=0,jMaximo=0;
        
        for(i=0; i<6; i++){
            for(j=0; j<10; j++){
                
                num[i][j]=(int)(Math.random()*1000);
                
                if(num[i][j]<minimo){
                    minimo=num[i][j];
                    jMinimo=j;
                    iMinimo=i;
                }
                if(num[i][j]>maximo){
                    maximo=num[i][j];
                    jMaximo=j;
                    iMaximo=i;
                }
            }
        }
        System.out.print("Array        ");
        for(i=0; i<10; i++){
            System.out.printf("|%6d     |",i);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------"
                + "-------------------------------------------------------------------");
        for(i=0; i<6; i++){
            System.out.printf("|%6d     |",i);
            for(j=0; j<10; j++){
              
                System.out.printf("|%6d     |",num[i][j]); 
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("El maximo esta en la posicion [i:"+iMaximo+" - j: "+jMaximo+"]");
        System.out.println("El minimo esta en la posicion [i:"+iMinimo+" - j: "+jMinimo+"]");
        
        
    }
  
}
