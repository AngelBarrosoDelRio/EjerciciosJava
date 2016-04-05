/*
 * Une y amplía los dos programas anteriores de tal forma que se permita convertir un número
entre cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.
 */
package Tema8;

/**
 *
 * @author angelo
 */
/*
public class Ejercicio_19 {
    public static void main(String[] args) {
        
    
        String resultado = "";
    long numeroIntroducido = 666;
    
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = System.console().readLine();
    
    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    
    switch (opcion) {
      case 1:
        resultado = Long.toString(binarioAOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(binarioADecimal(numeroIntroducido));
        break;
      case 3:
        resultado = binarioAHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(octalABinario(numeroIntroducido));
        break;
      case  5:
        resultado = Long.toString(binarioADecimal(octalABinario(numeroIntroducido)));
        break;
      case  6:
        resultado = binarioAHexadecimal(octalABinario(numeroIntroducido));
        break;
      case  7:
        resultado = Long.toString(decimalABinario(numeroIntroducido));
        break;
      case  8:
        resultado = Long.toString(binarioAOctal(decimalABinario(numeroIntroducido)));
        break;
      case  9:
        resultado = binarioAHexadecimal(decimalABinario(numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(hexadecimalABinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(binarioAOctal(hexadecimalABinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(binarioADecimal(hexadecimalABinario(numeroIntroducidoString)));
        break;
    }
    
    System.out.println(resultado);
  } // main


  
    
  public static long binarioAOctal(long binario) {

  long octal = 1;
  
    while (binario > 0) {
    octal = octal * 10 + (binarioADecimal(binario % 1000));
    binario = binario / 1000;
  };
  
  octal = Matematicas.Variadas.pegaPorDetras(octal, 1);
  octal = Matematicas.Variadas.voltea(octal);
  octal = Matematicas.Variadas.quitaPorDetras(octal, 1);
  octal = Matematicas.Variadas.quitaPorDelante(octal, 1);
  
  return octal;
  }
  
  
  public static long binarioADecimal(long binario) {

    long decimal = 0;
  
  int bits = Matematicas.Variadas.digitos(binario);
  
  for(int i = 0; i < bits; i++)
    decimal += Matematicas.Variadas.digitoN(binario, bits - i - 1) * Matematicas.Variadas.potencia(2, i);
    
  return decimal;
  }
  


   public static String binarioAHexadecimal(long binario) {

  String hexadecimal = "";
  String digitosHexa = "0123456789ABCDEF";
  
    while (binario > 0) {
    hexadecimal = digitosHexa.charAt((int)binarioADecimal(binario % 10000)) + hexadecimal;
    binario = binario / 10000;
  };
    
  return hexadecimal;
  }
  
  
  
  public static long octalABinario(long octal) {
  
  long binario = 0;
  
    for (int i = 0; i < Matematicas.Variadas.digitos(octal); i++)
    binario = binario * 1000 + decimalABinario(Matematicas.Variadas.digitoN(octal, i));
    
  return binario;
  }
  
  
   
  public static long decimalABinario(long decimal) {
  
  if (decimal == 0)
    return 0;
    
  long binario = 1;
  
  while (decimal > 1) {
    binario = Matematicas.Variadas.pegaPorDetras(binario, (int)decimal % 2);
    decimal = decimal / 2;
  }
  binario = Matematicas.Variadas.pegaPorDetras(binario, 1);
  binario = Matematicas.Variadas.voltea(binario);
  binario = Matematicas.Variadas.quitaPorDetras(binario, 1);
  
  return binario;
}

 
  
  public static long hexadecimalABinario(String hexadecimal) {
  
  String digitosHexa = "0123456789ABCDEF";
  long binario = 0;
  
    for (int i = 0; i < hexadecimal.length(); i++)
    binario = binario * 10000 + decimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    
  return binario;
  }
 */ 
  
  
  
  

