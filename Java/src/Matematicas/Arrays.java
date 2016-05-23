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
public class Arrays {
    
        /*************************************************************/
	/*                                                           */
	/* generaArrayInt(int n, int maximo, int minimo)             */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Genera un array de tamaño n con números aleatorios cuyo  */
        /*  intervalo (mínimo y máximo) se indica como parámetro.    */
	/*                                                           */
	/*************************************************************/

	public static int[] generaArray(int n, int maximo, int minimo) {
            int[] array = new int[n];
            for(int i=0; i<n;i++){
                array[i]=(int)(Math.random()*(maximo-minimo)+minimo-1);
            }
            return array;
        }
        
        /*************************************************************/
	/*                                                           */
	/* minimoArrayInt:(int array[])                              */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Devuelve el mínimo del array que se pasa como parámetro. */
	/*                                                           */
	/*************************************************************/
        
        public static int minimoArrayInt (int[] array) {
            int minimo = Integer.MAX_VALUE;
           
            for(int i=0 ; i<array.length;i++){
                if(array[i]<minimo){
                   minimo=array[i]; 
                }
            }
            return minimo;
        }
        
        /*************************************************************/
	/*                                                           */
	/* maximoArrayInt:(int array[])                              */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Devuelve el maximo del array que se pasa como parámetro. */
	/*                                                           */
	/*************************************************************/
        
        public static int maximoArrayInt (int[] array) {
            int maximo = Integer.MIN_VALUE;
           
            for(int i=0 ; i<array.length;i++){
                if(array[i]>maximo){
                   maximo=array[i]; 
                }
            }
            return maximo;
        }
        
        /*************************************************************/
	/*                                                           */
	/* mediaArrayInt:(int array[])                               */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Devuelve la media del array que se pasa como parámetro.  */
	/*                                                           */
	/*************************************************************/
        
        public static int mediaArrayInt (int[] array) {
            int suma=0;
            for(int i=0 ; i<array.length;i++){
                suma+=array[i];
            }
            int media=suma/array.length;
            return media;
        }
        
        /*************************************************************/
	/*                                                           */
	/* estaEnArrayInt:(int array[],int x)                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Dice si un número está o no dentro de un array.          */
	/*                                                           */
	/*************************************************************/
        
        public static boolean estaEnArrayInt (int[] array,int x) {
            
            for(int i=0 ; i<array.length;i++){
                if(x==array[i]){
                    return true;
                }
            }
            
            return false;
        }
        
        /*************************************************************/
	/*                                                           */
	/* posicionEnArray:(int array[],int x)                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Busca un número en un array y devuelve la posición       */
        /*  (el índice) en la que se encuentra.                      */
	/*                                                           */
	/*************************************************************/
        
        public static String posicionEnArray (int[] array,int x) {
            
            for(int i=0 ; i<array.length;i++){
                if(x==array[i]){
                    
                    return "esta en la posicion "+(i);
                }
            }
            return "no esta en ninguna posicion";
            
        }
        
        /*************************************************************/
	/*                                                           */
	/* volteaArrayInt:(int array[],int x)                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Le da la vuelta a un array.                              */
	/*                                                           */
	/*************************************************************/
        
        public static int[] volteaArrayInt (int[] array) {
            
            
            
            
            int[] arrays = new int[array.length];
            // menos uno xk si no se saldria del 
            //tamaño original del array
            int tamaño=(array.length)-1; 
            for(int i=0; i<array.length;i++){
                
                arrays[tamaño]=array[i];
                
                tamaño--;
            }
            return arrays;
            
        }
        
        /*************************************************************/
	/*                                                           */
	/* rotaDerechaArrayInt::(int array[],int x)                  */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  Rota n posiciones a la derecha los números de un array.  */
	/*                                                           */
	/*************************************************************/
        
        public static int[] rotaDerechaArrayInt (int[] array, int n) {
            
            int[] arrays = new int[array.length];
            int i, aux;
            for(i=0; i<array.length;i++){
                
                arrays[i]=array[i];
                
                
            }
            
            while (n-- > 0) {
                aux = arrays[arrays.length - 1];
                for(i = arrays.length - 1; i > 0; i--){
                  arrays[i] = arrays[i - 1];
                }
                arrays[0] = aux;
            }
      
            return arrays;
            
            
        }
        
        
        /*************************************************************/
	/*                                                           */
	/* muestraArrayInt::(int v[])                                */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/*  muestra un array unidimensional.                         */
	/*                                                           */
	/*************************************************************/
        
        public static void muestraArrayInt(int v[]) {
            for(int i=0; i< v.length;i++){
                
                    System.out.printf("|%2d|",v[i]); 
            }
        }
        
}
