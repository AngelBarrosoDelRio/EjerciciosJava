/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author angelo
 */
public abstract class Vehiculo {

    private static int vehiculosCreados = 0;
    private static int kmRecorridosTotales = 0;

    private int kmRecorridos;

    //construct
    public Vehiculo() {
        vehiculosCreados++;
        this.kmRecorridos = 0;
    }

    //setter
    public void recorre(int km) {
        this.kmRecorridos += km;
        Vehiculo.kmRecorridosTotales += km;
    }

    // geters
    public int getkmRecorridos() {
        return kmRecorridos;
    }

    public static int getkmRecorridosTotales() {
        return Vehiculo.kmRecorridosTotales;
    }

    public static int getvehiculosCreados() {
        return Vehiculo.vehiculosCreados;
    }

}
