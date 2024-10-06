/* 
Scanner deberá ser importada, corresponde al paquete Java.Util
Scanner es una clase, luego se debe instanciar, por ello encontramos Scanner como clase y scanner como instancia (con la primera letra minuscula)
como buena practica se requiere cerrar el metodo scanner

*/

import java.util.Scanner;

public class leerDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        String saludo = "hola, escribe tu edad: ";
        System.out.println(saludo);
        edad = scanner.nextInt();
        System.out.println("su edad es: " + edad);
        scanner.close();
    }
}

