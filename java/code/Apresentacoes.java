package code;

import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes colecaoApresentacoes;
    private List<Apresentacao> lista;

    private Apresentacoes() {
        lista = new ArrayList<>();
    }

    public static Apresentacoes getColecaoApresentacoes() {
        if (colecaoApresentacoes == null) {
            colecaoApresentacoes = new Apresentacoes();
        }
        return colecaoApresentacoes;
    }

    public void adicionar(Apresentacao apresentacao) {
        lista.add(apresentacao);
    }

    public List<Apresentacao> listar() {
        return new ArrayList<>(lista);
    }
}
