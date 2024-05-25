package introducao;
import java.util.Scanner;
import java.util.Locale;

public class exercicioCompras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("||--------||-----------------|| -------");
        System.out.println("|| Código ||      Item       ||  Valor" );
        System.out.println("|| 1      || Mc Lanche Feliz || R$27.90");
        System.out.println("|| 15     || Panqueca        || R$10.55");
        System.out.println("|| 32     || Waffle          || R$08.99");
        System.out.println("|| 25     || Chocotone       || R$15.22");
        System.out.println("|| 46     || Java Coffe      || R$12.30");
        System.out.println("|| 2      || Whopper         || R$15.00");
        System.out.println("Digite sua escolha:");
        int codigo = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        if ( codigo == 1){
            String item = "Mc Lanche Feliz";
            double valor = quantidade * 27.90;
            System.out.printf("O item " + item + " comprando " +quantidade+ " unidades, sairá por R$:%.2f", valor);
        } else if ( codigo == 15){
            String item = "Panqueca";
            double valor = quantidade * 10.55;
            System.out.printf("O item " + item + " comprando " +quantidade+ " unidades, sairá por R$:%.2f", valor);
        } else if ( codigo == 32){
            String item = "Waffle ";
            double valor = quantidade * 08.99;
            System.out.printf("O item " + item + " comprando " +quantidade+ " unidades, sairá por R$:%.2f", valor);
        } else if ( codigo == 25){
            String item = "Chocotone";
            double valor = quantidade * 15.22;
            System.out.printf("O item " + item + " comprando " +quantidade+ " unidades, sairá por R$:%.2f", valor);
        } else if ( codigo == 46){
            String item = "Java Coffe";
            double valor = quantidade * 12.30;
            System.out.printf("O item " + item + " comprando " +quantidade+ " unidades, sairá por R$:%.2f", valor);
        } else if ( codigo == 2){
            String item = "Whopper";
            double valor = quantidade * 15.00;
            System.out.printf("O item " + item + " comprando " +quantidade+ " unidades, sairá por R$:%.2f", valor);

        }


    }
}
