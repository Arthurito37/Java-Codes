/*
* Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
* um valor por linha, inclusive o X ser for o caso.
*
*  Entrada
* A entrada será um valor inteiro positivo.
*
* Saída
* A saída será uma sequência de seis números ímpares.
*
* */
package exercicioBeecrowd.exercicioBeecrowd;

import java.util.Scanner;

public class seisnumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int resto = 0;
        int i = x;
        while (i >= x && i < x + 12){
            resto = i % 2;
            if  (resto > 0){
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
