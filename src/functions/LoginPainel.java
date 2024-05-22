package src.functions;
import javax.swing.*;

public class LoginPainel {
    public void functionLogin() {

        // Criando a janela de login
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 300);
        loginFrame.setLayout(null);

        // Textos para identificar os campos
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 50, 100, 50); // posição do texto

        JLabel passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(50, 100, 100, 50); // posição do texto
        
        // Campos de texto para preencher
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 50, 100, 50); // posição do campo

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 100, 50); // posição do campo

        // Botão login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 150, 100, 50); // posição do botão

        // Adicionando tudo na janela
        loginFrame.add(emailLabel);
        loginFrame.add(passwordLabel);
        loginFrame.add(emailField);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);
        loginFrame.setVisible(true);

        loginButton.addActionListener(e -> {
            // Verifica se o e-mail e a senha correspondem a algum usuário
            VerificarSenha.verificarLogin(emailField.getText(), new String(passwordField.getPassword()), loginFrame); // Chama a função verificarLogin passando o e-mail, a senha e a janela de login para depois poder desabilitar a janela de login
        });
    }
}
