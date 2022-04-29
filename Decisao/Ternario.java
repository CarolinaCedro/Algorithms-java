
import java.util.Scanner;

public class Ternario {
  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    String condicaoIdade;
    int idade;

    System.out.println("Olá entre com sua idade:");
    idade = scanf.nextInt();

    condicaoIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade";

    System.out.println("Olá você se encaixa na categoria: " + condicaoIdade);
  }
}
