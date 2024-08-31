package exercicioBeecrowd;
import java.util.Scanner;
/**
 * Leia um número inteiro que representa um código de DDD para discagem interurbana.
 * Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
 *
 * Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
 * DDD nao cadastrado
 *
 * Entrada
 * A entrada consiste de um único valor inteiro.
 *
 * Saída
 * Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
 * Data: 31/08/2024
 * Atualizado em: 23/08/2024
 * Criado por Arthur de Sousa Santana
 **/
public class DDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DDD = scanner.nextInt();
        switch (DDD) {
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
        }
            if (DDD != 61 && DDD != 71 && DDD != 11 && DDD != 21 && DDD != 19 && DDD != 32 && DDD != 27 && DDD != 31){
                System.out.println("nao cadastrado");
            }

        }

    }
