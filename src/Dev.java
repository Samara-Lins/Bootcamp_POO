import java.util.ArrayList;
import java.util.List;

public class Dev {
	private String nome;
	private List<Conteudo> conteudosInscritos = new ArrayList<>();
	private List<Conteudo> conteudosConcluidos = new ArrayList<>();
	
	public void inscrever(Bootcamp bootcamp) {
		conteudosInscritos.add(bootcamp);
	}
	
	public void progredir(Conteudo conteudo) {
		conteudosConcluidos.add(conteudo);
	}
	
	public void calcularXP() {
		
	}
}
