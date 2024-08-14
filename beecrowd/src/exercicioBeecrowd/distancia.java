package exercicioBeecrowd;
import java.io.IOException;
import java.util.Scanner;
public class distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int [] valores = new int [4]; //cria a matriz 
        valores [0] = 60; // define a velocidade como 60
        valores [1] = 90; // define a segunda velocidade como 90
        valores [2] = scanner.nextInt();
        valores [3] = (60*valores[2])/30; //faz o cálculo da distância entre os veiculos
        System.out.println(valores[3] + " minutos");
        scanner.close();
    }
}
