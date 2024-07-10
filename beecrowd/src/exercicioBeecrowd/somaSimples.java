package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class somaSimples {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int soma = a + b;
        System.out.printf("SOMA = " + soma);
    }
}
