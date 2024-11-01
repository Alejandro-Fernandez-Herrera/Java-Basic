package Arrays;

public class menorElemento {

  public static void main(String[] args) {
    int[] arreglo = new int[4 + (int) (Math.random() * 16)];

    for (int a = 0; a < arreglo.length; a++) {
      arreglo[a] = (int) (Math.random() * 100);
      System.out.print(arreglo[a] + " ");
    }

    System.out.println("");
    int min = arreglo[0];

    for (int i = 1; i < arreglo.length; i++) {
      if (arreglo[i] < min) {
        min = arreglo[i];
      }
    }

    System.out.println("El menor número es: " + min);

  }
}
