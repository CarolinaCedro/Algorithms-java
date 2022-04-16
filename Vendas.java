/*
Previsão de vendas – Sabendo que o lucro anual de uma empresa é, tipicamente,
23% do total de vendas, crie um algoritmo que solicite ao usuário entre com o
valor projetado do total de vendas e, em seguida, calcule e exiba o lucro que
deve ser obtido com esse valor.
*/

import java.util.*;

public class Vendas {
  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);
    float totalVendas, lucro;

    System.out.println("Entre com o valor projetado total de vendas:");
    totalVendas = scanf.nextFloat();

    lucro = (float) (totalVendas * 0.23);

    System.out.println("O lucro anual e:" + lucro);
    System.out.println("Valor bruto: " + (totalVendas + lucro));
  }
}
