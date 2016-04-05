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
public class PruebaAnimal {

    public static void main(String[] args) {

        Perro keny = new Perro("macho");
        Perro nala = new Perro("hembra", "terrestre", "yorkshire", 3);
        Canario picholo = new Canario();
        Canario pichi = new Canario("hembra");
        Pinguino pingu = new Pinguino("macho");
        Pinguino pingunia = new Pinguino("hembra");
        Delfin dolphyn = new Delfin("macho", "acuatico");
        Delfin fliper = new Delfin("hembra", "acuatico");

        System.out.println("Perros:");
        System.out.print("keny puedes amamantar al cachorrito?");
        keny.amamanta();
        System.out.println("");
        System.out.print("Nala puedes amamantar al cachorrito?");
        nala.amamanta();
        System.out.println("");
        System.out.println("Vamos a dar un paseo Keny y Nala.");
        keny.anda();
        nala.anda();
        System.out.println("");
        System.out.println("Pinguinos:");
        System.out.println("Pingu vuela");
        pingu.vuelta();
        System.out.println("");
        System.out.println("Pingu encuba");
        pingu.encuba();
        System.out.println("");
        System.out.println("pingunia encuba");
        pingunia.encuba();
        System.out.println("");
        System.out.println("Delfin:");
        System.out.println("fliper hace pirueta");
        fliper.piruetas();
        System.out.println("");
        System.out.println("fliper anda");
        fliper.anda();
        System.out.println("");
        System.out.println("fliper amamanta");
        fliper.amamanta();
        System.out.println("dolphyn hace pirueta");
        fliper.piruetas();
        System.out.println("");
        System.out.println("dolphyn anda");
        dolphyn.anda();
        System.out.println("");
        System.out.println("dolphyn amamanta");
        dolphyn.amamanta();
        System.out.println("");
        System.out.println("Canario: ");
        System.out.println("picholo vuela");
        picholo.vuelta();
        System.out.println("");
        System.out.println("picholo encuba");
        picholo.encuba();
        System.out.println("");
        System.out.println("pichi encuba");
        pichi.encuba();
        System.out.println("");
        System.out.println("DIME EL SEXO DE KENY: " + keny.getSexo());
        System.out.println("DIME EL SEXO DE NALA: " + nala.getSexo());
    }
}
