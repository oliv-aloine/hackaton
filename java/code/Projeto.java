package code;

public class Projeto {
    private String nome;
    private Profissional orientador;
    private Equipe equipe;
    private double notaFinal;

    public Projeto(String nome, Profissional orientador, Equipe equipe) {
        this.nome = nome;
        this.orientador = orientador;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public void setOrientador(Profissional orientador) {
        this.orientador = orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}