
public class Break {

  public static void main(String[] args) {

    int number = 0;

    while (number < 10) {
      number++;

      if (number == 7) {
        break;
      }

      System.out.println(number);
    }

  }

}