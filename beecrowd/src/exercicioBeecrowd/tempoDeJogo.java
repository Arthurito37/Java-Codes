package exercicioBeecrowd;
import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 *
 * Entrada
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 *
 * Saída
 * Apresente a duração do jogo conforme exemplo abaixo.
 *
 *
 * Data: 24/08/2024
 * Criado por Arthur de Sousa Santana
 **/
public class tempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] hora = new int [4];
        hora [0] = scanner.nextInt();
        hora [1] = scanner.nextInt();
        hora [3] = hora [1] - hora [0];
        if (hora [3] < 0){
            hora [3] = (hora [0] - hora [1] - 24) * -1;
        }else if (hora [3] == 0){
            hora [3] = 24;
        } else {
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", hora [3]);

    }
}
