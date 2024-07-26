package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class diferenca {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int A = scanner.nextInt();
        System.out.println("Digite um outro número:");
        int B = scanner.nextInt();
        System.out.println("Digite um outro número:");
        int C = scanner.nextInt();
        System.out.println("Digite o último número:");
        int D = scanner.nextInt();

        int DIFERENCA = (A * B) - (C * D);

        System.out.println("A diferença da multiplicação do primeiro e do segundo número com o terceiro e do quarto número é " + DIFERENCA);

        scanner.close();
    }
}

