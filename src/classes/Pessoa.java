package src.classes;

import java.util.ArrayList;

public class Pessoa {
    // Atributos
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private String senha;

    ArrayList<Pessoa> users = null;
    // Construtor padrão
    public Pessoa() {
    }

    public void salvar(Pessoa p) {
        users.add(p);
        System.out.println(users);
    }

    public Pessoa(ArrayList<Pessoa> users) {
        this.users = users;
    }
    // Construtor com parâmetros
    public Pessoa(String nome, String email, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    /* ===========================================*/
}