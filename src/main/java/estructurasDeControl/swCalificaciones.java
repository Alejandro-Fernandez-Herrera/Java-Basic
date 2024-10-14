/* 
Actividad: Conversión de Calificaciones
En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación numérica del 1 al 5. 
Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
1: "Muy deficiente"
2: "Deficiente"
3: "Suficiente"
4: "Notable"
5: "Sobresaliente"
 */

package estructurasDeControl;

import java.util.Scanner;

public class swCalificaciones {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ingrese la calificación numerica, entre 1 y el 5: ");
    int calificacion = scanner.nextInt();
    String calificacionString;

    switch (calificacion) {
      case 1 -> calificacionString = "muy deficiente";
      case 2 -> calificacionString = "deficiente";
      case 3 -> calificacionString = "suficiente";
      case 4 -> calificacionString = "notable";
      case 5 -> calificacionString = "sobresaliente";
      default -> calificacionString = "ingresa una calificacion entre 1 y 5";
    }

    System.out.println(calificacionString);

    scanner.close();
  }
}
