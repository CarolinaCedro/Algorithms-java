import java.util.Scanner;

class Notas {

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    int vetor[] = new int[10];

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("numero:");
      vetor[i] = scanf.nextInt();
    }

  }

}