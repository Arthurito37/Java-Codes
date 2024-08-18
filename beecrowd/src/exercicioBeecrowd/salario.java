package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class salario {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int [] inteiros = new int [3]; // armazena o código do funcionário e a hora
    double [] real = new double [3]; //armazena o valor da hora e do salário
    System.out.println("Digite o código do fuuncionário:");
    inteiros [0] = scanner.nextInt(); //recebe a código do trabalhador
    System.out.println("Digite as horas trabalhadas pelo funcionário:");
    inteiros [1] = scanner.nextInt(); //recebe as horas trabalhadas
    System.out.println("Quanto é o valor da hora do funcionário?");
    real [0] = scanner.nextDouble(); //recebe o valor da hora trabalhada

    real [1] = real [0] * inteiros [1];

    System.out.println("O número do funcionário é: " + inteiros [0]);
    System.out.printf("O funcionário irá receber U$ %.2f%n ", real [1]);

    scanner.close();
}
}
