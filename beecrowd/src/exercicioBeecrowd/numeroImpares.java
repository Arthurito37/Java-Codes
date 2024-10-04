/*
* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
* um valor por linha, inclusive o X, se for o caso.
*
* Entrada
* O arquivo de entrada contém 1 valor inteiro qualquer.
*
* Saída
* Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 */
package exercicioBeecrowd;

import java.util.Scanner;

public class numeroImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int x = scanner.nextInt();
        int resto = 0;
        while (i <= x){
            resto = i % 2;
            if  (resto > 0){
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
