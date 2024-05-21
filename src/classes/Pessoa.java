package src.classes;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    // Atributos
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private String senha;
    private static List<Pessoa> pessoas = new ArrayList<Pessoa>(); // Array de pessoas registradas, esse é o nosso "banco de dados"

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String email, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    // Método para adicionar uma pessoa no array de pessoas
    public static void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    // Método para retornar a lista de pessoas
    public static List<Pessoa> getPessoas() {
        return pessoas;
    }

    // Método toString para mostrar as informações da pessoa
    public String toString() {
        return "Nome: " + this.nome + "\nEmail: " + this.email + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone + "\nEndereço: " + this.endereco;
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