/* 
Verificación de Día Hábil
En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana. 
El programa determinará si ese día es hábil o no. 
Se mostrará el resultado en pantalla. 
Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). 
Utilizaremos la estructura "switch" para implementar este programa. 
(Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).
*/

package estructurasDeControl;

import java.util.Scanner;

public class verificarDiaHabil {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "ingrese un numero del 1 al 7, \neste numero representa un día de la semana y \nen respuesta el programa te indicará si el día es hábil o no");
    System.out.print("ingrese numero: ");

    int numeroDia = scanner.nextInt();
    String diaSemana = "";

    switch (numeroDia) {
      case 1, 2, 3, 4, 5 -> diaSemana = "Día Hábil";
      case 6, 7 -> diaSemana = "Día No Hábil";
      default -> diaSemana = "ingrese un numero entero entre 1 y 7";
    }
    System.out.println(diaSemana);
    scanner.close();
  }

}
