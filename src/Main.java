
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("POO");
		curso1.setDescricao("Introdução à programação"
				+ " orientada a objetos.");
		curso1.setCargaHoraria(6);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java");
		curso2.setDescricao("Instrodução à linguagem Java");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Pensamento Computacional");
		mentoria1.setDescricao("Introdução ao pensamento"
				+ " computacional e dicas");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp1 = new Bootcamp();
		Set<Conteudo> conteudos1 = new LinkedHashSet<>();
		conteudos1.add(curso1);
		conteudos1.add(curso2);
		conteudos1.add(mentoria1);
		bootcamp1.setConteudos(conteudos1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Samara Estrela");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println(dev1.getNome());
		System.out.println("DEV XP: "+dev1.calcularXP()+"\n");
		
		System.out.println("Conteúdos inscritos:");
		dev1.toString(dev1.getConteudosInscritos());
		System.out.println();
		
		System.out.println("Conteúdos concluídos:");
		dev1.toString(dev1.getConteudosConcluidos());
		
		System.out.println("\n--->");
		
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		
		System.out.println(dev1.getNome());
		System.out.println("DEV XP: "+dev1.calcularXP()+"\n");
		
		System.out.println("Conteúdos inscritos:");
		dev1.toString(dev1.getConteudosInscritos());
		System.out.println();
		
		System.out.println("Conteúdos concluídos:");
		dev1.toString(dev1.getConteudosConcluidos());
		
	}
}
