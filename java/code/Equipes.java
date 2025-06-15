package code;

import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes colecaoEquipes;
    private List<Equipe> lista;

    private Equipes() {
        lista = new ArrayList<>();
    }

    public static Equipes getColecaoEquipes() {
        if (colecaoEquipes == null) {
            colecaoEquipes = new Equipes();
        }
        return colecaoEquipes;
    }

    public void adicionar(Equipe equipe) {
        lista.add(equipe);
    }

    public List<Equipe> listar() {
        return new ArrayList<>(lista);
    }

    public Equipe buscarPorNome(String nome) {
        for (Equipe e : lista) {
            if (e.getNome().equalsIgnoreCase(nome)) return e;
        }
        return null;
    }
}
