package src.classes;
public class Receptor extends Pessoa {
    // Atributos
    private String campanha;
    private int idCampanha;
    private String descricaoCampanha;
    private int apoiadores;
    private int meta;
    private int arrecadado;
    private String chavePix;

    // Construtor padrão
    public Receptor() {
    }

    // Construtor com parâmetros
    public Receptor(String nome, String email, String cpf, String telefone, String endereco, String campanha, int idCampanha, String descricaoCampanha, int apoiadores, int meta, int arrecadado, String chavePix) {
        super(nome, email, cpf, telefone, endereco);
        this.campanha = campanha;
        this.idCampanha = idCampanha;
        this.descricaoCampanha = descricaoCampanha;
        this.apoiadores = apoiadores;
        this.meta = meta;
        this.arrecadado = arrecadado;
        this.chavePix = chavePix;
    }

    // Getters e Setters
    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public int getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(int idCampanha) {
        this.idCampanha = idCampanha;
    }

    public String getDescricaoCampanha() {
        return descricaoCampanha;
    }

    public void setDescricaoCampanha(String descricaoCampanha) {
        this.descricaoCampanha = descricaoCampanha;
    }

    public int getApoiadores() {
        return apoiadores;
    }

    public void setApoiadores(int apoiadores) {
        this.apoiadores = apoiadores;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public int getArrecadado() {
        return arrecadado;
    }

    public void setArrecadado(int arrecadado) {
        this.arrecadado = arrecadado;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    /* ===========================================*/
}
