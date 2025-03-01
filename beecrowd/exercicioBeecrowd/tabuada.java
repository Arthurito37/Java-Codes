package exercicioBeecrowd.exercicioBeecrowd;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplicador [] = new int [11];
        multiplicador [0] = scanner.nextInt();
        multiplicador [1] = multiplicador [0] * 1;
        multiplicador [2] = multiplicador [0] * 2;
        multiplicador [3] = multiplicador [0] * 3;
        multiplicador [4] = multiplicador [0] * 4;
        multiplicador [5] = multiplicador [0] * 5;
        multiplicador [6] = multiplicador [0] * 6;
        multiplicador [7] = multiplicador [0] * 7;
        multiplicador [8] = multiplicador [0] * 8;
        multiplicador [9] = multiplicador [0] * 9;
        multiplicador [10] = multiplicador [0] * 10;
        System.out.println("1 x " + multiplicador[0] + " = " + multiplicador [1]);
        System.out.println("2 x " + multiplicador[0] + " = " + multiplicador [2]);
        System.out.println("3 x " + multiplicador[0] + " = " + multiplicador [3]);
        System.out.println("4 x " + multiplicador[0] + " = " + multiplicador [4]);
        System.out.println("5 x " + multiplicador[0] + " = " + multiplicador [5]);
        System.out.println("6 x " + multiplicador[0] + " = " + multiplicador [6]);
        System.out.println("7 x " + multiplicador[0] + " = " + multiplicador [7]);
        System.out.println("8 x " + multiplicador[0] + " = " + multiplicador [8]);
        System.out.println("9 x " + multiplicador[0] + " = " + multiplicador [9]);
        System.out.println("10 x " + multiplicador[0] + " = " + multiplicador [10]);
    }
}
