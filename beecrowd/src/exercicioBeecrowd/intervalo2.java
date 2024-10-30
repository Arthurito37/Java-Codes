package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class intervalo2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i; /*Inicia a variavel i que irá armazenar a quantidade de vezes que o usuário enviará números*/
        i = scanner.nextInt();
        while (i == 0 || i < 0) {
            i = scanner.nextInt(); /*Recebe a quantidade de vezes que o número vai ser lido*/
        }
        int x = 0;
        int in = 0;
        int out = 0;
        int y;
        while (x < i) {
            y = scanner.nextInt();
            if (y >= 10 && y <= 20){
                in++;
                x++;
            } else {
                out++;
                x++;
            }

        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d in", out);

        scanner.close();
    }
}