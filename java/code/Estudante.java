package code;

public class Estudante extends Pessoa{
    private double matricula;
    private String curso;

    public Estudante(String nome, String cpf, double matricula, String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public double getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}