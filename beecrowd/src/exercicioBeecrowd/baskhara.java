package exercicioBeecrowd;
import java.util.Scanner; //importa a função Sccaner
import java.util.Locale;
import java.lang.Math; //importa a raiz quadrada

public class baskhara { public static void main(String[]args){
    /**
     * Este programa tem como objetivo realizar os calculos da formula de Bhaskara
     *
     * Data: 18/05/2024
     *
     * Criado por Arthur de Sousa Santana
     **/
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double [] valores = new double [7];
    System.out.print("Digite o número correspondente a A: ");
    valores [0] = sc.nextDouble(); // recebe o valor de A
    System.out.print("Digite o número correspondente a B: ");
    valores [1] = sc.nextDouble(); // recebe o valor de B
    System.out.print("Digite o número correspondente a C: ");
    valores [2] = sc.nextDouble(); // recebe o valor de C
    valores [3] = (valores [1]*valores [1]) -(4 * valores [0] * valores [2]); // recebe o valor de delta através da formula
    valores [4] = (-valores [1] + Math.sqrt(valores [3])) / (2*valores [0]); // recebe o valor de X¹ ou Xlinha1
    valores [5] = (-valores [1] - Math.sqrt(valores [3])) / (2*valores [0]); // recebe o valor de X² ou Xlinha2
    System.out.println("O delta equivale a: " + valores [3]);
    System.out.println("O X¹ equivale a:" + valores [4]);
    System.out.println("O X² equicale a:" + valores [5]);
    sc.close();
}
}

