/*
* Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
*
* Entrada
* O arquivo de entrada contém dois valores inteiros.
*
* Saída
* O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares
* que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
*/
package exercicioBeecrowd.exercicioBeecrowd;

import java.util.Scanner;

public class somaDeImparesConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int soma = 0;
        int resto;
        if (x == y) { //verifica se X e Y SÃO IGUAIS
            System.out.println(soma);
        }else if (x > y){ //verifica se X é maior que Y
            while (x > y+1){
                x--;
                resto = x % 2;
                if(resto == 1 || resto == -1){
                    soma = soma + x;

                }

            }
            System.out.println(soma);
        }else if (y > x+1){
            while (y > x){
                y--;
                resto = y % 2;
                if(resto == 1 || resto == -1){
                    soma = soma + y;
                }


            }
            System.out.println(soma);

            }
        scanner.close();
        }
}


