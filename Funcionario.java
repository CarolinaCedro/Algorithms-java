
public class Funcionario {
  static String nome;
  static String sobreNome;
  static int horasTrabalhadas;
  static float valorHorasTrabalhadas;

  void nomeCompleto(String nome, String sobreNome) {
    System.out.println("Funcionario = " + nome + " " + sobreNome);
  }

  public int calcularSalario(int horasTrabalhadas, float valorHorasTrabalhadas) {
    int salario = (int) (horasTrabalhadas * valorHorasTrabalhadas);
    System.out.println("Salario = " + salario);
    return salario;
  }

  public int incrementarHoras(int adicionarHoras) {
    int hours = horasTrabalhadas += adicionarHoras;
    System.out.println("Horas adicionais = " + hours);
    return hours;
  }

  public static void main(String[] args) {
    Funcionario novoFuncionario = new Funcionario();
    novoFuncionario.nome = "Luis";
    novoFuncionario.sobreNome = "Silva";
    novoFuncionario.horasTrabalhadas = 10;
    novoFuncionario.valorHorasTrabalhadas = (float) 25.50;
    novoFuncionario.nomeCompleto(nome, sobreNome);
    novoFuncionario.calcularSalario(horasTrabalhadas, valorHorasTrabalhadas);
    novoFuncionario.incrementarHoras(8);

  }

}
