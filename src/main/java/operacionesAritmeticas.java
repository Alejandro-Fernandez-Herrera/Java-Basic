import java.util.Scanner;;

public class operacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // suma, resta, multiplicacion, división y modulo
        System.out.print("ingresa el primer numero: ");
        float num1 = scanner.nextInt();
        System.out.print("ingresa el segundo numero: ");
        float num2 = scanner.nextInt();

        float suma = num1 + num2;
        float resta = num1 - num2;
        float multiplicacion = num1 * num2;
        float división = num1 / num2;
        float modulo = num1 % num2;

        System.out.println("los resultados son los siguientes");
        System.out.println("la suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("la resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("la division de " + num1 + " y " + num2 + " es: " + división);
        System.out.println("el modulo de " + num1 + " y " + num2 + " es: " + modulo);
        scanner.close();
    }
}

//pendiente un bloque try-catch para el denominador en cero