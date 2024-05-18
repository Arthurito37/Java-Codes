package exercicio1805;
import java.util.Scanner;
import java.util.Locale;
public class AluguelDeCarros {
    public static void main(String[]args){
        /**
         * Este código em JAVA faz um calculo do valor do aluguel de um carro
         * com base em quantos dias ele alugou o carro e quantidade de distãncia
         * percorrida
         * Data: 18/05/2024
         *
         * Criado por Arthur de Sousa Santana
         **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos dias o cliente permaneceu com o carro?");
        int dia = sc.nextInt();
        System.out.println("Quantos quilômetros o cliente andou com o carro?");
        double km = sc.nextDouble();
        final double valorDia = 86.75;
        final double valorKm = 1.23;
        double cashDia = dia * valorDia;
        double cashKm = km * valorKm;
        double valorFinal = cashDia + cashKm;
        System.out.println("Quantos dias você fou com o carro? "+ dia);
        System.out.println("Quantos quilometrôs você percorreu com o carro: " + km);
        System.out.printf("Você irá pagar  %.2f reais para a localiza.", valorFinal);
        sc.close();
    }
}
