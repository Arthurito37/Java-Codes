package exercicioBeecrowd.exercicioBeecrowd;

import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double [] valor = new double [2];
        valor [0] = scanner.nextDouble();
        if (valor [0] < 0){
            System.out.println("FORA DO INTERVALO");
            }else if (valor[0] > 0 && valor [0] <= 25) {
            System.out.println("Intervalo (0,25]");
            } else if (valor[0] > 25 && valor [0] <= 50) {
            System.out.println("Intervalo (25,50]");
            } else if (valor[0] > 50 && valor [0] <= 75) {
            System.out.println("Intervalo (50,75]");
            } else if (valor[0] > 75 && valor [0] <= 100) {
            System.out.println("Intervalo (75,100]");
            } else if (valor[0] > 100) {
            System.out.println("FORA DO INTERVALO");
        }
       scanner.close();
    }
}
