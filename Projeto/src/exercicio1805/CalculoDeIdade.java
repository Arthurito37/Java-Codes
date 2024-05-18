package exercicio1805;
import java.time.LocalDate;
import java.util.Scanner;
public class CalculoDeIdade {
    public static void main(String[] args) {
        /**
         * Este código em JAVA faz o calculo de idade com base na data atual e na data de nascimento.
         *
         * Data: 18/05/2024
         *
         * Criado por Arthur de Sousa Santana
         **/
        Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        System.out.println("Em qual ano você nasceu?");
        int dataNasc = sc.nextInt();
        int anoAtual;
        anoAtual = LocalDate.now().getYear();
        int idadeAtual = anoAtual - dataNasc;
        System.out.println("Com a data de hoje 18/05/2024 você tem "+ idadeAtual +" anos de idade.");
        sc.close();
    }
}

