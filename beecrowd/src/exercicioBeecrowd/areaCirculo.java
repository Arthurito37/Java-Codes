package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class areaCirculo{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double n = 3.14159;

        double raio = scanner.nextDouble();
        double area = n * (raio * raio);

        System.out.printf("A=%.4f%n", area);

        scanner.close(); // Boa prática para fechar o scanner
    }
}