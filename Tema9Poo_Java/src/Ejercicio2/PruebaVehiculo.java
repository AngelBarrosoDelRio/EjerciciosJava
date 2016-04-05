/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class PruebaVehiculo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Coche peugeot207 = new Coche("3713FKL", "PEUGEOT", "207", 5);
        Bicicleta monty = new Bicicleta("MONTY", "BMX", 21);
        int opcion = 0;
        int km;
        
        while (opcion != 9) {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Ver cuantos vehiculos se han creado");
            System.out.println("9. Salir");
            System.out.print("Elige una opción (1-9): ");

            opcion = Integer.parseInt(entrada.nextLine());

            System.out.println("");

            switch (opcion) {
                case 1:

                    System.out.print("¿Cuantos km desea andar con la bicicleta? : ");
                    km = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    monty.recorre(km);

                    break;
                case 2:

                    monty.caballito();

                    break;
                case 3:

                    System.out.print("¿Cuantos km desea andar con el coche? : ");
                    km = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    peugeot207.recorre(km);

                    break;
                case 4:

                    peugeot207.quemaRuedas();

                    break;
                case 5:

                    System.out.println("Ha recorrido " + monty.getkmRecorridos() + " km  con la bici");

                    break;
                case 6:

                    System.out.println("Ha recorrido " + peugeot207.getkmRecorridos() + " km  con el coche");

                    break;
                case 7:

                    System.out.println("Se han recorrido " + Vehiculo.getkmRecorridosTotales() + " km en total");

                    break;
                case 8:

                    System.out.println("Se han creado " + Vehiculo.getvehiculosCreados() + " vehiculos en totoal");

                    break;
            }
            System.out.println("");
        }

    }
}
