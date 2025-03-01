package exercicioBeecrowd.exercicioBeecrowd;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class media2 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        final double [] peso = new double[4]; // armazena os valores do peso das notas que são constantes
        double [] nota = new double [7];
        DecimalFormat df = new DecimalFormat("#.0"); // Define o formato com 1 casa decimal
        System.out.println("Digite a primeira nota:");
        nota [1] = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota [2] = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota [3] = scanner.nextDouble();
        System.out.println("Digite a quarta nota:");
        nota [4] = scanner.nextDouble();
        peso [0] = 2;
        peso [1] = 3;
        peso [2] = 4;
        peso [3] = 1;
        nota [0] = peso [0] + peso [1] + peso [2] + peso [3];
        nota [1] = nota [1] * peso [0]; //calcula a nota com primeiro peso
        nota [2] = nota [2] * peso [1]; //calcula a nota com segundo peso
        nota [3] = nota [3] * peso [2]; //calcula a nota com terceiro peso
        nota [4] = nota [4] * peso [3]; //calcula a nota com quarto peso

        nota [5] = (nota [1] + nota [2] + nota [3] + nota[4]) / nota [0]; //faz o calculo da média.
        String formato = df.format(nota[5]);
        nota[5] = Double.parseDouble(formato); // Arredondar e formatar os valores da matriz

        System.out.printf("Media: %.1f%n", nota [5]);
        if(nota [5] >= 7){
            System.out.println("Aluno aprovado.");
        } else if (nota [5] < 5) {
            System.out.println("Aluno reprovado.");
        } else if (nota [5] >= 5 && nota [5] < 6.9 ) {
            System.out.println("Aluno em exame.");
            System.out.println("Digite a nota do exame:");
            nota [6] = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", nota [6]);
            nota [5] = (nota [5] + nota [6]) / 2;
            if(nota [5] >= 5){
                System.out.println("Aluno aprovado");
                System.out.printf("Media final: %.1f%n", nota [5]);

            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", nota [5]);
            }
        }
        scanner.close();
    }
}
