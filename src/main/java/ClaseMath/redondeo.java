/* ✏️  Actividad: Redondeo de números
Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math. */

package ClaseMath;

import java.util.Scanner;

public class redondeo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ingresa un numero decimal para ser redondeado: ");
    double numero = scanner.nextDouble();
    long numeroRedondeado = Math.round(numero);
    System.out.println("redondeo de " + numero + " es : " + numeroRedondeado);


    scanner.close();
  }
}
