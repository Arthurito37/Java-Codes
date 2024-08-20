package exercicioBeecrowd;
import java.util.Scanner;
import java.util.Locale;
public class conversorDeTemperaturas {
    public static void main(String[]args){
    /**
     * Este código em JAVA transforma temperaturas de celsius
     *
     * Data: 18/05/2024
     *
     * Criado por Arthur de Sousa Santana
     **/
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com o a temperatura em celsius: ");
    double [] temperaturas = new double [6]; //array que armazena os valores
    temperaturas [0] = sc.nextDouble(); //armazena o valor em celsius

    temperaturas [1] = ((temperaturas [0] * 9) + 160)/5; //transforma o valor de celsius em Fahrenheit
    temperaturas [2] = (0.8*temperaturas [0]); //transforma o valor de celsius em Reaumur
    temperaturas [3] = temperaturas [0] + 273.15; //transforma o valor de celsius em Kelvin
    temperaturas [4] = (temperaturas [0] + 273.15) * 1.8; //transforma o valor de celsius em Rankine
    System.out.println("A temperatura "+ temperaturas [0]+ "° em Reaumur corresponde a: " + temperaturas [2] + "°.");
    System.out.println("A temperatura "+ temperaturas [0]+ "° em Fahrenheit corresponde a: " + temperaturas [1] + "°.");
    System.out.println("A temperatura "+ temperaturas [0]+ "° em Kelvin corresponde a: " + temperaturas [3] + ".");
    System.out.println("A temperatura "+ temperaturas [0]+ "° em Rankine corresponde a: " + temperaturas [4] + "°.");
    sc.close();
}
}

