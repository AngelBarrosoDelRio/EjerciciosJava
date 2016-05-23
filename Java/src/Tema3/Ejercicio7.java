/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Bienvenido empleado, por favor indiqueme las horas trabajadas esta semana para confirmar su salario.");
        
        System.out.print("HORAS ESTA SEMANA: ");
        int horas= entrada.nextInt();
        
        System.out.println("");
        System.out.println("Su salario semanal esta semana es: "+horas*12+" €");
    }
  
}
