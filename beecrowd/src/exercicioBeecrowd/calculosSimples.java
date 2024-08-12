package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class calculosSimples {public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int [] codEquant = new int [5];
    double [] valores = new double [3];
    System.out.println("Digite o código da vestimenta:");
    // recebe o código
    codEquant [0] = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    // recebe a quantidade de vestimentas
    codEquant [1] = scanner.nextInt();
    System.out.println("Digite o valor da vestimenta");
    //recebe o valor da vestimenta
    valores [0] = scanner.nextDouble();
    //faz o calculo do valor da compra
    valores [0] = valores [0] * codEquant [1];

    System.out.println("Digite o código da segunda vestimenta:");
    // recebe o código
    codEquant [2] = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    // recebe a quantidade de vestimentas
    codEquant [3] = scanner.nextInt();
    System.out.println("Quantas vestimentas o cliente irá levar?");
    //recebe o valor da vestimenta
    valores [1] = scanner.nextDouble();
    //faz o calculo do valor da compra
    valores [1] = codEquant [3] * valores[1];
    //faz o calculo do valor final da compra
    valores [2] = (valores [0] + valores [1]);
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valores [2]);

    scanner.close();
}
}
