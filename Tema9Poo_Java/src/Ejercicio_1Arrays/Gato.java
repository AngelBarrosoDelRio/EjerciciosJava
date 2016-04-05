/*
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno
de ellos mediante un bucle. Muestra a continuación los datos de todos los gatos utilizando
también un bucle.
 */
package Ejercicio_1Arrays;

/**
 *
 * @author angelo
 */
public class Gato {
   
    String raza;
    String nombre;
    
    
    public Gato(){
       
        
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
