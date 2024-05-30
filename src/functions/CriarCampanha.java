package src.functions;
import java.util.Random;

import src.classes.*;;
public class CriarCampanha {
    private static int gerarId() {
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }
    public void criarCampanha(Receptor r, String campanha, String descricaoCampanha, String meta, String chavePix) {
        r.setCampanha(campanha);
        r.setDescricaoCampanha(descricaoCampanha);
        r.setIdCampanha(gerarId());
        r.setMeta(meta);
        r.setChavePix(chavePix);
        r.adicionarReceptor(r);
    }
}
