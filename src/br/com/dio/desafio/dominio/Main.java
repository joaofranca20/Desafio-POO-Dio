package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Curso sobre JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso sobre JS");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria sobre JAVA");
        mentoria.setDescricao("Mentoria sobre o JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricão Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

            Dev devJoao = new Dev();
            devJoao.setNome("João");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();

            System.out.println("-");
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
            System.out.println("XP : " + devJoao.calcularTotalXp());
            System.out.println("-------");

            Dev devDriad = new Dev();
            devDriad.setNome("Driad");
            devDriad.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Driad: " + devDriad.getConteudosInscritos());

            devDriad.progredir();
            devDriad.progredir();

            System.out.println("-");
            System.out.println("Conteúdos Inscritos Driad: " + devDriad.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Driad: " + devJoao.getConteudosConcluidos());
            System.out.println("XP : " + devDriad.calcularTotalXp());









    }
}
