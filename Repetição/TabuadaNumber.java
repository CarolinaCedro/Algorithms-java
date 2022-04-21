import java.util.Scanner;

/**
 * Escreva um programa que imprima na tela para escrever a tabuada de um número
 * fornecido pelo usuário, de 1 a 10.
 */

public class TabuadaNumber {

  void tabuada(int number) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + (number * i));
    }
  }

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    int number;

    System.out.println("Entre com um numero: ");
    number = scanf.nextInt();

    TabuadaNumber tabuadaResults = new TabuadaNumber();
    tabuadaResults.tabuada(number);
  }
}
