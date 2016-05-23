/*
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón
 siguiendo la siguiente pauta: o bien coincide el valor con la moneda anteriormente generada
 - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros
 - o bien coincide la posición – cara o cruz. Simula, mediante un programa, la generación
 de 6 monedas aleatorias siguiendo la pauta correcta. Cada moneda generada debe ser una
 instancia de la clase Moneda y la secuencia se debe ir almacenando en una lista.
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class euroCoin {

    public static void main(String[] args) {

        Scanner entrada= new Scanner (System.in);
        ArrayList<Moneda> m = new ArrayList<Moneda>();//creo el arrayList de la clase Moneda

        Moneda monedaAux = new Moneda();//genera aleatoriamente los valores a coger por primera vez
        m.add(monedaAux);// lo añado al arrayList y este m.add(monedaAux) sera la refencia para despues hacer las comparaciones

        //recoge lo valores de la clase
        String ultimaPosicion = monedaAux.getPosicion();// cara o cruz
        String ultimaValor = monedaAux.getValorMoneda();// 1centimo,2 centimos...
        
        //pregunto cuantas veces va a pulsar el boton
        System.out.print("¿Cuantas monedas desea que salgan con este metodo? \n");
        int interacciones=Integer.parseInt(entrada.nextLine());
        System.out.print("");
        
        //comparo k se cumpla las restrinciones
        for (int i = 0; i < interacciones; i++) {
            do {
                
                monedaAux = new Moneda();
                
            } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getValorMoneda()).equals(ultimaValor)));
            
            //cuando salga del while añado esa nueva moneda
            m.add(monedaAux);
            //recojo los nuevos valores
            ultimaPosicion = monedaAux.getPosicion();
            ultimaValor = monedaAux.getValorMoneda();
        }
        
        //muestro el resultado
        for (Moneda mo : m) {
            
            System.out.println(mo);
            
        }

    }

}
