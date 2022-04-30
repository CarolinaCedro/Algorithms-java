
public class CanetaModels {

  String modelo;
  String cor;
  float ponta;
  boolean tampada;

  public void status() {
    System.out.println("O modelo da caneta é " + this.modelo);
    System.out.println("A cor é " + this.cor);
    System.out.println("A ponta é " + this.ponta);

    tampar(tampada);
  }

  public static void rabiscar(boolean tampada) {
    if (tampada == true) {
      System.out.println("A caneta não pode rabiscar, pois está tampada!");
    } else {
      System.out.println("A caneta está rabiscando");
    }
  }

  public static void tampar(boolean tampada) {
    tampada = true;
    System.out.println("está tampada: " + tampada);
  }
}