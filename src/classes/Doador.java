package src.classes;
import java.util.ArrayList;
import java.util.List;
public class Doador extends Pessoa{
    
    // Atributos
    private int valor;
    private static List<Doador> doadores = new ArrayList<Doador>(); // Array de doadores, esse é o nosso "banco de dados"
    
    // Construtor padrão
    public Doador() {
    }

    // Construtor com parâmetros
    public Doador(String nome, String email, String cpf, String telefone, String endereco, int valor) {
        super(nome, email, cpf, telefone, endereco);
        this.valor = valor;
    }

    // Método para adicionar um doador no array de doadores
    public static void adicionarDoador(Doador doador){
        doadores.add(doador);
    }

    // Método para retornar a lista de doadores
    public static List<Doador> getDoadores() {
        return doadores;
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
