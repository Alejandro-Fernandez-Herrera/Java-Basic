package Arrays;

public class diligenciarArrays {

  public static void main(String[] args) {
    int[] arreglo = new int[4 + (int) (Math.random() * 16)];
    System.out.print("\033[H\033[2J");
    for (int a = 0; a < arreglo.length; a++) {
      arreglo[a] = (int) (Math.random() * 100);
      System.out.print(arreglo[a] + " ");

    }
    System.out.println();
    for (int i = 0; i < arreglo.length; i++) {
      System.out.println(arreglo[i]);
    }
  }
}
