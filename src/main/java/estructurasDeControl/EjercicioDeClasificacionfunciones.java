package estructurasDeControl;

import java.util.Scanner;

public class EjercicioDeClasificacionfunciones {
  public static String obtenerCalificacion(int numero) {
    if (numero >= 0 && numero <= 100) {
      if (numero >= 90 && numero <= 100) {
        return "A";
      } else if (numero >= 80 && numero <= 89) {
        return "B";
      } else if (numero >= 70 && numero <= 79) {
        return "C";
      } else if (numero >= 60 && numero <= 69) {
        return "D";
      } else {
        return "F";
      }
    } else {
      return "Número fuera del rango válido";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un número entre 0 y 100: ");
    int numero = scanner.nextInt();
    String resultado = obtenerCalificacion(numero);
    System.out.println(resultado);
    scanner.close();
  }
}
