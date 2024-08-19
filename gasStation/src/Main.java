import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] gasName = new String [6]; //recebe o nome dos combustiveis
        final double [] gasPrice = new double [6]; //recebe o preço dos combustiveis
        gasPrice [0] = 6.50; //ARMAZENA O PREÇO DA GASOLINA
        gasPrice [1] = 6.80; //ARMAZENA O PREÇO DA GASOLINA ADITIVADA
        gasPrice [2] = 4.30; //ARMAZENA O PREÇO DA ETANOL
        gasPrice [3] = 5.00; //ARMAZENA O PREÇO DO DIESEL
        gasPrice [4] = 5.26; //ARMAZENA O PREÇO DO GNV

        gasName [0] = "Gasolina";
        gasName [1] = "Gasolina Aditivada";
        gasName [2] = "Etanol";
        gasName [3] = "Diesel";
        gasName [4] = "GNV";

    }
}
