/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author angelo
 */
public class Disco {
    
    int codigoAlbum;
    String nombreAutor="libre";
    String nombreAlbum;
    //String nombreCancion;
    double duracionCancion;
    
    
    public Disco(int c,String n,String na,double d){
        this.codigoAlbum=c;
        this.nombreAutor=n;
        this.nombreAlbum=na;
        this.duracionCancion=d;
        
    }
    
    public String toString(){
        return "codigo album: "+this.codigoAlbum +"\n"+
               "nombre autor: "+this.nombreAutor +"\n"+
               "nombre album: "+this.nombreAlbum+"\n"+
               "duracion: "+this.duracionCancion;
    }
    /*
    public String getNombreCancion(){
        return nombreCancion;
    }
    */
    //metodos getter
    public int getCodigoAlbum(){
        return codigoAlbum;
    }
    public String getNombreAutor(){
        return nombreAutor;
    }
    public String getNombreAlbum(){
        return nombreAlbum;
    }
    public double getDuracionCancion(){
        return duracionCancion;
    }
    
    //metodos setter
    public void setCodigoAlbum(int cod){
        this.codigoAlbum=cod;
    }
    public void setNombreAutor(String nom){
        this.nombreAutor=nom;
    }
    public void setNombreAlbum(String nom){
        this.nombreAlbum=nom;
    }
    /*
    public void setNombreCancion(String nom){
        this.nombreCancion=nom;
    }
    */
    public void setDuracionCancion(double du){
        this.duracionCancion=du;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object d) {
       
        return (this.codigoAlbum == ((Disco) d).getCodigoAlbum());
          
  
        
    }

   

   
    
    
   
    
}
