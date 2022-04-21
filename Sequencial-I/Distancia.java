
/*
Distância percorrida por um automóvel – Supondo que não haja acidentes ou
atrasos, a distância que um automóvel percorre numa rodovia pode ser
calculada com a seguinte fórmula:

Sabendo disso, construa um algoritmo em que o usuário possa informar a
velocidade em que um carro está viajando e exiba as seguintes informações:
• A distância que o carro percorrerá em 5 horas;
• A distância que o carro percorre em 8 horas;
• A distância que o carro percorrerá em 12 horas.

Distância = velocidade × tempo

*/

import java.util.*;

public class Distancia {
  public static void main(String[] args) {

    Scanner scanf = new Scanner(System.in);

    int velocidade;
    System.out.println("Entre com a velocidade do carro: ");
    velocidade = scanf.nextInt();

    System.out.println("Em 5 horas voce percorerra " + velocidade * 5 + " km");
    System.out.println("Em 8 horas voce percorerra " + velocidade * 8 + " km");
    System.out.println("Em 12 horas voce percorerra " + velocidade * 12 + " km");

  }
}
