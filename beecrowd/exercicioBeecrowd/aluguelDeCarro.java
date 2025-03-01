package exercicioBeecrowd.exercicioBeecrowd;
import java.util.Locale;
import java.util.Scanner;

public class aluguelDeCarro {
    public static void main(String[]args){
    /**
     * Este código em JAVA faz um calculo do valor do aluguel de um carro
     * com base em quantos dias ele alugou o carro e quantidade de distãncia
     * percorrida
     * Data: 19/08/2024
     *
     * Criado por Arthur de Sousa Santana
     **/
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    final double [] valorDiaKM = new double [3]; //array que armazena os valor do dia e do km
    double [] valores = new double [6];
    System.out.println("Quantos dias o cliente permaneceu com o carro?");
    valores [0] = sc.nextInt(); // recebe a quantidade de dias que o cliente permaneceu com o carro
    System.out.println("Quantos quilômetros o cliente andou com o carro?");
    valores [1] = sc.nextDouble(); // recbee a quantidade de km que o cliente permaneceu com o carro
    valorDiaKM [0] = 86.75; //atribui o valor do dia
    valorDiaKM [1] = 1.23;
    valores [2] = valores [0] * valorDiaKM [0]; // faz o calculo da diária do carro
    valores [3] = valores [1] * valorDiaKM [1] ; // faz o calculo do km utilizado pelo carro
    valores [4] = valores [2] + valores [3];
    System.out.println("Quantos dias você fou com o carro? "+ valores [0]);
    System.out.println("Quantos quilometrôs você percorreu com o carro: " + valores [1]);
    System.out.printf("Você irá pagar  %.2f reais para a locadora.", valores [4]);
    sc.close();
}
}

