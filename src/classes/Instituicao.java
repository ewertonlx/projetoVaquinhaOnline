package src.classes;

public class Instituicao extends Receptor{
    // Atributos
    private String cnpj;
    private String tipo;
    private String site;

    // Construtor padrão
    public Instituicao() {
    }

    // Construtor com parâmetros
    public Instituicao(String nome, String email, String cpf, String telefone, String endereco, String campanha, int idCampanha, String descricaoCampanha, int apoiadores, int meta, int arrecadado, String chavePix, String cnpj, String tipo, String site) {
        super(nome, email, cpf, telefone, endereco, campanha, idCampanha, descricaoCampanha, apoiadores, meta, arrecadado, chavePix);
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.site = site;
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
