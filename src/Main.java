import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("curso js");
        curso01.setDescricao("descrição curso js");
        curso01.setCargaHoraria(12);

        Curso curso02 = new Curso();
        curso02.setTitulo("curso java");
        curso02.setDescricao("descrição curso java");
        curso02.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria");
        mentoria.setDescricao("descrição");
        mentoria.setData(LocalDate.now());

        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Igor" + devIgor.getConteudosInscritos());
        devIgor.progredir();
        System.out.println("Conteúdos Inscritos Igor" + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Igor" + devIgor.getConteudosConcluidos());
        System.out.println("XP = " + devIgor.calcularTotalXp() );


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João" + devIgor.getConteudosConcluidos());
        System.out.println("XP = " + devJoao.calcularTotalXp() );


    }
}