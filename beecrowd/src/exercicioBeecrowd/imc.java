package exercicioBeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String [] nome = new String [2];
        double [] valores = new double [4];
        System.out.println("Por favor informe o seu nome:");
        nome [0] = sc.next();
        System.out.println("Olá " + nome + ", vamos calcular seu IMC.");
        System.out.println("Informe o seu peso:");
        valores [0] = sc.nextDouble(); //recebe o valor da massa
        System.out.println("Agora" + nome + " precisamos da sua altura:");
        valores [1] = sc.nextDouble(); //recebe o valor da altura
        valores [2] = (valores [0]/( valores [1]* valores [1])); // faz o calculo e armazena o IMC.
        if (valores [2] < 18.5){
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em magreza.", valores [2]);
        } else if ( valores [2] > 18.5 && valores [2] < 24.9) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Normal.", valores [2]);
        } else if ( valores [2] > 25 && valores [2] < 29.9 ) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Sobrepeso.", valores [2] );
        } else if ( valores [2] > 30 &&  valores [2] < 34.9 ) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Obesidade Grau 1.", valores [2] );
        } else if ( valores [2] > 35 &&  valores [2] < 39.9) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Obesidade Grau 2.", valores [2] );
        } else if ( valores [2] > 40) {
            System.out.printf("Obrigado por utilizar o nosso programa. O seu índice de massa corporal corresponde a %.2fkg e sua classificação se encontra em Obesidade Grau 3.", valores [2] );
        }
    }
}
