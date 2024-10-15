package Strings;

import java.util.Scanner;

public class introString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingresa una cadena de carateres: ");
    String cadenaString = scanner.nextLine();
    System.out.println("el tamaño de la cadena es: " + cadenaString.length());
    System.out.println("ingresa una segunda cadena: ");
    String segundacadenaString = scanner.nextLine();
    String nuevaCadenaString = cadenaString.concat(segundacadenaString);
    System.out.println(nuevaCadenaString);
    System.out.println("ingresa una frase:");
    String fraseString = scanner.nextLine();
    System.out.print("ingresa un numero entero: ");
    int primerNumero = scanner.nextInt();
    System.out.print("ingresa un segundo numero entero: ");
    int segundoNumero = scanner.nextInt();
    System.out.println(fraseString.substring(primerNumero, segundoNumero));
    scanner.close();
  }
  
}
