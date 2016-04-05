/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3Arrays;

/**
 *
 * @author angelo
 */
public class Disco {
    
    String nombreAutor="libre";
    String nombreAlbum;
    String nombreCancion;
    double duracionCancion;
    
    
    public Disco(){
        super();
        
    }
    
    public String toString(){
        return "nombre cancion: "+this.nombreCancion +"\n"+
               "nombre autor: "+this.nombreAutor +"\n"+
               "nombre album: "+this.nombreAlbum+"\n"+
               "duracion: "+this.duracionCancion;
    }
    
    public String getNombreCancion(){
        return nombreCancion;
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
    public void setNombreAutor(String nom){
        this.nombreAutor=nom;
    }
    public void setNombreAlbum(String nom){
        this.nombreAlbum=nom;
    }
    public void setNombreCancion(String nom){
        this.nombreCancion=nom;
    }
    public void setDuracionCancion(double du){
        this.duracionCancion=du;
    }
    
}
