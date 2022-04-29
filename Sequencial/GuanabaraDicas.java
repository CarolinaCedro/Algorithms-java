
import java.util.Scanner;

public class GuanabaraDicas {

  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);
    float valor = scanf.nextFloat();
    int numero = 5;

    numero++;
    System.out.println(numero);
    String valorRecebido = Float.toString(valor);

    System.out.println("saida de dados " + valorRecebido);

  }

}
