package exercicioBeecrowd;
import java.util.Locale;
import javax.swing.*;
import java.lang.Math; //importa a raiz quadrada
public class baskhara { public static void main(String[]args){
    /**
     * Este programa tem como objetivo realizar os calculos da formula de Bhaskara
     *
     * Data: 18/05/2024
     * Atualizado em: 23/08/2024
     * Criado por Arthur de Sousa Santana
     **/
    Locale.setDefault(Locale.US);
    double [] valores = new double [8];
    valores [6] = 0;
        while (valores [6] == 0) {
            valores[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de A"));
            valores[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de B"));
            valores[2] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de C"));
            valores[3] = (valores[1] * valores[1]) - (4 * valores[0] * valores[2]); // recebe o valor de delta através da formula
            valores[4] = (-valores[1] + Math.sqrt(valores[3])) / (2 * valores[0]); // recebe o valor de X¹ ou Xlinha1
            valores[5] = (-valores[1] - Math.sqrt(valores[3])) / (2 * valores[0]); // recebe o valor de X² ou Xlinha2
            JOptionPane.showMessageDialog(null, "O valor de delta equivale a: " + valores[3]);
            JOptionPane.showMessageDialog(null, "O X¹ equivale a:" + valores[4]);
            JOptionPane.showMessageDialog(null, "O X² equicale a:" + valores[5]);
            valores [7] = JOptionPane.showConfirmDialog(null, String.format("Deseja realizar mais utilizando a fórmula de baskhara?"), "Calculo de Área",JOptionPane.YES_NO_OPTION);
            if (valores [7] == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Ok, tenha um ótimo dia.");
                valores[6]++;
            }
        }
    }
}


