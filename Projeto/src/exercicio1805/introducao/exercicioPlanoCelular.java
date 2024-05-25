package introducao;
import java.util.Scanner;
import java.util.Locale;

public class exercicioPlanoCelular {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double fixo = 79.30;
        double valorMinuto = 2.30;
        System.out.println("Digite a quantidade de minutos que vocÊ utilizou:");
        double minUtilizado = sc.nextDouble();
        if (minUtilizado > 100) {
            double valorFinal = fixo + ((minUtilizado - 100)*2.30);
            System.out.println("O valor final da conta equivale a: " + valorFinal);
        } else
            System.out.println("O valor final da conta equivale a :" + fixo);
        sc.close();
    }
}
