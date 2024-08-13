package exercicioBeecrowd;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double [] valores = new double [3]; //declara a matriz que recebe os valores
        System.out.println("Digite a distância percorrida:");
        valores [0] = scanner.nextDouble(); // recebe o valor responsável pela distância
        System.out.println("Digite a quantidade de litros consumida");
        valores [1] = scanner.nextDouble(); // recebe o valor responsável pelos litro consumidos

        valores [2] = valores [0]/valores[1]; // faz o calculo responsável pela média dos quilômetros percorridos por litro

        System.out.printf("FORAM PERCORRIDOS EM MÉDIA %.3f km por litro %n", valores[2]);

    scanner.close();

    }
}
