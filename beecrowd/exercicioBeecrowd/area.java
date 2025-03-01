package exercicioBeecrowd.exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;

public class area {
    public static void main(String[] args) throws IOException {
        //chama classe sccaner
        Scanner scanner = new Scanner(System.in);
        // inicia a array que contém as medidas
        double [] medidas = new double [3];
        // inicia a array que contém as areas
        double areas [] = new double [5];
        System.out.println("DIGITE UM NÚMERO");
        medidas [0] = scanner.nextDouble();
        // valor A
        System.out.println("DIGITE OUTRO NÚMERO:");
        medidas [1] = scanner.nextDouble();
        // valor B
        System.out.println("DIGITE O ÚLTIMO NÚMERO:");
        medidas [2] = scanner.nextDouble();
        // valor C
        // declara o valor e pi
        final double pi = 3.14159;
        //areaTriaguloRetangulo
        areas [0] = (medidas [0]*medidas [2])/2;
        //areaCirculo
        areas [1] = pi * (medidas[2] * medidas [2]);
        //areaTrapezio
        areas [2]  = ((medidas [0]+medidas [1])*medidas [2])/2;
        //areaQuadrado
        areas [3]  = medidas [1]*medidas[1];
        //areaRetangulo
        areas [4]  = medidas [0]*medidas [1];
        
        System.out.printf("A ÁREA DO TRIANGULO RETÂNGULO: %.3f%n", areas[0]);
        System.out.printf("A ÁREA DO CIRCULO: %.3f%n", areas [1] );
        System.out.printf("A ÁREA DO TRAPEZIO: %.3f%n", areas [2] );
        System.out.printf("A ÁREA DO QUADRADO: %.3f%n", areas [3] );
        System.out.printf("A ÁREA DO RETANGULO: %.3f%n", areas [4] );

        //fecha a classe scanner
        scanner.close(); 
    }
}
