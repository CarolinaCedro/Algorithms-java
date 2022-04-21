
import java.util.Scanner;

public class Maior {

  void numeroMaior(int number1, int number2) {
    if (number1 == number2) {
      System.out.println("Numeros iguais");
    } else if (number1 > number2) {
      System.out.println(number1 + " é maior");
    } else {
      System.out.println(number2 + " é maior");
    }
  }

  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);

    int number1, number2;

    System.out.println("Entre com 2 numeros:");
    number1 = scanf.nextInt();
    number2 = scanf.nextInt();

    Maior numberComparation = new Maior();

    numberComparation.numeroMaior(number1, number2);

  }
}