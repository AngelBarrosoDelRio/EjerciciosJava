/*
 * Realiza el juego de las tres en raya.
 */
package Tema7_Bidimensional;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        String[][] tablero= new String[3][3];
        String jugador1="x";
        String jugador2="o";
        int filaJ1,columnaJ1,filaJ2,columnaJ2;
        int i,j;
        boolean jugador1Gana=false;
        boolean jugador2Gana=false;
        int intentos;
        String seguir;
        int continuar;
        do{
            
        
            //le doy el valor inicial al array de vacio.
            for(i=0; i<3; i++){
                for(j=0; j<3; j++){

                    tablero[i][j]=" ";
                }
            }
            //Menu de eleccion
            System.out.println("¡¡¡Bienvenidos al juego de tres en raya!!!");
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("|                 Menú                       |");
            System.out.println("---------------------------------------------");
            System.out.println("| A continuación debera elegir una de las    |");
            System.out.println("| dos opciones que se presentan seguidamente.|");
            System.out.println("---------------------------------------------");
            System.out.println("| 1- multijugador.(juega contra un amigo)    |");
            System.out.println("| 2- jugador vs computer                     |");
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.print(" opción: ");
            int opcion= Integer.parseInt(entrada.next());

            switch(opcion){

                case 1: //multijugador
                   
                
                    intentos=8;
                    System.out.println("");
                    // pinta el tablero vacio
                    for(i=0; i<3; i++){
                        for(j=0; j<3; j++){

                            System.out.printf("| "+tablero[i][j]+" |");

                        }
                        System.out.println("");
                        if(i<2){
                            System.out.println("----------------");
                        }
                    }
                    System.out.println("");

                    //JUEGO.
                    do{
                        System.out.println("Turno jugador 1.");
                        System.out.println("Intentos= "+intentos);
                        do{
                            System.out.print("selecion fila J1: ");
                            filaJ1=Integer.parseInt(entrada.next());
                            System.out.print("selecion columna J1: ");
                            columnaJ1=Integer.parseInt(entrada.next());
                            System.out.println("");
                            if(tablero[filaJ1][columnaJ1].equals(jugador2)){
                                    System.out.println("Esa posicion ya esta ocupada por el contrario, elija otra."); 
                                }
                        }while(tablero[filaJ1][columnaJ1].equals(jugador2));

                        for(i=0; i<3; i++){
                            for(j=0; j<3; j++){
                                if((i==filaJ1)&&(j==columnaJ1)){
                                    tablero[i][j]=jugador1;
                                }   


                            }
                        }
                        // comprobacion de si el jugador 1 gana.
                        if(((tablero[0][0]==jugador1)&&(tablero[0][1]==jugador1)&&(tablero[0][2]==jugador1))
                         ||((tablero[1][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[1][2]==jugador1))
                         ||((tablero[2][0]==jugador1)&&(tablero[2][1]==jugador1)&&(tablero[2][2]==jugador1))
                         ||((tablero[0][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][2]==jugador1))
                         ||((tablero[2][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[0][2]==jugador1))
                         ||((tablero[0][0]==jugador1)&&(tablero[1][0]==jugador1)&&(tablero[2][0]==jugador1))
                         ||((tablero[0][1]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][1]==jugador1))
                         ||((tablero[0][2]==jugador1)&&(tablero[1][2]==jugador1)&&(tablero[2][2]==jugador1))
                         ){

                            jugador1Gana=true;
                        
                        }else{
                            intentos--;
                            jugador1Gana=false;

                        }
                        // pinta el tablero con la posicion de Jugador1
                        for(i=0; i<3; i++){
                            for(j=0; j<3; j++){

                                System.out.printf("| "+tablero[i][j]+" |");

                            }
                            System.out.println("");
                            if(i<2){
                                System.out.println("----------------");
                            }
                        }
                        // Jugador 2
                        if(jugador1Gana==false){
                            System.out.println("Turno del jugador 2.");
                            System.out.println("Intentos= "+intentos);
                            do{
                                System.out.print("selecion fila J2: ");
                                filaJ2=Integer.parseInt(entrada.next());
                                System.out.print("selecion columna J2: ");
                                columnaJ2=Integer.parseInt(entrada.next());
                                System.out.println("");
                                if(tablero[filaJ2][columnaJ2].equals(jugador1)){
                                    System.out.println("Esa posicion ya esta ocupada por el contrario, elja otra."); 
                                }
                            }while(tablero[filaJ2][columnaJ2].equals(jugador1));

                            for(i=0; i<3; i++){
                                for(j=0; j<3; j++){
                                    if((i==filaJ2)&&(j==columnaJ2)){
                                        tablero[i][j]=jugador2;
                                    }

                                }
                            }
                            // comprobacion de si gana Jugador 2
                            if(((tablero[0][0]==jugador2)&&(tablero[0][1]==jugador2)&&(tablero[0][2]==jugador2))
                            ||((tablero[1][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[1][2]==jugador2))
                            ||((tablero[2][0]==jugador2)&&(tablero[2][1]==jugador2)&&(tablero[2][2]==jugador2))
                            ||((tablero[0][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][2]==jugador2))
                            ||((tablero[2][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[0][2]==jugador2))
                            ||((tablero[0][0]==jugador2)&&(tablero[1][0]==jugador2)&&(tablero[2][0]==jugador2))
                            ||((tablero[0][1]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][1]==jugador2))
                            ||((tablero[0][2]==jugador2)&&(tablero[1][2]==jugador2)&&(tablero[2][2]==jugador2))
                            ){

                                    jugador2Gana=true;
                            }else{
                                intentos--;
                                jugador2Gana=false;

                            }
                            // pinta posicion del jugador 2
                            for(i=0; i<3; i++){
                                for(j=0; j<3; j++){

                                    System.out.printf("| "+tablero[i][j]+" |");

                                }
                                System.out.println("");
                                if(i<2){
                                    System.out.println("----------------");
                                }
                            }
                        }

                    }while((jugador1Gana==false)&&(jugador2Gana==false)&&(intentos>0)); 

                    if(jugador1Gana==true){
                        System.out.println("Enhorabuena jugador 1!! eres el ganador!!, El jugador 2 no tenia nada que hacer contra ti... XD");
                    }
                    if(jugador2Gana==true){
                       System.out.println("Enhorabuena jugador 2!! eres el ganador!!, El jugador 1 no tenia nada que hacer contra ti... XD"); 
                    }
                    if((intentos>=0)&&(intentos<1)){
                        System.out.println("Esto huele a empate...");
                    }
                    break;
                        
                

                case 2:
                
                    intentos=8;
                    System.out.println("");
                    // pinta el tablero vacio
                    for(i=0; i<3; i++){
                        for(j=0; j<3; j++){

                            System.out.printf("| "+tablero[i][j]+" |");

                        }
                        System.out.println("");
                        if(i<2){
                            System.out.println("----------------");
                        }
                    }
                    System.out.println("");

                    //JUEGO.
                    do{
                        System.out.println("Turno jugador 1.");
                        System.out.println("Intentos= "+intentos);
                        do{
                            System.out.print("selecion fila J1: ");
                            filaJ1=Integer.parseInt(entrada.next());
                            System.out.print("selecion columna J1: ");
                            columnaJ1=Integer.parseInt(entrada.next());
                            System.out.println("");
                            if(tablero[filaJ1][columnaJ1].equals(jugador2)){
                                    System.out.println("Esa posicion ya esta ocupada por el contrario, elja otra."); 
                                }
                        }while(tablero[filaJ1][columnaJ1].equals(jugador2));

                        for(i=0; i<3; i++){
                            for(j=0; j<3; j++){
                                if((i==filaJ1)&&(j==columnaJ1)){
                                    tablero[i][j]=jugador1;
                                }   


                            }
                        }
                        // Comprueba si gana el jugador 1
                        if(((tablero[0][0]==jugador1)&&(tablero[0][1]==jugador1)&&(tablero[0][2]==jugador1))
                         ||((tablero[1][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[1][2]==jugador1))
                         ||((tablero[2][0]==jugador1)&&(tablero[2][1]==jugador1)&&(tablero[2][2]==jugador1))
                         ||((tablero[0][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][2]==jugador1))
                         ||((tablero[2][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[0][2]==jugador1))
                         ||((tablero[0][0]==jugador1)&&(tablero[1][0]==jugador1)&&(tablero[2][0]==jugador1))
                         ||((tablero[0][1]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][1]==jugador1))
                         ||((tablero[0][2]==jugador1)&&(tablero[1][2]==jugador1)&&(tablero[2][2]==jugador1))
                         ){

                            jugador1Gana=true;
                        }else{
                            intentos--;
                            jugador1Gana=false;

                        }

                        for(i=0; i<3; i++){
                            for(j=0; j<3; j++){

                                System.out.printf("| "+tablero[i][j]+" |");

                            }
                            System.out.println("");
                            if(i<2){
                                System.out.println("----------------");
                            }
                        }
                        // jugador Computer.
                        if(jugador1Gana==false){
                            System.out.println("Turno del jugador 2.");
                            System.out.println("Intentos= "+intentos);
                            do{

                                filaJ2=(int)(Math.random()*3);

                                columnaJ2=(int)(Math.random()*3);


                            }while((tablero[filaJ2][columnaJ2].equals(jugador1))||((tablero[filaJ2][columnaJ2].equals(jugador2))));

                            System.out.println("posicion computer: fila- "+filaJ2+" ; culumna- "+columnaJ2);
                            for(i=0; i<3; i++){
                                for(j=0; j<3; j++){
                                    if((i==filaJ2)&&(j==columnaJ2)){
                                        tablero[i][j]=jugador2;
                                    }

                                }
                            }
                            //compruebo si gana el Jugador computer
                            if(((tablero[0][0]==jugador2)&&(tablero[0][1]==jugador2)&&(tablero[0][2]==jugador2))
                            ||((tablero[1][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[1][2]==jugador2))
                            ||((tablero[2][0]==jugador2)&&(tablero[2][1]==jugador2)&&(tablero[2][2]==jugador2))
                            ||((tablero[0][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][2]==jugador2))
                            ||((tablero[2][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[0][2]==jugador2))
                            ||((tablero[0][0]==jugador2)&&(tablero[1][0]==jugador2)&&(tablero[2][0]==jugador2))
                            ||((tablero[0][1]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][1]==jugador2))
                            ||((tablero[0][2]==jugador2)&&(tablero[1][2]==jugador2)&&(tablero[2][2]==jugador2))
                            ){

                                    jugador2Gana=true;
                            }else{
                                intentos--;
                                jugador2Gana=false;

                            }
                            for(i=0; i<3; i++){
                                for(j=0; j<3; j++){

                                    System.out.printf("| "+tablero[i][j]+" |");

                                }
                                System.out.println("");
                                if(i<2){
                                    System.out.println("----------------");
                                }
                            }
                        }

                    }while((jugador1Gana==false)&&(jugador2Gana==false)&&(intentos>0)); 

                    if(jugador1Gana==true){
                        System.out.println("Enhorabuena jugador 1!! eres el ganador!!, El jugador 2 no tenia nada que hacer contra ti... XD");
                    }
                    if(jugador2Gana==true){
                       System.out.println("Enhorabuena jugador 2!! eres el ganador!!, El jugador 1 no tenia nada que hacer contra ti... XD"); 
                    }
                    if(intentos>=0){
                        System.out.println("Esto huele a empate...");
                    }
                
                    break;

            }// cierre del switch
            // pregunta para continuar jugando o para salir del programa
            System.out.println("Desea salir o ir al menu principal? 1)menu principal 2)salir : ");
            continuar=Integer.parseInt(entrada.next());
        }while (continuar==1);
        
        
    }
  
}

        
   
