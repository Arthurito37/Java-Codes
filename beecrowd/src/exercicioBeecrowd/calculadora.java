package exercicioBeecrowd;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] numero = new double [4]; // armazena os valores
        System.out.println("DIGITE UM NÚMERO:");
        numero [0] = sc.nextDouble(); // recebe o primeiro valor
        System.out.println("DIGITE O COMANDO QUE DESEJA:");
        System.out.println("+ PARA SOMAR");
        System.out.println("- PARA SUBTRAIR");
        System.out.println("* PARA MULTIPLICAR");
        System.out.println("/ PARA DIVIDIR");
        String operador = sc.next();
        System.out.println("DIGITE OUTRO NÚMERO:");
        numero [1] = sc.nextDouble(); //recebe o segundo valor
        if (operador.equals("+")) {
            numero [2] = numero [0] + numero [1]; // faz a soma dos valores
            System.out.printf("As somas dos valores equivale a: " + numero [2]);
        }
        ;
        if (operador.equals("-")) {
            numero [2] = numero [0] - numero [1]; // faz a subtração dos valores
            System.out.printf("As subtração dos valores equivale a: " + numero [2]);
        }
        ;
        if (operador.equals("*")) {
            numero [2] = numero [0] * numero [1]; // faz a multiplicação dos valores
            System.out.printf("As multiplicação dos valores equivale a: " + numero [2]);
        }
        ;
        if (operador.equals("/")) {
            numero [2] = numero [0] / numero [1]; // faz a divisão dos valores
            System.out.printf("As divisão dos valores equivale a: " + numero [2]);
        }
    }
}
