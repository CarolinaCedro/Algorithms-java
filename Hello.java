import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);

    String name, adress, city, state, profession;
    int cep, phone;

    System.out.print("your name:");
    name = scanf.nextLine();

    System.out.print("your adress:");
    adress = scanf.nextLine();

    System.out.print("your city:");
    city = scanf.nextLine();

    System.out.print("your state:");
    state = scanf.nextLine();

    System.out.print("your profession:");
    profession = scanf.nextLine();

    System.out.print("your Cep:");
    cep = scanf.nextInt();

    System.out.print("your phone:");
    phone = scanf.nextInt();

    System.out
        .println("your name is " + name + " your adress is " + adress + " your city is " + city + " your state is "
            + state + " your profession is " + profession + " your cep is " + cep + " your phone is " + phone);

  }

}