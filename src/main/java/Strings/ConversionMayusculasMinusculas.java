/* ✏️  Actividad: Conversión de Mayúsculas y Minúsculas
Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena, 
pero con todos los caracteres en mayúsculas o minúsculas. 
Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión. */

package Strings;

import java.util.Scanner;

public class ConversionMayusculasMinusculas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingresa una cadena");
    String cadenaString = scanner.nextLine();
    String cadenaMinusculaString = cadenaString.toLowerCase();
    String cadenaMayusculaString = cadenaString.toUpperCase();

    System.out.println("cadena minuscula: " + cadenaMinusculaString);
    System.out.println("cadena mayuscula: " + cadenaMayusculaString);

    scanner.close();
  }

}
