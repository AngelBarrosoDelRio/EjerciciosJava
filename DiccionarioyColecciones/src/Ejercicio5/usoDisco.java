/*
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez una lista para
 almacenar la información sobre los discos en lugar de un array convencional. Comprobarás
 que el código se simplifica notablemente
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoDisco {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion, i;
        int codigoIntro;
        String nombreAutor, albumIntro;
        double duracionIntro;
        ArrayList<Disco> album = new ArrayList<Disco>();
        album.add(new Disco(1, "Wim Mertens", "Maximazing the Audience", 50));

        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado ");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(entrada.nextLine());
            System.out.println("");
            switch (opcion) {

                case 1:

                    int opcionListado;

                    do {

                        System.out.println("Listado");
                        System.out.println("=======");

                        System.out.print("¿Como desea ver el listado?\n"
                                + " 1) lista completa \n"
                                + " 2) por autor \n"
                                + " 3) duracion \n"
                                + " 4) menu principal \n"
                                + "opcion :");
                        opcionListado = Integer.parseInt(entrada.nextLine());
                        System.out.println("");

                        switch (opcionListado) {

                            case 1:
                                System.out.println("Listado completo");
                                System.out.println("================");
                                for (Disco d : album) {
                                    System.out.println(d);
                                }
                                break;
                            case 2:
                                System.out.println("Listado por autor");
                                System.out.println("=================");
                                for (Disco d : album) {
                                    System.out.println("codigo:" + d.getCodigoAlbum() + "nombre autor: " + d.getNombreAutor());
                                }

                                break;
                            case 3:
                                System.out.println("Listado por duracion");
                                System.out.println("====================");
                                for (Disco d : album) {
                                    System.out.println("codigo:" + d.getCodigoAlbum() + "duracion: " + d.getDuracionCancion());
                                }

                                break;

                        }//swicth opcion lista
                    } while (opcionListado != 4);
                    break;
                case 2:

                    System.out.println("añadir nuevo disco");
                    System.out.println("==================");
                    System.out.println("");
                    String seguir = "no";
                    int j = 0;

                    do {

                        System.out.println("codigo: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());

                        while (album.contains(new Disco(codigoIntro, "", "", 0))) {
                            System.out.println("Ese código ya existe en la base de datos.");
                            System.out.print("Introduzca otro código: ");
                            codigoIntro = Integer.parseInt(entrada.nextLine());
                        }

                        System.out.print("nombre del autor: ");
                        nombreAutor = entrada.nextLine();
                        System.out.println("");
                        System.out.print("nombre album: ");
                        albumIntro = entrada.nextLine();
                        System.out.println("");
                        System.out.print("duracion: ");
                        duracionIntro = Double.parseDouble(entrada.nextLine());
                        System.out.println("");

                        album.add(new Disco(codigoIntro, nombreAutor, albumIntro, duracionIntro));
                        System.out.println("¿Desea introducir otro disco? [si/no]");
                        seguir = entrada.nextLine();

                    } while (seguir.equals("si"));

                    break;
                case 3:

                    System.out.println("Modificar disco");
                    System.out.println("==================");
                    System.out.println("");

                    System.out.println("introduzca el codigo del album que desea modificar");
                    System.out.print("codigo album: ");
                    codigoIntro = Integer.parseInt(entrada.nextLine());

                    while (!album.contains(new Disco(codigoIntro, "", "", 0))) {
                        System.out.println("Ese código NO existe en la base de datos.");
                        System.out.print("Introduzca un código correcto: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());
                    }
                    i = album.indexOf(new Disco(codigoIntro, "", "", 0));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Codigo: " + album.get(i).getCodigoAlbum());
                    System.out.print("Nuevo codigo: ");
                    //declaro este string para hacer la compraciones si esta o no vacio
                    String codigoIntrocadena = entrada.nextLine();
                    System.out.println("");

                    if (!codigoIntrocadena.equals("")) {

                        codigoIntro = Integer.parseInt(codigoIntrocadena);
                        album.get(i).setCodigoAlbum(codigoIntro);

                    }

                    System.out.println("Nombre autor: " + album.get(i).getNombreAutor());
                    System.out.print("Nuevo nombre autor: ");
                    nombreAutor = entrada.nextLine();

                    if (!nombreAutor.equals("")) {

                        album.get(i).setNombreAutor(nombreAutor);

                    }

                    System.out.println("Nombre album: " + album.get(i).getNombreAlbum());
                    System.out.print("Nuevo nombre album: ");
                    albumIntro = entrada.nextLine();

                    if (!albumIntro.equals("")) {

                        album.get(i).setNombreAlbum(albumIntro);

                    }

                    System.out.println("Duracion: " + album.get(i).getDuracionCancion());
                    System.out.print("Nueva duracion: ");
                    String duracionIntrocadena = entrada.nextLine();

                    if (!duracionIntrocadena.equals("")) {

                        duracionIntro = Double.parseDouble(duracionIntrocadena);
                        album.get(i).setDuracionCancion(duracionIntro);

                    }

                    break;
                case 4:

                    System.out.println("Borrar");
                    System.out.println("======");

                    System.out.println("introduzca el codigo del album que desea eliminar");
                    System.out.print("codigo album: ");
                    codigoIntro = Integer.parseInt(entrada.nextLine());

                    while (!album.contains(new Disco(codigoIntro, "", "", 0))) {
                        System.out.println("Ese código NO existe en la base de datos.");
                        System.out.print("Introduzca un código correcto: ");
                        codigoIntro = Integer.parseInt(entrada.nextLine());
                    }

                    album.remove(album.indexOf(new Disco(codigoIntro, "", "", 0)));
                    System.out.println("Album borrado.");
                    break;

            }

        } while (opcion != 5);
    }

}
