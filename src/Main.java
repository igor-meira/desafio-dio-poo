import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("curso js");
        curso01.setDescricao("descrição curso js");
        curso01.setCargaHoraria(12);

        Curso curso02 = new Curso();
        curso02.setTitulo("curso ");
        curso02.setDescricao("descrição");
        curso02.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria");
        mentoria.setDescricao("descrição");
        mentoria.setData(LocalDate.now());

        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria);
    }
}