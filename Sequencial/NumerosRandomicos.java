import java.util.Scanner;

public class NumerosRandomicos {
  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    System.out.println("Tente adivinhar o numero de 0 a 10:");
    System.out.println("Entre com a sua primeira sugestão: ");
    int palpite = scanf.nextInt();
    double number = Math.random();
    int n = (int) (1 + number * (10 - 1));
    if (palpite == n) {
      System.out.println("Carambolas você acertou!!!");
    } else if (n <= 5) {
      System.out.println("Dica: O numero está entre 1 a 5.. tente novamente");
      palpite = scanf.nextInt();
      if (palpite == n) {
        System.out.println("Numero aleatorio foi " + n);
        System.out.println("Você acertou!!!!");

      } else {
        System.out.println("Você errou!!!");
        System.out.println("Numero aleatorio foi " + n);
      }
    } else if (n > 5) {
      System.out.println("Dica: O numero está entre 6 a 10.. tente novamente");
      palpite = scanf.nextInt();
      if (palpite == n) {
        System.out.println("Numero aleatorio foi " + n);
        System.out.println("Você acertou!!!!");
      } else {
        System.out.println("Você errou!!!");
        System.out.println("Numero aleatorio foi " + n);
      }
    }

  }
}
