
public class Return {

  static int soma(int numero1, int numero2) {
    int soma = (numero1 + numero2);
    return soma;
  }

  public static void main(String[] args) {
    int soma = soma(10, 20);
    System.out.println(soma);
  }
}