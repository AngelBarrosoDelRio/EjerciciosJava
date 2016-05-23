/*
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los
 métodos pueden ser invierte , simplifica , multiplica , divide , etc.
 */
package Ejercicio4;


/**
 *
 * @author angelo
 */
public class Fraccion {

    public int numerador;
    public int denominador;

    public Fraccion(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }

    public void invierte(int n, int d) {

        System.out.println("Fraccion invertida= " + d + " / " + n);
    }

    public void simplifica(int n, int d) {
        
        int primo = 2;
        boolean primosi = false;

        do {
            for (int i = 2; i <= primo; i++) {
                if ((primo % i) == 0) {
                    primosi = true;
                } else {
                    primosi = false;
                }
            }

            if (primosi == true) {
                if (n % primo == 0 && d % primo == 0) {
                    n = n / primo;
                    d = d / primo;

                } else {
                    primo++;
                }
            }

        } while (primo < 100);

        System.out.println("Fraccion simplificada= " + n + " / " + d);
    }

    public void dividir(int n, int d, int n1, int d1) {

        n = n * d1;
        d = d * n1;
        System.out.println("multiplicacion= " + n + "/" + d);
    }

    public void multiplica(int n, int d, int n1, int d1) {
        n = n * n1;
        d = d * d1;
        System.out.println("multiplicacion= " + n + "/" + d);
    }
}
