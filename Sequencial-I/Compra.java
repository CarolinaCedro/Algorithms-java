
/*
 * Valores de uma Compra – Um cliente de uma loja está comprando cinco
 * produtos. Crie um algoritmo que solicite o preço de cada um desses produtos
 * e,
 * em seguida, exiba o subtotal da venda, o valor do imposto e o valor total
 * (subtotal da venda mais o valor do imposto). Suponha que a alíquota do
 * imposto
 * seja de 6% sobre o subtotal da venda.
 */
import java.util.*;

public class Compra {
  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    float produtos[] = new float[5], soma = 0;
    int i;
    double imposto;

    System.out.println("Entre com o valor dos produtos comprados:");

    for (i = 0; i < produtos.length; i++) {
      System.out.println("Valor produto " + i + " :");
      produtos[i] = scanf.nextFloat();
      soma = soma + produtos[i];
    }

    System.out.println("Valor total dos itens: " + soma);
    imposto = (soma * 0.6);
    System.out.println("Valor imposto: " + imposto);
    System.out.println("O valor total da compra com imposto e: " + (soma + imposto));

  }
}