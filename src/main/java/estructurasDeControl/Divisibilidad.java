/*
En esta actividad, escribirás un programa que solicite al usuario un número y 
determine si es divisible por 5, por 3, por ambos o por ninguno. 
El resultado se mostrará en pantalla. 
*/

package estructurasDeControl;

import java.util.Scanner;

public class Divisibilidad {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("ingresar un numero: ");
    int numero = scanner.nextInt();

    if ((numero % 5 == 0) && (numero % 3 == 0)) {
      System.out.println("el numero " + numero + " es divisible entre 5 y entre 3!");
    } else if (numero % 5 == 0) {
      System.out.println("el numero " + numero + " es divisible entre 5!");
    } else if (numero % 3 == 0) {
      System.out.println("el numero " + numero + " es divisible entre 3!");
    } else {
      System.out.println("el numero " + numero + " no es divisible entre 3 ni entre 5!!! ");

    }

    scanner.close();

  }

}
