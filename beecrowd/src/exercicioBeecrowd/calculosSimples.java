package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class calculosSimples {public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o código da vestimenta:");
    int code = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    int quant = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    double valor = scanner.nextDouble();

    valor = valor * quant;

    System.out.println("Digite o código da segunda vestimenta:");
    int code2 = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    int quant2 = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    double valor2 = scanner.nextDouble();

    valor2 = quant2 * valor2;

    double total = (valor + valor2);
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    scanner.close();
}
}
