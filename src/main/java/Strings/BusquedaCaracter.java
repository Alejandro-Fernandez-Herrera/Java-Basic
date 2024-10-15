/* ✏️  Actividad: Búsqueda de Caracteres
Escribe un programa que pida al usuario ingresar una palabra y un carácter, y 
determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. 
Muestra un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra. */

package Strings;

import java.util.Scanner;

public class BusquedaCaracter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ingresa una palabra: ");
    String palabraString = scanner.nextLine();

    System.out.print("ingresa un caracter para que sea buscado en la palabra: ");
    String caracterString = scanner.nextLine();

    System.out.println(palabraString.indexOf(caracterString));

    scanner.close();
  }
}

// Si no se encuentra regresa '-1' -> operador ternario (?)