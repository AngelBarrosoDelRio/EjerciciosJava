/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author angelo
 */
public class Mamifero extends Animal {
   
    private String tipoMamifero;// si es acuatico o terrestre
    
    public Mamifero(String s) {

        super(s);
        this.tipoMamifero="terrestre";
    }

    public Mamifero(String s,String t) {

        super(s);
        this.tipoMamifero=t;
    }
    
    public Mamifero(){
        super();
    }
    
  

    public void amamanta() {
        if ("macho".equals(this.getSexo())) {
            System.out.println("Soy un macho no puedo amamantar al cachorro");
        } else {
            System.out.println("Toma pequeño bebe leche y hazte grande");
        }
    }
    
    public void anda(){
        if("terrestre".equals(this.tipoMamifero)){
            System.out.println("Me voy a dar un paseo, que estoy aburrido a ver que pillo...");
        }else if("acuatico".equals(this.tipoMamifero)){
            System.out.println("Uff como quieres que ande si no tengo piernas, querras decir que me vaya a nadar...");
        }
    }

}
