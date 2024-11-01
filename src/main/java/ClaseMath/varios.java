/* ✏️  Actividad: Calculando el valor absoluto
Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.

✏️  Actividad: Redondeo de números
Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.

✏️  Actividad: Generando números aleatorios
Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo. */

package ClaseMath;

import java.util.Scanner;

public class varios {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ingresa un numero entero para conocer su valor absoluto: ");
    int numeroEntero = scanner.nextInt();
    System.out.println("abs de " + numeroEntero + " es : " + Math.abs(numeroEntero));

    scanner.close();
  }
}
