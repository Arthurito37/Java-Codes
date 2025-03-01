/*
    Este programa serve para aprender o básico sobre criar as telas em Java.
*/
package exercicioBeecrowd.exercicioBeecrowd;
import javax.swing.*;
import javax.swing.JOptionPane; // importa a classe que abre janelas de diálogo
public class olaMundo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog ("Qual o seu nome irmão?"); // Exibe uma caixa de texto onde o usuário pode digitar algo, e você pode capturar esse valor em uma variável
        JOptionPane.showMessageDialog(null, "Olá " + nome); //cria uma caixa de mensagem
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?"); //Exibe uma janela com os botões "Sim", "Não" e "Cancelar", retornando a opção escolhida.
        if (resposta == JOptionPane.YES_OPTION) {//Se for YES
            JOptionPane.showMessageDialog(null, "Você escolheu SIM!");//Exibe uma janela com os botões "Sim", "Não" e "Cancelar", retornando a opção escolhida.
        } else if (resposta == JOptionPane.NO_OPTION) {//Se fo NO
            JOptionPane.showMessageDialog(null, "Você escolheu NÃO!");//Exibe uma janela com os botões "Sim", "Não" e "Cancelar", retornando a opção escolhida.
        }
        String[] opcoes = {"Hamburguer", "Pizza", "Cachorro Quente"};//Cria tres varivaveis
        int escolha = JOptionPane.showOptionDialog( //Cria uma caixa de dialogo
                null, "Escolha uma janta?", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]
        );
        JOptionPane.showMessageDialog(null, "Você escolheu " + opcoes[escolha] + ". Bom apetite.");
        JOptionPane.showMessageDialog(null, "Ocorreu um erro!", "Erro", JOptionPane.ERROR_MESSAGE); //Apresenta a mensagem de erro
    }
}
