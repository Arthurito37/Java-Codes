package exercicio1805;
import java.util.Scanner;
import java.util.Locale;
public class ConversorDeTemperaturas {
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
        double Temperatura = sc.nextDouble();
        double Reaumur = 0;
        double Fahrenheit = 0;
        double Kelvin = 0;
        double Rankine = 0;

        Fahrenheit = ((Temperatura * 9) + 160)/5;
        Reaumur = (1.25*Temperatura);
        Kelvin = Temperatura + 273.15;
        Rankine = (Temperatura + 273.15) * 1.8;
        System.out.println("A temperatura "+ Temperatura+ "° em Reaumur corresponde a: " + Reaumur + "°.");
        System.out.println("A temperatura "+ Temperatura+ "° em Fahrenheit corresponde a: " + Fahrenheit + "°.");
        System.out.println("A temperatura "+ Temperatura+ "° em Kelvin corresponde a: " + Kelvin + ".");
        System.out.println("A temperatura "+ Temperatura+ "° em Rankine corresponde a: " + Rankine + "°.");
        sc.close();
    }
}
