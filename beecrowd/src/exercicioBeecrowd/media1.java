package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class media1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double [] peso = new double [3]; //array que armazenas o pesos que não são alterados
        double [] nota = new double [5]; //array que armazena as notas, a soma das notas e média final
        peso [0] = 3.5;  //atribui o peso da nota
        peso [1] = 7.5;  //atribui o peso da nota
        System.out.println("Digite a sua nota:");
        nota [0] = scanner.nextDouble(); //solicita ao usuário o peso da nota
        System.out.println("Digite a sua nota:");
        nota [1] = scanner.nextDouble(); //solicita ao usuário o peso da nota

        nota [3] = peso [0] + peso [1]; //soma as duas notas

        nota [0] = nota [0] * peso [0]; //faz os calculos da primeira nota com o peso
        nota [1] = nota [1] * peso [1]; //faz os calculas da segunda nota com o peso

        nota [4]= ((nota [0] + nota [1])/nota [3]); //faz o calculo da média
        System.out.printf("MEDIA = %.5f%n", nota [4]); //retorna a informação ao usuário
    }
}
