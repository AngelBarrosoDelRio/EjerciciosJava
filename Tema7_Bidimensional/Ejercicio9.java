/*
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
original como la matriz resultado, ambas con los números convenientemente alineados.
 */
package Tema7_Bidimensional;

/**
 *
 * @author angelo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
      
        int[][] matriz = new int[12][12];
        int[][]arrayAux= new int [12][12];
        int i,j;
        
        //meto valores en el array matriz.
        for(i=0; i<12 ; i++){
            for(j=0; j<12; j++){
              matriz[i][j]=(int)(Math.random()*100);
            }
        }
        
        //muestra el arrays matriz origianl.
        for(i=0; i<12 ; i++){
            for(j=0; j<12; j++){
                //vuelco el array matriz en el arrayAux para depues poder rotarlo
                arrayAux[i][j]=matriz[i][j];
                System.out.printf("| %3d |",matriz[i][j]);  
            }
            System.out.println("");
            System.out.println("--------------------------------------"
                    + "----------------------------------------------");
            
        }
        
        //rotar el array
        // Capa y Capa2 controlan los for de cada una de las lineas a rotar.
        int capa=0;
        int capa2=11;
        // Capa 3controla las veces que debemos realizar la rotacion 
        // como son 12x12 debera llegar hasta 6.
        int capa3=0;
        
        do{
            
                //primera linea
                for(j=capa; j<=capa2; j++){
                    // ponemos este if para que NO sucediese ( matriz[0][0]=arrayAux[0][-1])
                    // que seria un caso imposible ya que el indice -1 no existe.
                    if (j>0) {
                        // matriz[0][1]=arrayAux[0][0]
                        // matriz[0][2]=arrayAux[0][1]...
                        matriz[capa][j]=arrayAux[capa][j-1]; 
                    }
                } 
                
                
                //ultima columna
                for(i=capa2; i>capa; i--){
                    // matriz[11][11]=arrayAux[10][11]
                    // matriz[10][11]=arrayAux[9][11]...
                    matriz[i][capa2]=arrayAux[i-1][capa2];
                }
                //ultima linea.
                // capa2-1 por que el valor de matriz[11][11] se asigno en el anterior for
                for(j=capa2-1; j>=capa;j--){
                    // matriz[11][10]=arrayAux[11][11]
                    // matriz[11][9]=arrayAux[11][10]...
                    matriz[capa2][j]=arrayAux[capa2][j+1];
                }
                //primera  columna.
                // capa2-1 por que el valor de matriz[11][0] se asigno en el anterior for
                for(i=capa2-1; i>capa; i--){ 
                    // matriz[10][0]=arrayAux[11][0]
                    // matriz[9][0]=arrayAux[10][0]...
                    matriz[i][capa]=arrayAux[i+1][capa];
                }
                capa++;
                capa2--;
                capa3++;
            
            
        }while(capa3<6);
        
        // el primer valor del array matriz obtiene el valor del ultimo valor
        //del arrayAux.
        matriz[0][0]=arrayAux[capa][capa2];
        
        //muestra el array rotado.
        System.out.println("");
        System.out.println("Array modificado: ");
        for(i=0; i<12 ; i++){
            for(j=0; j<12; j++){
                
                System.out.printf("| %3d |",matriz[i][j]);  
            }
            System.out.println("");
            System.out.println("--------------------------------------"
                    + "----------------------------------------------");
            
        }
        
    }
   
}
