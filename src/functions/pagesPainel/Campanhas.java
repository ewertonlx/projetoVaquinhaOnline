package src.functions.pagesPainel;
import src.functions.PainelGeral;
import java.awt.*;
import javax.swing.*;
import src.classes.Instituicao;
import src.classes.Receptor;

import java.util.List;

public class Campanhas {
    Receptor doador = new Receptor();
    Instituicao instituicao = new Instituicao();
    public void chamarCampanhas(){
        JFrame campanhasFrame = new JFrame("Campanhas");
        campanhasFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campanhasFrame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.getHSBColor(110, 194, 246)); // Cor de fundo do painel

        JLabel title = new JLabel("Campanhas registradas");
        title.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o texto ao centro
        title.setForeground(Color.WHITE); // Cor do texto
        title.setFont(new Font("Arial", Font.BOLD, 20)); // Define a fonte e o tamanho do texto
        
        JButton voltarButton = new JButton("Voltar");
        voltarButton.setPreferredSize(new Dimension(100, 50));
        voltarButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        voltarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel.add(title);
        List<Receptor> campanhas = doador.getReceptores();
        System.out.println(campanhas.size());

        if (campanhas.size() == 0) {
            JLabel semCampanha = new JLabel("Não há campanhas disponíveis");
            semCampanha.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o texto ao centro
            semCampanha.setForeground(Color.WHITE); // Cor do texto
            semCampanha.setFont(new Font("Arial", Font.BOLD, 15)); // Define a fonte e o tamanho do texto
            panel.add(semCampanha);
        } else {
            for (int i = 0; i < campanhas.size(); i++) {
                JLabel campanha = new JLabel(campanhas.get(i).toString());
                campanha.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o texto ao centro
                campanha.setForeground(Color.WHITE); // Cor do texto
                campanha.setFont(new Font("Arial", Font.BOLD, 15)); // Define a fonte e o tamanho do texto
                panel.add(campanha);
            }
        }
        System.out.println(campanhas);
        panel.add(voltarButton);
        campanhasFrame.add(panel);
        campanhasFrame.setVisible(true);

        voltarButton.addActionListener(e -> {
            PainelGeral painelGeral = new PainelGeral();      
            painelGeral.chamarPainel("usuário");
            campanhasFrame.setVisible(false);
        });
    }
}
