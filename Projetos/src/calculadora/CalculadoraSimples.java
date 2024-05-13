package calculadora;

public class CalculadoraSimples {
    public static void main(String[] args) {
        float numero1 = 1;
        float numero2 = 2;
        float resposta = 0;
        String operador = "+";
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
