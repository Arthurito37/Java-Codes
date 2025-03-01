package exercicioBeecrowd.exercicioBeecrowd;
import java.util.Scanner;
import java.io.IOException;

public class conversaoDeTempo {public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int horas = 0;
    int minutos = 0;
    int segundos = 0;
    if (N >= 3600) {
        while (N >= 3600){
            N = N - 3600;
            horas = horas + 1;
        }
    }
    if (N < 3600 && N > 60) {
        while (N >= 60) {
            N = N - 60;
            minutos = minutos + 1;
        }
    }
    if (N < 60){
        segundos = N;
    }
    System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
