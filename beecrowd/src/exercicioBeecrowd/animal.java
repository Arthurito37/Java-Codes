package exercicioBeecrowd;
/**
 * Identificar o animnal segundo as caracteristicas fornecidas
 *
 * Data: 29/08/2024
 *
 * Criado por Arthur de Sousa Santana
 * Versão: 1.0
 **/
import java.io.IOException;
import java.util.Scanner;

public class animal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String [] caracteristicas = new String [1];
        caracteristicas [0] = scanner.nextLine().toLowerCase();
    if (caracteristicas [0].equals("vertebrado")){
        caracteristicas[0] = scanner.nextLine().toLowerCase();
        if (caracteristicas [0].equals("ave")){
            caracteristicas[0] = scanner.nextLine().toLowerCase();
            if (caracteristicas [0].equals("carnivoro")){
                System.out.println("aguia");
            } else if (caracteristicas [0].equals("onivoro")) {
                System.out.println("pomba");
            }
        } else if (caracteristicas [0].equals("mamifero")){
            caracteristicas[0] = scanner.nextLine().toLowerCase();
            if (caracteristicas [0].equals("onivoro")){
                System.out.println("homem");
            } else if (caracteristicas [0].equals("herbivoro")){
                System.out.println("Vaca");
            }

        }
    } else if (caracteristicas [0].equals("invertebrado")){
        caracteristicas[0] = scanner.nextLine().toLowerCase();
        if (caracteristicas [0].equals("inseto")){
            caracteristicas[0] = scanner.nextLine().toLowerCase();
            if (caracteristicas [0].equals("hematofago")){
                System.out.println("pulga");
            } else if (caracteristicas [0].equals("herbivoro")){
                System.out.println("lagarta");
            }
        } else if (caracteristicas [0].equals("anelideo")){
            caracteristicas[0] = scanner.nextLine().toLowerCase();
            if (caracteristicas [0].equals("hematofago")){
                System.out.println("sanguessuga");
            } else if (caracteristicas [0].equals("onivoro")) {
                System.out.println("minhoca");
            }
        }
    }
    }
}
