package exercicioBeecrowd.exercicioBeecrowd;
import java.util.Scanner;
public class testeDeSelecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO:");
        int A = scanner.nextInt();
        System.out.println("DIGITE OUTRO NÚMERO:");
        int B = scanner.nextInt();
        System.out.println("DIGITE OUTRO NÚMERO:");
        int C = scanner.nextInt();
        System.out.println("DIGITE O ÚLTIMO NÚMERO:");
        int D = scanner.nextInt();
        int par = A % 2;
        int somaAeB = A + B;
        int somaCeD = C + D;
        if (C >= 0 && D >= 0) {
            if (B > C) {
                if (D > A) {
                    if (somaCeD > somaAeB) {
                        if (par == 0) {
                            System.out.println("Valores aceitos");
                        } else {
                            System.out.println("Valores nao aceitos");
                        }
                    } else {
                        System.out.println("Valores nao aceitos");
                    }
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
        scanner.close();
    }
}
