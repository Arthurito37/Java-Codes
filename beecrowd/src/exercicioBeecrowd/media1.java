package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class media1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double peso1 = 3.5;
        final double peso2 = 7.5;

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double somaPeso = peso1 + peso2;

        nota1 = nota1 * peso1;
        nota2 = nota2 * peso2;

        double MEDIA = ((nota1 + nota2)/somaPeso);
        System.out.printf("MEDIA = %.5f%n", MEDIA);


    }
}