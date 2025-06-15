package code;

public class Profissional extends Pessoa {
    private double numeroRegistro;

    public Profissional(String nome, String cpf, double numeroRegistro) {
        super(nome, cpf);
        this.numeroRegistro = numeroRegistro;
    }

    public double getNumeroRegistro() {
        return numeroRegistro;
    }
}