public class Vaquinha {
    // Classe Pessoa com atributos comuns
    public class Pessoa {
        private String nome;
        private String email;
        private String cpf;
        private String telefone;
        private String endereco;
    }
    // Classe Receptor que herda todos atributos da classe Pessoa
    public class Receptor extends Pessoa {
        private String campanha;
        private String descricaoCampanha;
        private int apoiadores;
        private int meta;
        private int arrecadado;
        private String chavePix;
    }
    // Classe Instituição que herda tudo da classe Receptor e da classe Pessoa
    public class Instituicao extends Receptor {
        private String cnpj;
        private String tipo;
        private String site;
    }
    public class Doador extends Pessoa {
        private int valor;
    }

}
