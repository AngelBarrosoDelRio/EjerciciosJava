
/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 */
package Tema7_Bidimensional;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class movimientosAjedrez {
        // se definen constantes para representar el
	// contenido de las celdas
	static final String NEGRA = "██"; // █ ■
	static final String BLANCA = "  ";
	static final String ALFIL = "♗ ";  // ∆♝۩
	static final String MOVIMIENTOBLANCO = "• "; // ●
	static final String MOVIMIENTONEGRO = "◙ "; // ◘◙
    public static void main(String[] args) {
     
        //int[][] tablero= new int [8][8];
        Scanner entrada= new Scanner (System.in);
        String nombreFila = "hgfedcba";
	String[][] tablero = new String[8][8];
	int fila, columna;
	String casilla;

	// pinta el tablero vacío
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	casilla = BLANCA;
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
			System.out.print(casilla);
			tablero[fila][columna] = casilla;
			if (casilla.equals(BLANCA))
				casilla = NEGRA;
			else
				casilla = BLANCA;
		}
		if (casilla.equals(BLANCA))
			casilla = NEGRA;
		else
			casilla = BLANCA;
			System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        
        System.out.println("Introduzca la posicion de la figura: ");
        String posicionAlfil =entrada.next();
        int filaAlfil = nombreFila.indexOf(posicionAlfil.charAt(0));
	int columnaAlfil = posicionAlfil.charAt(1) - 1 - 48;
        tablero[filaAlfil][columnaAlfil]=ALFIL;
        
       
        
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<MOVIMIENTO ALFIL>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
        System.out.println("");
        System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
                    
		    if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (! ((filaAlfil == fila) && (columnaAlfil == columna))))
			if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
					
		System.out.print(tablero[fila][columna]);
		}
		System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        
        
        /*
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<MOVIMIENTO CABALLO.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
        System.out.println("");
        System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
                    
		    if ((fila == filaAlfil-2 ) && (Math.abs(columnaAlfil - columna)==1)){
			if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }else if ((fila == filaAlfil+2 ) && (Math.abs(columnaAlfil - columna)==1)){
                         if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }else if ((columnaAlfil == columna+2 ) && (Math.abs(fila - filaAlfil)==1)){
                         if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                        
                    }else if ((columnaAlfil == columna-2 ) && (Math.abs(fila - filaAlfil)==1)){
                         if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }
		System.out.print(tablero[fila][columna]);
		}
		System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        */
        /*
        
        //<<<<<<<<<<<<<<<<<<<MOVIMIENTO TORRE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
        System.out.println("");
        System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
                    
		    if (((fila == filaAlfil )&& (columnaAlfil!=columna))||((fila != filaAlfil )&& (columnaAlfil==columna))){
			if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }
		System.out.print(tablero[fila][columna]);
		}
		System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        */
        /*
        
        //>>>>>>>>>>>>>>>>>>>>>>>>MOVIMIENTO PEON<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        System.out.println("");
        System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
                    
		    if (((fila == filaAlfil-1 )&& (columnaAlfil-columna)==0)){
			if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }
		System.out.print(tablero[fila][columna]);
		}
		System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        */
        /*
        
        
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>MOVIMIENTO REINA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        System.out.println("");
        System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
                    
		    if (((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (! ((filaAlfil == fila) && (columnaAlfil == columna))))
                            || (((fila == filaAlfil )&& (columnaAlfil!=columna)) || ((fila != filaAlfil )&& (columnaAlfil==columna)))){
			if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }
		System.out.print(tablero[fila][columna]);
		}
		System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        
        */
        /*
        
        //>>>>>>>>>>>>>>>>>>>>>>MOVIMIENTO REY<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        System.out.println("");
        System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	for(fila = 0; fila < 8; fila++) {
		System.out.print(nombreFila.charAt(fila)+ " ░░");
		for(columna = 0; columna < 8; columna++) {
                    
		    if ((Math.abs(filaAlfil - fila) <=1 )&& (Math.abs(columnaAlfil - columna)<=1)){
			if (tablero[fila][columna] == BLANCA)
				tablero[fila][columna] = MOVIMIENTOBLANCO;
			else
				tablero[fila][columna] = MOVIMIENTONEGRO;
                    }
		System.out.print(tablero[fila][columna]);
		}
		System.out.println("░░");
	}
	System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
	System.out.println("     1 2 3 4 5 6 7 8");
        
        */
    }
  
}

