package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class media2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double peso1 = 2;
        final double peso2 = 3;
        final double peso3 = 5;

        final double somaMedia = peso1 + peso2 + peso3;

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        A = A * peso1;
        B = B * peso2;
        C = C * peso3;

        double MEDIA = (A + B + C) / somaMedia;

        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
