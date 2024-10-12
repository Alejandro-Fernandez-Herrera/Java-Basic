package estructurasDeControl;

import java.util.Scanner;

public class divisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el primer entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo entero: ");
        int numero2 = scanner.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("el resultado es: "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println("otro error");        }
    }



}
