import java.util.Scanner;

public class CalculoMinimoLitros {

  void calculoLitros(float distanciaPercorrida, float consumo, int numeroVoltas, int numeroReabastecimento) {

    float totalPercurso, distReabastecimento, totalCombustivel, totalDistancia;
    totalDistancia = (distanciaPercorrida * numeroVoltas);
    totalPercurso = totalDistancia / 1000;
    distReabastecimento = (totalPercurso / numeroReabastecimento);
    totalCombustivel = (distReabastecimento / consumo);

    System.out.println("Total de combustivel ate o primeiro reabastecimento: " + totalCombustivel);
  }

  public static void main(String[] args) {
    try (Scanner scanf = new Scanner(System.in)) {
      float distanciaPercorrida, consumo;

      int numeroVoltas, numeroReabastecimento, cond = 1;
      while (cond == 1) {

        System.out.println("Bem vindo ao sistema de Calculo mínimo de litros por tanque !!!");
        System.out.println("Deseja fazer uma operação:");
        System.out.println("(1)Sim");
        System.out.println("(0)Não");
        cond = scanf.nextInt();

        if (cond == 1) {
          System.out.println("Entre com a Distancia percorrida: ");
          distanciaPercorrida = scanf.nextFloat();

          System.out.println("Entre com a quantidade de voltas percorridas: ");
          numeroVoltas = scanf.nextInt();

          System.out.println("Quantas vezes será reabastecido: ");
          numeroReabastecimento = scanf.nextInt();

          System.out.println("Qual o consumo por km: ");
          consumo = scanf.nextFloat();

          CalculoMinimoLitros calculoLitrosFunction = new CalculoMinimoLitros();
          calculoLitrosFunction.calculoLitros(distanciaPercorrida, consumo, numeroVoltas, numeroReabastecimento);
        } else {
          System.out.println("Sistema finalizado");
        }

      }

    }

  }

}
