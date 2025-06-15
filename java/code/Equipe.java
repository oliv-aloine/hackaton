package code;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Estudante> membros;

    public Equipe(String nome){
        this.nome = nome;
        this.membros = new ArrayList<Estudante>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMembro(Estudante estudante) {
        this.membros.add(estudante);
    }

    public void removerMembro(Estudante estudante) {
        this.membros.remove(estudante);
    }

    public List<Estudante> getMembros() {
        return new ArrayList<>(membros);
    }
}