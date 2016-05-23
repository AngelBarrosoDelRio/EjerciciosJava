/*
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la
 clase Carta ). Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que
 no se repite ninguna.
 */
package Ex30abr3;

/**
 *
 * @author angelo
 */
public class Cartas implements Comparable<Cartas> {

    private static String numCarta[] = {"AS", "2", "3", "4", "5", "6", "7", "SOTA", "CABALLO", "REY"};
    private static String palo[] = {"espadas", "bastos", "oros", "copas"};

    String numCartaObtenida;
    String paloObtenido;

    Cartas() {
        this.numCartaObtenida = numCarta[(int) (Math.random() * 10)];
        this.paloObtenido = palo[(int) (Math.random() * 4)];
    }

    public String getNumCartaObtenida() {
        return this.numCartaObtenida;
    }

    public String getPaloObtenido() {
        return this.paloObtenido;
    }

    public String toString() {

        return this.numCartaObtenida + " - " + this.paloObtenido;

    }

    // esta funcion evita k se repita compara un objeto con otro los datos provienen del do/while

    public boolean equals(Object o) {
        Cartas c = (Cartas) o;
        return (this.numCartaObtenida.equals(c.getNumCartaObtenida()) && (this.paloObtenido.equals(c.getPaloObtenido())));
    }

    // esta funcion para la ordenacion
    public int compareTo(Cartas g) {
        return (this.numCartaObtenida).compareTo(g.getNumCartaObtenida()) ;
        /*
        si quisier ordenar por orden de palo y numero
        Cartas c = (Cartas) g;
        if(paloObtenido.equals(c.getPaloObtenido())){
            return numCartaObtenida.compareTo(c.getNumCartaObtenida());
        }else{
           return paloObtenido.compareTo(c.getPaloObtenido()) ; 
        }
        */
    }
}
