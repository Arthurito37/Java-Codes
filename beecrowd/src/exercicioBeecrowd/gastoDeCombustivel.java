package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class gastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int velocidade = scanner.nextInt();
        int distancia = horas*velocidade;
        final double eficiencia = 12.0;
        double gastoCombustivel = distancia/eficiencia;
        System.out.printf("%.3f%n", gastoCombustivel);
    }
}
