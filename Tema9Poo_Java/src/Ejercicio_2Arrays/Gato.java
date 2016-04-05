/*
 * Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan
directamente en el código de la forma gatito[2].setColor(“marrón”) o bien mediante
el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”, “macho”) .
Muestra a continuación los datos de todos los gatos utilizando un bucle.
 */
package Ejercicio_2Arrays;

/**
 *
 * @author angelo
 */
public class Gato {
   String raza;
    String nombre;
    
    
    public Gato(String no,String ra){
       this.nombre=no;
       this.raza=ra;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre=nombre;
        
    }
    public void setRaza(String raza){
        
        this.raza=raza;
        
    }
    
    public String toString(){
        return "nombre: "+this.nombre +"\n"+
               "raza: "+this.raza;
        
    }
}
 

