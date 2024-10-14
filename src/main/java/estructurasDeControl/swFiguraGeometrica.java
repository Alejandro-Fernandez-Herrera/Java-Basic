/* 
Actividad: Selección de Figura Geométrica
Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número del 1 al 3 para seleccionar una figura geométrica: 
1 para círculo, 2 para cuadrado y 3 para triángulo. 
Después, solicitará al usuario los datos necesarios para calcular el área de la figura seleccionada. 
Estos datos serán:
Para el círculo: el radio.
Para el cuadrado: el lado.
Para el triángulo: la base y la altura.
Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada. 
*/

package estructurasDeControl;

import java.util.Scanner;

public class swFiguraGeometrica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== MENU ===");
    System.out.println("1 - circulo\n" + "2 - cuadrado\n" + "3 - triangulo");
    System.out.print("seleciona tu figura geometrica: ");

    int opcionFigura = scanner.nextInt();
    double area = 0.0;
    String figuraString = "";

    area = switch (opcionFigura) {
      case 1 -> {
        figuraString = "circulo";
        System.out.println("=== CIRCULO ===");
        System.out.print("Cual es el radio del circulo: ");
        double radio = scanner.nextDouble();
        yield Math.PI * Math.pow(radio, 2);
      }

      case 2 -> {
        System.out.println("=== CUADRADO ===");
        figuraString = "cuadrado";
        System.out.print("Cual es el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        yield lado * lado;
      }

      case 3 -> {
        System.out.println("=== TRIANGULO ===");
        figuraString = "triangulo";
        System.out.print("Cual es la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Cual es la altura del triangulo: ");
        double altura = scanner.nextDouble();
        yield (base * altura) / 2;
      }

      default -> {
        System.out.println("opcion no valida");
        yield 0.0; // no debería dar cero! se deberá manejar como un error!
      }

    };

    if (area < 0) {
      System.out.println("el área de una figura geometrica no debe ser negativa!");
      
    }
    System.out.println("el área del " + figuraString + " es: " + area);
    scanner.close();
  }
}
