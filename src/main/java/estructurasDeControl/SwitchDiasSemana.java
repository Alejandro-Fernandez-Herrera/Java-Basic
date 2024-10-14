/* 
Actividad: Ejercicio de Días de la Semana
En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, 
que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. 
Utilizaremos la estructura "switch" para implementar este programa.

 */
package estructurasDeControl;

import java.util.Scanner;

public class SwitchDiasSemana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ingresa un numero del 1 al 7, este numero representa un día de la semana: ");
    int diaSemana = scanner.nextInt();
    String nombreDiaString;

    switch (diaSemana) {
      case 1 -> nombreDiaString = "lunes";
      case 2 -> nombreDiaString =  "martes";
      case 3 -> nombreDiaString =  "miercoles";
      case 4 -> nombreDiaString =  "jueves";
      case 5 -> nombreDiaString =  "viernes";
      case 6 -> nombreDiaString =  "sabado";
      case 7 -> nombreDiaString =  "domingo";
      default -> nombreDiaString =  "ingresa un numero entre 1 y 7";
    }
    
    System.out.println(nombreDiaString);
    scanner.close();
  }
}
