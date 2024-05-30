package src.classes;
import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Receptor{
    
    // Atributos
    private String cnpj;
    private String tipo;
    private String site;
    private static List<Instituicao> instituicoes = new ArrayList<Instituicao>(); // Array de instituições de doações, esse é o nosso "banco de dados"

    // Construtor padrão
    public Instituicao() {
    }

    // Construtor com parâmetros
    public Instituicao(String nome, String email, String cpf, String telefone, String endereco, String campanha, int idCampanha, String descricaoCampanha, int apoiadores, String meta, int arrecadado, String chavePix, String cnpj, String tipo, String site) {
        super(nome, email, cpf, telefone, endereco, campanha, idCampanha, descricaoCampanha, apoiadores, meta, arrecadado, chavePix);
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.site = site;
    }

    // Método para adicionar uma instituição no array de instituições
    public static void adicionarInstituicao(Instituicao instituicao){
        instituicoes.add(instituicao);
    }

    // Método para retornar a lista de instituições
    public static List<Instituicao> getIntituicoes() {
        return instituicoes;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    /* =================================== */
}
