/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
 */
package Tema7_2;

/**
 *
 * @author angelo
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        
        int [] par= new int[20];
        int []impar= new int[20];
        int [] numero = new int[20];
        int i;
        int cuentaPar=0;
        int cuentaImpar=0;
        
        //obtengo los numeros aleatorios
        for(i=0;i<20;i++){
            
            numero[i]=(int)(Math.random()*100);
        
        }
        
        
        //Muestra el array original.
        System.out.println("Array original: ");
        for(i=0;i<20;i++){
            
            System.out.print(numero[i]+",");
        
        }
        
        // almaceno los pares y los impares en sus respectivos arrays.
        for(i=0;i<20;i++){
            if((numero[i]%2==0)||(numero[i]==1)||(numero[i]==0)){
                    par[cuentaPar++]=numero[i];
                    
            }else{
                  impar[cuentaImpar++]=numero[i];    
            }
        }
        
        //metos los pares en las primeras posiciones.
        for(i=0;i<cuentaPar;i++){
            
            numero[i]=par[i];
        }
        // metos los impares en las restantes.
        for(i=cuentaPar;i<20;i++){
            
            numero[i]=impar[i-cuentaPar];
        }
        
        System.out.println("");
        // muestra el arrays modificado
        System.out.println("Arrays modificado:");
        for(i=0;i<20;i++){
            System.out.print(numero[i]+",");
        }
        
    }
  
}