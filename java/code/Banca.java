package code;

import java.util.Map;

public class Banca implements IAvaliavel{
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }

    public void setJurados(Map<Jurado, Integer> jurados) {
        this.jurados = jurados;
    }

    @Override
    public void calcularNotaFinal() {
        int soma = 0;
        for (Integer nota : jurados.values()) {
            soma += nota;
        }

        double media = (double) soma / jurados.size();

        projetoAvaliado.setNotaFinal(media);
    };
}