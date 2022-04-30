import java.util.Scanner;

public class NotasAlunos {

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    float notas[][] = new float[3][3];

    for (int i = 0; i < notas.length; i++) {
      for (int j = 0; j < notas[i].length; j++) {
        System.out.println("Entre com o valor na linha " + i + " na coluna " + j);
        notas[i][j] = scanf.nextFloat();
      }
    }

    for (int i = 0; i < notas.length; i++) {
      float soma = 0;
      for (int j = 0; j < notas[i].length; j++) {
        soma += notas[i][j];
        System.out.print(" " + notas[i][j]);
      }
      System.out.println();
      System.out.println("A media do aluno " + i + " é = " + (soma / 3));
    }
  }
}