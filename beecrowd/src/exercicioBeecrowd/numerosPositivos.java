package exercicioBeecrowd;

import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valores [] = new double[7];
        valores [6] = 0;
        valores [0] = scanner.nextDouble();
        if (valores [0] > 0){
            valores [6]++;
        }
        valores [1] = scanner.nextDouble();
        if (valores [1] > 0){
            valores [6]++;
        }
        valores [2] = scanner.nextDouble();
        if (valores [2] > 0){
            valores [6]++;
        }
        valores [3] = scanner.nextDouble();
        if (valores [3] > 0){
            valores [6]++;
        }
        valores [4] = scanner.nextDouble();
        if (valores [4] > 0){
            valores [6]++;
        }
        valores [5] = scanner.nextDouble();
        if (valores [5] > 0){
            valores [6]++;
        }
        System.out.printf("%.0f valores positivos", valores [6]);
        scanner.close();
    }
}
