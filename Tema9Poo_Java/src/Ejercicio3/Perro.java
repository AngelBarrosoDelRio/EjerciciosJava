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
public class Perro extends Mamifero {
    
    private String raza;
    private int peso;
    private String sexo;
    
    public Perro(String s) {
        super(s);
    }

    public Perro (String s,String t,String r,int p) {
	super(s,t);
        this.raza=r;
        this.peso=p;
        
    }
    
    public void corre(){
        System.out.println("Parece un galgo!!");
    }
    
    public void ladra(){
        System.out.println("guaauf guaauf.. rrgrrgrg");
    }
    
    
}
