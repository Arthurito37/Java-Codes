package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class salarioBonus {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do vendedor:");
    String name = scanner.nextLine();
    System.out.println("Qual é o salário fixo do funcionário:");
    double salary = scanner.nextDouble();
    System.out.println("Quantas vendas o funcionário realizou (Em Dinheiro)?");
    double sales = scanner.nextDouble();

    double porc = sales * 0.15;

    double total = salary + porc;

    System.out.printf("O valor total que o vendedor irá receber é R$ %.2f%n", total);
    scanner.close();
}
}
