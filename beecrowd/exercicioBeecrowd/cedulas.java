package exercicioBeecrowd.exercicioBeecrowd;
import java.util.Scanner;
import java.io.IOException;

public class cedulas {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        int notaInserida = scanner.nextInt();
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;
        System.out.println(notaInserida);
        if (notaInserida >= 100){
            while (notaInserida > 99){
            notaInserida = notaInserida - 100;
            nota100 = nota100 + 1;
            }
        }
        if (notaInserida >= 50){
            while (notaInserida > 49){
                notaInserida = notaInserida - 50;
                nota50 = nota50 + 1;
            }
        }
        if (notaInserida >= 20){
            while (notaInserida > 19){
                notaInserida = notaInserida - 20;
                nota20 = nota20 + 1;
            }
        }
        if (notaInserida >= 10){
            while (notaInserida > 9){
                notaInserida = notaInserida - 10;
                nota10 = nota10 + 1;
            }
        }
        if (notaInserida >= 5){
            while (notaInserida > 4){
                notaInserida = notaInserida - 5;
                nota5 = nota5 + 1;
            }
        }
        if (notaInserida >= 2){
            while (notaInserida > 1){
                notaInserida = notaInserida - 2;
                nota2 = nota2 + 1;
            }
        }
        if (notaInserida >= 1){
            while (notaInserida > 0){
                notaInserida = notaInserida - 1;
                nota1 = nota1 + 1;
            }
        }

        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

    }
}
