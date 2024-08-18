package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class salarioBonus {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String [] name = new String [1];
    double [] valores = new double [4];
    System.out.println("Digite o nome do vendedor:");
    name [0] = scanner.nextLine();
    System.out.println("Qual é o salário fixo do funcionário:");
    valores [0] = scanner.nextDouble();
    System.out.println("Quantas vendas o funcionário realizou (Em Dinheiro)?");
    valores [1] = scanner.nextDouble();

    valores [2] = valores [1] * 0.15;

    valores [3] = valores [0] + valores [2];

    System.out.printf("O valor total que o vendedor irá receber é R$ %.2f%n", valores [3]);
    scanner.close();
}
}

