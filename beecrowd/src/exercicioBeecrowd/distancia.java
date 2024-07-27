package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class distancia {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final int velX = 60;
        final int velY = 90;

        int distancia = scanner.nextInt();
        int tempo = (60*distancia)/30;
        System.out.println(tempo + " minutos");
        scanner.close();
    }
}
