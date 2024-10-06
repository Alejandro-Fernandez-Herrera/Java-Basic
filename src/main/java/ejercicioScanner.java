/* 
Actividad: Usando la Clase Scanner 
Para entender mejor el concepto de esta clase, practicarás con los siguientes ejercicios: 
Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
 */

import java.util.Scanner;


public class ejercicioScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // se instancia con scanner, podría llamarse de cualquier forma, pero es importante que sea claro

        System.out.println("ingresa tu nombre: ");
        String nombre = scanner.nextLine(); //especial atención al caseSensitive de Java -> es Line es con mayúscula en la 'L'!!!
        System.out.println("su nombre es: " + nombre);

        System.out.println("ingresa tu edad: ");
        int edad = scanner.nextInt(); 
        System.out.println("su edad es: " + edad);

        System.out.println("su nombre es: " + nombre + " y su edad es: " + edad);

        scanner.close();
    }
}

/*
 * next solo leerá hasta que encuentre un espacio, es mejor ocupar nextline para que lea hasta que sea pulsado el enter!!!
 */