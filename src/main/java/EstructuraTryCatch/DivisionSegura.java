/* ✏️  Actividad: Division Segura
Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.
 */

package EstructuraTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("ingresa dos numeros enteros para realizar una división");
    System.out.print("ingresa el dividendo: ");
    int dividendo = scanner.nextInt();
    System.out.print("ingresa el divisor: ");
    int divisor = scanner.nextInt();

    try {
      int resultado = dividendo / divisor;
      System.out.println("el resultado es: " + resultado);
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("error aritmetico, no dividir entre 0" + e.getMessage());
      // el video del ejemplo relaciona el inputmismatch, pero al ingresar un tipo de dato diferente ni siquiera llega a ésta parte del codigo...
    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("error de ingreso, tipo de dato no coincide" + e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("error generico" + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
