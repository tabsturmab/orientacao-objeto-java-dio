package br.com.dio.banco.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("java básico para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java 2");
        curso2.setDescricao("java intermediário");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("mentoria em java básico");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp Java Básico para iniciantes");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("Andre");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andre:" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andre:" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andre" + devAndre.getConteudosConcluidos());
        System.out.println("XP:" + devAndre.calcularTotalXp());

        System.out.println("=================================================================");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paula:" + devPaula.getConteudosInscritos());
        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paula:" + devPaula.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Paula:" + devPaula.getConteudosConcluidos());
        System.out.println("XP:" + devPaula.calcularTotalXp());

    }

}
