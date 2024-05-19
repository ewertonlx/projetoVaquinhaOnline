package src.functions;
import javax.swing.*;

public class RegistroPainel {
    public void chamarRegistro() {
        JFrame registerFrame = new JFrame("Registre-se em nosso sistema!");
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setSize(300, 500);
        registerFrame.setLayout(null);

        // Textos
        JLabel nameLabel = new JLabel("Nome");
        nameLabel.setBounds(50, 0, 100, 50); // posição do texto

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 50, 100, 50); // posição do texto

        JLabel cpfLabel = new JLabel("CPF");
        cpfLabel.setBounds(50, 100, 100, 50); // posição do texto

        JLabel phoneLabel = new JLabel("Telefone");
        phoneLabel.setBounds(50, 150, 100, 50); // posição do texto

        JLabel addressLabel = new JLabel("Endereço");
        addressLabel.setBounds(50, 200, 100, 50); // posição do texto

        JLabel passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(50, 250, 100, 50); // posição do texto

        JLabel confirmPasswordLabel = new JLabel("Confirmar senha");
        confirmPasswordLabel.setBounds(50, 300, 100, 50); // posição do texto

        // Campos de texto para preencher
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 0, 100, 50); // posição do campo
        
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 50, 100, 50); // posição do campo
        
        JTextField cpfField = new JTextField();
        cpfField.setBounds(150, 100, 100, 50); // posição do campo
        
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 150, 100, 50); // posição do campo
        
        JTextField addressField = new JTextField();
        addressField.setBounds(150, 200, 100, 50); // posição do campo
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 250, 100, 50); // posição do campo
        
        JPasswordField confirmPasswordField = new JPasswordField(); 
        confirmPasswordField.setBounds(150, 300, 100, 50); // posição do campo

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100, 350, 100, 50); // posição do botão

        // Adicionando tudo no painel
        registerFrame.add(nameLabel);
        registerFrame.add(emailLabel);
        registerFrame.add(cpfLabel);
        registerFrame.add(phoneLabel);
        registerFrame.add(addressLabel);
        registerFrame.add(passwordLabel);
        registerFrame.add(confirmPasswordLabel);
        registerFrame.add(nameField);
        registerFrame.add(emailField);
        registerFrame.add(cpfField);
        registerFrame.add(phoneField);
        registerFrame.add(addressField);
        registerFrame.add(passwordField);
        registerFrame.add(confirmPasswordField);
        registerFrame.add(registerButton);
        registerFrame.setVisible(true);

        // Interação do botão registrar
        registerButton.addActionListener(e -> {

            // Pegando os valores dos campos preenchidos
            String name = nameField.getText();
            String email = emailField.getText();
            String cpf = cpfField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            // Verificando se os espaços estão vazios
            if (name.isEmpty() || email.isEmpty() || cpf.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algums campos estão vazios! Por favor preencha corretamente!");
            } 
            // Verificando se a senha é igual a confirmação de senha
            else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
            } 
            // Caso não tenha nenhum erro, o sistema registra o usuário
            else {
                RegistrarUsuario registrarUsuario = new RegistrarUsuario(); // Instanciando a classe RegistrarUsuario   
                registrarUsuario.registrarUsuario(name, email, cpf, phone, address, password); // Chamando a função registrarUsuario
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!"); // Mensagem de sucesso
                registerFrame.setVisible(false);
                LoginPainel loginPainel = new LoginPainel(); // Instanciando a classe LoginPainel
                loginPainel.functionLogin(); // Chamando a função functionLogin
            }
            
        });
    }
}