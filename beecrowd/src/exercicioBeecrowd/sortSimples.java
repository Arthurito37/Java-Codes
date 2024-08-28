package exercicioBeecrowd;
import java.util.Scanner;
/*
* Leia 3 valores inteiros e ordene-os em ordem crescente.
* No final, mostre os valores em ordem crescente,
* uma linha em branco e em seguida,
* os valores na sequência como foram lidos.
* Criado por Arthur de Sousa
*
* Dia: 28/08/2024
*/
public class sortSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Três váriaveis
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = a;
        int e = b;
        int f = c;
        if (a > b){
            int temp = a; a = b; b = temp;
        }   if (b > c) {
            int temp = b; b = c; c = temp;
        }   if (a > b) { int temp = a; a = b; b = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
