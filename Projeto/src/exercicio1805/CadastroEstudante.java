package exercicio1805;
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
public class CadastroEstudante {
    public static void main(String[]args){
    /**
     * Este código em JAVA faz o cadastro de um estudante
     * Fazendo a contagem de caracteres do nome e gerando um RA aleatório com uma
     * letra e um número
     * Data: 18/05/2024
     *
     * Criado por Arthur de Sousa Santana
     **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Criar um objeto da classe Random
        Random rand = new Random();
        System.out.println("Digite o nome do estudante:");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        String idade = sc.next();
        System.out.println("Digite seu gênero: [M/F]");
        String genero = sc.next();
        System.out.println("Digite o nome do curso: ");
        String curso = sc.next();

        int x = nome.length();
        int RA = rand.nextInt(100);
        int randomNumber = rand.nextInt(26) + 65;
        char letra = (char) RA;
        System.out.println("Seu nome é " + nome + " ele possui " + x + " letras, sua idade é " + idade + " seu gênero é" + genero + ".");
        System.out.println("Você se inscreveu no curso " + curso + "com o RA: "+letra+"" + RA + ".");
    }
}
