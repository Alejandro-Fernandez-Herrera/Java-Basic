package integrador;


import java.util.ArrayList;
import java.util.Scanner;

public class registroAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                        break;
                    }

                    System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
                    double nota;
                    try {
                        nota = Double.parseDouble(scanner.nextLine());
                        if (nota < 0.00 || nota > 10.00) {
                            System.out.println("La nota debe estar entre 0.00 y 10.00.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese una nota válida.");
                        break;
                    }

                    nombres.add(nombre);
                    notas.add(nota);
                    System.out.println("Alumno registrado con éxito.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Alumnos ---");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". Nombre: " + nombres.get(i) + ", Nota: " + notas.get(i));
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        double sumaNotas = 0;
                        for (double n : notas) {
                            sumaNotas += n;
                        }
                        double promedio = sumaNotas / notas.size();
                        System.out.println("El promedio de las notas es: " + promedio);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    nombre = scanner.nextLine().trim();
                    int index = nombres.indexOf(nombre);
                    if (index != -1) {
                        System.out.println("Nota de " + nombre + ": " + notas.get(index));
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el nombre del alumno para modificar la nota: ");
                    nombre = scanner.nextLine().trim();
                    index = nombres.indexOf(nombre);
                    if (index != -1) {
                        System.out.print("Ingrese la nueva nota (0.00 - 10.00): ");
                        try {
                            nota = Double.parseDouble(scanner.nextLine());
                            if (nota < 0.00 || nota > 10.00) {
                                System.out.println("La nota debe estar entre 0.00 y 10.00.");
                                break;
                            }
                            notas.set(index, nota);
                            System.out.println("Nota modificada con éxito.");
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingrese una nota válida.");
                        }
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Ingrese el nombre del alumno a eliminar: ");
                    nombre = scanner.nextLine().trim();
                    index = nombres.indexOf(nombre);
                    if (index != -1) {
                        nombres.remove(index);
                        notas.remove(index);
                        System.out.println("Alumno eliminado con éxito.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }
}
