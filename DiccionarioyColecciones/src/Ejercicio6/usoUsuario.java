/*
 * Implementa el control de acceso al área restringida de un programa. Se debe pedir un
nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente,
el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3
oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso
al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben
estar almacenados en una estructura de la clase HashMap .
 */
package Ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class usoUsuario {
    public static void main(String[] args) {
        
        HashMap<String, String> usuario = new HashMap<String, String>();
        
        usuario.put("angelo","1234");
        int oportunidades=3;
        boolean accesoPermitido=false;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Acceso");
        System.out.println("=========");
        System.out.print("Introduzca su nombre de usuario: ");
        String nombreUsuario=entrada.nextLine();
        System.out.print("Introduzca contraseña: ");
        String contraseñaIntro=entrada.nextLine();
        do{
            if(!usuario.containsKey(nombreUsuario) || !usuario.containsValue(contraseñaIntro)){
                System.out.println("Lo siento el usuario o contraseña introducidos no existen");
                System.out.print("Vuelva a introducir su nombre de usuario: ");
                nombreUsuario=entrada.nextLine();
                System.out.print("Vuelva a introducir la contraseña: ");
                contraseñaIntro=entrada.nextLine();
                
                oportunidades--;
                System.out.println("oportunidades: "+oportunidades);
                
            }else{
                System.out.println("Bienvenido de nuevo "+usuario.get(nombreUsuario));
                accesoPermitido=true;
                
            }
            if(oportunidades==0){
            System.out.println("Lo siento se quedo sin oportunidades.");
        }
        }while(accesoPermitido==false && oportunidades>0);
        
        
    }
  
}
