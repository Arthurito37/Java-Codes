package pizzaTime;

import java.io.IOException;
import java.util.Scanner;

public class pizzaTimeMain { public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    double VALOR1 = 0;
    double VALOR2 = 0;
    String BORDA = "";
    String PIZZA = "";
    System.out.println("Bem Vindo ao Pizza Time!");
    System.out.println("Digite o seu nome:");
    String NOME = scanner.nextLine().toUpperCase();
    System.out.println("Olá " + NOME + " selecione o sabor que deseja:");
    System.out.println("1 - Pizza Marguerita R$: 29.90");
    System.out.println("2 - Pizza de Pepperoni R$: 39.90");
    System.out.println("3 - Pizza de Muçarela R$: 25.90");
    System.out.println("4 - Pizza de Calabreza R$: 35.90");
    System.out.println("5 - Pizza de Frango com Catupiry R$: 39.90");
    int i = scanner.nextInt();
    switch (i){
        case 1:
            PIZZA = "Pizza de Marguerita";
            VALOR1 = 29.90;
            System.out.println("Você escolheu Pizza de Marguerita");
            break;
        case 2:
            PIZZA = "Pizza de Pepperoni";
            VALOR1 = 39.90;
            System.out.println("Você escolheu Pizza de Pepperoni");
            break;
        case 3:
            PIZZA = "Pizza de Muçarela";
            VALOR1 = 25.90;
            System.out.println("Você escolheu Pizza de Muçarela");
            break;
        case 4:
            PIZZA = "Pizza de Calabreza";
            VALOR1 = 35.90;
            System.out.println("Você escolheu Pizza de Calabreza");
            break;
        case 5:
            PIZZA = "Pizza de Frango com Catupiry";
            VALOR1 = 39.90;
            System.out.println("Você escolheu Pizza de Frango com Catupiry");
            break;
    }
    System.out.println("Deseja adicionar borda?(DIGITE SIM OU NÃO)");
    String S = scanner.next().toUpperCase();
        if (S.equals("SIM")){
            System.out.println("Digite o número correspondente a borda.");
            System.out.println("1 - Catupiry");
            System.out.println("2 - Cheddar");
            System.out.println("3 - Chocolate");
            System.out.println("4 - Goiabada");
            int b = scanner.nextInt();
            switch (b){
                case 1:
                    VALOR2 = 5.99;
                    BORDA = "Catupiry";
                    double valorTOTAL = VALOR1 + VALOR2;
                    System.out.println("Você selecionou borda de catupiry.");
                    System.out.printf("Ok %s Seu pedido é uma %s com borda de %sno valor total de R$: %.2f", NOME,  PIZZA, BORDA, valorTOTAL);
                    break;
                case 2:
                    VALOR2 = 5.99;
                    BORDA = "Cheddar";
                    valorTOTAL = VALOR1 + VALOR2;
                    System.out.println("Você selecionou borda de cheddar.");
                    System.out.printf("Ok %s Seu pedido é uma %s com borda de %sno valor total de R$: %.2f", NOME, PIZZA, BORDA, valorTOTAL);
                    break;
                case 3:
                    VALOR2 = 6.99;
                    BORDA = "Chocolate";
                    valorTOTAL = VALOR1 + VALOR2;
                    System.out.println("Você selecionou borda de chocolate.");
                    System.out.printf("Ok %s Seu pedido é uma %s com borda de %sno valor total de R$: %.2f", NOME, PIZZA, BORDA, valorTOTAL);
                    break;
                case 4:
                    VALOR2 = 6.99;
                    BORDA = "Goiabada";
                    valorTOTAL = VALOR1 + VALOR2;
                    System.out.println("Você selecionou borda de goiabada.");
                    System.out.printf("Ok %s Seu pedido é uma %s com borda de %sno valor total de R$: %.2f", NOME, PIZZA, BORDA, valorTOTAL);
                    break;
            }
        }
        if (S.equals("NAO")){
            double valorTOTAL = VALOR1 + VALOR2;
            System.out.printf("Ok %s Seu pedido é uma %s no valor total de R$: %.2f", NOME, PIZZA, valorTOTAL);
        }
        if (S.equals("NÃO")){
            double valorTOTAL = VALOR1 + VALOR2;
            System.out.printf("Ok %s Seu pedido é uma %s no valor total de R$: %.2f", NOME, PIZZA, valorTOTAL);
        }
    scanner.close();

    }
}
