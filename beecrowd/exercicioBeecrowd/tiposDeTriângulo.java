package exercicioBeecrowd.exercicioBeecrowd;

import java.util.Scanner;
/**
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
 * A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
 *
 * se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
 * se A² = B² + C², apresente a mensagem: TRIANGULO RETANGULO
 * se A² > B² + C², apresente a mensagem: TRIANGULO OBTUSANGULO
 * se A² < B² + C², apresente a mensagem: TRIANGULO ACUTANGULO
 * se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 * se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 * Entrada
 * A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).
 *
 * Saída
 * Imprima todas as classificações do triângulo especificado na entrada.
 * * Data: 24/08/2024
 * Criado por Arthur de Sousa Santana
 **/

public class tiposDeTriângulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double array [] = new double [4];
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        if (A < B) { double temp = A; A = B; B = temp; }
        if (B < C) { double temp = B; B = C; C = temp; }
        if (A < B) { double temp = A; A = B; B = temp; }

        if (A >= B+C){
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((A * A) == (B * B) + (C * C)){
            System.out.println("TRIANGULO RETANGULO");
        } else if ((A * A) > (B * B) + (C * C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((A * A) < (B * B) + (C * C)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C & C == A){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B && B != C){
            System.out.println("TRIANGULO ISOSCELES");
        } else if (A == C && A != B){
            System.out.println("TRIANGULO ISOSCELES");
        } else if (C == B && A != C){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
