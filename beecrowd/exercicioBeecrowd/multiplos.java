package exercicioBeecrowd.exercicioBeecrowd;
import java.util.Scanner;



/**

 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",

 * indicando se os valores lidos são múltiplos entre si.

 *

 * Data: 28/08/2024

 * Atualizado em: 28/08/2024

 * Criado por Arthur de Sousa Santana

 **/

public class multiplos {  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");

        } else {

            System.out.println("Nao sao Multiplos");

        }

        scanner.close();

    }

}
