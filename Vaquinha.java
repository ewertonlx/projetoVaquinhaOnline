import javax.swing.*;
import java.awt.*;
import src.functions.*;
public class Vaquinha {
    public static void main(String[] args) {
        // Funções
        LoginPainel chamarLogin = new LoginPainel();  // Instanciando a classe LoginPainel
        RegistroPainel chamarRegistro = new RegistroPainel(); // Instanciando a classe RegistroPainel
        // Criando uma janela
        JFrame frame = new JFrame("Vaquinha Online");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        // Paineis (Tela)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.getHSBColor(110, 194, 246)); // Cor de fundo do painel
        // Textos
        JLabel title = new JLabel("Bem-vindo à Vaquinha Online");
        title.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o texto ao centro
        title.setForeground(Color.WHITE); // Cor do texto
        title.setFont(new Font("Arial", Font.BOLD, 20)); // Define a fonte e o tamanho do texto
        JLabel footer = new JLabel("Doe e ajude quem precisa");
        footer.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o texto ao centro
        footer.setForeground(Color.WHITE); // Cor do texto
        footer.setFont(new Font("Arial", Font.BOLD, 15)); // Define a fonte e o tamanho do texto
        
        // Carregando uma imagem
        ImageIcon userIcon = new ImageIcon("src/images/user.png");
        JLabel userLabel = new JLabel(userIcon);
        userLabel.setPreferredSize(new Dimension(100, 100)); // Define o tamanho da imagem
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha a imagem ao centro
        
        // Botões
        JButton login = new JButton("Login");
        JButton register = new JButton("Registre-se");

        // Botão LOGIN
        login.setPreferredSize(new Dimension(100, 50));
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Botão REGISTRO
        register.setCursor(new Cursor(Cursor.HAND_CURSOR));
        register.setPreferredSize(new Dimension(100, 50));
        register.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Interação com os botões
        login.addActionListener(e -> {
            chamarLogin.functionLogin(); // Chama a função de login
            frame.setVisible(false);
        });

        register.addActionListener(e -> {
            chamarRegistro.chamarRegistro(); // Chama a função de registro
            frame.setVisible(false);
        });

        // Adicionando os itens na tela
        panel.add(Box.createVerticalGlue());
        panel.add(title);
        panel.add(userLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaço entre a imagem e os botões
        panel.add(login);
        panel.add(register);
        panel.add(footer);
        panel.add(Box.createVerticalGlue());
        frame.add(panel);
        frame.setVisible(true);
    }
}