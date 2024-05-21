package src.functions;
import javax.swing.JOptionPane;
import src.classes.Pessoa;
public class VerificarSenha {
    public static void verificarLogin(String email, String senha) {
        // Obtém todas as pessoas no arrayList
        for (Pessoa pessoa : Pessoa.getPessoas()) {
            // Verifica se o e-mail e a senha correspondem a algum usuário
            if (pessoa.getEmail().equals(email) && pessoa.getSenha().equals(senha)) {
                // Instancia o painel geral
                PainelGeral pg = new PainelGeral();
                pg.chamarPainel(pessoa.getNome()); // Chama o painel geral passando o nome do usuário
                return; // Termina a execução do método após encontrar o usuário
            }
        }
        // Se não encontrou nenhum usuário, exibe uma mensagem de erro
        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
