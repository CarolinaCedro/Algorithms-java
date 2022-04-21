/*
Escreva um algoritmo que leia três números fornecidos pelo usuário e mostre se
a soma de dois deles resulta no terceiro.
*/

import java.util.Scanner;

public class Result3 {

  void verifyResults(int number1, int number2, int number3) {

    int soma1 = (number1 + number2);
    int soma2 = (number1 + number3);
    int soma3 = (number2 + number3);

    if (soma1 == number3) {
      System.out.println("A soma dos dos numeros é igual ao valor do terceito numero de valor: " + number3);
    } else if (soma2 == number2) {
      System.out.println("A soma dos dos numeros é igual ao valor de " + number2);
    } else if (soma3 == number1) {
      System.out.println("A soma dos dos numeros é igual ao valor de " + number1);
    } else {
      System.out.println("Soma não é igual a nenhum dos numeros inputados");
    }
  }

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    int number1, number2, number3;

    System.out.println("Entre com 3 numeros: ");
    number1 = scanf.nextInt();
    number2 = scanf.nextInt();
    number3 = scanf.nextInt();

    Result3 resultsComparation = new Result3();
    resultsComparation.verifyResults(number1, number2, number3);

  }

}
