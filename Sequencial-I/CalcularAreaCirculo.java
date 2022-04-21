
/**
 * 
 * Calcular a área do círculo
 */
import java.util.Scanner;

public class CalcularAreaCirculo {

  void calculoArea(double raio) {
    double area = (2 * Math.PI * raio);
    System.out.println("A area do circulo e:" + area);
  }

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);
    double raio;

    System.out.println("Entre com o raio: ");
    raio = scanf.nextDouble();

    CalcularAreaCirculo verify = new CalcularAreaCirculo();
    verify.calculoArea(raio);

  }
}
