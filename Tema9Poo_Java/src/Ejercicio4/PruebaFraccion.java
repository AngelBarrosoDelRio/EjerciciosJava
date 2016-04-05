/*
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los
métodos pueden ser invierte , simplifica , multiplica , divide , etc.
 */
package Ejercicio4;

/**
 *
 * @author angelo
 */
public class PruebaFraccion {
    public static void main(String[] args) {
        int n=24;
        int d=108;
        int n1=2;
        int d1=4;
        Fraccion invierte = new Fraccion(n, d);
        
        System.out.println("La fraccion original es: "+n+"/"+d);
        invierte.invierte(n, d);
        invierte.simplifica(n, d);
        invierte.multiplica(n, d,n1,d1);
        invierte.dividir(n, d,n1,d1);
    }
 
    
    
}
