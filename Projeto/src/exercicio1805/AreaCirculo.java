package exercicio1805;
import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {
    public static void main(String[] args){
        /**
         * Este código em JAVA faz um calculo da área de um círculo
         *
         * Data: 18/05/2024
         *
         * Criado por Arthur de Sousa Santana
         **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14; //Declara uma váriavel que é real e constante
        System.out.print("Entre com o raio do círculo: ");
        double r = sc.nextDouble();
        double area = pi * (r*r);
        System.out.printf("A área do círculo com raio %.2f equivale a: %.2f", r, area);
        sc.close();
    }
}
