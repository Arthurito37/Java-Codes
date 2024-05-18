package calculadora;
import java.util.Scanner;
import java.util.Locale;
public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero1 = sc.nextDouble();
        System.out.println("Digite outro número:");
        double numero2 = sc.nextDouble();
        double resposta = 0;
        System.out.println("Digite a operação que deseja fazer:");
        String operador = sc.next();
        System.out.println("DIGITE UM NÚMERO:");
        System.out.println("DIGITE O COMANDO QUE DESEJA:");
        System.out.println("+ PARA SOMAR");
        System.out.println("- PARA SUBTRAIR");
        System.out.println("* PARA MULTIPLICAR");
        System.out.println("/ PARA DIVIDIR");
        System.out.println("DIGITE OUTRO NÚMERO:");
        if (operador.equals("+")) {
            resposta = numero1 + numero2;
        }
        ;
        if (operador.equals("-")) {
            resposta = numero1 - numero2;
        }
        ;
        if (operador.equals("*")) {
            resposta = numero1 * numero2;
        }
        ;
        if (operador.equals("/")) {
            resposta = numero1 / numero2;
        }
        ;
        System.out.printf("As somas do resultados são: " + resposta);
    }
}
