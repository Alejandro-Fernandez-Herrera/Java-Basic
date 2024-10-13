package estructurasDeControl;

import java.util.Scanner;

/* 
Actividad: Clasificación de Números
En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.
*/

public class clasificarNumeros {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        System.out.println("ingresa un numero entero: ");
        int numero = tecladoScanner.nextInt();
        if (numero < 0) {
            System.out.println("el numero " + numero + " es un numero negativo.");
        } else if (numero > 0) {
            System.out.println("el numero " + numero + " es un numero positivo.");
        } else {
            System.out.println("el numero " + numero + " es cero.");
        }
        tecladoScanner.close();
    }

}
