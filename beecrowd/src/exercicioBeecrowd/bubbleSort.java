package exercicioBeecrowd;

public class bubbleSort {
    public static void main(String[] args) {
        // Suponha que essas são as três variáveis que você deseja ordenar
        int a = 10;
        int b = 5;
        int c = 8;

        // Implementa o Bubble Sort para ordem crescente sem array
        if (a > b) { int temp = a; a = b; b = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        if (a > b) { int temp = a; a = b; b = temp; }

        // Exibe os valores ordenados em ordem crescente
        System.out.println("Valores ordenados em ordem crescente: " + a + ", " + b + ", " + c);
    }
}

