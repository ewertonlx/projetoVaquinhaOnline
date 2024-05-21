package src.functions;
import java.util.ArrayList;
import src.classes.Pessoa;

public class RegistrarUsuario {
    ArrayList<Pessoa> users = null;
    public void registrarUsuario(Pessoa p, String nome, String email, String cpf, String telefone, String endereco, String senha) {
        // Instanciando a classe Pessoa
        Pessoa pessoa = new Pessoa(users);
        pessoa.setNome(nome);
        pessoa.setEmail(email);
        pessoa.setCpf(cpf);
        pessoa.setTelefone(telefone);
        pessoa.setEndereco(endereco);
        pessoa.setSenha(senha);      
        pessoa.salvar(p);

    }
}
