package src.functions;
import javax.swing.*;

public class LoginPainel {
    public void functionLogin() {

        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 300);
        loginFrame.setLayout(null);
        
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 50, 100, 50);

        JLabel passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(50, 100, 100, 50);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 50, 100, 50);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 100, 50);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 150, 100, 50);

        loginFrame.add(emailLabel);
        loginFrame.add(passwordLabel);
        loginFrame.add(emailField);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);
        loginFrame.setVisible(true);
    }
}
