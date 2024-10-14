/* 
Calculadora de Área y Perímetro:
Implementando el uso de la estructura "switch expression", solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
Opción 1: "Circulo"
Opción 2: "Rectangulo"
Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área o el perímetro de cada figura:
Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
Para el Rectángulo: Solicita el valor de la base y de la altura.
Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área o el perímetro de dicha figura.
Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado.
*/

package estructurasDeControl;

import java.util.Scanner;

public class CalcularAreaPerimetro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("===== MENU =====");
    System.out.println(
        "vamos a calcular el area o el perimetro de una figura geometrica\nselecciona el 1 para el circulo y el 2 para el rectangulo");
    System.out.print("escoge tu figura: ");
    int opcionFigura = scanner.nextInt();
    float area = 0.0F;
    float perimetro = 0.0F;

    switch (opcionFigura) {
      case 1 -> {
        System.out.print("ingresa el radio del circulo: ");
        float radio = scanner.nextFloat();
        System.out.print("que deseas calcular?\n1 para el area \n2 para el perimetro: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
          case 1 -> {
            area = (float) (Math.PI * Math.pow(radio, 2));
            /*
             * en este ejercicio tuve conflictos con los tipos, estoy declarando todo en
             * float y sin embargo tuve que convertir la variale a float... validar si por
             * defecto en la librería de math viene en double(?) R. en la librería Math por
             * defecto devuelve double, so... declarar todo en double(?) float es más
             * rapido, se utiliza en aplicaicones de graficos, embebidos, moviles o bigdata,
             * double tiene mayor precisión, recordar la historia del banco... otra
             * pregunta, por qué emplear yield me arroja un error? yield se utiliza en
             * switch expression para devolver un valor, cuál es la diferencia entre los dos
             * casos? revisar el otro ejercicio con switch y yield!!!
             */
            System.out.println("el area del circulo es: " + area);
          }

          case 2 -> {
            perimetro = (float) (2 * Math.PI * radio);
            System.out.println("el perimetro del circulo es: " + perimetro);
          }

          default -> {
            System.out.println("opcion no valida");
          }
        }
      }

      case 2 -> {
        System.out.print("ingresa la base del rectangulo: ");
        float base = scanner.nextFloat();
        System.out.print("ingresa la altura del rectangulo: ");
        float altura = scanner.nextFloat();
        System.out.print("que deseas calcular?\n1 para el area \n2 para el perimetro: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
          case 1 -> {
            area = (float) (base + altura);
            System.out.println("el area del rectangulo es: " + area);
          }

          case 2 -> {
            perimetro = (float) ((2*base)+(2*altura));
            System.out.println("el perimetro del rectangulo es: " + perimetro);
          }

          default -> {
            System.out.println("opcion no valida");
          }
        }
      }

      default -> {
        System.out.println("opcion no valida");
      }

    }

    scanner.close();
  }

}
