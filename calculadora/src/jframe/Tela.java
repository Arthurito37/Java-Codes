package jframe;
import javax.swing.*; // import
import java.awt.*; //importa as cores
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tela extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JTextField text;
    private JTextField text2;
    public Tela() {

        setButton();
        setLabel();
        setLabel1();
        setLabel2();
        setLabel3();
        setText1();
        setText2();
        configurarTela();
        }
        public void configurarTela(){
            setSize(800,500); // Define o tamanho da tela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha ao clicar no botão fechar da janela
            setResizable(false);  // boolean impede o usuário de aumentar e diminuir a janela
            setLocationRelativeTo(null); // centraliza a página
            getContentPane().setBackground(new Color(0xBDE303)); //altera a cor de fundo do programa
            setTitle("Calculadora"); // coloca um título na página
            setLayout(null); //
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aluno\\IdeaProjects\\calculadora\\src\\img\\calculator-v0-1chpxxqp1i6a1.png")); //altera o ícone do título
            setVisible(true); // boolean Torna a página vísivel
        }
        public void setButton(){
            this.button =  new JButton();
            this.button.setText("CLIQUE AQUI"); // adiciona um texto ao botão (button)
            this.button.setBounds(320, 350, 150, 50 ); //adicionamos layout ao botão
            this.button.setBackground(new Color (0xD9D9D9)); //cor de fundo do botão
            this.button.setForeground(new Color (0x000000)); //cor do texto do botão
            this.button.setFont(new Font("Arial", Font.BOLD, 12)); // tipo da fonte do botão
            add(this.button); // adiciona o botão na tela
        }
        public void setLabel(){
            this.label = new JLabel();
            this.label.setText("CALCULADORA"); // adiciona um texto ao label
            this.label.setForeground(new Color(0x002D85)); //cor do texto do label
            this.label.setFont(new Font("Arial", Font.BOLD, 30)); //tipo da fonte do label
            this.label.setBounds(300, 0, 350, 50 ); //adicionamos layout ao label
            add(this.label);  // adiciona o botão no label
        }
        public void setLabel1(){
            this.label2 = new JLabel();
            this.label2.setText("NÚMERO 1:"); // adiciona um texto ao label
            this.label2.setForeground(new Color(0x002D85)); //cor do texto do label
            this.label2.setFont(new Font("Arial", Font.BOLD, 12)); //tipo da fonte do label
            this.label2.setBounds(100, 50, 350, 50 ); //adicionamos layout ao label
            add(this.label2);  // adiciona o botão no label
        }
        public void setLabel2(){
            this.label3 = new JLabel();
            this.label3.setText("NÚMERO 2:"); // adiciona um texto ao label
            this.label3.setForeground(new Color(0x002D85)); //cor do texto do label
            this.label3.setFont(new Font("Arial", Font.BOLD, 12)); //tipo da fonte do label
            this.label3.setBounds(400, 50, 350, 50 ); //adicionamos layout ao label
            add(this.label3);  // adiciona o botão no label

    }
        public void setLabel3() {
        this.label = new JLabel();
        this.label.setForeground(new Color(0x002D85)); //cor do texto do label
        this.label.setFont(new Font("Arial", Font.BOLD, 12)); //tipo da fonte do label
        this.label.setBounds(400, 50, 350, 50); //adicionamos layout ao label
        add(this.label);  // adiciona o botão no label
    }

        public void setText1(){
            this.text = new JTextField();
            this.text.setBounds(100, 100, 200,50);
            this.text.setForeground(new Color(0x000000));
            this.text.setBackground(new Color(0xffffff));
            this.text.setFont(new Font("Arial", Font.BOLD, 12));
            add(this.text);
    }
        public void setText2(){
            this.text2 = new JTextField();
            this.text2.setBounds(400, 100, 200,50);
            this.text2.setForeground(new Color(0x000000));
            this.text2.setBackground(new Color(0xffffff));
            this.text2.setFont(new Font("Arial", Font.BOLD, 12));
            add(this.text2);
    }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==button){
                JOptionPane.showMessageDialog(null, "A SOMA É:");
                
        }
    }
}

