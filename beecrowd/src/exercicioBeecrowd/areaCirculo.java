package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class areaCirculo{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double n = 3.14159;
        System.out.println("Digite o raio do círculo:");
        
        // cria a matriz que recebe o dados
        double [] i = new double[2];
        // recebe o raio
        i [0] = scanner.nextDouble();
        // armaneza o valor da área
        i [1] = n * (i [0] * i [0]);

        System.out.printf("A=%.4f%n", i [1]);

        scanner.close(); // Boa prática para fechar o scanner
    }
}
