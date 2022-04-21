
public class ContaCorrente {

  float saldo;
  private boolean confirmation;

  void definirSaldoInicial(float valor) {
    saldo += valor;
  }

  void depositar(float valorDeposito) {

    saldo += valorDeposito;
  }

  public float getSaldo(float saldo) {
    return saldo;
  }

  public void sacar(float valorSaque) {
    this.saldo -= valorSaque;
    if (saldo >= valorSaque) {
      this.confirmation = true;
    }

    else {
      this.confirmation = false;
    }
  }

  boolean saqueOperação() {
    return confirmation;
  }

  public void verificaSaldo() {
    System.out.println("Valor do Saldo: " + getSaldo(saldo));
  }

  public static void main(String[] args) {

    ContaCorrente novaConta = new ContaCorrente();
    novaConta.confirmation = false;
    novaConta.definirSaldoInicial(1000);
    novaConta.verificaSaldo();
    novaConta.sacar(500);
    novaConta.verificaSaldo();
    novaConta.depositar(50);
    novaConta.verificaSaldo();
    novaConta.sacar(600);
    novaConta.verificaSaldo();
    System.out.println(novaConta.saqueOperação());

  }

}
