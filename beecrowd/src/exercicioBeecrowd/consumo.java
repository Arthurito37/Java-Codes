package exercicioBeecrowd;

import java.io.IOException;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida:");
        double km = scanner.nextDouble();
        System.out.println("Digite a quantidade de litros consumida");
        double l = scanner.nextDouble();

        double consumoMedio = km/l;

        System.out.printf("FORAM PERCORRIDOS EM MÉDIA %.3f km/l%n", consumoMedio);

    scanner.close();

    }
}
