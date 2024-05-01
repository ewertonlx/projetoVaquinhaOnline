import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vaquinha {
    // Classe Pessoa com atributos comuns
    public class Pessoa {
        private String nome;
        private String email;
        private String cpf;
        private String telefone;
        private String endereco;
    }

    // Classe Receptor que herda todos atributos da classe Pessoa
    public class Receptor extends Pessoa {
        private String campanha;
        private int idCampanha;
        private String descricaoCampanha;
        private int apoiadores;
        private int meta;
        private int arrecadado;
        private String chavePix;
    }

    // Classe Instituição que herda tudo da classe Receptor e da classe Pessoa
    public class Instituicao extends Receptor {
        private String cnpj;
        private String tipo;
        private String site;
    }

    public class Doador extends Pessoa {
        private int valor;
    }
    public static void main(String[] args) {
        Vaquinha vaquinha = new Vaquinha();
        JFrame frame = new JFrame("Vaquinha Online");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.getHSBColor(30, 144, 255));
        JLabel textLabel = new JLabel("Bem-vindo à Vaquinha Online");
        textLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o texto ao centro
        textLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Define a fonte e o tamanho do texto
        
        // Adiciona o JLabel ao painel principal no topo
        
        ImageIcon userIcon = new ImageIcon("images/u.png");
        JLabel userLabel = new JLabel(userIcon);
        userLabel.setPreferredSize(new Dimension(100, 100));
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton login = new JButton("Login");
        JButton register = new JButton("Registre-se");
        login.setPreferredSize(new Dimension(100, 50));
        register.setPreferredSize(new Dimension(100, 50));
        login.setAlignmentX(Component.CENTER_ALIGNMENT);
        register.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel.add(Box.createVerticalGlue());
        panel.add(textLabel);
        panel.add(userLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaço entre a imagem e os botões
        panel.add(login);
        panel.add(register);
        panel.add(Box.createVerticalGlue());
        
        frame.add(panel);
        frame.setVisible(true);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame loginFrame = new JFrame("Login");
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loginFrame.setSize(300, 300);
                loginFrame.setLayout(null);
                JLabel emailLabel = new JLabel("Email");
                JLabel passwordLabel = new JLabel("Password");
                JTextField emailField = new JTextField();
                JPasswordField passwordField = new JPasswordField();
                JButton loginButton = new JButton("Login");
                emailLabel.setBounds(50, 50, 100, 50);
                passwordLabel.setBounds(50, 100, 100, 50);
                emailField.setBounds(150, 50, 100, 50);
                passwordField.setBounds(150, 100, 100, 50);
                loginButton.setBounds(100, 150, 100, 50);
                loginFrame.add(emailLabel);
                loginFrame.add(passwordLabel);
                loginFrame.add(emailField);
                loginFrame.add(passwordField);
                loginFrame.add(loginButton);
                loginFrame.setVisible(true);
                frame.setVisible(false);
                loginButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loginFrame.setVisible(false);
                        vaquinha.paginaPrincipal();
                    }
                });
            }
        });
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame registerFrame = new JFrame("Registre-se em nosso sistema!");
                registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                registerFrame.setSize(300, 500);
                registerFrame.setLayout(null);
                JLabel nameLabel = new JLabel("Nome");
                JLabel emailLabel = new JLabel("Email");
                JLabel cpfLabel = new JLabel("CPF");
                JLabel phoneLabel = new JLabel("Telefone");
                JLabel addressLabel = new JLabel("Endereço");
                JLabel passwordLabel = new JLabel("Senha");
                JLabel confirmPasswordLabel = new JLabel("Confirmar Senha");
                JTextField nameField = new JTextField();
                JTextField emailField = new JTextField();
                JTextField cpfField = new JTextField();
                JTextField phoneField = new JTextField();
                JTextField addressField = new JTextField();
                JPasswordField passwordField = new JPasswordField();
                JPasswordField confirmPasswordField = new JPasswordField();
                JButton registerButton = new JButton("Register");
                nameLabel.setBounds(50, 0, 100, 50);
                emailLabel.setBounds(50, 50, 100, 50);
                cpfLabel.setBounds(50, 100, 100, 50);
                phoneLabel.setBounds(50, 150, 100, 50);
                addressLabel.setBounds(50, 200, 100, 50);
                passwordLabel.setBounds(50, 250, 100, 50);
                confirmPasswordLabel.setBounds(50, 300, 100, 50);
                nameField.setBounds(150, 0, 100, 50);
                emailField.setBounds(150, 50, 100, 50);
                cpfField.setBounds(150, 100, 100, 50);
                phoneField.setBounds(150, 150, 100, 50);
                addressField.setBounds(150, 200, 100, 50);
                passwordField.setBounds(150, 250, 100, 50);
                confirmPasswordField.setBounds(150, 300, 100, 50);
                registerButton.setBounds(100, 350, 100, 50);
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
            }
        });
    }
    private void paginaPrincipal() {
        JFrame mainFrame = new JFrame("Vaquinha Online");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 300);
        mainFrame.setLayout(null);
        JButton doar = new JButton("Doar");
        JButton criarCampanha = new JButton("Criar Campanha");
        doar.setBounds(100, 100, 100, 50);
        criarCampanha.setBounds(100, 150, 100, 50);
        mainFrame.add(doar);
        mainFrame.add(criarCampanha);
        mainFrame.setVisible(true);
        doar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame doarFrame = new JFrame("Doar");
                doarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                doarFrame.setSize(300, 300);
                doarFrame.setLayout(null);
                JLabel valorLabel = new JLabel("Valor");
                JTextField valorField = new JTextField();
                JButton doarButton = new JButton("Doar");
                valorLabel.setBounds(50, 50, 100, 50);
                valorField.setBounds(150, 50, 100, 50);
                doarButton.setBounds(100, 100, 100, 50);
                doarFrame.add(valorLabel);
                doarFrame.add(valorField);
                doarFrame.add(doarButton);
                doarFrame.setVisible(true);
            }
        });
        criarCampanha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame criarCampanhaFrame = new JFrame("Criar Campanha");
                criarCampanhaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                criarCampanhaFrame.setSize(300, 500);
                criarCampanhaFrame.setLayout(null);
                JLabel campanhaLabel = new JLabel("Campanha");
                JLabel descricaoLabel = new JLabel("Descrição");
                JLabel metaLabel = new JLabel("Meta");
                JLabel chavePixLabel = new JLabel("Chave Pix");
                JTextField campanhaField = new JTextField();
                JTextField descricaoField = new JTextField();
                JTextField metaField = new JTextField();
                JTextField chavePixField = new JTextField();
                JButton criarCampanhaButton = new JButton("Criar Campanha");
                campanhaLabel.setBounds(50, 0, 100, 50);
                descricaoLabel.setBounds(50, 0, 100, 50);
                metaLabel.setBounds(50, 0, 100, 50);
                chavePixLabel.setBounds(50, 0, 100, 50);
                campanhaField.setBounds(150, 0, 100, 50);
                descricaoField.setBounds(150, 0, 100, 50);
                metaField.setBounds(150, 0, 100, 50);
                chavePixField.setBounds(150, 0, 100, 50);
                criarCampanhaButton.setBounds(100, 0, 100, 50);
                criarCampanhaFrame.add(campanhaLabel);
                criarCampanhaFrame.add(descricaoLabel);
                criarCampanhaFrame.add(metaLabel);
                criarCampanhaFrame.add(chavePixLabel);
                criarCampanhaFrame.add(campanhaField);
                criarCampanhaFrame.add(descricaoField);
                criarCampanhaFrame.add(metaField);
                criarCampanhaFrame.add(chavePixField);
                criarCampanhaFrame.add(criarCampanhaButton);
                criarCampanhaFrame.setVisible(true);

            }
        });
}
}