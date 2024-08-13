package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class diferenca {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int [] valores = new int [4]; //inicia a matriz com quatro valores
        System.out.println("Digite um número:");
        valores [0] = scanner.nextInt(); // recebe o primeiro valor
        System.out.println("Digite um outro número:");
        valores [1] = scanner.nextInt(); // recebe o segundo valor
        System.out.println("Digite um outro número:");
        valores [2] = scanner.nextInt(); // recebe o terceiro valor
        System.out.println("Digite o último número:");
        valores [3] = scanner.nextInt(); // recebe o quarto valor

        valores [4] = (valores [0] * valores [1]) - (valores [2] * valores [3]); // realiza os calculos da diferença da 
        //da multiplicação dos primeiro com o segundo do terceiro com o quarto

        System.out.println("A diferença da multiplicação do primeiro e do segundo número com o terceiro e do quarto número é " + valores [4]);

        scanner.close();
    }
}

