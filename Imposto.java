/*
Imposto sobre vendas – Crie um algoritmo que solicite ao usuário que insira o
valor da compra. O programa deve calcular os impostos de vendas estadual e
municipal. Suponha que o imposto estadual sobre vendas seja de 4% e o imposto
estadual sobre vendas seja de 2%. O programa deve exibir o valor da compra, o
imposto estadual sobre vendas, o imposto municipal sobre vendas, o imposto
total sobre vendas e o total da venda (que é a soma do valor da compra mais o
imposto total sobre vendas).

*/

import java.util.*;

public class Imposto {

  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);

    double compra, impostoEstadual, impostoMunicipal, impostoTotal;

    System.out.println("Entre com o valor da compra:");
    compra = scanf.nextInt();

    impostoEstadual = (compra * 0.4);
    impostoMunicipal = (compra * 0.2);
    impostoTotal = (impostoEstadual + impostoMunicipal);

    System.out.println("Valor compra:" + compra);
    System.out.println("Imposto estadual:" + impostoEstadual);
    System.out.println("Imposto municipal:" + impostoMunicipal);
    System.out.println("Imposto Total:" + impostoTotal);
    System.out.println("Valor Total:" + (impostoTotal + compra));

  }
}
