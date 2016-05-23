/*
 * Realiza un programa que escoja al azar 5 palabras en español del mini-diccionario del
 ejercicio anterior. El programa irá pidiendo que el usuario teclee la traducción al inglés
 de cada una de las palabras y comprobará si son correctas. Al final, el programa deberá
 mostrar cuántas respuestas son válidas y cuántas erróneas.
 */
package Ejercicio_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoDiccionario2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("perro", "dog");
        diccionario.put("coche", "car");
        diccionario.put("ordenador", "computer");
        diccionario.put("vaso", "glass");
        diccionario.put("gato", "cat");
        diccionario.put("caballo", "horse");
        diccionario.put("hierba", "weed");
        diccionario.put("lapiz", "pencil");
        diccionario.put("ladron", "thief");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("periodico", "newspapper");
        diccionario.put("figura", "figure");
        diccionario.put("mierda", "shit");
        diccionario.put("cara", "face");
        diccionario.put("movil", "mobile");
        diccionario.put("silla", "chair");
        diccionario.put("pelo", "hair");
        diccionario.put("bolsa", "bag");
        diccionario.put("agua", "water");

        int i;
        int numero;
        String[] almacenaClaves = diccionario.keySet().toArray(new String[0]);

        // genera 5 números aleatorios que no se repiten
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        numerosAleatorios.add((int) (Math.random() * 22));

        for (i = 0; i < 4; i++) {
            do {
                numero = (int) (Math.random() * 22);
            } while (numerosAleatorios.contains(numero));
            numerosAleatorios.add(numero);
        }

        // muestra las palabras en español y pregunta por su traducción
        int puntos = 0;
        System.out.println("Mostraré la palabra en español y usted tendrá que traducirla al inglés.");
        
        for (i = 0; i < 5; i++) {
            System.out.print(almacenaClaves[numerosAleatorios.get(i)] + ": ");
            String palabraIntro = entrada.nextLine();
            
            if (palabraIntro.equals(diccionario.get(almacenaClaves[numerosAleatorios.get(i)]))) {
                System.out.println("¡Correcto!");
                puntos++;
            } else {
                System.out.println("Respuesta incorrecta :(");
                System.out.println("La respuesta correcta es " + diccionario.get(almacenaClaves[numerosAleatorios.get(i)]));
            }
        }

        System.out.println("Ha obtenido " + puntos + " puntos.");

    }

}
