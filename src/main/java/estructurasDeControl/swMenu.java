/* 
Actividad: Selección de Opción
En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
Opción 1: "Guardar"
Opción 2: "Cargar"
Opción 3: "Salir"
El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada. 
*/

package estructurasDeControl;

import java.util.Scanner;

public class swMenu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("menu de opciones ");
    System.out.println("1 para guardar ");
    System.out.println("2 para cargar ");
    System.out.println("3 para salir ");
    System.out.print("Ingrese una opcion: ");

    int opcionmenu = scanner.nextInt();
    String opcionmenuString;

    switch (opcionmenu) {
      case 1 -> opcionmenuString = "guardado";
      case 2 -> opcionmenuString = "cargado";
      case 3 -> opcionmenuString = "saliendo...";
      default -> opcionmenuString = "ingresa una opción válida.";
    }
    System.out.println(opcionmenuString);
    scanner.close();
  }
}
