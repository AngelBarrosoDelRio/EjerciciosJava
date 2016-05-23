/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

/**
 *
 * @author angelo
 */
public class Variadas {
    
        /*************************************************************/
	/*                                                           */
	/* boolean esCapicua(long x)                                 */
	/* boolean esCapicua(int x)                                  */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Devuelve verdadero si el número que se pasa como          */
	/* parámetro es capicúa y falso en caso contrario.           */
	/*                                                           */
	/*************************************************************/

	public static boolean esCapicua(long x) {
		
		return x == voltea(x);	
	}
		
	public static boolean esCapicua(int x) {
		
		return esCapicua((long)x);	
	}
        
        /*************************************************************/
	/*                                                           */
	/* int voltea(int x)                                         */
	/* long voltea(long x)                                       */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Le da la vuelta a un numero entero                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int voltea(int x){
            
            if (x < 0)
			return -voltea(-x);
            int volteado=0;    
            while(x>0){
                volteado= (volteado * 10) + (x % 10);
			x = x / 10;
		}
		
		return volteado;
	
            }
        public static long voltea(long x) {
		
		return (long)voltea((int)x);		
	}
        
        /*************************************************************/
	/*                                                           */
	/* int esPrimo(int x)                                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Devuelve verdadero si el numero es capicua                */
        /*                                                           */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static boolean esPrimo(int x){
            for (int i = 2; i < x; i++){
                if ((x % i) == 0){ 
                    return false;
                }else{
                    return true;
                }
            }
            return false; // comprobarr!!!
        }
        
        /*************************************************************/
	/*                                                           */
	/* int SiguientePrimo(int x)                                 */
	/* long SiguientePrimo(long x)                               */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Devuelve el menor primo que es mayor al número que se pasa*/
        /* como parámetro.                                           */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
          
        public static int siguientePrimo(int x){
               
            while (!esPrimo(++x));
		
		return x;	
	}
        
        /*************************************************************/
	/*                                                           */
	/* int potencia(int x)                                       */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Dada una base y un exponente devuelve la potencia.        */
        /*                                                           */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int potencia(int base,int exponente){
            
           int resultado = (int) Math.pow(base, exponente);
           return resultado;
        }
        
        
        /*************************************************************/
	/*                                                           */
	/* int cuentaDigitos(int x)                                  */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* cueta el numero de digitos de un numero (X)               */
        /*                                                           */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int cuentaDigitos(int x){
           int numeroDigitos=0;
            do{
              x=x/10; 
              numeroDigitos++;
            }while(x>0);
            
            return numeroDigitos;
        }
        public static int cuentaDigitosLong(long x){
           int numeroDigitos=0;
            do{
              x=x/10; 
              numeroDigitos++;
            }while(x>0);
            
            return numeroDigitos;
        }
        
        /*************************************************************/
	/*                                                           */
	/* int digitoN(int x)                                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Devuelve el dígito que está en la posición n de un número */
        /* entero. Se empieza contando por el 0 y de izquierda a     */
        /*  derecha.                                                 */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int digitoN(int x,int y){
            int numero=0;
            x=voltea(x);
            for(int i=0; i<=y;i++){
                
                if(i==y){
                    numero=x%10;
                }
                x=x/10;
            }
            return numero;
        }
        
        /*************************************************************/
	/*                                                           */
	/* int posicionDeDigito(int x)                               */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Da la posición de la primera ocurrencia de un dígito      */
        /*  dentro de un número entero. Si no se encuentra,          */
	/*  devuelve -1.                                             */
	/*                                                           */
	/*************************************************************/
        
        public static int posicionDeDigito(int x,int y){
            int posicion=0;
            
            while(x%10!=y){
              x=x/10;
              posicion++;
            }
            if(x%10==y)
                return posicion;
            else
                return -1;
            
        }
        
        /*************************************************************/
	/*                                                           */
	/* int quitaPorDetras(int x)                                 */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Le quita a un número n dígitos por detrás                 */
        /*  (por la derecha).                                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int quitaPorDetras(int x,int y){
          
            for(int i=0; i<y;i++){
                x=x/10;
            }
            
            return x;
        }
        
        /*************************************************************/
	/*                                                           */
	/* int quitaPorDelante(int x)                                 */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Le quita a un número n dígitos por detrás                 */
        /*  (por la derecha).                                        */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int quitaPorDelante(int x,int y){
            x=voltea(x);
            for(int i=0; i<y;i++){
                x=x/10;
            }
            x=voltea(x);
            return x;
        }
        
        
        /*************************************************************/
	/*                                                           */
	/* int pegaPorDetras:(int x)                                 */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Añade un dígito a un número por detrás.                   */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
        public static int pegaPorDetras(int x,int y){
            
            return (int)(x * potencia(10, cuentaDigitos(y))) + y;
        }
        
        /*************************************************************/
	/*                                                           */
	/* int pegaPorDelante:(int x)                                */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Añade un dígito a un número por delante.                  */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
        
         public static int pegaPorDelante(int x,int y){
             int añade;
             x=voltea(x); 
             añade=(int)(x * potencia(10, cuentaDigitos(y))) + y;
             añade=voltea(añade);
             return añade;
         }
         
        /*************************************************************/
	/*                                                           */
	/* int trozoDeNumero:(int x)                                 */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Toma como parámetros las posiciones inicial y final       */
        /* dentro de un número y devuelve el trozo correspondiente.  */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
         
         public static int trozoDeNumero(int x,int posiInicial,int posiFinal){
             
             int posicionFinal=((cuentaDigitos(x))-1)-posiFinal;
             
             x=quitaPorDelante(x, posiInicial);
             x=quitaPorDetras(x, posicionFinal);
             return x;
             
         }
         
         /*************************************************************/
	/*                                                           */
	/* int juntaNumeros:(int x)                                  */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
	/*                                                           */
	/* Pega dos números para formar uno.                         */
	/*                                                           */
	/*                                                           */
	/*************************************************************/
         
         public static int juntaNumeros(int x,int y){
             
             return (int)(x * potencia(10, cuentaDigitos(y))) + y;
             
             
         }
         
         
}// public class del main.
