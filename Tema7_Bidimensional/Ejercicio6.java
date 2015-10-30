/*
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 */
package Tema7_Bidimensional;

/**
 *
 * @author angelo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
     
        int[][] num = new int[6][10];
        int[][] repite= new int[6][10];
        int i,j,a;
        int maximo=0;
        int minimo=1000;
        int iMinimo=0,iMaximo=0,jMinimo=0,jMaximo=0;
        boolean repetido;
        
        for(i=0; i<6; i++){
            for(j=0; j<10; j++){
                
                do {
                num[i][j] = (int)(Math.random() * 1001);

                // Comprueba si el número generado ya está en el array.
                repetido = false;
                for (a = 0; a < 10 * i + j; a++) {
                     if (num[i][j] == num[a / 10][a % 10]) {
                    repetido = true;
                   }
                }
                } while (repetido);
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
