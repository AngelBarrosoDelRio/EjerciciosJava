/*
 * Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo son
intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde
los parámetros que se le pasan al constructor son las horas, los minutos y los segundos
respectivamente. Crea el método toString para ver los intervalos de tiempo de la forma
10h 35m 5s . Si se suman por ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s .
Realiza un programa de prueba para comprobar que la clase funciona bien.
 */
package Ejercicio6;

/**
 *
 * @author angelo
 */
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;
    
   

    public Tiempo(int h, int m,int s){ // m de medida, t de tipo
       this.hora=h;
       this.minutos=m;
       this.segundos=s;
    }
    int getHora(){
		return this.hora;
    }
	
    int getMinutos(){
            return this.minutos;
    }
    int getSegundos(){
            return this.segundos;
    }
    
    public String toString(){
        return this.hora+"h "+this.minutos+"m "+this.segundos+"s";
    }
    
    public void sumaTiempo(Tiempo s){
        int segundosSumados=0;
        int minutosSumados=0;
        int horasSumadas=0;
        boolean mePase=false;//en caso k me pase de los miinutos o segundos
        boolean anadoDia=false;//encaso k me pase de las 24h
        
        if(this.segundos==0 && s.getSegundos()==0){
           segundosSumados=0; 
        }else if(this.segundos>=0 && s.getSegundos()>=0){
            segundosSumados=this.segundos+s.getSegundos();
            if(segundosSumados>60){
                mePase=true;
                segundosSumados=segundosSumados-60;
            }
        }
        
        if((this.minutos==0 && s.getMinutos()==0) && mePase==true){
            minutosSumados=1;
        }else if(this.minutos>=0 && s.getMinutos()>=0){
            if(mePase){
                minutosSumados=this.minutos+s.getMinutos()+1;
                if(minutosSumados>60){
                    minutosSumados=minutosSumados-60;
                    mePase=true;
                }else{
                    mePase=false;
                }
            }else{
               minutosSumados=this.minutos+s.getMinutos(); 
               if(minutosSumados>60){
                    minutosSumados=minutosSumados-60;
                    mePase=true;
                }else{
                    mePase=false;
                }
            }
            
        }
        
        if((this.hora==0 && s.getHora()==0)&& mePase==true){
            horasSumadas=1;
        }else if(this.hora>=0 && s.getHora()>=0){
            if(mePase){
                horasSumadas=this.hora+s.getHora()+1;
                if(horasSumadas>24){
                    horasSumadas=24;
                    anadoDia=true;
                }
            }else{
              horasSumadas=this.hora+s.getHora();
              if(horasSumadas>24){
                    horasSumadas=horasSumadas-24;
                    anadoDia=true;
                }
            }
            
        }
        if(anadoDia){
            System.out.println("EL resultado es: 1 dia "+horasSumadas+"h "+minutosSumados+"m "+segundosSumados+"s");
        }else{
            System.out.println("EL resultado es: "+horasSumadas+"h "+minutosSumados+"m "+segundosSumados+"s");
        }
        
    }//cierre de la funcion sumaTiempo
}
