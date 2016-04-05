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
        int opcion, i;
        String nombreAutor, nombreAlbum, nombreCancion;
        double duracionCancion;

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

                    System.out.println("Listado");
                    System.out.println("=======");
                    int cuentaCanciones=0;
                    for (i = 0; i < N; i++) {

                        if (!album[i].getNombreAutor().equals("libre")) {
                            System.out.println(album[i]);
                            cuentaCanciones++;
                        }

                    }
                    if(cuentaCanciones==0){
                        System.out.println("no hay ningun album introducido");
                    }
                    //System.out.println("fuerad el for");
                    break;

                case 2:

                    System.out.println("añadir nuevo disco");
                    System.out.println("==================");

                    for (i = 0; i < 1; i++) {
                        if (album[i].getNombreAutor().equals("libre")) {
                            System.out.print("nombre del autor: ");
                            nombreAutor = entrada.nextLine();
                            System.out.println("");
                            album[i].setNombreAutor(nombreAutor);

                            System.out.print("nombre del album: ");
                            nombreAlbum = entrada.nextLine();
                            System.out.println("");
                            album[i].setNombreAlbum(nombreAlbum);

                            System.out.print("nombre de la cancion: ");
                            nombreCancion = entrada.nextLine();
                            System.out.println("");
                            album[i].setNombreCancion(nombreCancion);

                            System.out.print("duracion: ");
                            duracionCancion = Double.parseDouble(entrada.nextLine());
                            System.out.println("");
                            album[i].setDuracionCancion(duracionCancion);
                        }
                    }

                    break;
                case 3:
                        
                    System.out.println("Modificar disco");
                    System.out.println("==================");
                    
                    System.out.println("introduzca el nombre del album que desea modificar");
                    System.out.print("nombre album: ");
                    nombreAlbum=entrada.nextLine();
                    System.out.println("");
                    
                    for(i=0;i<N;i++){
                        if(album[i].getNombreAlbum().equals(nombreAlbum)){
                            System.out.print("nuevo nombre album: ");
                            nombreAlbum=entrada.nextLine();
                            if(nombreAlbum.equals("")){
                                nombreAlbum=album[i].getNombreAlbum();
                            }
                            album[i].setNombreAlbum(nombreAlbum);
                            
                            System.out.print("nuevo nombre autor: ");
                            nombreAutor=entrada.nextLine();
                            if(nombreAutor.equals("")){
                                nombreAutor=album[i].getNombreAutor();
                            }
                            album[i].setNombreAutor(nombreAutor);
                            
                            System.out.print("nuevo nombre cancion: ");
                            nombreCancion=entrada.nextLine();
                            if(nombreCancion.equals("")){
                                nombreCancion=album[i].getNombreCancion();
                            }
                            album[i].setNombreCancion(nombreCancion);
                            
                            System.out.print("nueva duracion: ");
                            duracionCancion=Double.parseDouble(entrada.nextLine());
                            if(duracionCancion==album[i].getDuracionCancion()){
                                duracionCancion=album[i].getDuracionCancion();
                            }
                            album[i].setDuracionCancion(duracionCancion);
                            i=100;
                        }
                    }
                   
                    break;
                case 4:
                    
                    System.out.println("Borrar");
                    System.out.println("======");
                    System.out.print("Indique k album desea eliminar: ");
                    nombreAlbum=entrada.nextLine();
                    System.out.println("");
                    for(i=0;i<N;i++){
                        if(nombreAlbum.equals(album[i].getNombreAlbum())){
                            album[i].setNombreAutor("libre");
                        }
                    }
                    System.out.println("album eliminado con exito");
                    break;

            }

        } while (opcion != 5);
    }

}
