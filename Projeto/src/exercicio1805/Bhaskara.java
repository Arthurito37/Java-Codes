package exercicio1805;
import java.util.Scanner; //importa a função Sccaner
import java.util.Locale;
import java.lang.Math; //importa a raiz quadrada
public class Bhaskara{
    public static void main(String[]args){
        /**
         * Este programa tem como objetivo realizar os calculos da formula de Bhaskara
         *
         * Data: 18/05/2024
         *
         * Criado por Arthur de Sousa Santana
         **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número correspondente a A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o número correspondente a B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o número correspondente a C: ");
        double c = sc.nextDouble();
        double delta = (b*b) -(4 * a * c);
        double xPositivo = (-b + Math.sqrt(delta)) / (2*a);
        double xNegativo = (-b - Math.sqrt(delta)) / (2*a);
        System.out.println("O delta equivale a: " + delta);
        System.out.println("O X¹ equivale a:" + xPositivo);
        System.out.println("O X² equicale a:" + xNegativo);
        sc.close();
    }
}
