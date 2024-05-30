package src.functions.pagesPainel;
import javax.swing.*;

import src.classes.Pessoa;
import src.classes.Receptor;
import src.functions.CriarCampanha;
import src.functions.LoginPainel;
import src.functions.PainelGeral;
import src.functions.RegistrarUsuario;
public class CriarCampPainel {
    public void chamarCampanhaPainel() {
        // Criando a janela de criar campanha
        JFrame campanhaFrame = new JFrame("Crie uma campanha");
        campanhaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campanhaFrame.setSize(300, 300);
        campanhaFrame.setLayout(null);

        // Textos para identificar os campos
        JLabel campanhaLabel = new JLabel("Nome da campanha");
        campanhaLabel.setBounds(50, 50, 110, 50); // posição do texto

        JLabel descricaoLabel = new JLabel("Descrição da campanha");
        descricaoLabel.setBounds(50, 100, 110, 50); // posição do texto

        JLabel metaLabel = new JLabel("Meta da campanha");
        metaLabel.setBounds(50, 150, 110, 50); // posição do texto

        JLabel chavePixLabel = new JLabel("Chave PIX");
        chavePixLabel.setBounds(50, 200, 110, 50); // posição do texto

        // Campos de texto para preencher
        JTextField campanhaField = new JTextField();
        campanhaField.setBounds(180, 50, 100, 50); // posição do campo

        JTextField descricaoField = new JTextField();
        descricaoField.setBounds(180, 100, 100, 50); // posição do campo

        JTextField metaField = new JTextField();
        metaField.setBounds(180, 150, 100, 50); // posição do campo

        JTextField chavePixField = new JTextField();
        chavePixField.setBounds(180, 200, 100, 50); // posição do campo

        // Botão criar campanha
        JButton criarCampanhaButton = new JButton("Criar campanha");
        criarCampanhaButton.setBounds(100, 250, 100, 50); // posição do botão

        // Adicionando tudo na janela
        campanhaFrame.add(campanhaLabel);
        campanhaFrame.add(campanhaField);
        campanhaFrame.add(descricaoLabel);
        campanhaFrame.add(descricaoField);
        campanhaFrame.add(metaLabel);
        campanhaFrame.add(metaField);
        campanhaFrame.add(chavePixLabel);
        campanhaFrame.add(chavePixField);
        campanhaFrame.add(criarCampanhaButton);
        campanhaFrame.setVisible(true);

        criarCampanhaButton.addActionListener(e -> {
            Receptor p = new Receptor();
            // Pegando os valores dos campos preenchidos
            String campanha = campanhaField.getText();
            String desc = descricaoField.getText();
            String meta = metaField.getText();
            String pix = chavePixField.getText();

            // Verificando se os espaços estão vazios
            if (campanha.isEmpty() || desc.isEmpty() || meta.isEmpty() || pix.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algums campos estão vazios! Por favor preencha corretamente!");
            } 
            // Caso não tenha nenhum erro, o sistema cria a campanha
            else {
                CriarCampanha criarCampanha = new CriarCampanha();
                criarCampanha.criarCampanha(p, campanha, desc, meta, pix);
                JOptionPane.showMessageDialog(null, "Campanha criada com sucesso!"); // Mensagem de sucesso
                campanhaFrame.setVisible(false);
                PainelGeral painelGeral = new PainelGeral();
                painelGeral.chamarPainel(p.getNome());
            }
            
        });
    }
}
