package exercicioBeecrowd.exercicioBeecrowd;

import javax.swing.*;

public class triângulo {
    public static void main(String[] args) {
        double [] valores  = new double[7];
        valores [5] = 0;
        while (valores [5] == 0) {
            valores[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
            valores[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
            valores[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
            if (valores[0] + valores[1] > valores[2] && valores[0] + valores[2] > valores[1] && valores[1] + valores[2] > valores[0]) {
                valores[4] = valores[0] + valores[1] + valores[2]; //faz o calculo do perímetro
                JOptionPane.showMessageDialog(null, String.format("O perímetro equivale a: %.1f", valores[4]));
            } else {
                valores[4] = ((valores[0] + valores[1]) * valores[2]) / 2; // Calcula a área do trapézio
                JOptionPane.showMessageDialog(null, String.format("A área do trapézio equivale a: %.1f", valores[4]));
            }
            valores [6] = JOptionPane.showConfirmDialog(null, String.format("Deseja realizar mais calculos?"), "Calculo de Área",JOptionPane.YES_NO_OPTION);
            if (valores [6] == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Ok, tenha um ótimo dia.");
                valores[5]++;
            }
        }

    }
}
