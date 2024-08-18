package exercicioBeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class cafeteria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double [] valores = new double [4];
        String [] item = new String [2];
        System.out.println("||--------||-----------------|| -------");
        System.out.println("|| Código ||      Item       ||  Valor" );
        System.out.println("|| 1      || Pão de Queijo   || R$ 8.90");
        System.out.println("|| 15     || Panqueca        || R$10.55");
        System.out.println("|| 32     || Waffle          || R$ 9.99");
        System.out.println("|| 25     || Sonho           || R$ 9.99");
        System.out.println("|| 46     || Java Coffe      || R$12.30");
        System.out.println("|| 2      || Ovos e Bacon    || R$15.00");
        System.out.println("Digite sua escolha:");
        valores [0] = sc.nextInt(); // recebe o código do produto
        System.out.println("Digite a quantidade: ");
        valores [1] = sc.nextInt(); // recebe a quantidade do produto
        if ( valores [0] == 1){
            item [0] = "Pão de Queijo";
            valores [2] = valores [1] * 8.90;
            System.out.printf("O item " + item [0] + " comprando " +valores [1]+ " unidades, sairá por R$:%.2f", valores [2]);
        } else if ( valores [0] == 15){
            item [0] = "Panqueca";
            valores [2] = valores [1] * 10.55;
            System.out.printf("O item " + item [0] + " comprando " +valores [1]+ " unidades, sairá por R$:%.2f", valores [2]);
        } else if ( valores [0] == 32){
            item [0] = "Waffle ";
            valores [2] = valores [1] * 9.99;
            System.out.printf("O item " + item [0] + " comprando " +valores [1]+ " unidades, sairá por R$:%.2f", valores [2]);
        } else if ( valores [0] == 25){
            item [0] = "Sonho";
            valores [2] = valores [1] * 9.99;
            System.out.printf("O item " + item [0] + " comprando " +valores [1]+ " unidades, sairá por R$:%.2f", valores [2]);
        } else if ( valores [0] == 46){
            item [0] = "Java Coffe";
            valores [2] = valores [1] * 12.30;
            System.out.printf("O item " + item [0] + " comprando " +valores [1]+ " unidades, sairá por R$:%.2f", valores [2]);
        } else if ( valores [0] == 2){
            item [0] = "Ovos e Bacon";
            valores [2] = valores [1] * 15.00;
            System.out.printf("O item " + item [0] + " comprando " +valores [1]+ " unidades, sairá por R$:%.2f", valores [2]);

        }


    }
}
