/*
Um brechó revende produtos usados, e fixa o preço de venda de cada produto
conforme o valor de sua aquisição: se o preço de aquisição de um produto é menor
do de R$ 50.00, ele deve ser vendido por um preço 45% maior; caso contrário, o
lucro será de 30%. Sabendo disso, construa um algoritmo que leia o valor de
aquisição de um produto e mostre o seu valor de venda.
*/

import java.util.Scanner;

public class Brecho {

  void verificaValorAquisição(float valorProduto) {

    if (valorProduto < 50) {

      float valorPagar = (valorProduto + (float) (valorProduto * 0.45));
      System.out.println("Valor a pagar :" + valorPagar);
    } else {
      float valorPagar = (valorProduto + (float) (valorProduto * 0.30));
      System.out.println("Valor a pagar :" + valorPagar);
    }
  }

  public static void main(String[] args) {

    float valorProduto;
    Scanner scanf = new Scanner(System.in);
    System.out.println("Valor de aquisição de um produto: ");
    valorProduto = scanf.nextFloat();

    Brecho valorPagar = new Brecho();
    valorPagar.verificaValorAquisição(valorProduto);

  }

}
