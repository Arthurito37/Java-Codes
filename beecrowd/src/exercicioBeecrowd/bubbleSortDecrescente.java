package exercicioBeecrowd;

public class bubbleSortDecrescente {
    public static void main(String[] args) {
        // váriaveis
        int a = 2;
        int b = 4;
        int c = 8;

        // Implementa o Bubble Sort para ordem decrescente
        if (a < b) { int temp = a; a = b; b = temp; }
        if (b < c) { int temp = b; b = c; c = temp; }
        if (a < b) { int temp = a; a = b; b = temp; }

        // Exibe os valores ordenados em ordem decrescente
        System.out.println("Valores ordenados em ordem decrescente: " + a + ", " + b + ", " + c);
    }
}

