package exercicioBeecrowd.exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class distanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double [] xy = new double [8]; //cria a matriz que armazena os valores
        System.out.println("Vamos calcular a distância entre dois pontos:");
        System.out.println("Digite o x1:");
        xy [0] = scanner.nextDouble(); //recebe x1
        System.out.println("Digite o y1:");
        xy [2] = scanner.nextDouble(); //recebe y1
        System.out.println("Digite o x2:");
        xy [1] = scanner.nextDouble(); //recebe x2
        System.out.println("Digite o y2:");
        xy [3] = scanner.nextDouble(); //recebe y2

        xy [4] = (xy [1]-xy [0]) * (xy [1] - xy [0]); // calcula a distância entre o ponto x1 e x2
        xy [5] = (xy [3]-xy [2]) * (xy [3]-xy [2]);// calcula a distância entre o ponto y1 e x2

        xy [6] = Math.sqrt(xy [4]+xy [5]); //A função Math.sqrt faz a raiz quadrada
        System.out.printf("A distância entre esses dois pontos é %.4f",xy [6]);

        scanner.close();
    }
   
}
