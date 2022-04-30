import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);

    int number[] = new int[5];

    for (int i = 0; i < number.length; i++) {
      System.out.println("Entre com um numeros:");
      number[i] = scanf.nextInt();
    }

    for (int i = 0; i < number.length; i++) {
      System.out.println(number[i]);
    }
  }

}