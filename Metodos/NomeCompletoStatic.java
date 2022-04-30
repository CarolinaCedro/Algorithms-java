
import java.util.Scanner;

public class NomeCompletoStatic {

  static void nomeCompleto(String nome, String sobrenome) {
    String nomeCompleto = (nome + " " + sobrenome);
    System.out.println("O seu nome completo é " + nomeCompleto);
  }

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);
    nomeCompleto("Ana", "Cedro");
  }
}