package Arrays;

public class inversoArray {

  public static void main(String[] args) {
    int[] arreglo = new int[4 + (int) (Math.random() * 16)];

    for (int a = 0; a < arreglo.length; a++) {
      arreglo[a] = (int) (Math.random() * 100);
      System.out.print(arreglo[a] + " ");
    }

    System.out.println();

    for (int i = arreglo.length - 1; i >= 0; i--) {
      System.out.print(arreglo[i] + " ");
    }
  }
}
