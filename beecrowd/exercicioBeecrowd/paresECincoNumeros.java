package exercicioBeecrowd.exercicioBeecrowd;

import java.util.Scanner;
/*Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados
* são pares e mostre esta informação.
*
* Entrada
* O arquivo de entrada contém 5 valores inteiros quaisquer.
*
* Saída
* Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.*/
public class paresECincoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valores [] = new int[6];
        double resto = 0;
        valores [0] = scanner.nextInt();
        resto = valores [0] % 2;
        if (resto == 0){
            valores [5]++;
        }
        valores [1] = scanner.nextInt();
        resto = valores [1] % 2;
        if (resto == 0){
            valores [5]++;
        }
        valores [2] = scanner.nextInt();
        resto = valores [2] % 2;
        if (resto == 0){
            valores [5]++;
        }
        valores [3] = scanner.nextInt();
        resto = valores [3] % 2;
        if (resto == 0){
            valores [5]++;
        }
        valores [4] = scanner.nextInt();
        resto = valores [4] % 2;
        if (resto == 0){
            valores [5]++;
        }
        System.out.printf("%d valores pares", valores [5]);
    }
}