package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class distanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a distância entre dois pontos:");
        System.out.println("Digite o x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Digite o y1:");
        double y1 = scanner.nextDouble();
        System.out.println("Digite o x2:");
        double x2 = scanner.nextDouble();
        System.out.println("Digite o y2:");
        double y2 = scanner.nextDouble();

        double p1 = (x2-x1) * (x2-x1);
        double p2 = (y2-y1) * (y2-y1);

        double distancia = Math.sqrt(p1+p2); //A função Math.sqrt faz a raiz quadrada
        System.out.printf("A distância entre esses dois pontos é %.4f",distancia);

        scanner.close();
    }
}
