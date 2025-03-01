package exercicioBeecrowd.exercicioBeecrowd;
import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class areaCirculo{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double n = 3.14159;
        // cria a matriz que recebe o dados
        double [] i = new double[4];
        // recebe o raio
        while (i [2] == 0){
            i [0] = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do círculo:")); // armazena o valor e cria uma caixa de diálogo
            // armaneza o valor da área
            i [1] = n * (i [0] * i [0]);
            JOptionPane.showMessageDialog(null, "A área do círculo é: " + i[1]); // retorna um diálogo e a área do circulo
            i [3] = JOptionPane.showConfirmDialog(null, String.format("Deseja realizar mais calculos de área?"), "Calculo de Área",JOptionPane.YES_NO_OPTION); 
            if (i [3] == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Ok, tenha um ótimo dia.");
                i[2]++;
            }
         }
    }
}
