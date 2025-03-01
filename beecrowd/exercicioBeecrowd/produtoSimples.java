package exercicioBeecrowd.exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class produtoSimples {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int [4]; //ARRAY QUE ARMAZENA OS VALORES
        System.out.println("Digite o multiplicando:");
        numeros [0] = scanner.nextInt(); //RECEBE O MULTIPLICANDO
        System.out.println("Digite o multiplicador:");
        numeros [1] = scanner.nextInt(); //RECEBE O MULTIPLICADOR

        numeros [3]  = numeros [0] * numeros [1] ; //CALCULA O PRODUTO

        System.out.printf("PRODUTO = %d%n", numeros [3]);

        scanner.close();
    }
}
