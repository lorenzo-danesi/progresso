
import java.time.LocalDate;

import br.com.dio.projeto.Curso;
import br.com.dio.projeto.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();

        curso.setTitulo("Introdução ao Git e ao GitHub");
        curso.setDescricao("Iniciando o Git e passo a passo no GitHub");
        curso.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Como Criar seu Plano de Estudos Usando o GitHub");
        mentoria.setDescricao("Trabalhando com GitHub");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
