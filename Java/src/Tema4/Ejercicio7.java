/*
 * 7ºRealiza un programa que calcule la media de tres notas.
   8ºAmplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
    notable o sobresaliente).
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Por favor, para obtener su nota necesito que "
                + "introduzca las notas obtenidas este curso. ");
        System.out.print("Nota 1: ");
        
        int nota1=Integer.parseInt(entrada.nextLine());
        
        System.out.print("Nota 2: ");
        
        int nota2=Integer.parseInt(entrada.nextLine());
        
        System.out.print("Nota 3: ");
        
        int nota3=Integer.parseInt(entrada.nextLine());
        System.out.println("");
        
        //PRIMERA ASIGANTURA
        if((nota1>=0)&&(nota1<5)){
            
            System.out.println("Programacion: Insuficiente");
        }
        if((nota1>=5)&&(nota1<6)){
            
            System.out.println("Programacion: Suficiente");
        }
        if((nota1>=6)&&(nota1<7)){
            
            System.out.println("Programacion: Bien");
        }
        if((nota1>=7)&&(nota1<9)){
            
            System.out.println("Programacion: Notable");
        }
        if((nota1>=9)&&(nota1<=10)){
            
            System.out.println("Programacion: Sobresaliente");
        }
        
        //SEGUNDA ASIGNATURA
        if((nota2>=0)&&(nota2<5)){
            
            System.out.println("BBDD: Insuficiente");
        }
        if((nota2>=5)&&(nota2<6)){
            
            System.out.println("BBDD: Suficiente");
        }
        if((nota2>=6)&&(nota2<7)){
            
            System.out.println("BBDD: Bien");
        }
        if((nota2>=7)&&(nota2<9)){
            
            System.out.println("BBDD: Notable");
        }
        if((nota2>=9)&&(nota2<=10)){
            
            System.out.println("BBDD: Sobresaliente");
        }
        
        //TERCERA ASIGNATURA
        
        if((nota3>=0)&&(nota3<5)){
            
            System.out.println("DWES: Insuficiente");
        }
        if((nota3>=5)&&(nota3<6)){
            
            System.out.println("DWES: Suficiente");
        }
        if((nota3>=6)&&(nota3<7)){
            
            System.out.println("DWES: Bien");
        }
        if((nota3>=7)&&(nota3<9)){
            
            System.out.println("DWES: Notable");
        }
        if((nota3>=9)&&(nota3<=10)){
            
            System.out.println("DWES: Sobresaliente");
        }
        
        System.out.println("");
        System.out.println("          BOLETIN DE NOTAS");
        System.out.println("-----------------------------");
        System.out.println("| Programacion     |   "+ nota1+"    |");
        System.out.println("| BBDD             |   "+ nota2+"    |");
        System.out.println("| DWES             |   "+ nota3+"    |");
        System.out.println("-----------------------------");
        System.out.println("| MEDIA:           |   "+(nota1+nota2+nota3)/3+"    |");
        System.out.println("-----------------------------");
        System.out.println("");
    }
   
}
