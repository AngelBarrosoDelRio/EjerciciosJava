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
public class funcionesExamen {

    /**
     * **********************************************************
     */
    /*                                                           */
    /* rotaNumeroDerecha(long x, int veces)                      */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*  Esta función rota hacia la derecha las cifras 
     de un número. Lógicamente, las cifras que salen por la
     derecha entran por la izquierda.                         */
    /*                                                           */
    /**
     * **********************************************************
     */
    public static long rotaNumeroDerecha(long x, int veces) {
        int interaccion = 0;
        long numero = 0;
        long numeroExtraido = 0;
        long copiaX = x;
        do {
            if (interaccion == 0) {

                numero = x % 10;
                copiaX = x / 10;

                numeroExtraido = (Matematicas.Variadas.voltea(copiaX) * 10) + numero;
                numeroExtraido = Matematicas.Variadas.voltea(numeroExtraido);
                interaccion++;

            }
            if (interaccion > 0) {
                
                numero = numeroExtraido % 10;
                copiaX = numeroExtraido / 10;

                numeroExtraido = (Matematicas.Variadas.voltea(copiaX) * 10) + numero;
                numeroExtraido = Matematicas.Variadas.voltea(numeroExtraido);
                interaccion++;
            }

        } while (interaccion < veces);

        return numeroExtraido;
    }
    
    /**
     * **********************************************************
     */
    /*                                                           */
    /* moda(int x[])                      */
    /*                                                           */
    /*                                                           */
    /**
     * **********************************************************
     */
    /*                                                           */
    /*  Crea la función de manejo de arrays que tenga la 
        siguiente cabecera y que haga lo que se especifica  
        en los comentarios (puedes incluirla en tu propia biblioteca 
        de rutinas):
        
        Devuelve un array con dos elementos. El primer elemento indica el número de
//      moda, es decir, el número que más se repite. El segundo elemento indica la
//      frecuencia, o sea, el número de veces que aparece el número de moda en
//      el array.
    /*                                                           */
    /**
     * **********************************************************
     */
    
    public static int[] moda(int x[]){
        
        int mayor=0;
        int i,j;
        int [] repite= new int[5];
        int [] devuelve= new int[2];
        
        for(i=0;i<5;i++){
            repite[i]=1;
            for(j=0;j<5;j++){
                
                if((x[i]==x[j]) && (i!=j)){
                    repite[i]++;
                }  
            }
        }
        for(i=0;i<5;i++){
            if(repite[i]>mayor){
                mayor=repite[i];
            }
        }
        
        for(i=0;i<5;i++){
            if(repite[i]==mayor){
               devuelve[0]=x[i];
               devuelve[1]=repite[i]; 
               
            }
        }
        return devuelve;
    }
    
   
}
