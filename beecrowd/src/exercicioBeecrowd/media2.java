package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class media2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double [] peso = new double[4]; // armazena os valores do peso das notas que são constantes
        double [] nota = new double [6];
        peso [0] = 2;
        peso [1] = 3;
        peso [2] = 5;

        nota [0] = peso [0] + peso [1] + peso [2]; // faz o calculo da soma dos pesos
        System.out.println("Digite a primeira nota:");
        nota [1] = scanner.nextDouble(); //recebe a primeira nota
        System.out.println("Digite a segunda nota:");
        nota [2] = scanner.nextDouble(); //recebe a segunda nota
        System.out.println("Digite a terceira nota:");
        nota [3] = scanner.nextDouble(); //recebe a terceira nota

        nota [1] = nota [1] * peso [0]; //calcula a nota com primeiro peso
        nota [2] = nota [2] * peso [1]; //calcula a nota com segundo peso
        nota [3] = nota [3] * peso [2]; //calcula a nota com terceiro peso

        nota [5] = (nota [1] + nota [2] + nota [3]) / nota [0]; //faz o calculo da média.

        System.out.printf("MEDIA = %.1f%n", nota [5]);
    }
}
