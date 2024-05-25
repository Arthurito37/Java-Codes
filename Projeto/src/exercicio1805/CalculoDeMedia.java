package exercicio1805;
import java.util.Scanner;
import java.util.Locale;
public class CalculoDeMedia {
    public static void main(String[] args) {
        /**
         * Este código em JAVA faz um conta da média do estudante com base em três notas.
         * Data: 18/05/2024
         *
         * Criado por Arthur de Sousa Santana
         **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do estudante: ");
        String nome = sc.next();
        System.out.println("Digite o RA do estudante: ");
        String RA = sc.next();
        System.out.println("Digite o primeira nota do estudante: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite o segunda nota do estudante: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite o terceira nota do estudante: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Digite seu nome para cadastro: " + nome);
        System.out.println("por favor, digite seu RA: " + RA);
        System.out.println("Digite a primeira nota: " + nota1);
        System.out.println("Digite a segunda nota: " + nota2);
        System.out.println("Digite a terceira nota: " + nota3);
        System.out.println("Querido estudante " + nome + " do RA " + RA + " sua média é igual a " + media + ".");

        if (media > 7.0){
            System.out.println("Você foi aprovado.");
        } else if (media > 5.0 && media < 7.0){
            System.out.println("Você está de recuperação");
        } else
            System.out.println("Você foi reprovado:");


        sc.close();
    }
}
