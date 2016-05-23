/*
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejo-
ras:
• Utiliza una lista en lugar de un array para el almacenamiento de los datos.
• Comprueba la existencia del código en el alta, la baja y la modificación de artículos
para evitar errores.
• Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer
una venta de varios artículos y emitir la factura correspondiente. Se debe preguntar
por los códigos y las cantidades de cada artículo que se quiere comprar. Aplica un
21% de IVA.
 */
package Ex30abr4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class gestisimal {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int opcion,i,opcionSubMenu;
        String descripcionIntro,seguir="no";
        String tipoArticuloIntro;
        String tiposAux="";
        int precioBuyIntr,precioSaleIntro,codigoIntro,stock=0;
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        articulos.add(new Articulo(1, "Bolso Zara ","moda", 20, 40,1));
        articulos.add(new Articulo(2, "Zapatos Gris/az ","moda", 10, 50,2));
        articulos.add(new Articulo(3, "hamburguesa buey ","alimentacion", 5, 30,40));
        articulos.add(new Articulo(4, "coca cola ","alimentacion", 1, 4,1));
        articulos.add(new Articulo(5, "fregona ","limpieza", 1, 2,40));
        
        do {
            System.out.println("\n\nGESTISIMAL");
            System.out.println("===================");
            System.out.println("1. Listado ");
            System.out.println("2. Alta articulo");
            System.out.println("3. Modifica articulo");
            System.out.println("4. Baja articulo");
            System.out.println("5. Entrada de mercancia");
            System.out.println("6. Venta articulos");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(entrada.nextLine());
            System.out.println("");
            switch (opcion) {

                case 1:
                    if(articulos.isEmpty()){
                        System.out.println("No hay articulos introducidos aun, por favor vaya a la opcion dos e introduzca algun articulo");
                    }else{
                        do{
                            System.out.println("Listado de articulos");
                            System.out.println("====================");
                            System.out.println("1) completa ");
                            System.out.println("2) por tipo ");
                            System.out.println("3) salir al menu principal ");
                            System.out.print("opcion elegida: ");
                            opcionSubMenu=Integer.parseInt(entrada.nextLine());
                            switch(opcionSubMenu){
                                case 1:
                                    System.out.println("Listado completo");
                                    for (Articulo muestraArticulo : articulos) {

                                        System.out.println(muestraArticulo);

                                    } 
                                    break;
                                case 2:
                                    System.out.println("Listado por tipo");
                                    System.out.println("¿Que tipo desea obtener?");
                                    System.out.print("tipo: ");
                                    for (Articulo muestraArticulo : articulos) {
                                        String tiposObtenidos=muestraArticulo.getTipoProducto();
                                        if(!tiposObtenidos.equals(tiposAux)){
                                            System.out.print(tiposObtenidos+", ");
                                        }
                                        tiposAux=muestraArticulo.getTipoProducto();
                                        
                                    }
                                    System.out.println("ELige opcion: ");
                                    String opcionMenu=entrada.nextLine();
                                    for (Articulo muestraArticulo : articulos) {
                                        if(muestraArticulo.getTipoProducto().equals(opcionMenu)){
                                            System.out.println(muestraArticulo);
                                            System.out.println("");
                                        }

                                    }

                                    break;

                            }
                        }while(opcionSubMenu!=3);
                    
                    }
                    
                    break;
                 
                case 2:
                    System.out.println("Alta nuevo articulo");
                    System.out.println("===================");
                    System.out.println("");
                    seguir = "no";
                   

                    do {

                        System.out.println("codigo: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());

                        while (articulos.contains(new Articulo(codigoIntro,"","",0,0,0))) {
                            System.out.println("Ese código ya existe en la base de datos.");
                            System.out.print("Introduzca otro código: ");
                            codigoIntro = Integer.parseInt(entrada.nextLine());
                        }

                        System.out.print("Descripcion articulo: ");
                        descripcionIntro=entrada.nextLine();
                        System.out.println("");
                        System.out.print("Tipo articulo: ");
                        tipoArticuloIntro=entrada.nextLine();
                        System.out.println("");
                        System.out.print("Precio compra: ");
                        precioBuyIntr=Integer.parseInt(entrada.nextLine());
                        System.out.println("");
                        System.out.print("Precio venta: ");
                        precioBuyIntr=Integer.parseInt(entrada.nextLine());
                        System.out.println("");
                        System.out.print("stock: ");
                        stock=Integer.parseInt(entrada.nextLine());

                        articulos.add(new Articulo(codigoIntro, descripcionIntro,tipoArticuloIntro, precioBuyIntr, precioBuyIntr,stock));
                        System.out.println("¿Desea introducir otro disco? [si/no]");
                        seguir = entrada.nextLine();

                    } while (seguir.equals("si"));
                    
                    break;
                    
                case 3:
                    System.out.println("Modificar articulo");
                    System.out.println("===================");
                    System.out.println("");
                    
                    System.out.println("codigo: ");
                    codigoIntro = Integer.parseInt(entrada.nextLine());

                    while (!articulos.contains(new Articulo(codigoIntro,"","",0,0,0))) {
                        System.out.println("Ese código NO existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());
                    }
                    i = articulos.indexOf(new Articulo(codigoIntro,"","",0,0,0));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Codigo: " + articulos.get(i).getCodArticulo()+"\n");
                    System.out.print("Nuevo codigo: ");
                    //declaro este string para hacer la compraciones si esta o no vacio
                    String codigoIntrocadena = entrada.nextLine();
                    System.out.println("");

                    if (!codigoIntrocadena.equals("")) {

                        codigoIntro = Integer.parseInt(codigoIntrocadena);
                        articulos.get(i).setCodArticulo(codigoIntro);

                    }

                    System.out.println("Descripcion: " + articulos.get(i).getDescripcion()+"\n");
                    System.out.print("Nueva descripcion: ");
                    descripcionIntro = entrada.nextLine();

                    if (!descripcionIntro.equals("")) {

                        articulos.get(i).setDescripcion(descripcionIntro);

                    }
                    
                    System.out.println("Tipo articulo: " + articulos.get(i).getTipoProducto()+"\n");
                    System.out.print("Nuevo tipo: ");
                    tipoArticuloIntro = entrada.nextLine();

                    if (!tipoArticuloIntro.equals("")) {

                        articulos.get(i).setTipoProducto(tipoArticuloIntro);

                    }
                    
                    System.out.println("Precio compra: " + articulos.get(i).getPrecioCompra()+"\n");
                    System.out.print("Nuevo Precio compra: ");
                    String precioCompraCompara = entrada.nextLine();

                    if (!precioCompraCompara.equals("")) {
                        precioBuyIntr = Integer.parseInt(precioCompraCompara);
                        articulos.get(i).setPrecioCompra(precioBuyIntr);

                    }
                    System.out.println("Precio venta: " + articulos.get(i).getPrecioVenta()+"\n");
                    System.out.print("Nuevo Precio venta: ");
                    String precioVentaCompara = entrada.nextLine();

                    if (!precioVentaCompara.equals("")) {
                        precioSaleIntro = Integer.parseInt(precioVentaCompara);
                        articulos.get(i).setPrecioVenta(precioSaleIntro);

                    }
                    
                    System.out.println("Stock actual: " + articulos.get(i).getStock()+"\n");
                    System.out.print("Nuevo stock: ");
                    String stockcompara = entrada.nextLine();

                    if (!stockcompara.equals("")) {
                        stock = Integer.parseInt(stockcompara);
                        articulos.get(i).setStock(stock);

                    }

                    break;
                    
                case 4:

                    System.out.println("Borrar");
                    System.out.println("======");

                    System.out.println("introduzca el codigo del album que desea eliminar");
                    System.out.print("codigo album: ");
                    codigoIntro = Integer.parseInt(entrada.nextLine());

                    while (!articulos.contains(new Articulo(codigoIntro, "","", 0, 0,0))) {
                        System.out.println("Ese código NO existe en la base de datos.");
                        System.out.print("Introduzca un código correcto: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());
                    }

                    articulos.remove(articulos.indexOf(new Articulo(codigoIntro, "","", 0, 0,0)));
                    System.out.println("Articulo borrado.");
                    break;
                    
                case 5:
                    System.out.println("Entrada de stock");
                    System.out.println("=================");
                    System.out.println("");
                    
                    System.out.println("codigo: ");
                    codigoIntro = Integer.parseInt(entrada.nextLine());

                    while (!articulos.contains(new Articulo(codigoIntro,"","",0,0,0))) {
                        System.out.println("Ese código NO existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());
                    }
                    i = articulos.indexOf(new Articulo(codigoIntro,"","",0,0,0));
                    System.out.println("Stock actual: " + articulos.get(i).getStock()+"\n");
                    System.out.print("Añadir stock: ");
                    int stockSuma = Integer.parseInt(entrada.nextLine());
                    stock=articulos.get(i).getStock()+stockSuma;
                    articulos.get(i).setStock(stock);

                    break;
                    
                case 6:
                    System.out.println("Venta de stock");
                    System.out.println("=================");
                    System.out.println("");
                    HashMap<String, Integer> datosFactura = new HashMap<String, Integer>();
                    int sumaPrecios=0;
                    boolean salirNoProductos=false;
                    int articulosComprados=0;
                    do{
                        
                        System.out.println("codigo: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());

                        while (!articulos.contains(new Articulo(codigoIntro,"","",0,0,0))) {
                            System.out.println("Ese código NO existe en la base de datos.");
                            System.out.print("Introduzca otro código: ");
                            codigoIntro = Integer.parseInt(entrada.nextLine());
                        }
                    
                   
                    
                        i = articulos.indexOf(new Articulo(codigoIntro,"","",0,0,0));
                        
                        System.out.println("Stock actual: " + articulos.get(i).getStock()+"\n");
                        System.out.print("¿Cuantos articulos desea de este articulo? \n cantidad: ");
                        int stockResta = Integer.parseInt(entrada.nextLine());
                        if(articulos.get(i).getStock()<=0 ||articulos.get(i).getStock()<stockResta){
                            System.out.println("No quedan articulos en el stock de este articulo");
                            salirNoProductos=true;
                            System.out.print("¿desea comprar otro articulos diferente? [si/no]: ");
                            seguir=entrada.nextLine();
                            System.out.println(""); 
                        }else{
                            stock=articulos.get(i).getStock()-stockResta;
                            articulos.get(i).setStock(stock);
                            precioSaleIntro=articulos.get(i).getPrecioVenta();
                            sumaPrecios+=precioSaleIntro;
                            descripcionIntro= articulos.get(i).getDescripcion();
                            datosFactura.put(descripcionIntro,precioSaleIntro);
                            System.out.print("¿desea comprar mas articulos? [si/no]: ");
                            seguir=entrada.nextLine();
                            System.out.println(""); 
                            articulosComprados++;
                        }
                        
                        
                    }while (seguir.equals("si"));
                    
                    if(!salirNoProductos || articulosComprados>0){
                        System.out.println("Factura");
                        System.out.println("=======");
                        System.out.println("");
                        
                        for (Map.Entry pareja: datosFactura.entrySet()) {
                            System.out.println(pareja.getKey()+"........."+pareja.getValue());
                        }
                        double precioFinal=((sumaPrecios*21)/100)+sumaPrecios;
                        System.out.println("");
                        System.out.println("precio..........."+sumaPrecios);
                        System.out.println("IVA:..............21%");
                        System.out.println("TOTAL............"+precioFinal);
                    }
                    

                    break;
                default:
                    break;
                    
            }
        }while(opcion!=7); //cierre do while principal
        
    }
 
}
