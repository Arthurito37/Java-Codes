package exercicioBeecrowd;
import java.util.Scanner;
import java.io.IOException;

public class oMaior {public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int [] numeros = new int [6];
    System.out.println("Digite um número:");
    numeros [0] = scanner.nextInt();
    System.out.println("Digite outro número:");
    numeros [1] = scanner.nextInt();
    System.out.println("Digite mais um número:");
    numeros [2] = scanner.nextInt();
    // A fórmula usa Math.abs para encontrar a diferença absoluta entre a e b
    // e então encontrar o maior valor entre a e b.
    numeros [3] = (numeros [0] + numeros [1] + Math.abs(numeros [0]-numeros [1]) ) / 2;
    //A fórmula usa Math.abs para encontrar a diferença absoluta entre maiorAB e c
    // e então encontrar o maior valor entre maiorAB e c.
    numeros [4] = (numeros [3] + numeros [2] + Math.abs(numeros [3] - numeros [2])) / 2;
    System.out.println(numeros [4] + " e o maior número digitado.");
    scanner.close();
    }
}

