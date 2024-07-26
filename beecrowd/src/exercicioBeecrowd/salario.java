package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class salario {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o código do fuuncionário:");
    int number = scanner.nextInt();
    System.out.println("Digite as horas trabalhadas pelo funcionário:");
    int hours = scanner.nextInt();
    System.out.println("Quanto é o valor da hora do funcionário?");
    double valueHour = scanner.nextDouble();

    double salary = valueHour * hours;

    System.out.println("O número do funcionário é: " + number);
    System.out.printf("O funcionário irá receber U$ %.2f%n ", salary);

    scanner.close();
}
}
