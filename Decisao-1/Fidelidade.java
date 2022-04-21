/*
O programa de fidelidade de uma determinada livraria premia seus clientes de
acordo com o número de livros comprados a cada mês. Os pontos são atribuídos
da seguinte forma:
• Se um cliente comprar 0 livros, ele ganhará 0 pontos.
• Se um cliente comprar um livro, ele ganhará 5 pontos.
• Se um cliente comprar dois livros, ele ganhará 15 pontos.
• Se um cliente comprar 3 livros, ele ganhará 30 pontos.
• Se um cliente comprar 4 ou mais livros, ele ganhará 60 pontos.
Crie um algoritmo que leia o número de livros comprado por um usuário e exiba
o número de pontos correspondentes.
*/

import java.util.Scanner;

public class Fidelidade {

  void calcularPontos(int qtdLivrosComprados) {

    switch (qtdLivrosComprados) {
      case 0:
        System.out.println("Você recebeu um total de 0 pontos");
        break;
      case 1:
        System.out.println("Você recebeu um total de 5 pontos");

        break;
      case 2:
        System.out.println("Você recebeu um total de 15 pontos");

        break;
      case 3:
        System.out.println("Você recebeu um total de 30 pontos");

        break;
      case 4:
        System.out.println("Você recebeu um total de 60 pontos");

        break;
      default:
        if (qtdLivrosComprados > 4) {
          System.out.println("Você recebeu um total de 60 pontos");
        }

        break;
    }

  }

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    int qtdLivrosComprados, cond;

    do {

      System.out.println("Entre com as quantidade de livros comprados: ");
      qtdLivrosComprados = scanf.nextInt();

      Fidelidade verify = new Fidelidade();

      verify.calcularPontos(qtdLivrosComprados);

      System.out.println("Deseja fazer mais uma verificação: ");
      System.out.println("(0)sair");
      System.out.println("(1)continuar:  ");
      cond = scanf.nextInt();

    } while (cond != 0);

  }

}
