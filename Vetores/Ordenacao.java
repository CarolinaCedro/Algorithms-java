
import java.util.Scanner;
import java.util.Arrays;

public class Ordenacao {

  public static void main(String[] args) {
    float valoresOrdenados[] = new float[5];

    Scanner scanf = new Scanner(System.in);

    for (int i = 0; i < valoresOrdenados.length; i++) {
      System.out.println("Entre com o valor: ");
      valoresOrdenados[i] = scanf.nextFloat();
    }

    for (int ordenacao = 0; ordenacao < valoresOrdenados.length; ordenacao++) {
      Arrays.sort(valoresOrdenados);
      System.out.println(valoresOrdenados[ordenacao]);
    }

  }

}