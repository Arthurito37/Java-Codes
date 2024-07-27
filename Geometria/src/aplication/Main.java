package aplication;
import entities.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Area retangulo = new Area();
        Area triangulo = new Area();
        Area quadrado = new Area();
        Area losango = new Area();
        Area circulo = new Area();
        System.out.println("Vamos calcular a área do Retângulo:");
        System.out.println("Digite o comprimento:");
        retangulo.A = scanner.nextDouble();

        System.out.println("Digite a largura:");
        retangulo.B = scanner.nextDouble();

        System.out.printf("A área do retângulo é igual a %.2f\n", retangulo.areaRetangulo());

        System.out.println("-----------------------------------");
        System.out.println("Vamos calcular a área do Quadrado:");
        System.out.println("Digite o lado do quadrado");
        quadrado.A= scanner.nextDouble();

        System.out.printf("A área do quadrado é igual a %.2f\n", quadrado.areaQuadrado());

        System.out.println("-----------------------------------");
        System.out.println("Vamos calcular a área do Triângulo:");
        System.out.println("Digite a base:");
        triangulo.A = scanner.nextDouble();
        System.out.println("Digite a altura:");
        triangulo.B = scanner.nextDouble();
        System.out.printf("A área do triângulo é igual a %.2f\n", triangulo.areaTriangulo());

        System.out.println("-----------------------------------");
        System.out.println("Vamos calcular a área do Losangulo:");

        System.out.println("Digite o lado maior:");
        losango.A = scanner.nextDouble();
        System.out.println("Digite o lado menor:");
        losango.B = scanner.nextDouble();
        System.out.printf("A área do losango é igual a %.2f\n", losango.areaLosango());

        System.out.println("-----------------------------------");
        System.out.println("Vamos calcular a área do Círculo:");
        System.out.println("Digite o raio:");
        circulo.A = scanner.nextDouble();
        System.out.printf("A área do círculo é igual a %.2f\n", circulo.areaCirculo());

        double maiorRetanguloQuadrado = ((retangulo.areaRetangulo() + quadrado.areaQuadrado() + Math.abs(retangulo.areaRetangulo() - quadrado.areaQuadrado())) / 2);
        double maiorQuadradoTriângulo = ((maiorRetanguloQuadrado + triangulo.areaQuadrado() + Math.abs(maiorRetanguloQuadrado - triangulo.areaQuadrado())) / 2);
        double maiorTrianguloLosangulo = ((maiorQuadradoTriângulo + losango.areaQuadrado() + Math.abs(maiorQuadradoTriângulo - losango.areaQuadrado())) / 2);
        double maiorLosanguloCirculo = ((maiorTrianguloLosangulo + circulo.areaCirculo() + Math.abs(maiorTrianguloLosangulo - circulo.areaCirculo())) / 2);

        System.out.printf("A forma geométrica que tem a maior área é a %.2f", maiorLosanguloCirculo);
    }
}
