/*
✏️  Actividad: Practicando con estructuras de control
En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
Si la puntuación está entre 90 y 100, se mostrará "A".
Si la puntuación está entre 80 y 89, se mostrará "B".
Si la puntuación está entre 70 y 79, se mostrará "C".
Si la puntuación está entre 60 y 69, se mostrará "D".
Si la puntuación es menor a 60, se mostrará "F".
Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
El programa mostrará en la consola el valor de la calificación obtenida.
Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta.  
*/

package estructurasDeControl;

import java.util.Scanner;

public class EjercicioDeClasificacion {
    public static void main(String[] args) {
        System.out.print("Ingresa un numero entre 0 y 100: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero >= 0 && numero <= 100) {
            // codigo si se encuentra en el rango
            // System.out.println("mensaje de prueba, ingresa en el rango");
            if (numero >= 90 && numero <= 100) {
                System.out.println("A");
            } else if (numero >= 80 && numero <= 89) {
                System.out.println("B");
            } else if (numero >= 70 && numero <= 79) {
                System.out.println("C");
            } else if (numero >= 60 && numero <= 69) {
                System.out.println("D");
            } else {
                System.out.println("F(?)");
            }
        } else {
            System.out.println("por favor ingresar un numero entre 0 y 100.");
        }

        scanner.close();

    }
}
