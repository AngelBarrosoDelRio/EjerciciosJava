/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
A partir de la hora 41, se pagan a 16 euros la hora.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Buenos dias empleado, por favor introduce las horas"
                + " trabajadas esta semana y le dire que salario le corresponde.");
        
        System.out.print("Horas: ");
        int horas= entrada.nextInt();
        int sueldoBase=12;
        int sueldoExtra=16;
        int sueldoSemanal = 0;
        
        if(horas<=40){
           sueldoSemanal=sueldoBase*horas; 
        }else if(horas<40){
           sueldoSemanal=sueldoExtra*horas;  
        }
        System.out.println("Su sueldo esta semana es: "+ sueldoSemanal+" €");
    }
  
}
