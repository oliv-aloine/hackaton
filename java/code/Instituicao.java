package code;

public abstract class Instituicao {
    private String nome;
    private String cnpj;

    public Instituicao(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}