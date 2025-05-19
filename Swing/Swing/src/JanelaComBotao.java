import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaComBotao {
    public static void main(String[] args) {
        // Criando a janela
        JFrame frame = new JFrame("Minha Janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Criando o botão
        JButton botao = new JButton("Clique aqui");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        // Adicionando o botão à janela
        frame.add(botao);
        frame.setVisible(true);
    }
}

