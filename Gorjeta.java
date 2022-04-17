/* 
10. Gorjeta, Imposto e Total Pago por uma Refeição – Crie um algoritmo que peça
para o usuário informar o valor de uma refeição num restaurante. A partir desse
valor, o algoritmo deverá calcular o valor da gorjeta (15% sobre o valor da
refeição), dos impostos (7% do valor da refeição) e o total a ser pago (valor da
refeição mais os valores da gorjeta e dos impostos). Ao final, o algoritmo deverá
exibir cada um desses valores e o total.
*/

import java.util.*;

public class Gorjeta {

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    float valorRefeição;
    float gorjeta, total;
    double imposto;

    System.out.print("Entre com o valor da refeição: ");
    valorRefeição = scanf.nextFloat();

    gorjeta = (float) (valorRefeição * 0.15);
    imposto = (valorRefeição * 0.07);
    total = (float) (valorRefeição + gorjeta + imposto);

    System.out.println("O valor darefeição foi: " + valorRefeição);
    System.out.println("O valor da gorjeta aplicado ao valor da refeição é:" + gorjeta);
    System.out.println("O valor do imposto aplicado sobre o valor da refeição é:" + imposto);
    System.out.println("O valor total da refeição com gorjeta e imposto é: " + total);
  }

}
