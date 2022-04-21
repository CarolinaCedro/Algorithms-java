/**
 * Projete um algoritmo que imprima uma lista de todos os números ímpares entre
 * 0
 * e 30. Cada número deve ser impresso ao lado do seu dobro e do seu triplo.
 */

public class NumberImpar {

  void imparValue() {
    for (int i = 0; i <= 30; i++) {
      if (i % 2 != 0) {
        int doubleNumber, tripleNumber;
        doubleNumber = (i * 2);
        tripleNumber = (i * 3);

        System.out.println(i + " double: " + doubleNumber + " triple: " + tripleNumber);

      }
    }
  }

  public static void main(String[] args) {

    NumberImpar verify = new NumberImpar();
    verify.imparValue();
  }
}
