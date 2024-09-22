package exercicioBeecrowd;

import java.util.Scanner;

public class numeroPositivosEMedia {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double valores [] = new double[8];
            valores [6] = 0;
            valores [0] = scanner.nextDouble();
            //na matriz até o 5 será armazenado os valores digitados pelo usuário
            //se for positivo será somado uma unidade na váriavel matriz valores [6]
            //a matriz valores [7] receberá a média dos números positivos
            if (valores [0] > 0){
                valores [6]++;
                valores [7] = valores [7] + valores [0];
            }
            valores [1] = scanner.nextDouble();
            if (valores [1] > 0){
                valores [6]++;
                valores [7] = valores [7] + valores [1];
            }
            valores [2] = scanner.nextDouble();
            if (valores [2] > 0){
                valores [6]++;
                valores [7] = valores [7] + valores [2];
            }
            valores [3] = scanner.nextDouble();
            if (valores [3] > 0){
                valores [6]++;
                valores [7] = valores [7] + valores [3];
            }
            valores [4] = scanner.nextDouble();
            if (valores [4] > 0){
                valores [6]++;
                valores [7] = valores [7] + valores [4];
            }
            valores [5] = scanner.nextDouble();
            if (valores [5] > 0){
                valores [6]++;
                valores [7] = valores [7] + valores [5];
            }
            valores [7] = valores [7]/valores[6];
            System.out.printf("%.0f valores positivos\n", valores [6]);
            System.out.printf("%.1f media", valores [7]);
            scanner.close();
        }
    }
