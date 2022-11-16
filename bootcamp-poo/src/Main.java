
import java.time.LocalDate;

import br.com.dio.projeto.Bootcamp;
import br.com.dio.projeto.Conteudo;
import br.com.dio.projeto.Curso;
import br.com.dio.projeto.Dev;
import br.com.dio.projeto.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();

        curso.setTitulo("Introdução ao Git e ao GitHub");
        curso.setDescricao("Iniciando o Git e passo a passo no GitHub");
        curso.setCargaHoraria(5);

        System.out.println(curso);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Como Criar seu Plano de Estudos Usando o GitHub");
        mentoria.setDescricao("Trabalhando com GitHub");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Potência Tech powered by iFood - Java Beginners");
        bootcamp.setDescricao("Uma trilha com conteúdos completos, desafios de projetos, mentorias ao vivo e networking com a comunidade.");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devLorenzo = new Dev();
        devLorenzo.setNome("Lorenzo");
        devLorenzo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devLorenzo.getConteudosInscritos());
        System.out.println("XP:" + devLorenzo.calcularTotalXp());
    }
}