package exercicio;

public class MediaPreco {
    public static void main(String[] args) {
        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int age = 35;
        int code = 2367;
        String gender = "M";

        double priceRPG = 107.80;
        double priceIndie = 46.99;

        int valor;
        double valorArredondado;
        double valorAmericano;

        valor = ((int)priceRPG + (int)priceIndie)/2;
        valorArredondado = (priceRPG + priceIndie)/2;
        valorAmericano = (priceRPG + priceIndie)/2;

        System.out.println("Produtos:");
        System.out.println(gameRPG + ", está custando R$:" + priceRPG);
        System.out.println(gameIndie + ", está custando R$:" + priceIndie);

        System.out.printf("O comprador tinha %d anos code %d e genero: %s%n", age, code, gender );


        System.out.println("Média de valor de R$:" + valor);
        System.out.printf("Média de valor de arredondado R$: %.2f%n", valorArredondado);
        System.out.printf("Média de valor de arredondado no padrão americano: R$: %.2f", valorAmericano);
    }
}