package src.functions;
import src.classes.Pessoa;

public class RegistrarUsuario {
    public void registrarUsuario(Pessoa p, String nome, String email, String cpf, String telefone, String endereco, String senha) {
        // Instanciando a classe Pessoa
        Pessoa pessoa = new Pessoa(null);
        pessoa.setNome(nome);
        pessoa.setEmail(email);
        pessoa.setCpf(cpf);
        pessoa.setTelefone(telefone);
        pessoa.setEndereco(endereco);
        pessoa.setSenha(senha);
        System.out.println(p.toString());
    }
}
