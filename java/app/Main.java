package app;

import code.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Equipes equipes = Equipes.getColecaoEquipes();
        Apresentacoes apresentacoes = Apresentacoes.getColecaoApresentacoes();

        // Cria primeira Equipe com 5 alunos
        equipes.adicionar(new Equipe("Equipe Primeira"));

        List<Estudante> grupo1 = Arrays.asList(
                new Estudante("John DarkSouls", "123.456.789-00", 20250001, "Engenharia de Software"),
                new Estudante("John EldenRing", "234.567.890-11", 20250002, "Ciência da Computação"),
                new Estudante("John Bloodborne", "345.678.901-22", 20250003, "Sistemas de Informação"),
                new Estudante("John Sekiro", "456.789.012-33", 20250004, "Engenharia da Computação"),
                new Estudante("John NightReign", "567.890.123-44", 20250005, "Análise e Desenvolvimento de Sistemas")
        );

        Equipe equipe1 = equipes.buscarPorNome("Equipe Primeira");
        grupo1.forEach(equipe1::adicionarMembro);

        // Cria segunda Equipe com 5 alunos
        equipes.adicionar(new Equipe("Equipe Segunda"));

        List<Estudante> grupo2 = Arrays.asList(
                new Estudante("Wylder", "678.901.234-55", 20250006, "Engenharia de Software"),
                new Estudante("Duchess", "789.012.345-66", 20250007, "Ciência da Computação"),
                new Estudante("Guardian", "890.123.456-77", 20250008, "Sistemas de Informação"),
                new Estudante("Executor", "901.234.567-88", 20250009, "Engenharia da Computação"),
                new Estudante("Revenant", "012.345.678-99", 20250010, "Análise e Desenvolvimento de Sistemas")
        );

        Equipe equipe2 = equipes.buscarPorNome("Equipe Segunda");
        grupo2.forEach(equipe2::adicionarMembro);

        //cria orientadores para os projetos
        Profissional orientador1 = new Profissional("Prof. Artorias", "111.222.333-44", 112233);
        Profissional orientador2 = new Profissional("Prof. Messmer", "555.666.777-88", 332211);

        //cria projetos, com orientador e equipes
        Projeto projeto1 = new Projeto("Projeto Soco Foguete", orientador1, equipe1);
        Projeto projeto2 = new Projeto("Projeto Pescar sem Linha", orientador2, equipe2);

        //cria jurados para a primeira banca
        Jurado jurado1 = new Jurado("Jurado1", "111.222.333-44", 1234);
        Jurado jurado2 = new Jurado("Jurado2", "222.333.444-55", 2345);
        Jurado jurado3 = new Jurado("Jurado3", "333.444.555-66", 3456);
        Jurado jurado4 = new Jurado("Jurado4", "444.555.666-77", 4567);

        // Cria mapa de jurados e notas para projeto1
        Map<Jurado, Integer> notasProjeto1 = new HashMap<>();
        notasProjeto1.put(jurado1, 8);
        notasProjeto1.put(jurado2, 7);
        notasProjeto1.put(jurado3, 9);
        notasProjeto1.put(jurado4, 6);

        // Criar a banca para o projeto1
        Banca banca1 = new Banca();
        banca1.setProjetoAvaliado(projeto1);
        banca1.setJurados(notasProjeto1);

        banca1.calcularNotaFinal(); // Calcula nota final do projeto1


        // cria jurados para a segunda banca
        Jurado jurado5 = new Jurado("Jurado A2", "201.302.403-88", 5678);
        Jurado jurado6 = new Jurado("Jurado B2", "202.303.404-99", 6789);
        Jurado jurado7 = new Jurado("Jurado C2", "203.304.405-00", 7890);
        Jurado jurado8 = new Jurado("Jurado D2", "204.305.406-11", 8901);

        // Cria mapa de jurados e notas para projeto2
        Map<Jurado, Integer> notasProjeto2 = new HashMap<>();
        notasProjeto2.put(jurado5, 5);
        notasProjeto2.put(jurado6, 6);
        notasProjeto2.put(jurado7, 7);
        notasProjeto2.put(jurado8, 8);

        // Criar a banca para o projeto1
        Banca banca2 = new Banca();
        banca2.setProjetoAvaliado(projeto2);
        banca2.setJurados(notasProjeto2);

        banca2.calcularNotaFinal();

        List<Projeto> projetos = Arrays.asList(projeto1, projeto2);
        projetos.stream()
                .filter(p -> p.getNotaFinal() >= 7)
                .forEach(p -> System.out.println(
                        "Projeto: " + p.getNome() +
                                ", Nota Final: " + p.getNotaFinal() +
                                ", Orientador: " + p.getOrientador().getNome()
                ));
    }

}