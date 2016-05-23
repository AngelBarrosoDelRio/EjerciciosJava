/*
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
de suspensos, el número de suficientes, el número de bienes, etc.
 */
package Tema6;

/**
 *
 * @author angelo
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        
     int i;
     int notasGenardas;
     int cuentaSobresalientes=0;
     int cuentaNotables=0;
     int cuentaBien=0;
     int cuentaSuficientes=0;
     int cuentaInsuficientes=0;
     
     for(i=0;i<20;i++){
         
         notasGenardas=(int)(Math.random()*5);
         
         switch(notasGenardas){
             
            case 0:
                 System.out.println("Insuficiente");
                 cuentaInsuficientes++;
                 break;
            case 1:
                System.out.println("Suficiente");
                cuentaSuficientes++;
                break;
            case 2:
                System.out.println("Bien");
                cuentaBien++;
                break;
            case 3:
                System.out.println("Notable");
                cuentaNotables++;
                break;
            case 4:
                System.out.println("Sobresaliente");
                cuentaSobresalientes++;
                break;
        }
     }
        System.out.println("Ha obtenido "+cuentaInsuficientes+" Insuficientes.");
        System.out.println("Ha obtenido "+cuentaSuficientes+" Suficientes.");
        System.out.println("Ha obtenido "+cuentaBien+" Bienes.");
        System.out.println("Ha obtenido "+cuentaNotables+" Notables.");
        System.out.println("Ha obtenido "+cuentaSobresalientes+" SObresalientes.");
     
    }
  
}
