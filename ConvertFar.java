
/*
Conversão de graus Celsius para Fahrenheit – Crie um algoritmo que converta
graus Celsius em Fahrenheit. 
*/

import java.util.*;

public class ConvertFar {
  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);

    float celsius, Fahrenheit;
    System.out.println("Entre com a temperatura em Celsius: ");
    celsius = scanf.nextFloat();

    Fahrenheit = (float) ((celsius * 1.8) + 32.);

    System.out.println("A temperatura em fahrenheit e: " + Fahrenheit);

  }
}
