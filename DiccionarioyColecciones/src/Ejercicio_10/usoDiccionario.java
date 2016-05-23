/*
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su
 correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar las
 parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente
 traducción en inglés.
 */
package Ejercicio_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoDiccionario {

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

        System.out.println("¿De que palabra desea conocer la traduccion?");
        for (Map.Entry pareja : diccionario.entrySet()) {
            System.out.print(pareja.getKey() + ", ");
        }
        System.out.println("");
        System.out.print("Introduzca la palabra: ");
        String palabraIntro = entrada.nextLine();
        System.out.println("");
        String respuesta = "no";
        do {
            if (respuesta.equals("si")) {
                System.out.print("Introduzca otra palabra: ");
                palabraIntro = entrada.nextLine();
                System.out.println("");
            }
            System.out.println(palabraIntro + "-->" + diccionario.get(palabraIntro));
            System.out.print("¿Quieres buscar otra palabra? [si/no]");
            respuesta = entrada.nextLine();

        } while (respuesta.equals("si"));

        System.out.println("Vuelva pronto!!");

    }

}
