package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class area {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO");
        double A = scanner.nextDouble();
        System.out.println("DIGITE OUTRO NÚMERO:");
        double B = scanner.nextDouble();
        System.out.println("DIGITE O ÚLTIMO NÚMERO:");
        double C = scanner.nextDouble();
        double pi = 3.14159;
        double areaTriaguloRetangulo = (A*C)/2;
        double areaCirculo = pi * (C*C);
        double areaTrapezio = ((A+B)*C)/2;
        double areaQuadrado = B*B;
        double areaRetângulo = A*B;
        System.out.printf("A ÁREA DO TRIANGULO RETÂNGULO: %.3f%n", areaTriaguloRetangulo);
        System.out.printf("A ÁREA DO CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("A ÁREA DO TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("A ÁREA DO QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("A ÁREA DO RETANGULO: %.3f%n", areaRetângulo);

        scanner.close();
    }
}
