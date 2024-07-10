package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class produtoSimples {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int PROD = a * b;

        System.out.printf("PROD = %d%n",PROD);

        scanner.close();
    }
}