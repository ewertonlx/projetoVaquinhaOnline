package src.functions;
import src.functions.pagesPainel.*;
import javax.swing.*;
import java.awt.*;
public class PainelGeral {
    public void chamarPainel(String nome){
        
        // Criando uma janela
        JFrame geralFrame = new JFrame("Bem-vindo à Vaquinha Online");
        geralFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para de executar o programa quando a janela é fechada
        geralFrame.setSize(500, 500); // Tamanho da janela

        // Criando um painel
        JPanel painelGeral = new JPanel();
        painelGeral.setLayout(new BoxLayout(painelGeral, BoxLayout.Y_AXIS)); // Organização do painel
        painelGeral.setBackground(Color.getHSBColor(110, 194, 246)); // Cor de fundo do painel

        JLabel titulo = new JLabel("Olá " + nome + ", escolha uma opção!"); // Título mostrando o nome do usuário. A variável nome é passada como parâmetro na função "chamarPainel"
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o texto
        titulo.setForeground(Color.WHITE); // Cor do texto
        titulo.setFont(new Font("Arial", Font.BOLD, 20)); // Fonte do texto

        JButton doar = new JButton("Doar"); // Botão
        doar.setPreferredSize(new Dimension(100, 50)); // Tamanho do botão
        doar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Modificando o cursor quando passar o mouse por cima
        doar.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão

        JButton verCampanhas = new JButton("Campanhas"); // Botão
        verCampanhas.setPreferredSize(new Dimension(100, 50)); // Tamanho do botão
        verCampanhas.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Modificando o cursor quando passar o mouse por cima
        verCampanhas.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão

        JButton criarCampanha = new JButton("Criar campanha"); // Botão
        criarCampanha.setPreferredSize(new Dimension(100, 50)); // Tamanho do botão
        criarCampanha.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Modificando o cursor quando passar o mouse por cima
        criarCampanha.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão
        
        JButton configuracoes = new JButton("Configurações"); // Botão
        configuracoes.setPreferredSize(new Dimension(100, 50)); // Tamanho do botão
        configuracoes.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Modificando o cursor quando passar o mouse por cima
        configuracoes.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão

        JButton home = new JButton("Voltar"); // Botão
        home.setPreferredSize(new Dimension(15, 15)); // Tamanho do botão
        home.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Modificando o cursor quando passar o mouse por cima
        home.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão

        // Adicionando os elementos no painel
        painelGeral.add(titulo);
        painelGeral.add(doar);
        painelGeral.add(verCampanhas);
        painelGeral.add(criarCampanha);
        painelGeral.add(configuracoes);
        painelGeral.add(home);
        geralFrame.add(painelGeral);
        geralFrame.setVisible(true);
        
        verCampanhas.addActionListener(e -> {
            Campanhas campanhas = new Campanhas();
            campanhas.chamarCampanhas();
        });
    }
}
