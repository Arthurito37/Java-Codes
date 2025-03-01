package exercicioBeecrowd.exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class gastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double [] dados= new double [4]; //armazena os dados
        final double eficiencia = 12.0;
        System.out.println("Quantas horas teve a viagem?");
        dados [0] = scanner.nextDouble(); //recebe as horas
        System.out.println("Qual foi a velocidade mantida durante a viagem?");
        dados [1] = scanner.nextDouble(); //recebe a velocidade
        dados [2] = dados [0] * dados [1];
        dados [3] = dados [2]/eficiencia; //calcula o gasto do combustivel
        System.out.printf("%.3f%n", dados [3]); //retorna os dados ao usuário
    }
}
