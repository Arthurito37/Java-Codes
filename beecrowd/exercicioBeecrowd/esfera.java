package exercicioBeecrowd.exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class esfera {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        double [] dados = new double [3]; //armazena os dados
        System.out.println("Qual o valor do raio do círculo?");
        dados [0] = scanner.nextDouble(); //recebe o dados do usuário

        dados [1] = (4.0/3) * pi * ((dados [0]*dados [0])*dados [0]); //realiza o calculo do volume

        System.out.printf("O VOLUME  DO CÍRCULO É IGUAL A %.3f%n", dados [1]); //retorna ao usuario o calculo do volume

        scanner.close();
    }

}
