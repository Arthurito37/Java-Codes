package introducao;
import java.util.Scanner;
import java.util.Locale;
public class IMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor informe o seu nome:");
        String nome = sc.next();
        System.out.println("Olá " + nome + ", vamos calcular seu IMC.");
        System.out.println("Informe o seu peso:");
        double massa = sc.nextDouble();
        System.out.println("Agora" + nome + " precisamos da sua altura:");
        double altura = sc.nextDouble();
        double imc = (massa/(altura*altura));
        if (imc < 18.5){
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em magreza.", imc);
        } else if ( imc > 18.5 && imc < 24.9) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Normal.", imc);
        } else if ( imc > 25 && imc < 29.9 ) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Sobrepeso.", imc );
        } else if ( imc > 30 &&  imc < 34.9 ) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Obesidade Grau 1.", imc );
        } else if ( imc > 35 &&  imc < 39.9) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Obesidade Grau 2.", imc );
        } else if ( imc > 40) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Obesidade Grau 3.", imc );
        }
    }
}