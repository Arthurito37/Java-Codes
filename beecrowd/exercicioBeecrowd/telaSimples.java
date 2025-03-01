package exercicioBeecrowd.exercicioBeecrowd;

import javax.swing.*;

public class telaSimples {
    public static void main(String[] args) {
        // Criação da janela
        JFrame janela = new JFrame("Minha Janela"); //Cria a Janela Principal
        janela.setSize(400, 200); // Definindo o tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando fechar a janela, o programa termina

        // Criando um campo de texto
        JTextField campoTexto = new JTextField(20); //JTextField: Cria uma caixa de texto onde o usuário pode digitar.


        // Adicionando um botão à janela
        JButton botao = new JButton("Enviar"); //JButton: Cria um botão que pode ser clicado.
        janela.add(botao); // Adicionando o botão à janela

        botao.addActionListener(e -> { //addActionListener: Define o que acontece quando o botão é clicado.
            String texto = campoTexto.getText();  // Pega o texto do campo de texto
            JOptionPane.showMessageDialog(janela, "Você digitou: " + texto);
        });

        JPanel painel = new JPanel(); // Criando um painel (panel) para organizar os componentes
        painel.add(campoTexto); // Adicionando os componentes (campo de texto e botão) ao painel
        painel.add(botao); // O campo de texto e o botão serão organizados dentro do painel


        // Adicionando o painel à janela
        janela.add(painel); // Agora o painel (que contém o campo de texto e o botão) será exibido na janela


        // Tornando a janela visível
        janela.setVisible(true); // Isso garante que a janela apareça para o usuário
    }
}
