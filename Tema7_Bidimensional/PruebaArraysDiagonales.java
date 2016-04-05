/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7_Bidimensional;

/**
 *
 * @author angelo
 */
public class PruebaArraysDiagonales {
    public static void main(String[] args) {
        
        int tamañoArray=5;
        int[][] num = new int [tamañoArray][tamañoArray];
        int i,j;
        
        for( i=0;i<tamañoArray;i++){
            for(j=0;j<tamañoArray;j++){
                num[i][j]=(int)(Math.random()*9)+1;
            }
        }
        System.out.println("muestra el array");
        for( i=0;i<tamañoArray;i++){
            for(j=0;j<tamañoArray;j++){
                if((i==j)||((i+j)==tamañoArray-1)){
                    num[i][j]=0;
                    System.out.print(" "+num[i][j]+" ");
                }else{
                    System.out.print(" "+num[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
  
}
