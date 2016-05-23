/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
     
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("A continuacion indiqueme el mes y dia de su "
                + " nacimiento para saber su horoscopo");
        
        System.out.print("MES: ");
        String mesIntro=entrada.nextLine();
        System.out.print("DIA: ");
        int diaIntro=entrada.nextInt();
        
        System.out.println("");
        
        switch(mesIntro) {
            case "enero":
                if((diaIntro>=1)&&(diaIntro<=19)){
                    
                    System.out.println("Usted es Capricornio");
                    
                }else if((diaIntro>19)&&(diaIntro<=31)){
                    
                    System.out.println("Usted es Acuario");
                }
            break;
            case "febrero":
                if((diaIntro>=1)&&(diaIntro<=18)){
                    
                    System.out.println("Usted es Acuario");
                    
                }else if((diaIntro>18)&&(diaIntro<=27)){
                    
                    System.out.println("Usted es Piscis");
                }
            break;
            case "Marzo":
                if((diaIntro>=1)&&(diaIntro<=20)){
                    
                    System.out.println("Usted es Piscis");
                    
                }else if((diaIntro>20)&&(diaIntro<=31)){
                    
                    System.out.println("Usted es Aries");
                }
            break;
            case "Abril":
                if((diaIntro>=1)&&(diaIntro<=20)){
                    
                    System.out.println("Usted es Aries");
                    
                }else if((diaIntro>20)&&(diaIntro<=30)){
                    
                    System.out.println("Usted es Tauro");
                }
            break;
            case "Mayo":
                if((diaIntro>=1)&&(diaIntro<=20)){
                    
                    System.out.println("Usted es Tauro");
                    
                }else if((diaIntro>20)&&(diaIntro<=31)){
                    
                    System.out.println("Usted es Geminis");
                }
            break;
            case "Junio":
                if((diaIntro>=1)&&(diaIntro<=20)){
                    
                    System.out.println("Usted es Geminis");
                    
                }else if((diaIntro>20)&&(diaIntro<=31)){
                    
                    System.out.println("Usted es Cancer");
                }
            break;
            case "Julio":
                if((diaIntro>=1)&&(diaIntro<=21)){
                    
                    System.out.println("Usted es Cancer");
                    
                }else if((diaIntro>21)&&(diaIntro<=31)){
                    
                    System.out.println("Usted es Leo");
                }
            break;
            case "Agosto":
                if((diaIntro>=1)&&(diaIntro<=21)){
                    
                   System.out.println("Usted es Leo");
                    
                }else if((diaIntro>21)&&(diaIntro<=27)){
                    
                   System.out.println("Usted es Virgo");
                }
            break;
            case "Septiembre":
                if((diaIntro>=1)&&(diaIntro<=22)){
                    
                    System.out.println("Usted es Virgo");
                    
                }else if((diaIntro>22)&&(diaIntro<=30)){
                    
                    System.out.println("Usted es Libra");
                }
            break;
            case "Octubre":
                if((diaIntro>=1)&&(diaIntro<=23)){
                    
                    System.out.println("Usted es Libra");
                    
                }else if((diaIntro>23)&&(diaIntro<=31)){
                    
                    System.out.println("Usted es Escorpio");
                }
            break;
            case "Noviembre":
                if((diaIntro>=1)&&(diaIntro<=22)){
                    
                    System.out.println("Usted es Escorpio");
                    
                }else if((diaIntro>22)&&(diaIntro<=27)){
                    
                    System.out.println("Usted es Sagitario");
                }
            break;
            case "diciembre":
                if((diaIntro>=1)&&(diaIntro<=20)){
                    
                    System.out.println("Usted es Sagitario");
                    
                }else if((diaIntro>20)&&(diaIntro<=27)){
                    
                    System.out.println("Usted es Piscis");
                }
            break;
        }
        
    }
   
}
