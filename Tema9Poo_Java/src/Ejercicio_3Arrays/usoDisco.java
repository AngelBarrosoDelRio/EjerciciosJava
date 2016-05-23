/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3Arrays;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoDisco {

    static int N = 100;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Disco[] album = new Disco[N];
        int opcion, i, codigoAlbum;
        String nombreAutor, nombreAlbum;
        double duracionCancion;
        int cacnionesIntroducidas = N;
        int cuentaCanciones = 0;
        boolean existeCodigo = true;

        for (i = 0; i < N; i++) {
            album[i] = new Disco();
        }

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

            switch (opcion) {

                case 1:
                    
                    int opcionListado;
                    
                    //para k permanezca en listado y probar todas sin 
                    //tener k salir al menu principal 
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
                                if (cuentaCanciones == 0) {
                                    System.out.println("no hay ningun album introducido");
                                } else {
                                    System.out.println("listado completo");
                                    System.out.println("================");
                                    for (i = 0; i < N; i++) {

                                        if (!album[i].getNombreAutor().equals("libre")) {
                                            System.out.println(album[i]);
                                            System.out.println("");
                                        }

                                    }
                                }
                                break;
                            case 2:
                                if (cuentaCanciones == 0) {
                                    System.out.println("no hay ningun album introducido");
                                } else {
                                    System.out.println("listado por autor");
                                    System.out.print("¿Que autor desea mostrar? : ");
                                    nombreAutor = entrada.nextLine();
                                    for (i = 0; i < N; i++) {

                                        if (album[i].getNombreAutor().equals(nombreAutor)) {
                                            System.out.println("Nombre Autor: " + nombreAutor + "\n "
                                                    + "Nombre Album: " + album[i].getNombreAlbum());

                                        }

                                    }
                                }

                                break;
                            case 3:
                                if (cuentaCanciones == 0) {
                                    System.out.println("no hay ningun album introducido");
                                } else {
                                    System.out.println("listado por Duracion");
                                    System.out.println("¿La duracion que desea estara comprendida entre?");
                                    System.out.print("minima duracion: ");
                                    double duracionMinima = Double.parseDouble(entrada.nextLine());
                                    System.out.print("maxima duracion: ");
                                    double duracionMaxima = Double.parseDouble(entrada.nextLine());

                                    for (i = 0; i < N; i++) {
                                        if (album[i].getDuracionCancion() >= duracionMinima && album[i].getDuracionCancion() <= duracionMaxima) {
                                            System.out.println("Nombre Album: " + album[i].getNombreAlbum() + "\n"
                                                    + "Nombre Autor: " + album[i].getNombreAutor() + "\n"
                                                    + "Duracion : " + album[i].getDuracionCancion());
                                            System.out.println("");
                                        }
                                    }

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
                        if (cacnionesIntroducidas > 0) {

                            if (album[j].getNombreAutor().equals("libre")) {
                                cuentaCanciones++;
                                cacnionesIntroducidas--;

                                System.out.print("codigo album: ");
                                existeCodigo = true;
                                while (existeCodigo) {

                                    existeCodigo = false;
                                    codigoAlbum = Integer.parseInt(entrada.nextLine());
                                    System.out.println("");
                                    for (i = 0; i < N; i++) {
                                        if (codigoAlbum == album[i].getCodigoAlbum()) {
                                            existeCodigo = true;
                                        }
                                    }
                                    if (existeCodigo) {
                                        System.out.println("EL codigo introducido ya existe.");
                                        System.out.print("Introduzca un codigo distinto: ");
                                    } else {
                                        album[cuentaCanciones].setCodigoAlbum(codigoAlbum);
                                    }

                                }

                                System.out.print("nombre del autor: ");
                                nombreAutor = entrada.nextLine();
                                System.out.println("");
                                album[cuentaCanciones].setNombreAutor(nombreAutor);

                                System.out.print("nombre del album: ");
                                nombreAlbum = entrada.nextLine();
                                System.out.println("");
                                album[cuentaCanciones].setNombreAlbum(nombreAlbum);

                                System.out.print("duracion: ");
                                duracionCancion = Double.parseDouble(entrada.nextLine());
                                System.out.println("");
                                album[cuentaCanciones].setDuracionCancion(duracionCancion);

                                System.out.println("");
                                System.out.print("¿Desea introducir algun disco mas?");
                                seguir = entrada.nextLine();

                            } else {

                                seguir = "si";
                            }
                        } else {
                            System.out.println("Lo siento pero la memoria esta llena, por favor"
                                    + " elimine algun disco para poder introducir el nuevo");
                            seguir = "no";
                        }
                    } while (seguir.equals("si"));

                    break;
                case 3:

                    System.out.println("Modificar disco");
                    System.out.println("==================");
                    System.out.println("");

                    System.out.println("introduzca el codigo del album que desea modificar");
                    System.out.print("codigo album: ");
                    codigoAlbum = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    i = 0;
                    boolean modificado = false;
                    //for (i = 0; i < N; i++) {
                    do {
                        if (album[i].getCodigoAlbum() == codigoAlbum) {

                            System.out.println("Si desea mantener el codigo ya introducido \n"
                                    + "solo tienes k volver a meter el codigo original era '" + codigoAlbum + "'.");
                            System.out.print("nuevo codigo album: ");
                            codigoAlbum = Integer.parseInt(entrada.nextLine());

                            if (codigoAlbum == album[i].getCodigoAlbum()) {
                                codigoAlbum = album[i].getCodigoAlbum();
                            }
                            album[i].setCodigoAlbum(codigoAlbum);

                            System.out.print("nuevo nombre album: ");
                            nombreAlbum = entrada.nextLine();
                            if (nombreAlbum.equals("")) {
                                nombreAlbum = album[i].getNombreAlbum();
                            }
                            album[i].setNombreAlbum(nombreAlbum);

                            System.out.print("nuevo nombre autor: ");
                            nombreAutor = entrada.nextLine();
                            if (nombreAutor.equals("")) {
                                nombreAutor = album[i].getNombreAutor();
                            }
                            album[i].setNombreAutor(nombreAutor);

                            System.out.print("nueva duracion: ");
                            duracionCancion = Double.parseDouble(entrada.nextLine());
                            if (duracionCancion == album[i].getDuracionCancion()) {
                                duracionCancion = album[i].getDuracionCancion();
                            }
                            album[i].setDuracionCancion(duracionCancion);
                            modificado = true;
                            //i = N;//para una vez encontrado el codigo del k keremos modificar salga del bucle
                        } else {
                            i++;
                        }

                    } while (modificado == false);

                    break;
                case 4:

                    System.out.println("Borrar");
                    System.out.println("======");
                    System.out.println("");
                    System.out.print("Indique que album desea eliminar: ");
                    codigoAlbum = Integer.parseInt(entrada.nextLine());
                    System.out.println("");
                    for (i = 0; i < N; i++) {
                        if (codigoAlbum == album[i].getCodigoAlbum()) {
                            album[i].setNombreAutor("libre");
                        }
                    }
                    System.out.println("album eliminado con exito");
                    break;

            }

        } while (opcion != 5);
    }

}
