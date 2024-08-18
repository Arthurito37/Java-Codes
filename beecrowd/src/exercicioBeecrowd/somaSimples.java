package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class somaSimples {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int [4];
        System.out.println("Digite a primeira parcela:");
        numeros [0] = scanner.nextInt();
        System.out.println("Digite a segunda parcela:");
        numeros [1] = scanner.nextInt();

        numeros [2] = numeros [0] + numeros [1];
        System.out.printf("SOMA = " + numeros [2]);
    }
}
