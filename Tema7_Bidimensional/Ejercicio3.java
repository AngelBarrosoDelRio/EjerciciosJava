/*
 * Modifica el programa anterior de tal forma que los números que se introducen en el array
se generen de forma aleatoria (valores entre 100 y 999).
 */
package Tema7_Bidimensional;



/**
 *
 * @author angelo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
     
        
        
        int[][] num = new int[4][5];
        int i,j;
        int[] sumaFila = new int[4];
        int[] sumaColumna= new int[5];
        int total=0;
        
        // meto valores en el array num[][].
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
                
                num[i][j]=(int)(Math.random()*900+100);
            }
        }
        // calculo lo que va a dar la suma de cada una de las filas.
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
              
                sumaFila[i]+=num[i][j];
            }
        }
        // calculo lo que va a dar la suma de las cada una de las columnas.
        for(j=0; j<5; j++){
            for(i=0; i<4; i++){
               sumaColumna[j]+= num[i][j];
            }
        }
        
        //muestro el Array 
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
              
                System.out.printf("|%6d     |",num[i][j]);
            }
            System.out.printf("|%9d  |",sumaFila[i]);
            System.out.println("");
        }
        System.out.println("-----------------------------------------------"
                + "--------------------------------");
        for(j=0; j<5; j++){
            
            if(j==4){
                System.out.printf("|%9d  |",sumaColumna[j]);
                total+=sumaColumna[j];
                System.out.printf("|Total:%2d |",total);
            }else{
                System.out.printf("|%9d  |",sumaColumna[j]);
                total+=sumaColumna[j];
            }
        }
    }
  
}
