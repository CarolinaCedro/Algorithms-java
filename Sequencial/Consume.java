/* 
Consumo de um automóvel – Nos EUA, a unidade de distância é a milha e
unidade de volume para abastecimento é o galão. Assim, o cálculo do consumo
de um carro em milhas por galão (MPG) de um automóvel podem ser calculadas
com a seguinte fórmula:
MPG =

Número de milhas percorridas
Número de galões de gasolina consumidos

A partir dessas informações, crie um algoritmo que solicite ao usuário quantas
milhas um determinado carro percorreu e quantos galões de gasolina ele
consumiu para percorrer essa distância. Com essas informações o algoritmo deve
calcular o consumo do carro em milhas por galão e exibir o resultado obtido na
tela.
*/

import java.util.*;

public class Consume {
  public static void main(String[] args) {

    try (Scanner scanf = new Scanner(System.in)) {
      float milhas, galoes, mpg;
      System.out.println("Entre com a quantidade de milhas que o carro percorreu: ");
      milhas = scanf.nextFloat();

      System.out
          .println("Entre com a quantidade de galoes de gasolina que foram consumidos para percorrer essa distancia: ");
      galoes = scanf.nextFloat();

      mpg = (milhas / galoes);

      System.out.println("Consumo do carro em milhas por galão = " + mpg);
    }
  }
}
