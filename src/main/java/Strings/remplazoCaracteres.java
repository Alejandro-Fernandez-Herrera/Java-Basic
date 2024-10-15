/*
1. Reemplazo de Caracteres
Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias del primer carácter con el segundo carácter en la frase ingresada por el usuario. Muestra la frase resultante en pantalla. 
*/

//este codigo fue compartido en el grupo, no fue desarrollado por mi

package Strings;

import java.util.Scanner;

public class remplazoCaracteres {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite una frase");
    String frase = sc.nextLine();
    System.out.println("Digite un caracter");
    char caracterOriginal = sc.nextLine().charAt(0);
    System.out.println("Digite otro caracter");
    char caracterReemplazo = sc.nextLine().charAt(0);
    sc.close();
    String nuevaFrase = frase.replace(caracterOriginal, caracterReemplazo);
    System.out.println(nuevaFrase);

  }
}