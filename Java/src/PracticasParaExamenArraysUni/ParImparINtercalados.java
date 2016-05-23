/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasParaExamenArraysUni;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class ParImparINtercalados {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int[] numero= new int[10];
        int[] numeroPar= new int[20];
        int[] numeroImpar= new int[20];
        int i;
        int cuentaPares=0,cuentaImpares=1;
        int paresIntro=0,imparesIntro=0;
        System.out.println("Introduzca 10 numeros enteros");
        for(i=0;i<10;i++){
            System.out.print("Numero "+i+": ");
            numero[i]=Integer.parseInt(entrada.next());
            System.out.println("");
        }
        
        //// ARRAY ORIGINAL
        
        System.out.println("ARRAY ORIGINAL:");
        System.out.print("Indice |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",numero[i]);
        }
        System.out.println("|");
        
        //COMPRUEBO LOS PARES E IMPARES Y LOS ALMACENO EN EN SU ARRAY RESPECTIVAMENTE
        
        for(i=0;i<10;i++){
            if(numero[i]%2==0){
               numeroPar[cuentaPares]=numero[i]; 
               cuentaPares+=2; // DE DOS EN DOS PARA QUE SE GUARDE EN PSICIONES PARES YA CUENTAPARES COMINEZA EN '0'
               paresIntro++;
            }else{
               numeroImpar[cuentaImpares]=numero[i]; 
               cuentaImpares+=2;// DE DOS EN DOS PARA QUE SE GUARDE EN POSICIONES IMPARES YA CUENTAIMPARES COMINEZA EN '1'
               imparesIntro++;
            }
        }
        
        // MUESTRA EL ARRAY MODIFICADO
        System.out.println("ARRAY MODIFICADO");
        System.out.print("Indice |");
        for(i=0;i<10;i++){
            System.out.printf("%2d |",i);
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Numero |");
        
        i=0;
        do{
            /// SI HAY TANTO NUMEROS PARES COMO IMPARES
            if((paresIntro>0)&&(imparesIntro>=1)){
                if((i%2==0)||(i==0)){
                    System.out.printf("%2d |",numeroPar[i]); 
                    paresIntro--;
                    i++;
                }else if((i%2!=0)||(i==1)){
                    System.out.printf("%2d |",numeroImpar[i]);
                    imparesIntro--;
                    i++;
                 }  
            }
            /// SI SOLO QUEDAN NUMEROS PARES Y NINGUNO IMPAR POR MOSTRAR.
            if((paresIntro>0)&&(imparesIntro<1)){
                
                if((i%2==0)||(i==0)){
                   
                   System.out.printf("%2d |",numeroPar[i]); 
                   
                }else{
                    
                   System.out.printf("%2d |",numeroPar[i+1]); 
                   i++;// INCREMENTO LA I TAMBIEN AQUI PARA COMPENSAR EL SALTO DEL INDICE Y EVITAR QUE SE REPITA EL NUMERO SIGUIENTE
                    
                }
                paresIntro--; 
                i++;
            }
            /// SI SOLO QUEDAN NUMEROS IMPARES Y NINGUNO PAR POR MOSTRAR
            if((paresIntro<=0)&&(imparesIntro>=1)){
                
                if((i%2!=0)||(i==1)){
                    
                   System.out.printf("%2d |",numeroImpar[i]);
                   
                }else{
                    
                   System.out.printf("%2d |",numeroImpar[i+1]);
                   i++;// INCREMENTO LA I TAMBIEN AQUI PARA COMPENSAR EL SALTO DEL INDICE Y EVITAR QUE SE REPITA EL NUMERO SIGUIENTE
                }
                imparesIntro--;
                i++;    
            }
            
        } while((paresIntro>0)||(imparesIntro>=1));
        
        System.out.println("|");
        
        
    }
  
}
