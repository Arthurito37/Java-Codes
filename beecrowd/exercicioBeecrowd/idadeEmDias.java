package exercicioBeecrowd.exercicioBeecrowd;

import java.io.IOException;
import java.util.Scanner;

public class idadeEmDias {public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int idadeEmDias = scanner.nextInt();
    int ano = 0;
    int mes = 0;

    if (idadeEmDias >= 365) {
        while (idadeEmDias >= 365) {
            idadeEmDias = idadeEmDias - 365;
            ano = ano + 1;
        }
    }
    if (idadeEmDias >= 30){
        while(idadeEmDias >= 30){
            idadeEmDias = idadeEmDias - 30;
            mes = mes + 1;
        }
    }
    System.out.println(ano + " ano(s)");
    System.out.println(mes + " mes(es)");
    System.out.println(idadeEmDias + " dia(s)");
    }
}
