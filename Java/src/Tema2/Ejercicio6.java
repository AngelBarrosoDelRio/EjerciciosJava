/*
 * Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
sin IVA). La base imponible estará almacenada en una variable.
 */
package Tema2;

/**
 *
 * @author angelo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
     
        int iva=21;
        
        int precio1=120;
        int precio2=20;
        int precio3=300;
        
        System.out.println("              Factura");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("1. Tenis de futbol............"+precio1+" €");
        System.out.println("2. Calcetas deptor............"+precio2+" €");
        System.out.println("3. Mesa de pin pon............"+precio3+" €");
        System.out.println("");
        
        int suma=precio1+precio2+precio3;
        
        System.out.println("                       precio "+suma+" €");
        System.out.println("                       IVA    "+iva+"%");
        System.out.println("                 precio final "+ (suma*iva)/100+" €");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("  GRACIAS POR CONFIAR EN DECATHLON");
        System.out.println("        VUELVA PRONTO");
    }
  
}
