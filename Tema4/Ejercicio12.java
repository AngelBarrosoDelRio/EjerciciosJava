/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class Ejercicio12 {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner (System.in);
        
        int puntos=0;
        
        System.out.println("Vamos a poner a prueba tus conocimietos de "
                + " programacion");
        
        System.out.println("¿Que es Java?: a) Lenguaje b) programa c) Sist.operativo ");
        System.out.print("Respuesta: ");
        String pregunta1=entrada.nextLine();
        String respuestaValida1="a";
        System.out.println("");
        
        System.out.println("¿Donde programamos en Java?: a)MySql b)Netbeans c)Notepad ");
        System.out.print("Respuesta: ");
        String pregunta2=entrada.nextLine();
        String respuestaValida2="b";
        System.out.println("");
        
        System.out.println("¿Como se inicializa una variable entera?: a) String b) int c) long");
        System.out.print("Respuesta: ");
        String pregunta3=entrada.nextLine();
        String respuestaValida3="b";
        System.out.println("");
        
        System.out.println("¿Para que usamos los String?: a) numeros b) caracteres c) palabras ");
        System.out.print("Respuesta: ");
        String pregunta4=entrada.nextLine();
        String respuestaValida4="c ";
        System.out.println("");
        
        System.out.println("¿Como se pone una condicion?: a)for b) if c) array");
        System.out.print("Respuesta: ");
        String pregunta5=entrada.nextLine();
        String respuestaValida5="b";
        System.out.println("");
        
        System.out.println("¿Para que se usa el switch?: a) condicion b) bucle c) arrays ");
        System.out.print("Respuesta: ");
        String pregunta6=entrada.nextLine();
        String respuestaValida6="a";
        System.out.println("");
        
        if(pregunta1.equals(respuestaValida1)){
            
            puntos+=3;
        }
        if(pregunta2.equals(respuestaValida2)){
            
            puntos+=3;
        }
        if(pregunta3.equals(respuestaValida3)){
            
            puntos+=3;
        }
        if(pregunta4.equals(respuestaValida4)){
            
            puntos+=3;
        }
        if(pregunta5.equals(respuestaValida5)){
            
            puntos+=3;
        }
        if(pregunta6.equals(respuestaValida6)){
            
            puntos+=3;
        }
           
        System.out.println("Ha obtenido "+ puntos+" puntos.");
        
    }
   
}
