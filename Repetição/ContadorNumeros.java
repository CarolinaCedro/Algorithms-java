
import java.util.Scanner;

public class ContadorNumeros {

  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);

    String condition;
    int number = 0, soma = 0;

    do {
      System.out.println("Entre com um numero: ");
      number = scanf.nextInt();
      System.out.println("Deseja continuar: [S/N]:");
      condition = scanf.next();

      soma += number;
    } while (condition.equals("S"));
    System.out.println("A soma é:" + soma);
  }

}