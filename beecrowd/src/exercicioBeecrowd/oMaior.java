package exercicioBeecrowd;
import java.util.Scanner;
import java.io.IOException;

public class oMaior {public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número:");
    int a = scanner.nextInt();
    System.out.println("Digite outro número:");
    int b = scanner.nextInt();
    System.out.println("Digite mais um número:");
    int c = scanner.nextInt();
    // A fórmula usa Math.abs para encontrar a diferença absoluta entre a e b
    // e então encontrar o maior valor entre a e b.
    int MaiorAB = (a + b + Math.abs(a-b) ) / 2;
    //A fórmula usa Math.abs para encontrar a diferença absoluta entre maiorAB e c
    // e então encontrar o maior valor entre maiorAB e c.
    int MaiorABC = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;
    System.out.println(MaiorABC + " e o maior número digitado.");
    scanner.close();
    }
}
