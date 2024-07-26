package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class esfera {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        System.out.println("Qual o valor do raio do círculo?");
        double r = scanner.nextInt();

        double volume = (4.0/3) * pi * ((r*r)*r);

        System.out.printf("O VOLUME  DO CÍRCULO É IGUAL A %.3f%n", volume);

        scanner.close();
    }

}
