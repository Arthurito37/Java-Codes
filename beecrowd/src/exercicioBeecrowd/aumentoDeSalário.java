package exercicioBeecrowd;

import javax.xml.transform.Source;
import java.util.Scanner;

/*
*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
*
*
*Salário	                Percentual de Reajuste
*0 - 400.00                         15%
*400.01 - 800.00                    12%
*800.01 - 1200.00                   10%
*1200.01 - 2000.00                  7%
*Acima de 2000.00                   4%
*
*
* Leia o salário do funcionário e calcule e mostre o novo salário,
* bem como o valor de reajuste ganho e o índice reajustado, em percentual.
* Entrada
*
* A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
*
*Saída
*Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.
*/
public class aumentoDeSalário {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] salario = new double [3];
        System.out.println("Digite o salário:");
        salario [0] = scanner.nextDouble();
        while (salario[0] <= 0) {
            System.out.println("ERRO - O salário deve ser maior que zero.");
            System.out.println("Digite o salário:");
            salario [0] = scanner.nextDouble();
        }
        if (salario [0] <= 400.00 ) {
            salario [1] = salario [0] * 1.15;
            salario [0] = salario [1] - salario [0];
            System.out.printf("Novo salario: %.2f\n", salario [1]);
            System.out.printf("Reajuste ganho: %.2f\n" , salario [0]);
            System.out.println("Em percentual: 15%");
        } else if (salario [0] >= 400.01 && salario [0] <= 800.00){
            salario [1] = salario [0] * 1.12;
            salario [0] = salario [1] - salario [0];
            System.out.printf("Novo salario: %.2f\n", salario [1]);
            System.out.printf("Reajuste ganho: %.2f\n" , salario [0]);
            System.out.println("Em percentual: 12%");
        } else if (salario [0] >= 800.01 && salario [0] <= 1200.00){
            salario [1] = salario [0] * 1.10;
            salario [0] = salario [1] - salario [0];
            System.out.printf("Novo salario: %.2f\n", salario [1]);
            System.out.printf("Reajuste ganho: %.2f\n" , salario [0]);
            System.out.println("Em percentual: 10%");
        } else if (salario [0] >= 1200.01 && salario [0] <= 2000.00){
            salario [1] = salario [0] * 1.07;
            salario [0] = salario [1] - salario [0];
            System.out.printf("Novo salario: %.2f\n", salario [1]);
            System.out.printf("Reajuste ganho: %.2f\n" , salario [0]);
            System.out.println("Em percentual: 7%");
        } else if (salario [0] >= 2000.01){
            salario [1] = salario [0] * 1.04;
            salario [0] = salario [1] - salario [0];
            System.out.printf("Novo salario: %.2f\n", salario [1]);
            System.out.printf("Reajuste ganho: %.2f\n", salario [0]);
            System.out.println("Em percentual: 4%");
        }
    }
}
