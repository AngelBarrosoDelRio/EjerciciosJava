/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author angelo
 */
public class Moneda {
    
    private static String valoresMonedas[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private static String posiciones[] = {"cara", "cruz"};
    
    String valorMoneda,posicion;
    
    Moneda(){
        this.valorMoneda = valoresMonedas[(int)(Math.random()*8)];
        this.posicion = posiciones[(int)(Math.random()*2)];
        
    }
    
    public String getValorMoneda(){
        
        return this.valorMoneda;
        
    }
    public String getPosicion(){
       
        return this.posicion;
        
    }
    public String toString() {
        
         return this.valorMoneda + " - " + this.posicion;
         
    }
}
