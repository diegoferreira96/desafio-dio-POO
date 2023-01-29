import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiego = new Dev();
        devDiego.setNome("Diego Ferreira");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Diego " + devDiego.getConteudosInscritos());
        devDiego.progredir();

        System.out.println("-----");

        System.out.println("Conteudos Inscritos Diego " + devDiego.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Diego " + devDiego.getConteudosConcluidos());
        System.out.println("XP: " + devDiego.calcularTotalXP());

        System.out.println("------------------");

        Dev devJennifer = new Dev();
        devJennifer.setNome("Jennifer Arouca");
        devJennifer.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jennifer " + devJennifer.getConteudosInscritos());
        devJennifer.progredir();

        System.out.println("-----");

        System.out.println("Conteudos Inscritos Jennifer " + devJennifer.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jennifer " + devJennifer.getConteudosConcluidos());
        System.out.println("XP: " + devJennifer.calcularTotalXP());

        System.out.println("------------------");

        Dev devAntonio = new Dev();
        devAntonio.setNome("Antonio Nunes");
        devAntonio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Antonio " + devAntonio.getConteudosInscritos());
        devAntonio.progredir();
        devAntonio.progredir();
        devAntonio.progredir();

        System.out.println("-----");

        System.out.println("Conteudos Inscritos Antonio " + devAntonio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Antonio " + devAntonio.getConteudosConcluidos());
        System.out.println("XP: " + devAntonio.calcularTotalXP());
    }
}