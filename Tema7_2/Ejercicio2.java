/*
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 */
package Tema7_2;

/**
 *
 * @author angelo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
     
        char [] numero= new char[10];
        numero[0]='a';
        numero[1]='x';
        numero[4]='@';
        numero[6]=' ';
        numero[7]='+';
        numero[8]='q';
        
        System.out.println("Array :");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<10;i++){
            
            System.out.print("| "+numero[i]+" |");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
    }
  
}
