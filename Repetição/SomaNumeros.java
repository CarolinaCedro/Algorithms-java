
/**
 * Crie um programa para que retorne o somatório de todos os números entre 1 e um
valor fornecido pelo usuário. Por exemplo, se o usuário fornecer o número 4, o
computador deverá calcular o somatório 1+ 2 + 3 + 4 = 10.
 */

import java.io.Console;
import java.util.Scanner;

public class SomaNumeros {

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    int number;
    int soma = 0;

    System.out.println("Entre com um numero: ");
    number = scanf.nextInt();
    for (int i = 1; i <= number; i++) {
      soma += i;
    }

    System.out.println(soma);
  }

}
