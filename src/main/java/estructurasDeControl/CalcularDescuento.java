/* 
2. Cálculo de Descuento:
En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto y determinará si tiene derecho a un descuento. 
Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. 
De lo contrario, se mostrará el precio original sin descuento.

 */
package estructurasDeControl;

import java.util.Scanner;

public class CalcularDescuento {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("precio del articulo: ");
    float precio = scanner.nextFloat();
    if (precio >= 100) {
      float descuento = (precio * 0.10F);
      System.out.println("su compra tiene un descuento de: $" + descuento);
      System.out.println("el nuevo precio es: $" + (precio - descuento));

    } else {
      System.out.println("gracias por su compra, el precio es: "+ precio);
    }
    scanner.close();
  }
}
