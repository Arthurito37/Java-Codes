package exercicioBeecrowd;

public class numerosPares {
    public static void main(String[] args) {
        int n = 1;
        int resto = 0;
        while (n <= 100) {
            resto = n % 2;
            if (resto == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
