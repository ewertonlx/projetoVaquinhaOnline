package src.functions;
import javax.swing.*;
import java.awt.*;
public class PainelGeral {
    public void chamarPainel(){
        JFrame geralFrame = new JFrame("Bem-vindo à Vaquinha Online");
        geralFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        geralFrame.setSize(500, 500);

        JPanel painelGeral = new JPanel();
        painelGeral.setLayout(new BoxLayout(painelGeral, BoxLayout.Y_AXIS));
        painelGeral.setBackground(Color.getHSBColor(110, 194, 246));

        JLabel titulo = new JLabel("Escolha uma opção");
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        JButton doar = new JButton("Doar");
        doar.setPreferredSize(new Dimension(100, 50));
        doar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        doar.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton verCampanhas = new JButton("Campanhas");
        verCampanhas.setPreferredSize(new Dimension(100, 50));
        verCampanhas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        verCampanhas.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton criarCampanha = new JButton("Criar campanha");
        criarCampanha.setPreferredSize(new Dimension(100, 50));
        criarCampanha.setCursor(new Cursor(Cursor.HAND_CURSOR));
        criarCampanha.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton configuracoes = new JButton("Configurações");
        configuracoes.setPreferredSize(new Dimension(100, 50));
        configuracoes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        configuracoes.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton home = new JButton("Voltar");
        home.setPreferredSize(new Dimension(15, 15));
        home.setCursor(new Cursor(Cursor.HAND_CURSOR));
        home.setAlignmentX(Component.CENTER_ALIGNMENT);

        painelGeral.add(titulo);
        painelGeral.add(doar);
        painelGeral.add(verCampanhas);
        painelGeral.add(criarCampanha);
        painelGeral.add(configuracoes);
        painelGeral.add(home);
        geralFrame.add(painelGeral);
        geralFrame.setVisible(true);
        
    }
}
