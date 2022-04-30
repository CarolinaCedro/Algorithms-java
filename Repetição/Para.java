
public class Para {

  public static void main(String[] args) {

    int number = 0;

    for (number = 0; number < 10; number++) {
      if (number % 2 == 0) {
        System.out.println("O numero " + number + " é par");
      } else {
        System.out.println("O numero " + number + " é impar");
      }
    }
  }

}