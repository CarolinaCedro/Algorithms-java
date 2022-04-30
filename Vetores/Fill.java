import java.util.Arrays;

public class Fill {
  public static void main(String[] args) {
    int vetor[] = { 1, 3, 5, 6, 99, 79, 34, 11, 1, 4 };

    for (int i = 0; i < vetor.length; i++) {
      Arrays.fill(vetor, 9);
      System.out.println(vetor[i]);
    }
  }
}