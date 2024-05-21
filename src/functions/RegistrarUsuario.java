package src.functions;
import src.classes.Pessoa;

public class RegistrarUsuario {
    public void registrarUsuario(Pessoa p, String nome, String email, String cpf, String telefone, String endereco, String senha) {
        p.setNome(nome);
        p.setEmail(email);
        p.setCpf(cpf);
        p.setTelefone(telefone);
        p.setEndereco(endereco);
        p.setSenha(senha);
        p.adicionarPessoa(p); // Adiciona a pessoa no arrayList chamando a função adicionarPessoa()
    }
}
