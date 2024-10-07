import java.util.Scanner;


public class operadoresDeComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el primer numero: ");
        float num1 = scanner.nextInt();
        System.out.print("ingresa el segundo numero: ");
        float num2 = scanner.nextInt();
        
        boolean igual = num1 == num2;
        boolean menor = num1 < num2;
        boolean mayor = num1 > num2;



        System.out.println("el numero " + num1 + " es igual al numero " + num2 + ". Lo anterior es: " + igual);
        System.out.println("el numero " + num1 + " es menor al numero " + num2 + ". Lo anterior es: " + menor);
        System.out.println("el numero " + num1 + " es mayor al numero " + num2 + ". Lo anterior es: " + mayor);


        scanner.close();
    }
}

/*
 el operador ternario consta de tres partes, 
 variable = condicion ? valorSiVerdadero: valorSiFalso;
 */