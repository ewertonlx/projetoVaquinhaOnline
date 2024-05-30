package src.functions.pagesPainel;
import javax.swing.*;

public class Doar {
    public void chamarDoar(){
         // Criando a janela de doar
        JFrame doarFrame = new JFrame("Doe e ajude quem precisa");
        doarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        doarFrame.setSize(300, 300);
        doarFrame.setLayout(null);

        // Textos para identificar os campos
        JLabel idLabel = new JLabel("ID da campanha");
        idLabel.setBounds(50, 50, 110, 50); // posição do texto

        JLabel valorLabel = new JLabel("Valor a ser doado");
        valorLabel.setBounds(50, 100, 110, 50); // posição do texto
        
        // Campos de texto para preencher
        JTextField idField = new JTextField();
        idField.setBounds(180, 50, 100, 50); // posição do campo

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(180, 100, 100, 50); // posição do campo

        // Botão doar
        JButton doarButton = new JButton("Doar");
        doarButton.setBounds(100, 150, 100, 50); // posição do botão

        // Adicionando tudo na janela
        doarFrame.add(idLabel);
        doarFrame.add(idField);
        doarFrame.add(valorLabel);
        doarFrame.add(idField);
        doarFrame.add(passwordField);
        doarFrame.add(doarButton);
        doarFrame.setVisible(true);

        doarButton.addActionListener(e -> {
        });
    }
}
