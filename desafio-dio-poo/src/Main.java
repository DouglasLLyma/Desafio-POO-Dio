import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(91);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python");
        curso2.setCargaHoraria(80);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Douglas" + devDouglas.getConteudoInscrito());
        devDouglas.progredir();
        devDouglas.progredir();
        devDouglas.progredir();
        System.out.println("---");
        System.out.println("Conteudo Inscritos Douglas" + devDouglas.getConteudoInscrito());
        System.out.println("Conteudo Concluidos Douglas" + devDouglas.getConteudoConcluido());
        System.out.println("XP: " + devDouglas.calcularTotalXp());

        System.out.println("----------------");

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Aline" + devAline.getConteudoInscrito());
        devAline.progredir();
        devAline.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos Aline" + devAline.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Aline" + devAline.getConteudoConcluido());
        System.out.println("XP: " + devAline.calcularTotalXp());


    }
}
