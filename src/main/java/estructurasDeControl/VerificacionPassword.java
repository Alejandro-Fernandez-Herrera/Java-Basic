/* 
1. Verificación de Contraseña:
En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida. 
Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado". */

package estructurasDeControl;

import java.util.Scanner;

public class VerificacionPassword {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String PASS = "password";

    System.out.print("ingresa tu contraseña: ");
    String autenticacion = scanner.nextLine();
    if (PASS.equals(autenticacion)) {
      System.out.println("acceso autorizado.");
    } else {
      System.out.println("contraseña incorrecta");
    }

    scanner.close();
  }
}
