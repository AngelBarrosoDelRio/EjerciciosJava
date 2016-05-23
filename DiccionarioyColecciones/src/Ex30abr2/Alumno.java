/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex30abr2;

/**
 *
 * @author angelo
 */
public class Alumno implements Comparable<Alumno> {
    private static int numeroAltas=0;
    private static int numMatriculas=0;
    
    String nombreAlumno;
    String apellidoAlumno;
    String curso;
    boolean matriculado;
    
    Alumno (String n,String a){
        this.nombreAlumno=n;
        this.apellidoAlumno=a;
        Alumno.numeroAltas++;
        this.matriculado=false;
        
    }
    
    public String getNombreAlumno() {
        return this.nombreAlumno;
    }
    public String getApellidoAlumno() {
        return this.apellidoAlumno;
    }
    public void matricula(String m){
        this.curso=m;
        this.matriculado=true;
        Alumno.numMatriculas++;
        
    }
    public String toString() {
        if(this.matriculado){
           return  this.apellidoAlumno+ ", " + this.nombreAlumno+" - "+this.curso+" (matriculado)"; 
        }else{
           return this.apellidoAlumno + ", " + this.nombreAlumno+ "-(no matriculado)"; 
 
        }
        
    }
    public static int getAlumnosTotales() {
        return Alumno.numeroAltas;
    }
    public static int getAlumnosMatriculados() {
        return Alumno.numMatriculas;
    }
    
    @Override
    public int compareTo(Alumno g) {
        //return (this.numCartaObtenida).compareTo(g.getNumCartaObtenida()) ;
        
        
        Alumno c = (Alumno) g;
        if(this.apellidoAlumno.equals(c.getApellidoAlumno())){
            return nombreAlumno.compareTo(c.getNombreAlumno());
        }else{
           return this.apellidoAlumno.compareTo(c.getApellidoAlumno()) ; 
        }
        
    }
}
