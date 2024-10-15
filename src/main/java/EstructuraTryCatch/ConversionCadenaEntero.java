/* ✏️  Actividad: Conversión de Cadena a Entero
Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla. */


package EstructuraTryCatch;

import java.util.Scanner;

public class ConversionCadenaEntero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa una cadena de caracteres que represente un número entero: ");
    String entrada = scanner.nextLine();

    try {
      int numero = Integer.parseInt(entrada);
      System.out.println("El número ingresado es: " + numero);
    } catch (NumberFormatException e) {
      System.out.println("Error: la cadena ingresada no es un número entero válido.");
    } finally {
      scanner.close();
    }
  }
}
