
public class Continue {

  public static void main(String[] args) {
    int number = 0;

    while (number < 10) {
      number++;
      if (number == 2 || number == 5 || number == 9) {
        continue;
      }
      System.out.println("looping" + number);
    }
  }

}
