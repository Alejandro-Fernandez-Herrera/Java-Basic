package EstructuraTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSeguraSegundaIteracion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.println("ingresa dos numeros enteros para realizar una división");
      System.out.print("ingresa el dividendo: ");
      int dividendo = scanner.nextInt();
      System.out.print("ingresa el divisor: ");
      int divisor = scanner.nextInt();

      int resultado = dividendo / divisor;
      System.out.println("el resultado es: " + resultado);

    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("error aritmetico, no dividir entre 0 - " + e.getMessage());
      // el video del ejemplo relaciona el inputmismatch, pero al ingresar un tipo de
      // dato diferente ni siquiera llega a ésta parte del codigo... en ese caso,
      // debería ingresar el try al solicitar el input - R. correcto!
    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("error de ingreso, tipo de dato no coincide - " + e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("error generico" + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
