/*
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el control
de los artículos de un almacén. De cada artículo se debe saber el código, la descripción, el
precio de compra, el precio de venta y el stock (número de unidades). El menú del programa
debe tener, al menos, las siguientes opciones:
 */
package Ejercicio_13;

/**
 *
 * @author angelo
 */
public class Articulo {
    
    int codArticulo;
    String descripcion;
    int precioCompra;
    int precioVenta;
    int stock;
    //constructor
    public Articulo(int c,String d,int pc,int pv,int s){
        
        this.codArticulo=c;
        this.descripcion=d;
        this.precioCompra=pc;
        this.precioVenta=pv;
        this.stock=s;
    }
    //metodos getter
    public int getCodArticulo (){
        return codArticulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getPrecioCompra(){
        return precioCompra;
    }
    public int getPrecioVenta(){
        return precioVenta;
    }
    public int getStock(){
        return stock;
    }
    //metodos setter
    public void setCodArticulo(int cod){
        this.codArticulo=cod;
    }
    public void setDescripcion(String des){
        this.descripcion=des;
    }
    public void setPrecioCompra(int precCom){
        this.precioCompra=precCom;
    }
    public void setPrecioVenta(int precVen){
        this.precioVenta=precVen;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    
    @Override
    public String toString(){
        return "Codigo Articulo: "+this.codArticulo+"\n"+
               "Descripcion: "+this.descripcion+"\n"+
               "Precio Compra: "+this.precioCompra+"\n"+
               "Precio Venta: "+this.precioVenta+"\n"+
               "Stock: "+this.stock;
                
    }
    //metodo importantisimo para poder hacer la compracion y comprobar que no
    //se repite ningun codigo a la hora d introducir un nuevo articulo
    @Override
    public boolean equals(Object d) {
       
        return (this.codArticulo == ((Articulo) d).getCodArticulo());
          
  
        
    }
    
    
    
}
