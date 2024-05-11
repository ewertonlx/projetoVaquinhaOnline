package src.classes;

public class Doador extends Pessoa{
    
    // Atributos
    private int valor;

    // Construtor padrão
    public Doador() {
    }

    // Construtor com parâmetros
    public Doador(String nome, String email, String cpf, String telefone, String endereco, int valor) {
        super(nome, email, cpf, telefone, endereco);
        this.valor = valor;
    }

    // Getters e Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    /* =================================== */
}
