/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
continuación se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe pedir cuántos pasos se quieren rotar los números. Los números se rotarán en tantos
pasos como indique el usuario, hacia la IZQUIERDA. El elemento que sale por la derecha deberá entrar
por la izquierda tantas veces como sea necesario. Al final se debe mostrar el array resultante.
 */
package PracticasParaExamenArraysUni;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class RotarArrayXposicionesIzq {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        int[] numero= new int[10];
        int[] rotado= new int[15];
        int i;
        
        System.out.println("Introduzca 10 numeros enteros");
        for(i=0;i<10;i++){
            System.out.print("Numero "+i+": ");
            numero[i]=Integer.parseInt(entrada.next());
            rotado[i]=numero[i];
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
        
        // POSICION A ROTAR
        System.out.println("");
        System.out.print("¿Cuantas posiciones desea rotar el array hacia la izquierda?");
        int rotar=Integer.parseInt(entrada.next());
        
        // ROTO LA PRIMERA PARTE APARTIR DE LO QUE HEMOS DECIDIDO ROTAR
        int aux=rotar;
        for(i=0;i<(10-rotar);i++){
            
            numero[i]=rotado[aux];            
            aux++;
        }
        
        int aux2=0;
        for(i=(10-rotar);i<10;i++){
           
            numero[i]=rotado[aux2];           
            aux2++;
        }
        
        
        //// ARRAY MODIFICADO
        System.out.println("");
        System.out.println("ARRAY MODIFICADO:");
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
        
        
        /*
        for(i=rotar;i>=0;i--){
            
            numero[i]=rotado[i+rotar];
            System.out.print("numero "+i+": "+numero[i]);
            System.out.println("; rotado "+(i+rotar)+": "+rotado[i+rotar]);
            
        }
        
        // NUMAUX PARA TENER UN APOYO PARA OBTENER LOS ULTIMOS VALORES PISADOS
        int numAux=0;
        for(i=9;i>=rotar;i--){
            numero[i]=rotado[numAux];
            System.out.print("numero2 "+i+": "+numero[i]);
            System.out.println("; rotado2 "+(numAux)+": "+rotado[numAux]);
            numAux++;
        }
        int numAux2=9;
        for(i=9-rotar;i>=rotar;i--){
            numero[i]=rotado[numAux2];
            System.out.print("numero3 "+i+": "+numero[i]);
            System.out.println(" ; rotado3 "+(numAux2)+": "+rotado[numAux2]);
            numAux2--;
        }
        
        //// ARRAY MODIFICADO
        System.out.println("");
        System.out.println("ARRAY MODIFICADO:");
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
        */
    }
  
}
