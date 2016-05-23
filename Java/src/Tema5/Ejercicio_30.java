/*
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de
la semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se
puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se
debe comprobar que el usuario introduce los datos correctamente y que el segundo día es
posterior al primero. A continuación se muestra un ejemplo:

                        Por favor, introduzca la primera hora.
                        Día: lunes
                        Hora: 18
                        Por favor, introduzca la segunda hora.
                        Día: martes
                        Hora: 20
                        Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio_30 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        int horasDIa=0;
        String dia1="";
        String dia2="";
        int primerDia;
        int segundoDia;
        int segundaHora;
        int primeraHora;
        
        do{
            
        
            System.out.println("Por favor, introduzca la primera hora.");

            System.out.print("Dia: ");
            primerDia=Integer.parseInt(entrada.next());

            System.out.print("Hora: ");
            primeraHora=Integer.parseInt(entrada.next());

            System.out.println("");

            System.out.println("Por favor, introduzca la segunda hora.");

            System.out.print("Dia: ");
            segundoDia=Integer.parseInt(entrada.next());

            System.out.print("Hora: ");
            segundaHora=Integer.parseInt(entrada.next());

            if(segundoDia<primerDia){
                
                System.out.println("El primer dia debe ser menor que el segundo dia introducido.");
                
            }
        
        }while(segundoDia<primerDia);
        
        for(int i=primerDia;i<segundoDia;i++){
            horasDIa+=24;
        }
        
        int resultado=(horasDIa-primeraHora)+segundaHora;
        
        switch(primerDia){
            case 1:
                
                dia1="lunes";
                
            break;
            case 2:
                
                dia1="martes";
                
            break;
            case 3:
                
                dia1="miercoles";
                
            break;
            case 4:
                
                dia1="jueves";
                
            break;
            case 5:
                
                dia1="viernes";
                
            break;
        }
        
        switch(segundoDia){
            case 1:
                
                dia2="lunes";
                
            break;
            case 2:
                
                dia2="martes";
                
            break;
            case 3:
                
                dia2="miercoles";
                
            break;
            case 4:
                
                dia2="jueves";
                
            break;
            case 5:
                
                dia2="viernes";
                
            break;
        }
        
        System.out.println("Entre las "+primeraHora+":00 del "+dia1+" y las "+segundaHora+":00 del "+dia2+" hay "+resultado+" horas");
        
    }
  
}
