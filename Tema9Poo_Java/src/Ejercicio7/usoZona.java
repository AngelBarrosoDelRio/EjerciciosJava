/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoZona {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int ZonaElegida;
        int opcion;
        Zona principal = new Zona(1000);
        Zona compraVenta= new Zona(200);
        Zona vip = new Zona(25);
        do{
        System.out.println("Bienvenido a la tu tienda online ticket.com");
        System.out.println("Por favor elija una opcion: ");
        System.out.println("1-Numero de entradas libres por Zona");
        System.out.println("2-Comprar entrada");
        System.out.println("3-Salir");
        System.out.print("opcion: ");
        opcion=Integer.parseInt(entrada.nextLine());
            System.out.println("");
        
        switch(opcion){
            case 1:
                System.out.println("Zona principal: "+principal.getEntradasPorVender());
                System.out.println("Zona compra venta: "+compraVenta.getEntradasPorVender());
                System.out.println("Zona vips: "+vip.getEntradasPorVender());
                System.out.println("");
                break;
                
            case 2:
                System.out.println("¿En que zona desea las entradas? 1.principal 2.compra venta 3.vips");
                System.out.print("opcion: ");
                ZonaElegida=Integer.parseInt(entrada.nextLine());
                System.out.println("");
                System.out.print("¿Cuantas entradas quiere? ");
                int numEntradas= Integer.parseInt(entrada.nextLine());
                if(ZonaElegida==1){
                    principal.vender(numEntradas);
                }else if(ZonaElegida==2){
                    compraVenta.vender(numEntradas);
                }else if(ZonaElegida==3){
                    vip.vender(numEntradas);
                }
                System.out.println("");
                break;
            case 3:
                System.out.println("Gracias por cofiar en nosotros, vuelva pronto.");
                System.out.println("");
        }
        }while (opcion!=3);
    }
 
}
