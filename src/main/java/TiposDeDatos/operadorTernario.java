import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("el numero 1 es divisible entre el numero 2?");
        System.out.print("ingresa el primer numero: ");
        float num1 = scanner.nextFloat();
        System.out.print("ingresa el segundo numero: ");
        float num2 = scanner.nextFloat();

        String resultado = (num1 % num2) == 0 ? "es divisible." : "no es divisible";
        System.out.println(resultado);

        scanner.close();
    }
}
