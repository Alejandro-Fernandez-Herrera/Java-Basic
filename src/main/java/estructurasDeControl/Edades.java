/* 3. Determinación de Edades
En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. Las categorías son las siguientes:
Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario. */


package estructurasDeControl;

import java.util.Scanner;

public class Edades {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("ingresa tu edad: ");
    int edad = scanner.nextInt();
    if (edad >=0) {
      if (edad < 18) {
        System.out.println("eres menor de edad");
      }

      if (edad >= 18 && edad <= 64) {
        System.out.println("eres adulto");
      }

      else if (edad >= 65){
        System.out.println("eres un adulto mayor");
      }

    } else {
      System.out.println("ingresa una edad mayor a cero");
    }

    scanner.close();
  }
  
}
