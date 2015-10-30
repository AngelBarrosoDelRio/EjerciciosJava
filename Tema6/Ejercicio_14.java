/*
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
estás pensando es mayor o menor que el que te acaba de decir.
 */
package Tema6;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Piensa un numero he intentare adivinarlo");
        
        int oportunidades=5;
        boolean acertado=false;
        String respuesPregunta="";
        int piensaPrimerNumero=0;
        int menor=0;
        int mayor=100;
        
        do{
            
            
            
            System.out.println("mayor= "+mayor);
            System.out.println("menor= "+menor);
            System.out.println("oportunidades= "+oportunidades);
            
            if(oportunidades==5){
                piensaPrimerNumero=(int)(Math.random()*100);
                System.out.println("¿El numero que piensas es? : "+piensaPrimerNumero);
            }else {
               piensaPrimerNumero=(int)(Math.random()*(mayor-menor) + menor); // importante los parentesis.
               
               System.out.println("¿El numero que piensas es? : "+piensaPrimerNumero);
            }
            
            
            System.out.print("¿He acertado? : ");
            String miContestacion=entrada.next();
           
            switch (miContestacion) {
                case "si":
                    System.out.println("Soy un Hachaa!!");
                    acertado=true;
                    break;
                case "no":
                    System.out.print("Mierda me confundi, ¿El numero que piensas en mayor o menor? : ");
                    respuesPregunta=entrada.next();
                    acertado=false;
                    oportunidades--;
                    break;
            }        
            switch (respuesPregunta) {
                case "mayor":
                        
                    menor=piensaPrimerNumero+1;
                            
                        
                    break;
                case "menor":
                        
                    mayor=piensaPrimerNumero-1;
                    break;    
                        
                    
            }

            System.out.println("");
            
        }while((oportunidades>0)&&(acertado==false));
        
        if(oportunidades==0){
            
             System.out.println("Vaya no lo consegui acertar....me quedan "+oportunidades+" oportunidades.");
        
        }
    }
  
}
