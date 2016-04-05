/*
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita
saber el tamaño - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su
estado - pedida o servida. La clase debe almacenar información sobre el número total de
pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva, su
estado es “pedida”.
 */
package Ejercicio5;

/**
 *
 * @author angelo
 */
public class Pizza {
  
    private static int pizzasPedidasTotal=0;
    private static int pizzasServidasTotal=0;
    
    private String tamano;
    private String tipo;
    private boolean servida=false;
    
    public Pizza(String m,String t){ // m de medida, t de tipo
       this.tamano=m;
       this.tipo=t;
       pizzasPedidasTotal++;
    }
    
    public void sirve(){
        
        if(this.servida==true){
            System.out.println("Esta pizza ya esta servida...");
        }else{
            this.servida=true;
            System.out.println("Hay tiene su pizza "+ this.tipo+" buen provecho!!");
            pizzasServidasTotal++;
        }
    }
    
    public static int getPizzaPedidasTotal(){
        return Pizza.pizzasPedidasTotal;
    }
    
    public static int getPizzasServidasTotal(){
        return Pizza.pizzasServidasTotal;
    }
    
    public String toString() {
       return "pizza " + this.tipo + " " + this.tamano; 
    } 
    
}
