/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5Arrays;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class gestisimal {

    static int N = 100;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Articulo[] articulo = new Articulo[N];
        int i;
        int opcion;
        int articulosCreados = 0;
        int controlDeVolumenMercancias = N;
        boolean existeCodigo = true;
        int codigoArticulo, precioVenta, precioCompra, stock;
        String descripcion;

        for (i = 0; i < N; i++) {
            articulo[i] = new Articulo();
        }

        do {
            System.out.println("\n\nGESTISIMAL");
            System.out.println("===================");
            System.out.println("1. Listado ");
            System.out.println("2. Alta articulo");
            System.out.println("3. Baja articulo");
            System.out.println("4. Modificar articulo");
            System.out.println("5. Entrada de mercancia");
            System.out.println("6. Salida de mercancia");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(entrada.nextLine());
            System.out.println("");
            switch (opcion) {

                case 1:
                    if (articulosCreados > 0) {
                        int opcionMenuLIstado;
                        do {
                            System.out.println("\n\nMENU LISTADO");
                            System.out.println("====================");
                            System.out.println("1. Listado completo ");
                            System.out.println("2. Por precios");
                            System.out.println("3. Obtener stocks");
                            System.out.println("4. Salir");
                            System.out.println("");
                            System.out.print("Introduzca una opción: ");
                            opcionMenuLIstado = Integer.parseInt(entrada.nextLine());
                            System.out.println("");

                            switch (opcionMenuLIstado) {
                                case 1:
                                    System.out.println("Listado completo");
                                    System.out.println("----------------");
                                    for (i = 0; i < N; i++) {
                                        if (articulo[i].getCodArticulo() != -1) {
                                            System.out.println(articulo[i]);
                                            System.out.println("");
                                        }

                                    }

                                    break;
                                case 2:
                                    System.out.println("Listado por precios");
                                    System.out.println("--------------------");
                                    for (i = 0; i < N; i++) {
                                        if (articulo[i].getCodArticulo() != -1) {
                                            System.out.println("Codigo articulo: " + articulo[i].getCodArticulo() + "\n"
                                                    + "Precio de compra: " + articulo[i].getPrecioCompra() + "\n"
                                                    + "Precio de Venta: " + articulo[i].getPrecioVenta());
                                            System.out.println("");
                                        }

                                    }
                                    break;
                                case 3:
                                    System.out.println("Listado por stock");
                                    System.out.println("--------------------");
                                    for (i = 0; i < N; i++) {
                                        if (articulo[i].getCodArticulo() != -1) {
                                            System.out.println("Codigo articulo: " + articulo[i].getCodArticulo() + "\n"
                                                    + "Stock actual: " + articulo[i].getPrecioCompra() + "\n");
                                            System.out.println("");
                                        }

                                    }
                                    break;
                            }

                        } while (opcionMenuLIstado != 4);//while del do del case 1 del menu principal
                        //cierre del if(articulosCreados>0)
                    } else {
                        System.out.println("Aun no ha introducido ningun articulo");
                    }
                    break;

                case 2:
                    System.out.println("\n\nAlta Articulo");
                    System.out.println("====================");
                    String seguir = "no";
                    int j = 0;
                    do {
                        if (controlDeVolumenMercancias > 0) {

                            if (articulo[j].getCodArticulo() == -1) {
                                articulosCreados++;
                                controlDeVolumenMercancias--;

                                System.out.print("codigo Articulo: ");
                                existeCodigo = true;
                                while (existeCodigo) {

                                    existeCodigo = false;
                                    codigoArticulo = Integer.parseInt(entrada.nextLine());
                                    System.out.println("");
                                    for (i = 0; i < N; i++) {
                                        if (codigoArticulo == articulo[i].getCodArticulo()) {
                                            existeCodigo = true;
                                        }
                                    }
                                    if (existeCodigo) {
                                        System.out.println("EL codigo introducido ya existe.");
                                        System.out.print("Introduzca un codigo distinto: ");
                                    } else {
                                        articulo[articulosCreados].setCodArticulo(codigoArticulo);
                                    }

                                }

                                System.out.print("Descripcion: ");
                                descripcion = entrada.nextLine();
                                System.out.println("");
                                articulo[articulosCreados].setDescripcion(descripcion);

                                System.out.print("Precio compra: ");
                                precioCompra = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                articulo[articulosCreados].setPrecioCompra(precioCompra);

                                System.out.print("Precio venta: ");
                                precioVenta = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                articulo[articulosCreados].setPrecioVenta(precioVenta);

                                System.out.print("Stock inicial: ");
                                stock = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                articulo[articulosCreados].setStock(stock);

                                System.out.println("");
                                System.out.print("¿Desea introducir algun articulo mas?");
                                seguir = entrada.nextLine();

                            } else {

                                seguir = "si";
                            }
                        } else {
                            System.out.println("Lo siento pero la memoria esta llena, por favor"
                                    + " elimine algun articulo para poder introducir el nuevo");
                            seguir = "no";
                        }
                    } while (seguir.equals("si"));
                    break;

                case 3:
                    System.out.println("\n\nBORRAR");
                    System.out.println("==============");
                    System.out.println("");
                    System.out.print("Indique que articulo desea eliminar introduciendo su codigo: ");
                    codigoArticulo = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    for (i = 0; i < N; i++) {
                        if (codigoArticulo == articulo[i].getCodArticulo()) {
                            articulo[i].setCodArticulo(-1);
                            articulosCreados--;
                        }
                    }
                    System.out.println("articulo eliminado con exito");

                    break;

                case 4:

                    System.out.println("\n\nMODIFICAR ARTICULO");
                    System.out.println("==========================");
                    System.out.println("");

                    System.out.println("introduzca el codigo del articulo que desea modificar");
                    System.out.print("codigo articulo: ");
                    codigoArticulo = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    i = 0;
                    boolean modificado = false;
                    //for (i = 0; i < N; i++) {
                    do {
                        if (articulo[i].getCodArticulo() == codigoArticulo) {

                            System.out.println("Si desea mantener el codigo ya introducido \n"
                                    + "solo tienes k volver a meter el codigo original que era '" + codigoArticulo + "'.");
                            System.out.print("nuevo codigo articulo: ");
                            codigoArticulo = Integer.parseInt(entrada.nextLine());

                            if (codigoArticulo == articulo[i].getCodArticulo()) {
                                codigoArticulo = articulo[i].getCodArticulo();
                            }
                            articulo[i].setCodArticulo(codigoArticulo);

                            System.out.print("nueva descripcion: ");
                            descripcion = entrada.nextLine();
                            if (descripcion.equals("")) {
                                descripcion = articulo[i].getDescripcion();
                            }
                            articulo[i].setDescripcion(descripcion);

                            System.out.print("nuevo precio compra: ");
                            precioCompra = Integer.parseInt(entrada.nextLine());
                            articulo[i].setPrecioCompra(precioCompra);

                            System.out.print("nuevo precio venta: ");
                            precioVenta = Integer.parseInt(entrada.nextLine());
                            articulo[i].setPrecioVenta(precioVenta);

                            System.out.print("nuevo stock: ");
                            stock = Integer.parseInt(entrada.nextLine());
                            articulo[i].setStock(stock);

                            modificado = true;
                            //i = N;//para una vez encontrado el codigo del k keremos modificar salga del bucle
                        } else {
                            i++;
                        }

                    } while (modificado == false);

                    break;

                case 5:
                    System.out.println("\n\nANADIR STOCK");
                    System.out.println("=====================");
                    System.out.println("");
                    System.out.print("Indique a que articulo desea anadir stock mediante su codigo: ");
                    codigoArticulo = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    for (i = 0; i < N; i++) {
                        if (codigoArticulo == articulo[i].getCodArticulo()) {
                            System.out.print("Indique cantidad que quiere anadir: ");
                            int cantidadAnadida = Integer.parseInt(entrada.nextLine());
                            int sumale = articulo[i].getStock() + cantidadAnadida;
                            articulo[i].setStock(sumale);

                        }
                    }
                    System.out.println("Sotck modificado");
                    break;

                case 6:
                    System.out.println("\n\nELIMINAR STOCK");
                    System.out.println("=====================");
                    System.out.println("");
                    System.out.print("Indique a que articulo desea eliminar stock mediante su codigo: ");
                    codigoArticulo = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    for (i = 0; i < N; i++) {
                        if (codigoArticulo == articulo[i].getCodArticulo()) {
                            System.out.print("Indique cantidad que desea eliminar: ");
                            int cantidadReducida = Integer.parseInt(entrada.nextLine());
                            int restale = articulo[i].getStock() - cantidadReducida;
                            articulo[i].setStock(restale);

                        }
                    }
                    System.out.println("Sotck modificado");
                    break;

            }//cierre del switch opcion menu principal
        } while (opcion != 7);//salir del programa
    }
}
